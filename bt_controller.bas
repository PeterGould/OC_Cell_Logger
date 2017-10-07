Type=Class
Version=5.2
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
'This module handles bluetooth communication with a data logger
Sub Class_Globals
	Dim scan_status As Int = 0
	Dim pass_message As String = ""
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
	Dim ble_timer As Timer
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize As Boolean
	Dim wait As Boolean = False
	Try
		Manager.Initialize("BLE")
		btAdmin.Initialize("null")
		If btAdmin.IsEnabled = False Then 
			btAdmin.Enable
			wait = True
		End If
	Catch
		Log("Error create service : " & LastException.Message)
	End Try		
	listBLEDevicesName.Initialize
	listBLEDevicesMacAdress.Initialize	
	Return(wait)
End Sub


Sub connectBT
	scan_status = 0
	Manager.StopRssiTracking	
  	Manager.Disconnect
	ConnectState = cstateDisconnect	
	Manager.Scan(3000, Null)		
	listBLEDevicesName.clear	
	listBLEDevicesMacAdress.clear	
	Log("Searching devices...")	
End Sub

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
		Log("No Devices Found")
	Else 
		scan_status = listBLEDevicesName.Size
		For i = 0 To scan_status - 1
			Log("found " & listBLEDevicesName.Get(i))
		Next
	End If
	'connect to first devicew
	connect_a_device(0)
End Sub


Sub connect_a_device(device_position As Int)
	If ConnectState = cstateDisconnect Then 
		ConnectState = cstatePreConnect      
		pass_message = listBLEDevicesName.Get(device_position)	
		Manager.Connect(listBLEDevicesMacAdress.Get(device_position), True)		
	End If 
End Sub

'disconnect to a device
Sub disconnect_a_device
	Manager.Disconnect
End Sub

'launched once a connection is made
Sub ble_Connected (Services As Map)
   If ConnectState = cstatePreConnect Then
	   	ConnectState = cstateConnect		
	   	Log("Connected")
	   	bleService = Services.GetValueAt(2)							
	   	readCharacteristic = bleService.GetCharacteristics.GetValueAt(0)
	   	Manager.ReadCharacteristic(readCharacteristic)
	   	Manager.SetCharacteristicNotification(readCharacteristic, True)	
	   	writeCharacteristic = bleService.GetCharacteristics.GetValueAt(0)  
	End If	   
End Sub

Sub ble_Disconnected  	
	ConnectState = cstateDisconnect		
  	Manager.refreshDeviceCache  
  	Manager.Close               
  	Log("Disconnected")
End Sub

'read from BT
Sub ble_CharacteristicChanged (Characteristic As BleCharacteristic)
	Log("Read -> " & Characteristic.GetStringValue(0))
End Sub