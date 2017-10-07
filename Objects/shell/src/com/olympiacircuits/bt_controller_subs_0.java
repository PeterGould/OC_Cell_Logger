package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bt_controller_subs_0 {


public static RemoteObject  _ble_characteristicchanged(RemoteObject __ref,RemoteObject _characteristic) throws Exception{
try {
		Debug.PushSubsStack("ble_CharacteristicChanged (bt_controller) ","bt_controller",10,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("ble_characteristicchanged")) return __ref.runUserSub(false, "bt_controller","ble_characteristicchanged", __ref, _characteristic);
Debug.locals.put("Characteristic", _characteristic);
 BA.debugLineNum = 109;BA.debugLine="Sub ble_CharacteristicChanged (Characteristic As B";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Log(\"Read -> \" & Characteristic.GetStringValue(0)";
Debug.ShouldStop(8192);
bt_controller.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Read -> "),_characteristic.runMethod(true,"GetStringValue",(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ble_connected(RemoteObject __ref,RemoteObject _services) throws Exception{
try {
		Debug.PushSubsStack("ble_Connected (bt_controller) ","bt_controller",10,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("ble_connected")) return __ref.runUserSub(false, "bt_controller","ble_connected", __ref, _services);
Debug.locals.put("Services", _services);
 BA.debugLineNum = 89;BA.debugLine="Sub ble_Connected (Services As Map)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="If ConnectState = cstatePreConnect Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_connectstate"),BA.numberCast(double.class, __ref.getField(true,"_cstatepreconnect")))) { 
 BA.debugLineNum = 91;BA.debugLine="ConnectState = cstateConnect";
Debug.ShouldStop(67108864);
__ref.setField ("_connectstate",__ref.getField(true,"_cstateconnect"));
 BA.debugLineNum = 92;BA.debugLine="Log(\"Connected\")";
Debug.ShouldStop(134217728);
bt_controller.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Connected")));
 BA.debugLineNum = 93;BA.debugLine="bleService = Services.GetValueAt(2)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_bleservice").setObject (_services.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 94;BA.debugLine="readCharacteristic = bleService.GetCharacteri";
Debug.ShouldStop(536870912);
__ref.getField(false,"_readcharacteristic").setObject (__ref.getField(false,"_bleservice").runMethod(false,"GetCharacteristics").runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 95;BA.debugLine="Manager.ReadCharacteristic(readCharacteristic";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_manager").runVoidMethod ("ReadCharacteristic",(Object)(__ref.getField(false,"_readcharacteristic")));
 BA.debugLineNum = 96;BA.debugLine="Manager.SetCharacteristicNotification(readCha";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_manager").runVoidMethod ("SetCharacteristicNotification",(Object)(__ref.getField(false,"_readcharacteristic")),(Object)(bt_controller.__c.getField(true,"True")));
 BA.debugLineNum = 97;BA.debugLine="writeCharacteristic = bleService.GetCharacter";
Debug.ShouldStop(1);
__ref.getField(false,"_writecharacteristic").setObject (__ref.getField(false,"_bleservice").runMethod(false,"GetCharacteristics").runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));
 };
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ble_devicefound(RemoteObject __ref,RemoteObject _name,RemoteObject _macaddress) throws Exception{
try {
		Debug.PushSubsStack("ble_DeviceFound (bt_controller) ","bt_controller",10,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("ble_devicefound")) return __ref.runUserSub(false, "bt_controller","ble_devicefound", __ref, _name, _macaddress);
Debug.locals.put("Name", _name);
Debug.locals.put("MacAddress", _macaddress);
 BA.debugLineNum = 50;BA.debugLine="Sub ble_DeviceFound (Name As String, MacAddress As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="Log(\"found BT \" & Name)";
Debug.ShouldStop(524288);
bt_controller.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("found BT "),_name)));
 BA.debugLineNum = 53;BA.debugLine="If Name.SubString2(0,4) = \"SODA\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_name.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 4))),BA.ObjectToString("SODA"))) { 
 BA.debugLineNum = 54;BA.debugLine="listBLEDevicesName.Add(Name)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_listbledevicesname").runVoidMethod ("Add",(Object)((_name)));
 BA.debugLineNum = 55;BA.debugLine="listBLEDevicesMacAdress.Add(MacAddress)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_listbledevicesmacadress").runVoidMethod ("Add",(Object)((_macaddress)));
 };
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ble_disconnected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ble_Disconnected (bt_controller) ","bt_controller",10,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("ble_disconnected")) return __ref.runUserSub(false, "bt_controller","ble_disconnected", __ref);
 BA.debugLineNum = 101;BA.debugLine="Sub ble_Disconnected";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="ConnectState = cstateDisconnect";
Debug.ShouldStop(32);
__ref.setField ("_connectstate",__ref.getField(true,"_cstatedisconnect"));
 BA.debugLineNum = 103;BA.debugLine="Manager.refreshDeviceCache";
Debug.ShouldStop(64);
__ref.getField(false,"_manager").runVoidMethod ("refreshDeviceCache");
 BA.debugLineNum = 104;BA.debugLine="Manager.Close";
Debug.ShouldStop(128);
__ref.getField(false,"_manager").runVoidMethod ("Close");
 BA.debugLineNum = 105;BA.debugLine="Log(\"Disconnected\")";
Debug.ShouldStop(256);
bt_controller.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Disconnected")));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ble_discoveryfinished(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ble_DiscoveryFinished (bt_controller) ","bt_controller",10,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("ble_discoveryfinished")) return __ref.runUserSub(false, "bt_controller","ble_discoveryfinished", __ref);
int _i = 0;
 BA.debugLineNum = 59;BA.debugLine="Sub ble_DiscoveryFinished";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Log(\"Search finished\")";
Debug.ShouldStop(134217728);
bt_controller.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Search finished")));
 BA.debugLineNum = 61;BA.debugLine="If(listBLEDevicesName.Size) = 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",(__ref.getField(false,"_listbledevicesname").runMethod(true,"getSize")),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 62;BA.debugLine="scan_status = -1";
Debug.ShouldStop(536870912);
__ref.setField ("_scan_status",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 63;BA.debugLine="Log(\"No Devices Found\")";
Debug.ShouldStop(1073741824);
bt_controller.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("No Devices Found")));
 }else {
 BA.debugLineNum = 65;BA.debugLine="scan_status = listBLEDevicesName.Size";
Debug.ShouldStop(1);
__ref.setField ("_scan_status",__ref.getField(false,"_listbledevicesname").runMethod(true,"getSize"));
 BA.debugLineNum = 66;BA.debugLine="For i = 0 To scan_status - 1";
Debug.ShouldStop(2);
{
final int step56 = 1;
final int limit56 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_scan_status"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step56 > 0 && _i <= limit56) || (step56 < 0 && _i >= limit56); _i = ((int)(0 + _i + step56))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 67;BA.debugLine="Log(\"found \" & listBLEDevicesName.Get(i))";
Debug.ShouldStop(4);
bt_controller.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("found "),__ref.getField(false,"_listbledevicesname").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 71;BA.debugLine="connect_a_device(0)";
Debug.ShouldStop(64);
__ref.runClassMethod (com.olympiacircuits.bt_controller.class, "_connect_a_device",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Dim scan_status As Int = 0";
bt_controller._scan_status = BA.numberCast(int.class, 0);__ref.setField("_scan_status",bt_controller._scan_status);
 //BA.debugLineNum = 5;BA.debugLine="Dim pass_message As String = \"\"";
bt_controller._pass_message = BA.ObjectToString("");__ref.setField("_pass_message",bt_controller._pass_message);
 //BA.debugLineNum = 6;BA.debugLine="Dim Manager As BleManager";
bt_controller._manager = RemoteObject.createNew ("anywheresoftware.b4a.objects.BleManager");__ref.setField("_manager",bt_controller._manager);
 //BA.debugLineNum = 7;BA.debugLine="Dim btAdmin As BluetoothAdmin";
bt_controller._btadmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.Serial.BluetoothAdmin");__ref.setField("_btadmin",bt_controller._btadmin);
 //BA.debugLineNum = 8;BA.debugLine="Dim readCharacteristic As BleCharacteristic";
bt_controller._readcharacteristic = RemoteObject.createNew ("anywheresoftware.b4a.objects.BleManager.GattCharacteristic");__ref.setField("_readcharacteristic",bt_controller._readcharacteristic);
 //BA.debugLineNum = 9;BA.debugLine="Dim writeCharacteristic As BleCharacteristic";
bt_controller._writecharacteristic = RemoteObject.createNew ("anywheresoftware.b4a.objects.BleManager.GattCharacteristic");__ref.setField("_writecharacteristic",bt_controller._writecharacteristic);
 //BA.debugLineNum = 10;BA.debugLine="Dim bleService As BleService";
bt_controller._bleservice = RemoteObject.createNew ("anywheresoftware.b4a.objects.BleManager.GattServiceWrapper");__ref.setField("_bleservice",bt_controller._bleservice);
 //BA.debugLineNum = 11;BA.debugLine="Dim listBLEDevicesName As List";
bt_controller._listbledevicesname = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_listbledevicesname",bt_controller._listbledevicesname);
 //BA.debugLineNum = 12;BA.debugLine="Dim listBLEDevicesMacAdress As List";
bt_controller._listbledevicesmacadress = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_listbledevicesmacadress",bt_controller._listbledevicesmacadress);
 //BA.debugLineNum = 13;BA.debugLine="Dim ConnectState As Int";
bt_controller._connectstate = RemoteObject.createImmutable(0);__ref.setField("_connectstate",bt_controller._connectstate);
 //BA.debugLineNum = 14;BA.debugLine="Dim cstateDisconnect As Int = 0";
bt_controller._cstatedisconnect = BA.numberCast(int.class, 0);__ref.setField("_cstatedisconnect",bt_controller._cstatedisconnect);
 //BA.debugLineNum = 15;BA.debugLine="Dim cstatePreConnect As Int = 1";
bt_controller._cstatepreconnect = BA.numberCast(int.class, 1);__ref.setField("_cstatepreconnect",bt_controller._cstatepreconnect);
 //BA.debugLineNum = 16;BA.debugLine="Dim cstateConnect As Int = 2";
bt_controller._cstateconnect = BA.numberCast(int.class, 2);__ref.setField("_cstateconnect",bt_controller._cstateconnect);
 //BA.debugLineNum = 17;BA.debugLine="Dim ble_timer As Timer";
bt_controller._ble_timer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_ble_timer",bt_controller._ble_timer);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _connect_a_device(RemoteObject __ref,RemoteObject _device_position) throws Exception{
try {
		Debug.PushSubsStack("connect_a_device (bt_controller) ","bt_controller",10,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("connect_a_device")) return __ref.runUserSub(false, "bt_controller","connect_a_device", __ref, _device_position);
Debug.locals.put("device_position", _device_position);
 BA.debugLineNum = 75;BA.debugLine="Sub connect_a_device(device_position As Int)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="If ConnectState = cstateDisconnect Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_connectstate"),BA.numberCast(double.class, __ref.getField(true,"_cstatedisconnect")))) { 
 BA.debugLineNum = 77;BA.debugLine="ConnectState = cstatePreConnect";
Debug.ShouldStop(4096);
__ref.setField ("_connectstate",__ref.getField(true,"_cstatepreconnect"));
 BA.debugLineNum = 78;BA.debugLine="pass_message = listBLEDevicesName.Get(device_pos";
Debug.ShouldStop(8192);
__ref.setField ("_pass_message",BA.ObjectToString(__ref.getField(false,"_listbledevicesname").runMethod(false,"Get",(Object)(_device_position))));
 BA.debugLineNum = 79;BA.debugLine="Manager.Connect(listBLEDevicesMacAdress.Get(devi";
Debug.ShouldStop(16384);
__ref.getField(false,"_manager").runVoidMethod ("Connect",(Object)(BA.ObjectToString(__ref.getField(false,"_listbledevicesmacadress").runMethod(false,"Get",(Object)(_device_position)))),(Object)(bt_controller.__c.getField(true,"True")));
 };
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _connectbt(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("connectBT (bt_controller) ","bt_controller",10,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("connectbt")) return __ref.runUserSub(false, "bt_controller","connectbt", __ref);
 BA.debugLineNum = 39;BA.debugLine="Sub connectBT";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="scan_status = 0";
Debug.ShouldStop(128);
__ref.setField ("_scan_status",BA.numberCast(int.class, 0));
 BA.debugLineNum = 41;BA.debugLine="Manager.StopRssiTracking";
Debug.ShouldStop(256);
__ref.getField(false,"_manager").runVoidMethod ("StopRssiTracking");
 BA.debugLineNum = 42;BA.debugLine="Manager.Disconnect";
Debug.ShouldStop(512);
__ref.getField(false,"_manager").runVoidMethod ("Disconnect");
 BA.debugLineNum = 43;BA.debugLine="ConnectState = cstateDisconnect";
Debug.ShouldStop(1024);
__ref.setField ("_connectstate",__ref.getField(true,"_cstatedisconnect"));
 BA.debugLineNum = 44;BA.debugLine="Manager.Scan(3000, Null)";
Debug.ShouldStop(2048);
__ref.getField(false,"_manager").runVoidMethod ("Scan",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, 3000)),(Object)((bt_controller.__c.getField(false,"Null"))));
 BA.debugLineNum = 45;BA.debugLine="listBLEDevicesName.clear";
Debug.ShouldStop(4096);
__ref.getField(false,"_listbledevicesname").runVoidMethod ("Clear");
 BA.debugLineNum = 46;BA.debugLine="listBLEDevicesMacAdress.clear";
Debug.ShouldStop(8192);
__ref.getField(false,"_listbledevicesmacadress").runVoidMethod ("Clear");
 BA.debugLineNum = 47;BA.debugLine="Log(\"Searching devices...\")";
Debug.ShouldStop(16384);
bt_controller.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Searching devices...")));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disconnect_a_device(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("disconnect_a_device (bt_controller) ","bt_controller",10,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("disconnect_a_device")) return __ref.runUserSub(false, "bt_controller","disconnect_a_device", __ref);
 BA.debugLineNum = 84;BA.debugLine="Sub disconnect_a_device";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Manager.Disconnect";
Debug.ShouldStop(1048576);
__ref.getField(false,"_manager").runVoidMethod ("Disconnect");
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bt_controller) ","bt_controller",10,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "bt_controller","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _wait = RemoteObject.createImmutable(false);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize As Boolean";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Dim wait As Boolean = False";
Debug.ShouldStop(2097152);
_wait = bt_controller.__c.getField(true,"False");Debug.locals.put("wait", _wait);Debug.locals.put("wait", _wait);
 BA.debugLineNum = 23;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 24;BA.debugLine="Manager.Initialize(\"BLE\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_manager").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("BLE")));
 BA.debugLineNum = 25;BA.debugLine="btAdmin.Initialize(\"null\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_btadmin").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("null")));
 BA.debugLineNum = 26;BA.debugLine="If btAdmin.IsEnabled = False Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_btadmin").runMethod(true,"IsEnabled"),bt_controller.__c.getField(true,"False"))) { 
 BA.debugLineNum = 27;BA.debugLine="btAdmin.Enable";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btadmin").runVoidMethod ("Enable");
 BA.debugLineNum = 28;BA.debugLine="wait = True";
Debug.ShouldStop(134217728);
_wait = bt_controller.__c.getField(true,"True");Debug.locals.put("wait", _wait);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e26) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e26.toString()); BA.debugLineNum = 31;BA.debugLine="Log(\"Error create service : \" & LastException.Me";
Debug.ShouldStop(1073741824);
bt_controller.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error create service : "),bt_controller.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA")).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 33;BA.debugLine="listBLEDevicesName.Initialize";
Debug.ShouldStop(1);
__ref.getField(false,"_listbledevicesname").runVoidMethod ("Initialize");
 BA.debugLineNum = 34;BA.debugLine="listBLEDevicesMacAdress.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_listbledevicesmacadress").runVoidMethod ("Initialize");
 BA.debugLineNum = 35;BA.debugLine="Return(wait)";
Debug.ShouldStop(4);
if (true) return (_wait);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}