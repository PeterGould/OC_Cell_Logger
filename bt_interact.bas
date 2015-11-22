Type=Service
Version=5.2
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
#End Region

Sub Process_Globals
	'ble variables
	Dim scan_status As Int = 0
	Dim Manager As BleManager
	Dim btAdmin As BluetoothAdmin
   	Dim readCharacteristic As BleCharacteristic
   	Dim writeCharacteristic As BleCharacteristic  
   	Dim bleService As BleService  	
	Dim listBLEDevicesName As List		
	Dim listBLEDevicesMacAdress As List	
   	Dim ConnectState As Int
	Dim cstateDisconnect As Int = 0
	Dim cstatePreConnect As Int = 1
	Dim cstateConnect As Int = 2
	Dim connection_tries As Int = 0
	Dim device_n As Int = 0
	'other variables
	Dim first_read As Boolean = True
	Dim ble_timer As Timer
	Dim timer_switch As String
	Dim timer_wait As Int
	Dim data_buffer As String = ""
	Dim conv As ByteConverter
End Sub

Sub Service_Create
	Try
		Manager.Initialize("BLE")
		btAdmin.Initialize("null")
	Catch
		Log("Error create service : " & LastException.Message)
	End Try		
	listBLEDevicesName.Initialize
	listBLEDevicesMacAdress.Initialize	
	'set timer to coordinate next activity
	ble_timer.Initialize("ble_timer",timer_wait)
	ble_timer.Enabled = False
End Sub

Sub Service_Start (StartingIntent As Intent)
	timer_wait = 1000
	'make sure bluetooth is enables
	If btAdmin.IsEnabled = False Then 
		btAdmin.Enable
		timer_wait = 5000
	End If
	'the timer will start the next action
	timer_switch = "find_devices"
	ble_timer.Interval = timer_wait
	ble_timer.Enabled = True
End Sub

Sub Service_Destroy

End Sub

'#######################################################################################
'##other subs
'######################################################################################
'####BLE Communication Subs
Sub scan_bt_devices
	scan_status = 0
	Manager.StopRssiTracking	
  	Manager.Disconnect
	ConnectState = cstateDisconnect	
	Manager.Scan(3000, Null)		
	listBLEDevicesName.clear	
	listBLEDevicesMacAdress.clear	
	Log("Searching devices...")	
	ToastMessageShow( "Searching devices..." ,True)
End Sub


Sub connect_a_device(device_position As Int)
	If device_n >= listBLEDevicesName.Size Then 'gone through all of the devices. Now finish
		Log("No additional devices found. Done.")
		'kill the timer to avoid additional actions
		ble_timer.Enabled = False
		bt_finish
		Return
	End If
	If ConnectState = cstateDisconnect Then 
		ConnectState = cstatePreConnect      
		Log("Connecting to " & listBLEDevicesName.Get(device_position))
		Manager.Connect(listBLEDevicesMacAdress.Get(device_position), True)		
	End If 
	'clear the data_buffer
	data_buffer = ""
	'set first_read for the download timer
	first_read = True
	'The connection event will launch the next actions.  Set timer in case connection fails
	ble_timer.Enabled = True
End Sub

'disconnect to a device
Sub disconnect_a_device
	Manager.Disconnect
End Sub

'finish up the process
Sub bt_finish
	'turn off bluetooth to save power
	If btAdmin.Enable = True Then btAdmin.Disable
	Service_Destroy
End Sub
'###################################################################
'###BLE Event subs
Sub ble_DeviceFound (Name As String, MacAddress As String)
	'only look for devices with the SODA prefix
	Log("found BT " & Name)
   If Name.SubString2(0,4) = "SODA" Then
		listBLEDevicesName.Add(Name)
		listBLEDevicesMacAdress.Add(MacAddress)
	End If
End Sub

Sub ble_DiscoveryFinished
 	Log("Search finished")
	If(listBLEDevicesName.Size) = 0 Then
		scan_status = -1
		Log("No Devices Found. Ending Service.")
		'kill the service now
		Service_Destroy
	Else 
		scan_status = listBLEDevicesName.Size
		For i = 0 To scan_status - 1
			Log("found " & listBLEDevicesName.Get(i))
		Next
	End If
	'connect to first device once discover finishes
	connection_tries = 0
	device_n = 0
	connect_a_device(device_n)
