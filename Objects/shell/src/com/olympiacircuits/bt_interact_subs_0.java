package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bt_interact_subs_0 {


public static RemoteObject  _ble_characteristicchanged(RemoteObject _characteristic) throws Exception{
try {
		Debug.PushSubsStack("ble_CharacteristicChanged (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,172);
if (RapidSub.canDelegate("ble_characteristicchanged")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","ble_characteristicchanged", _characteristic);
RemoteObject _capture = RemoteObject.createImmutable("");
RemoteObject _capture_byte = null;
Debug.locals.put("Characteristic", _characteristic);
 BA.debugLineNum = 172;BA.debugLine="Sub ble_CharacteristicChanged (Characteristic As B";
Debug.ShouldStop(2048);
 BA.debugLineNum = 174;BA.debugLine="If first_read = True Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",bt_interact._first_read,bt_interact.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 175;BA.debugLine="ble_timer.Enabled = False";
Debug.ShouldStop(16384);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 176;BA.debugLine="timer_switch = \"bt_download\"";
Debug.ShouldStop(32768);
bt_interact._timer_switch = BA.ObjectToString("bt_download");
 };
 BA.debugLineNum = 179;BA.debugLine="ble_timer.Enabled = False";
Debug.ShouldStop(262144);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 180;BA.debugLine="ble_timer.Interval = 500";
Debug.ShouldStop(524288);
bt_interact._ble_timer.runMethod(true,"setInterval",BA.numberCast(long.class, 500));
 BA.debugLineNum = 181;BA.debugLine="ble_timer.Enabled = True";
Debug.ShouldStop(1048576);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 182;BA.debugLine="Dim capture As String = \"\"";
Debug.ShouldStop(2097152);
_capture = BA.ObjectToString("");Debug.locals.put("capture", _capture);Debug.locals.put("capture", _capture);
 BA.debugLineNum = 183;BA.debugLine="Dim  capture_byte() As Byte = readCharacteristic.";
Debug.ShouldStop(4194304);
_capture_byte = bt_interact._readcharacteristic.runMethod(false,"GetValue");Debug.locals.put("capture_byte", _capture_byte);Debug.locals.put("capture_byte", _capture_byte);
 BA.debugLineNum = 184;BA.debugLine="capture = conv.StringFromBytes(capture_byte,\"UTF8";
Debug.ShouldStop(8388608);
_capture = bt_interact._conv.runMethod(true,"StringFromBytes",(Object)(_capture_byte),(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("capture", _capture);
 BA.debugLineNum = 185;BA.debugLine="Log(capture)";
Debug.ShouldStop(16777216);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(_capture));
 BA.debugLineNum = 186;BA.debugLine="data_buffer = data_buffer & capture";
Debug.ShouldStop(33554432);
bt_interact._data_buffer = RemoteObject.concat(bt_interact._data_buffer,_capture);
 BA.debugLineNum = 188;BA.debugLine="writeCharacteristic.SetStringValue(\"!\")";
Debug.ShouldStop(134217728);
bt_interact._writecharacteristic.runVoidMethod ("SetStringValue",(Object)(RemoteObject.createImmutable("!")));
 BA.debugLineNum = 189;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic)";
Debug.ShouldStop(268435456);
bt_interact._manager.runVoidMethod ("WriteCharacteristic",(Object)(bt_interact._writecharacteristic));
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ble_connected(RemoteObject _services) throws Exception{
try {
		Debug.PushSubsStack("ble_Connected (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,142);
if (RapidSub.canDelegate("ble_connected")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","ble_connected", _services);
Debug.locals.put("Services", _services);
 BA.debugLineNum = 142;BA.debugLine="Sub ble_Connected (Services As Map)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 144;BA.debugLine="ble_timer.Enabled = False";
Debug.ShouldStop(32768);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 145;BA.debugLine="If ConnectState = cstatePreConnect Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",bt_interact._connectstate,BA.numberCast(double.class, bt_interact._cstatepreconnect))) { 
 BA.debugLineNum = 146;BA.debugLine="ConnectState = cstateConnect";
Debug.ShouldStop(131072);
bt_interact._connectstate = bt_interact._cstateconnect;
 BA.debugLineNum = 147;BA.debugLine="Log(\"Connected\")";
Debug.ShouldStop(262144);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Connected")));
 BA.debugLineNum = 148;BA.debugLine="bleService = Services.GetValueAt(2)";
Debug.ShouldStop(524288);
bt_interact._bleservice.setObject(_services.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 149;BA.debugLine="readCharacteristic = bleService.GetCharacteri";
Debug.ShouldStop(1048576);
bt_interact._readcharacteristic.setObject(bt_interact._bleservice.runMethod(false,"GetCharacteristics").runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 150;BA.debugLine="Manager.ReadCharacteristic(readCharacteristic";
Debug.ShouldStop(2097152);
bt_interact._manager.runVoidMethod ("ReadCharacteristic",(Object)(bt_interact._readcharacteristic));
 BA.debugLineNum = 151;BA.debugLine="Manager.SetCharacteristicNotification(readCha";
Debug.ShouldStop(4194304);
bt_interact._manager.runVoidMethod ("SetCharacteristicNotification",(Object)(bt_interact._readcharacteristic),(Object)(bt_interact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 152;BA.debugLine="writeCharacteristic = bleService.GetCharacter";
Debug.ShouldStop(8388608);
bt_interact._writecharacteristic.setObject(bt_interact._bleservice.runMethod(false,"GetCharacteristics").runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 154;BA.debugLine="timer_switch = \"device_timeout\"";
Debug.ShouldStop(33554432);
bt_interact._timer_switch = BA.ObjectToString("device_timeout");
 BA.debugLineNum = 155;BA.debugLine="ble_timer.Interval = 1000";
Debug.ShouldStop(67108864);
bt_interact._ble_timer.runMethod(true,"setInterval",BA.numberCast(long.class, 1000));
 BA.debugLineNum = 156;BA.debugLine="connection_tries = 0";
Debug.ShouldStop(134217728);
bt_interact._connection_tries = BA.numberCast(int.class, 0);
 BA.debugLineNum = 157;BA.debugLine="ble_timer.Enabled = True";
Debug.ShouldStop(268435456);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 159;BA.debugLine="writeCharacteristic.SetStringValue(\"T\")";
Debug.ShouldStop(1073741824);
bt_interact._writecharacteristic.runVoidMethod ("SetStringValue",(Object)(RemoteObject.createImmutable("T")));
 BA.debugLineNum = 160;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic)";
Debug.ShouldStop(-2147483648);
bt_interact._manager.runVoidMethod ("WriteCharacteristic",(Object)(bt_interact._writecharacteristic));
 };
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ble_devicefound(RemoteObject _name,RemoteObject _macaddress) throws Exception{
try {
		Debug.PushSubsStack("ble_DeviceFound (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,112);
if (RapidSub.canDelegate("ble_devicefound")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","ble_devicefound", _name, _macaddress);
Debug.locals.put("Name", _name);
Debug.locals.put("MacAddress", _macaddress);
 BA.debugLineNum = 112;BA.debugLine="Sub ble_DeviceFound (Name As String, MacAddress As";
Debug.ShouldStop(32768);
 BA.debugLineNum = 114;BA.debugLine="Log(\"found BT \" & Name)";
Debug.ShouldStop(131072);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("found BT "),_name)));
 BA.debugLineNum = 115;BA.debugLine="If Name.SubString2(0,4) = \"SODA\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_name.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 4))),BA.ObjectToString("SODA"))) { 
 BA.debugLineNum = 116;BA.debugLine="listBLEDevicesName.Add(Name)";
Debug.ShouldStop(524288);
bt_interact._listbledevicesname.runVoidMethod ("Add",(Object)((_name)));
 BA.debugLineNum = 117;BA.debugLine="listBLEDevicesMacAdress.Add(MacAddress)";
Debug.ShouldStop(1048576);
bt_interact._listbledevicesmacadress.runVoidMethod ("Add",(Object)((_macaddress)));
 };
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ble_disconnected() throws Exception{
try {
		Debug.PushSubsStack("ble_Disconnected (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,164);
if (RapidSub.canDelegate("ble_disconnected")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","ble_disconnected");
 BA.debugLineNum = 164;BA.debugLine="Sub ble_Disconnected";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="ConnectState = cstateDisconnect";
Debug.ShouldStop(16);
bt_interact._connectstate = bt_interact._cstatedisconnect;
 BA.debugLineNum = 166;BA.debugLine="Manager.refreshDeviceCache";
Debug.ShouldStop(32);
bt_interact._manager.runVoidMethod ("refreshDeviceCache");
 BA.debugLineNum = 167;BA.debugLine="Manager.Close";
Debug.ShouldStop(64);
bt_interact._manager.runVoidMethod ("Close");
 BA.debugLineNum = 168;BA.debugLine="Log(\"Disconnected\")";
Debug.ShouldStop(128);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Disconnected")));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ble_discoveryfinished() throws Exception{
try {
		Debug.PushSubsStack("ble_DiscoveryFinished (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,121);
if (RapidSub.canDelegate("ble_discoveryfinished")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","ble_discoveryfinished");
int _i = 0;
 BA.debugLineNum = 121;BA.debugLine="Sub ble_DiscoveryFinished";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="Log(\"Search finished\")";
Debug.ShouldStop(33554432);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Search finished")));
 BA.debugLineNum = 123;BA.debugLine="If(listBLEDevicesName.Size) = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",(bt_interact._listbledevicesname.runMethod(true,"getSize")),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 124;BA.debugLine="scan_status = -1";
Debug.ShouldStop(134217728);
bt_interact._scan_status = BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 125;BA.debugLine="Log(\"No Devices Found. Ending Service.\")";
Debug.ShouldStop(268435456);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("No Devices Found. Ending Service.")));
 BA.debugLineNum = 127;BA.debugLine="Service_Destroy";
Debug.ShouldStop(1073741824);
_service_destroy();
 }else {
 BA.debugLineNum = 129;BA.debugLine="scan_status = listBLEDevicesName.Size";
Debug.ShouldStop(1);
bt_interact._scan_status = bt_interact._listbledevicesname.runMethod(true,"getSize");
 BA.debugLineNum = 130;BA.debugLine="For i = 0 To scan_status - 1";
Debug.ShouldStop(2);
{
final int step95 = 1;
final int limit95 = RemoteObject.solve(new RemoteObject[] {bt_interact._scan_status,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step95 > 0 && _i <= limit95) || (step95 < 0 && _i >= limit95); _i = ((int)(0 + _i + step95))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 131;BA.debugLine="Log(\"found \" & listBLEDevicesName.Get(i))";
Debug.ShouldStop(4);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("found "),bt_interact._listbledevicesname.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 135;BA.debugLine="connection_tries = 0";
Debug.ShouldStop(64);
bt_interact._connection_tries = BA.numberCast(int.class, 0);
 BA.debugLineNum = 136;BA.debugLine="device_n = 0";
Debug.ShouldStop(128);
bt_interact._device_n = BA.numberCast(int.class, 0);
 BA.debugLineNum = 137;BA.debugLine="connect_a_device(device_n)";
Debug.ShouldStop(256);
_connect_a_device(bt_interact._device_n);
 BA.debugLineNum = 138;BA.debugLine="End Sub";
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
public static RemoteObject  _ble_timer_tick() throws Exception{
try {
		Debug.PushSubsStack("ble_timer_Tick (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,194);
if (RapidSub.canDelegate("ble_timer_tick")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","ble_timer_tick");
 BA.debugLineNum = 194;BA.debugLine="Sub ble_timer_Tick";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="Log(\"Entering timer with switch \" & timer_switch)";
Debug.ShouldStop(4);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Entering timer with switch "),bt_interact._timer_switch)));
 BA.debugLineNum = 196;BA.debugLine="ble_timer.Enabled = False 'always disable. Someti";
Debug.ShouldStop(8);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 199;BA.debugLine="If timer_switch = \"find_devices\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",bt_interact._timer_switch,BA.ObjectToString("find_devices"))) { 
 BA.debugLineNum = 200;BA.debugLine="scan_bt_devices";
Debug.ShouldStop(128);
_scan_bt_devices();
 };
 BA.debugLineNum = 204;BA.debugLine="If timer_switch = \"try_connect\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",bt_interact._timer_switch,BA.ObjectToString("try_connect"))) { 
 BA.debugLineNum = 205;BA.debugLine="connection_tries = connection_tries + 1";
Debug.ShouldStop(4096);
bt_interact._connection_tries = RemoteObject.solve(new RemoteObject[] {bt_interact._connection_tries,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 206;BA.debugLine="If connection_tries > 3 Then 'move on to the nex";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",bt_interact._connection_tries,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 207;BA.debugLine="device_n = device_n + 1";
Debug.ShouldStop(16384);
bt_interact._device_n = RemoteObject.solve(new RemoteObject[] {bt_interact._device_n,RemoteObject.createImmutable(1)}, "+",1, 1);
 };
 BA.debugLineNum = 209;BA.debugLine="ble_timer.Enabled = True  're-enable timer";
Debug.ShouldStop(65536);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 210;BA.debugLine="connect_a_device(device_n)";
Debug.ShouldStop(131072);
_connect_a_device(bt_interact._device_n);
 };
 BA.debugLineNum = 214;BA.debugLine="If timer_switch = \"device_timeout\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",bt_interact._timer_switch,BA.ObjectToString("device_timeout"))) { 
 BA.debugLineNum = 216;BA.debugLine="If connection_tries < 2 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("<",bt_interact._connection_tries,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 217;BA.debugLine="writeCharacteristic.SetStringValue(\"T\")";
Debug.ShouldStop(16777216);
bt_interact._writecharacteristic.runVoidMethod ("SetStringValue",(Object)(RemoteObject.createImmutable("T")));
 BA.debugLineNum = 218;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristi";
Debug.ShouldStop(33554432);
bt_interact._manager.runVoidMethod ("WriteCharacteristic",(Object)(bt_interact._writecharacteristic));
 BA.debugLineNum = 219;BA.debugLine="connection_tries = connection_tries + 1";
Debug.ShouldStop(67108864);
bt_interact._connection_tries = RemoteObject.solve(new RemoteObject[] {bt_interact._connection_tries,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 220;BA.debugLine="ble_timer.Enabled = True";
Debug.ShouldStop(134217728);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 222;BA.debugLine="Log(\"deviced timed out; trying next device\")";
Debug.ShouldStop(536870912);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("deviced timed out; trying next device")));
 BA.debugLineNum = 223;BA.debugLine="device_n = device_n + 1";
Debug.ShouldStop(1073741824);
bt_interact._device_n = RemoteObject.solve(new RemoteObject[] {bt_interact._device_n,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 224;BA.debugLine="connect_a_device(device_n)";
Debug.ShouldStop(-2147483648);
_connect_a_device(bt_interact._device_n);
 };
 };
 BA.debugLineNum = 229;BA.debugLine="If timer_switch = \"bt_download\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",bt_interact._timer_switch,BA.ObjectToString("bt_download"))) { 
 BA.debugLineNum = 231;BA.debugLine="Manager.SetCharacteristicNotification(readCharac";
Debug.ShouldStop(64);
bt_interact._manager.runVoidMethod ("SetCharacteristicNotification",(Object)(bt_interact._readcharacteristic),(Object)(bt_interact.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 233;BA.debugLine="Manager.Disconnect";
Debug.ShouldStop(256);
bt_interact._manager.runVoidMethod ("Disconnect");
 BA.debugLineNum = 235;BA.debugLine="write_bt_file";
Debug.ShouldStop(1024);
_write_bt_file();
 BA.debugLineNum = 237;BA.debugLine="device_n = device_n + 1";
Debug.ShouldStop(4096);
bt_interact._device_n = RemoteObject.solve(new RemoteObject[] {bt_interact._device_n,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 238;BA.debugLine="connect_a_device(device_n)";
Debug.ShouldStop(8192);
_connect_a_device(bt_interact._device_n);
 };
 BA.debugLineNum = 240;BA.debugLine="End Sub";
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
public static RemoteObject  _bt_finish() throws Exception{
try {
		Debug.PushSubsStack("bt_finish (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,105);
if (RapidSub.canDelegate("bt_finish")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","bt_finish");
 BA.debugLineNum = 105;BA.debugLine="Sub bt_finish";
Debug.ShouldStop(256);
 BA.debugLineNum = 107;BA.debugLine="If btAdmin.Enable = True Then btAdmin.Disable";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",bt_interact._btadmin.runMethod(true,"Enable"),bt_interact.mostCurrent.__c.getField(true,"True"))) { 
bt_interact._btadmin.runVoidMethod ("Disable");};
 BA.debugLineNum = 108;BA.debugLine="Service_Destroy";
Debug.ShouldStop(2048);
_service_destroy();
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _connect_a_device(RemoteObject _device_position) throws Exception{
try {
		Debug.PushSubsStack("connect_a_device (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,78);
if (RapidSub.canDelegate("connect_a_device")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","connect_a_device", _device_position);
Debug.locals.put("device_position", _device_position);
 BA.debugLineNum = 78;BA.debugLine="Sub connect_a_device(device_position As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="If device_n >= listBLEDevicesName.Size Then 'gone";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("g",bt_interact._device_n,BA.numberCast(double.class, bt_interact._listbledevicesname.runMethod(true,"getSize")))) { 
 BA.debugLineNum = 80;BA.debugLine="Log(\"No additional devices found. Done.\")";
Debug.ShouldStop(32768);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("No additional devices found. Done.")));
 BA.debugLineNum = 82;BA.debugLine="ble_timer.Enabled = False";
Debug.ShouldStop(131072);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 83;BA.debugLine="bt_finish";
Debug.ShouldStop(262144);
_bt_finish();
 BA.debugLineNum = 84;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 86;BA.debugLine="If ConnectState = cstateDisconnect Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",bt_interact._connectstate,BA.numberCast(double.class, bt_interact._cstatedisconnect))) { 
 BA.debugLineNum = 87;BA.debugLine="ConnectState = cstatePreConnect";
Debug.ShouldStop(4194304);
bt_interact._connectstate = bt_interact._cstatepreconnect;
 BA.debugLineNum = 88;BA.debugLine="Log(\"Connecting to \" & listBLEDevicesName.Get(de";
Debug.ShouldStop(8388608);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Connecting to "),bt_interact._listbledevicesname.runMethod(false,"Get",(Object)(_device_position)))));
 BA.debugLineNum = 89;BA.debugLine="Manager.Connect(listBLEDevicesMacAdress.Get(devi";
Debug.ShouldStop(16777216);
bt_interact._manager.runVoidMethod ("Connect",(Object)(BA.ObjectToString(bt_interact._listbledevicesmacadress.runMethod(false,"Get",(Object)(_device_position)))),(Object)(bt_interact.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 92;BA.debugLine="data_buffer = \"\"";
Debug.ShouldStop(134217728);
bt_interact._data_buffer = BA.ObjectToString("");
 BA.debugLineNum = 94;BA.debugLine="first_read = True";
Debug.ShouldStop(536870912);
bt_interact._first_read = bt_interact.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 96;BA.debugLine="ble_timer.Enabled = True";
Debug.ShouldStop(-2147483648);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disconnect_a_device() throws Exception{
try {
		Debug.PushSubsStack("disconnect_a_device (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,100);
if (RapidSub.canDelegate("disconnect_a_device")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","disconnect_a_device");
 BA.debugLineNum = 100;BA.debugLine="Sub disconnect_a_device";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="Manager.Disconnect";
Debug.ShouldStop(16);
bt_interact._manager.runVoidMethod ("Disconnect");
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim scan_status As Int = 0";
bt_interact._scan_status = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 8;BA.debugLine="Dim Manager As BleManager";
bt_interact._manager = RemoteObject.createNew ("anywheresoftware.b4a.objects.BleManager");
 //BA.debugLineNum = 9;BA.debugLine="Dim btAdmin As BluetoothAdmin";
bt_interact._btadmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.Serial.BluetoothAdmin");
 //BA.debugLineNum = 10;BA.debugLine="Dim readCharacteristic As BleCharacteristic";
bt_interact._readcharacteristic = RemoteObject.createNew ("anywheresoftware.b4a.objects.BleManager.GattCharacteristic");
 //BA.debugLineNum = 11;BA.debugLine="Dim writeCharacteristic As BleCharacteristic";
bt_interact._writecharacteristic = RemoteObject.createNew ("anywheresoftware.b4a.objects.BleManager.GattCharacteristic");
 //BA.debugLineNum = 12;BA.debugLine="Dim bleService As BleService";
bt_interact._bleservice = RemoteObject.createNew ("anywheresoftware.b4a.objects.BleManager.GattServiceWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Dim listBLEDevicesName As List";
bt_interact._listbledevicesname = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 14;BA.debugLine="Dim listBLEDevicesMacAdress As List";
bt_interact._listbledevicesmacadress = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 15;BA.debugLine="Dim ConnectState As Int";
bt_interact._connectstate = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 16;BA.debugLine="Dim cstateDisconnect As Int = 0";
bt_interact._cstatedisconnect = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 17;BA.debugLine="Dim cstatePreConnect As Int = 1";
bt_interact._cstatepreconnect = BA.numberCast(int.class, 1);
 //BA.debugLineNum = 18;BA.debugLine="Dim cstateConnect As Int = 2";
bt_interact._cstateconnect = BA.numberCast(int.class, 2);
 //BA.debugLineNum = 19;BA.debugLine="Dim connection_tries As Int = 0";
bt_interact._connection_tries = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 20;BA.debugLine="Dim device_n As Int = 0";
bt_interact._device_n = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 22;BA.debugLine="Dim first_read As Boolean = True";
bt_interact._first_read = bt_interact.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 23;BA.debugLine="Dim ble_timer As Timer";
bt_interact._ble_timer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 24;BA.debugLine="Dim timer_switch As String";
bt_interact._timer_switch = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Dim timer_wait As Int";
bt_interact._timer_wait = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 26;BA.debugLine="Dim data_buffer As String = \"\"";
bt_interact._data_buffer = BA.ObjectToString("");
 //BA.debugLineNum = 27;BA.debugLine="Dim conv As ByteConverter";
bt_interact._conv = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scan_bt_devices() throws Exception{
try {
		Debug.PushSubsStack("scan_bt_devices (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,65);
if (RapidSub.canDelegate("scan_bt_devices")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","scan_bt_devices");
 BA.debugLineNum = 65;BA.debugLine="Sub scan_bt_devices";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="scan_status = 0";
Debug.ShouldStop(2);
bt_interact._scan_status = BA.numberCast(int.class, 0);
 BA.debugLineNum = 67;BA.debugLine="Manager.StopRssiTracking";
Debug.ShouldStop(4);
bt_interact._manager.runVoidMethod ("StopRssiTracking");
 BA.debugLineNum = 68;BA.debugLine="Manager.Disconnect";
Debug.ShouldStop(8);
bt_interact._manager.runVoidMethod ("Disconnect");
 BA.debugLineNum = 69;BA.debugLine="ConnectState = cstateDisconnect";
Debug.ShouldStop(16);
bt_interact._connectstate = bt_interact._cstatedisconnect;
 BA.debugLineNum = 70;BA.debugLine="Manager.Scan(3000, Null)";
Debug.ShouldStop(32);
bt_interact._manager.runVoidMethod ("Scan",bt_interact.processBA,(Object)(BA.numberCast(long.class, 3000)),(Object)((bt_interact.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 71;BA.debugLine="listBLEDevicesName.clear";
Debug.ShouldStop(64);
bt_interact._listbledevicesname.runVoidMethod ("Clear");
 BA.debugLineNum = 72;BA.debugLine="listBLEDevicesMacAdress.clear";
Debug.ShouldStop(128);
bt_interact._listbledevicesmacadress.runVoidMethod ("Clear");
 BA.debugLineNum = 73;BA.debugLine="Log(\"Searching devices...\")";
Debug.ShouldStop(256);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Searching devices...")));
 BA.debugLineNum = 74;BA.debugLine="ToastMessageShow( \"Searching devices...\" ,True)";
Debug.ShouldStop(512);
bt_interact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString("Searching devices...")),(Object)(bt_interact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,30);
if (RapidSub.canDelegate("service_create")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","service_create");
 BA.debugLineNum = 30;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 32;BA.debugLine="Manager.Initialize(\"BLE\")";
Debug.ShouldStop(-2147483648);
bt_interact._manager.runVoidMethod ("Initialize",bt_interact.processBA,(Object)(RemoteObject.createImmutable("BLE")));
 BA.debugLineNum = 33;BA.debugLine="btAdmin.Initialize(\"null\")";
Debug.ShouldStop(1);
bt_interact._btadmin.runVoidMethod ("Initialize",bt_interact.processBA,(Object)(RemoteObject.createImmutable("null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",bt_interact.processBA, e27.toString()); BA.debugLineNum = 35;BA.debugLine="Log(\"Error create service : \" & LastException.Me";
Debug.ShouldStop(4);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error create service : "),bt_interact.mostCurrent.__c.runMethod(false,"LastException",bt_interact.processBA).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 37;BA.debugLine="listBLEDevicesName.Initialize";
Debug.ShouldStop(16);
bt_interact._listbledevicesname.runVoidMethod ("Initialize");
 BA.debugLineNum = 38;BA.debugLine="listBLEDevicesMacAdress.Initialize";
Debug.ShouldStop(32);
bt_interact._listbledevicesmacadress.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="ble_timer.Initialize(\"ble_timer\",timer_wait)";
Debug.ShouldStop(128);
bt_interact._ble_timer.runVoidMethod ("Initialize",bt_interact.processBA,(Object)(BA.ObjectToString("ble_timer")),(Object)(BA.numberCast(long.class, bt_interact._timer_wait)));
 BA.debugLineNum = 41;BA.debugLine="ble_timer.Enabled = False";
Debug.ShouldStop(256);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
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
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,57);
if (RapidSub.canDelegate("service_destroy")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","service_destroy");
 BA.debugLineNum = 57;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,44);
if (RapidSub.canDelegate("service_start")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 44;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="timer_wait = 1000";
Debug.ShouldStop(4096);
bt_interact._timer_wait = BA.numberCast(int.class, 1000);
 BA.debugLineNum = 47;BA.debugLine="If btAdmin.IsEnabled = False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",bt_interact._btadmin.runMethod(true,"IsEnabled"),bt_interact.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 48;BA.debugLine="btAdmin.Enable";
Debug.ShouldStop(32768);
bt_interact._btadmin.runVoidMethod ("Enable");
 BA.debugLineNum = 49;BA.debugLine="timer_wait = 5000";
Debug.ShouldStop(65536);
bt_interact._timer_wait = BA.numberCast(int.class, 5000);
 };
 BA.debugLineNum = 52;BA.debugLine="timer_switch = \"find_devices\"";
Debug.ShouldStop(524288);
bt_interact._timer_switch = BA.ObjectToString("find_devices");
 BA.debugLineNum = 53;BA.debugLine="ble_timer.Interval = timer_wait";
Debug.ShouldStop(1048576);
bt_interact._ble_timer.runMethod(true,"setInterval",BA.numberCast(long.class, bt_interact._timer_wait));
 BA.debugLineNum = 54;BA.debugLine="ble_timer.Enabled = True";
Debug.ShouldStop(2097152);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _write_bt_file() throws Exception{
try {
		Debug.PushSubsStack("write_bt_file (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,243);
if (RapidSub.canDelegate("write_bt_file")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","write_bt_file");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _k = RemoteObject.createImmutable(0);
 BA.debugLineNum = 243;BA.debugLine="Sub write_bt_file";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="Dim filename As String = listBLEDevicesName.Get(d";
Debug.ShouldStop(524288);
_filename = RemoteObject.concat(bt_interact._listbledevicesname.runMethod(false,"Get",(Object)(bt_interact._device_n)),RemoteObject.createImmutable("_"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 245;BA.debugLine="Dim K As Int";
Debug.ShouldStop(1048576);
_k = RemoteObject.createImmutable(0);Debug.locals.put("K", _k);
 BA.debugLineNum = 246;BA.debugLine="For k = 0 To 10";
Debug.ShouldStop(2097152);
{
final int step180 = 1;
final int limit180 = 10;
for (_k = BA.numberCast(int.class, 0); (step180 > 0 && _k.<Integer>get().intValue() <= limit180) || (step180 < 0 && _k.<Integer>get().intValue() >= limit180); _k = RemoteObject.createImmutable((int)(0 + _k.<Integer>get().intValue() + step180))) {
Debug.locals.put("K", _k);
 BA.debugLineNum = 247;BA.debugLine="filename = filename & Chr(Rnd(65,90))";
Debug.ShouldStop(4194304);
_filename = RemoteObject.concat(_filename,bt_interact.mostCurrent.__c.runMethod(true,"Chr",(Object)(bt_interact.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 65)),(Object)(BA.numberCast(int.class, 90))))));Debug.locals.put("filename", _filename);
 }
}Debug.locals.put("K", _k);
;
 BA.debugLineNum = 249;BA.debugLine="filename = filename & \".csv\"";
Debug.ShouldStop(16777216);
_filename = RemoteObject.concat(_filename,RemoteObject.createImmutable(".csv"));Debug.locals.put("filename", _filename);
 BA.debugLineNum = 250;BA.debugLine="File.WriteString(file_manager.current_dir,filenam";
Debug.ShouldStop(33554432);
bt_interact.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(bt_interact.mostCurrent._file_manager._current_dir),(Object)(_filename),(Object)(bt_interact._data_buffer));
 BA.debugLineNum = 251;BA.debugLine="data_buffer = \"\"";
Debug.ShouldStop(67108864);
bt_interact._data_buffer = BA.ObjectToString("");
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}