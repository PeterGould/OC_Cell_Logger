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
	Dim at_active As Boolean = False
	Dim soda_stage As Int = 0
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
	'clear device list to prepare for new scan
	listBLEDevicesName.Clear
	listBLEDevicesMacAdress.Clear
	scan_status = 0
	Manager.StopRssiTracking	
  	Manager.Disconnect
	ConnectState = cstateDisconnect	
	Manager.Scan(3000, Null)		
	Log("Searching devices...")	
	
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
	timer_switch = "try_connect"
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
	StopService("")
End Sub
'###################################################################
'###BLE Event subs
Sub ble_DeviceFound (Name As String, MacAddress As String)
	'sometimes sends a NULL value
	If Name = Null Then Return
	'only look for devices with the SODA prefix
	Log("found BT " & Name)
	Name = Name.ToUpperCase ' makes it case insensitive
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
		For k = 0 To bleService.GetCharacteristics.Size - 1
			Log(k)
			Log(bleService.GetCharacteristics.GetKeyAt(k))
			Log(bleService.GetCharacteristics.GetValueAt(k))
		Next
		'start a timer so that we move on if nothing happens within 1 second
		timer_switch = "device_timeout"
		ble_timer.Interval = 2000
		connection_tries = 0
		ble_timer.Enabled = True
		'send the signals to turn on bluetooth
		soda_stage = 0
		soda_switch 'sub routine that handles setup
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
	If Characteristic = writeCharacteristic Then Log("write") 'Don't do anything when write changes
	If Characteristic = readCharacteristic Then Log("read") 'Don't do anything when write changes
	If Characteristic = readCharacteristic And Characteristic = writeCharacteristic Then Log("both")
	Dim capture As String = ""
	Dim  capture_byte() As Byte = readCharacteristic.GetValue
	capture = conv.StringFromBytes(capture_byte,"UTF8")
	Log(capture)
	'ignore echoes to AT commands
	If at_active = True Then 
		at_active = False
		soda_stage = soda_stage + 1 'acknowledge a reply but don't process it
		soda_switch 'call the next step
		Return
	End If
	'set the timer.  Will move on if nothing is read within 2 seconds
	If first_read = True Then
		ble_timer.Enabled = False
		timer_switch = "bt_download"
	End If
	'reset timer to give another 500 ms
	ble_timer.Enabled = False
	ble_timer.Interval = 500
	ble_timer.Enabled = True
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
		Return
	End If
	
	'retry connect
	If timer_switch = "try_connect" Then
		connection_tries = connection_tries + 1
		If connection_tries > 3 Then 'move on to the next device
			device_n = device_n + 1
		End If
		ble_timer.Enabled = True  're-enable timer
		connection_tries = 0
		connect_a_device(device_n)
	End If
	
	'device timed out. Try next device
	If timer_switch = "device_timeout" Then
			'give it a few more shots
		If connection_tries < 2 Then
			'try current step of the soda_switch	
			connection_tries = connection_tries + 1
			ble_timer.Enabled = True
			soda_switch
		Else 'OK, time to give up and try next device
			Log("deviced timed out; trying next device")
			device_n = device_n + 1
			connection_tries = 0
			connect_a_device(device_n)
		End If
	End If
	
	'interval between download packets
	If timer_switch = "bt_download" Then
		'start timer to finish up, in mean time turn off SODA
		timer_switch = "DL_finished"
		ble_timer.Interval = 5000
		ble_timer.Enabled = True
		'turn off SODA
		soda_stage = 10
		soda_switch
	End If
	
	'finish up the download and try the next
	If timer_switch = "DL_finished" Then
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

'Turn the SODA on using AT commands and responses
Sub soda_switch()
		Dim bt_power As String = "B"
		Dim bt_indicator As String = "8"
		at_active = True
		Log("Entering soda_switch on soda_stage = " & soda_stage)
		'Connect SODA to BT
		If soda_stage = 0 Then 'send the first command.  The reply will trigger the next command
			Log("Attempting to start SODA")
			writeCharacteristic.SetStringValue("AT+PIO" & bt_indicator & "1") 'set indicator to high
			Manager.WriteCharacteristic(writeCharacteristic)
			Return
		End If
		
		If soda_stage = 1 Then
			writeCharacteristic.SetStringValue("AT+PIO" & bt_power & "1") 'turn on SODA
			Manager.WriteCharacteristic(writeCharacteristic)
			Return
		End If
		
		If soda_stage = 2 Then
			at_active = False 'end the AT activity
			writeCharacteristic.SetStringValue("!") 'Signal the SODA to begin download
			Manager.WriteCharacteristic(writeCharacteristic)
			Return
		End If
		
		'disconnect SODA from BT
		If soda_stage = 10 Then
			writeCharacteristic.SetStringValue("AT+PIO" & bt_indicator & "0") 'turn indicator to low
			Manager.WriteCharacteristic(writeCharacteristic)
			Return
		End If
		
		If soda_stage = 11 Then
			writeCharacteristic.SetStringValue("AT+PIO" & bt_power & "0") 'turn power off
			Manager.WriteCharacteristic(writeCharacteristic)
			Return
		End If

		If soda_stage = 12 Then 'final clean up
			Manager.Disconnect
			at_active = False
		End If
		
End Sub