End Sub


'launched once a connection is made
Sub ble_Connected (Services As Map)
	'disable the timer 
	ble_timer.Enabled = False
   If ConnectState = cstatePreConnect Then
	   	ConnectState = cstateConnect		
	   	Log("Connected")
	   	bleService = Services.GetValueAt(2)							
	   	readCharacteristic = bleService.GetCharacteristics.GetValueAt(0)
	   	Manager.ReadCharacteristic(readCharacteristic)
	   	Manager.SetCharacteristicNotification(readCharacteristic, True)	
	   	writeCharacteristic = bleService.GetCharacteristics.GetValueAt(0)  
		'start a timer so that we move on if nothing happens within 1 second
		timer_switch = "device_timeout"
		ble_timer.Interval = 1000
		connection_tries = 0
		ble_timer.Enabled = True
		'send the signal to start bluetooth download
		writeCharacteristic.SetStringValue("T")
		Manager.WriteCharacteristic(writeCharacteristic)
	End If	   
End Sub

Sub ble_Disconnected  	
	ConnectState = cstateDisconnect		
  	Manager.refreshDeviceCache  
  	Manager.Close               
  	Log("Disconnected")
End Sub

'read from BT stream
Sub ble_CharacteristicChanged (Characteristic As BleCharacteristic)
	'set the timer.  Will move on if nothing is read within 2 seconds
	If first_read = True Then
		ble_timer.Enabled = False
		timer_switch = "bt_download"
	End If
	'reset timer to give another 200 ms
	ble_timer.Enabled = False
	ble_timer.Interval = 500
	ble_timer.Enabled = True
	Dim capture As String = ""
	Dim  capture_byte() As Byte = readCharacteristic.GetValue
	capture = conv.StringFromBytes(capture_byte,"UTF8")
	Log(capture)
	data_buffer = data_buffer & capture
	'send indication for next set
	writeCharacteristic.SetStringValue("!")
	Manager.WriteCharacteristic(writeCharacteristic)
End Sub

'#########################################################################
'Main timer
Sub ble_timer_Tick
	Log("Entering timer with switch " & timer_switch)
	ble_timer.Enabled = False 'always disable. Sometimes will want to re-enable.
	
	'start process to find device
	If timer_switch = "find_devices" Then
		scan_bt_devices
	End If
	
	'retry connect
	If timer_switch = "try_connect" Then
		connection_tries = connection_tries + 1
		If connection_tries > 3 Then 'move on to the next device
			device_n = device_n + 1
		End If
		ble_timer.Enabled = True  're-enable timer
		connect_a_device(device_n)
	End If
	
	'device timed out. Try next device
	If timer_switch = "device_timeout" Then
			'give it a few more shots
		If connection_tries < 2 Then
				writeCharacteristic.SetStringValue("T")
				Manager.WriteCharacteristic(writeCharacteristic)	
				connection_tries = connection_tries + 1
				ble_timer.Enabled = True
			Else 'OK, time to give up and try next device
			Log("deviced timed out; trying next device")
			device_n = device_n + 1
			connect_a_device(device_n)
		End If
	End If
	
	'interval between download packets
	If timer_switch = "bt_download" Then
		'turn off notifications since download must be finished
		Manager.SetCharacteristicNotification(readCharacteristic, False)	
		'disconnect from device
		Manager.Disconnect
		'save file
		write_bt_file
		'try next device
		device_n = device_n + 1
		connect_a_device(device_n)
	End If
End Sub
'###########################################################################
'####helper subs
Sub write_bt_file
	Dim filename As String = listBLEDevicesName.Get(device_n) & "_"
	Dim K As Int
	For k = 0 To 10
		filename = filename & Chr(Rnd(65,90))
	Next
	filename = filename & ".csv"
	File.WriteString(file_manager.current_dir,filename,data_buffer)
	data_buffer = ""
End Sub