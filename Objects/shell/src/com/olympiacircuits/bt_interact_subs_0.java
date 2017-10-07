package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bt_interact_subs_0 {


public static RemoteObject  _ble_characteristicchanged(RemoteObject _characteristic) throws Exception{
try {
		Debug.PushSubsStack("ble_CharacteristicChanged (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,184);
if (RapidSub.canDelegate("ble_characteristicchanged")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","ble_characteristicchanged", _characteristic);
RemoteObject _capture = RemoteObject.createImmutable("");
RemoteObject _capture_byte = null;
Debug.locals.put("Characteristic", _characteristic);
 BA.debugLineNum = 184;BA.debugLine="Sub ble_CharacteristicChanged (Characteristic As B";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="If Characteristic = writeCharacteristic Then Log(";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_characteristic,bt_interact._writecharacteristic)) { 
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("write")));};
 BA.debugLineNum = 186;BA.debugLine="If Characteristic = readCharacteristic Then Log(\"";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_characteristic,bt_interact._readcharacteristic)) { 
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("read")));};
 BA.debugLineNum = 187;BA.debugLine="If Characteristic = readCharacteristic And Charac";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_characteristic,bt_interact._readcharacteristic) && RemoteObject.solveBoolean("=",_characteristic,bt_interact._writecharacteristic)) { 
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("both")));};
 BA.debugLineNum = 188;BA.debugLine="Dim capture As String = \"\"";
Debug.ShouldStop(134217728);
_capture = BA.ObjectToString("");Debug.locals.put("capture", _capture);Debug.locals.put("capture", _capture);
 BA.debugLineNum = 189;BA.debugLine="Dim  capture_byte() As Byte = readCharacteristic.";
Debug.ShouldStop(268435456);
_capture_byte = bt_interact._readcharacteristic.runMethod(false,"GetValue");Debug.locals.put("capture_byte", _capture_byte);Debug.locals.put("capture_byte", _capture_byte);
 BA.debugLineNum = 190;BA.debugLine="capture = conv.StringFromBytes(capture_byte,\"UTF8";
Debug.ShouldStop(536870912);
_capture = bt_interact._conv.runMethod(true,"StringFromBytes",(Object)(_capture_byte),(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("capture", _capture);
 BA.debugLineNum = 191;BA.debugLine="Log(capture)";
Debug.ShouldStop(1073741824);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(_capture));
 BA.debugLineNum = 193;BA.debugLine="If at_active = True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",bt_interact._at_active,bt_interact.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 194;BA.debugLine="at_active = False";
Debug.ShouldStop(2);
bt_interact._at_active = bt_interact.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 195;BA.debugLine="soda_stage = soda_stage + 1 'acknowledge a reply";
Debug.ShouldStop(4);
bt_interact._soda_stage = RemoteObject.solve(new RemoteObject[] {bt_interact._soda_stage,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 196;BA.debugLine="soda_switch 'call the next step";
Debug.ShouldStop(8);
_soda_switch();
 BA.debugLineNum = 197;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 200;BA.debugLine="If first_read = True Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",bt_interact._first_read,bt_interact.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 201;BA.debugLine="ble_timer.Enabled = False";
Debug.ShouldStop(256);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 202;BA.debugLine="timer_switch = \"bt_download\"";
Debug.ShouldStop(512);
bt_interact._timer_switch = BA.ObjectToString("bt_download");
 };
 BA.debugLineNum = 205;BA.debugLine="ble_timer.Enabled = False";
Debug.ShouldStop(4096);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 206;BA.debugLine="ble_timer.Interval = 500";
Debug.ShouldStop(8192);
bt_interact._ble_timer.runMethod(true,"setInterval",BA.numberCast(long.class, 500));
 BA.debugLineNum = 207;BA.debugLine="ble_timer.Enabled = True";
Debug.ShouldStop(16384);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 208;BA.debugLine="data_buffer = data_buffer & capture";
Debug.ShouldStop(32768);
bt_interact._data_buffer = RemoteObject.concat(bt_interact._data_buffer,_capture);
 BA.debugLineNum = 210;BA.debugLine="writeCharacteristic.SetStringValue(\"!\")";
Debug.ShouldStop(131072);
bt_interact._writecharacteristic.runVoidMethod ("SetStringValue",(Object)(RemoteObject.createImmutable("!")));
 BA.debugLineNum = 211;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic)";
Debug.ShouldStop(262144);
bt_interact._manager.runVoidMethod ("WriteCharacteristic",(Object)(bt_interact._writecharacteristic));
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("ble_Connected (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,149);
if (RapidSub.canDelegate("ble_connected")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","ble_connected", _services);
int _k = 0;
Debug.locals.put("Services", _services);
 BA.debugLineNum = 149;BA.debugLine="Sub ble_Connected (Services As Map)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 151;BA.debugLine="ble_timer.Enabled = False";
Debug.ShouldStop(4194304);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 152;BA.debugLine="If ConnectState = cstatePreConnect Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",bt_interact._connectstate,BA.numberCast(double.class, bt_interact._cstatepreconnect))) { 
 BA.debugLineNum = 153;BA.debugLine="ConnectState = cstateConnect";
Debug.ShouldStop(16777216);
bt_interact._connectstate = bt_interact._cstateconnect;
 BA.debugLineNum = 154;BA.debugLine="Log(\"Connected\")";
Debug.ShouldStop(33554432);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Connected")));
 BA.debugLineNum = 155;BA.debugLine="bleService = Services.GetValueAt(2)";
Debug.ShouldStop(67108864);
bt_interact._bleservice.setObject(_services.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 156;BA.debugLine="readCharacteristic = bleService.GetCharacteri";
Debug.ShouldStop(134217728);
bt_interact._readcharacteristic.setObject(bt_interact._bleservice.runMethod(false,"GetCharacteristics").runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 157;BA.debugLine="Manager.ReadCharacteristic(readCharacteristic";
Debug.ShouldStop(268435456);
bt_interact._manager.runVoidMethod ("ReadCharacteristic",(Object)(bt_interact._readcharacteristic));
 BA.debugLineNum = 158;BA.debugLine="Manager.SetCharacteristicNotification(readCha";
Debug.ShouldStop(536870912);
bt_interact._manager.runVoidMethod ("SetCharacteristicNotification",(Object)(bt_interact._readcharacteristic),(Object)(bt_interact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 159;BA.debugLine="writeCharacteristic = bleService.GetCharacter";
Debug.ShouldStop(1073741824);
bt_interact._writecharacteristic.setObject(bt_interact._bleservice.runMethod(false,"GetCharacteristics").runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 160;BA.debugLine="For k = 0 To bleService.GetCharacteristics.Size";
Debug.ShouldStop(-2147483648);
{
final int step117 = 1;
final int limit117 = RemoteObject.solve(new RemoteObject[] {bt_interact._bleservice.runMethod(false,"GetCharacteristics").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_k = 0; (step117 > 0 && _k <= limit117) || (step117 < 0 && _k >= limit117); _k = ((int)(0 + _k + step117))) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 161;BA.debugLine="Log(k)";
Debug.ShouldStop(1);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_k)));
 BA.debugLineNum = 162;BA.debugLine="Log(bleService.GetCharacteristics.GetKeyAt(k))";
Debug.ShouldStop(2);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(bt_interact._bleservice.runMethod(false,"GetCharacteristics").runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _k))))));
 BA.debugLineNum = 163;BA.debugLine="Log(bleService.GetCharacteristics.GetValueAt(k)";
Debug.ShouldStop(4);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(bt_interact._bleservice.runMethod(false,"GetCharacteristics").runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _k))))));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 166;BA.debugLine="timer_switch = \"device_timeout\"";
Debug.ShouldStop(32);
bt_interact._timer_switch = BA.ObjectToString("device_timeout");
 BA.debugLineNum = 167;BA.debugLine="ble_timer.Interval = 2000";
Debug.ShouldStop(64);
bt_interact._ble_timer.runMethod(true,"setInterval",BA.numberCast(long.class, 2000));
 BA.debugLineNum = 168;BA.debugLine="connection_tries = 0";
Debug.ShouldStop(128);
bt_interact._connection_tries = BA.numberCast(int.class, 0);
 BA.debugLineNum = 169;BA.debugLine="ble_timer.Enabled = True";
Debug.ShouldStop(256);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 171;BA.debugLine="soda_stage = 0";
Debug.ShouldStop(1024);
bt_interact._soda_stage = BA.numberCast(int.class, 0);
 BA.debugLineNum = 172;BA.debugLine="soda_switch 'sub routine that handles setup";
Debug.ShouldStop(2048);
_soda_switch();
 };
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("ble_DeviceFound (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,116);
if (RapidSub.canDelegate("ble_devicefound")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","ble_devicefound", _name, _macaddress);
Debug.locals.put("Name", _name);
Debug.locals.put("MacAddress", _macaddress);
 BA.debugLineNum = 116;BA.debugLine="Sub ble_DeviceFound (Name As String, MacAddress As";
Debug.ShouldStop(524288);
 BA.debugLineNum = 118;BA.debugLine="If Name = Null Then Return";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("n",_name)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 120;BA.debugLine="Log(\"found BT \" & Name)";
Debug.ShouldStop(8388608);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("found BT "),_name)));
 BA.debugLineNum = 121;BA.debugLine="Name = Name.ToUpperCase ' makes it case insensiti";
Debug.ShouldStop(16777216);
_name = _name.runMethod(true,"toUpperCase");Debug.locals.put("Name", _name);
 BA.debugLineNum = 122;BA.debugLine="If Name.SubString2(0,4) = \"SODA\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_name.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 4))),BA.ObjectToString("SODA"))) { 
 BA.debugLineNum = 123;BA.debugLine="listBLEDevicesName.Add(Name)";
Debug.ShouldStop(67108864);
bt_interact._listbledevicesname.runVoidMethod ("Add",(Object)((_name)));
 BA.debugLineNum = 124;BA.debugLine="listBLEDevicesMacAdress.Add(MacAddress)";
Debug.ShouldStop(134217728);
bt_interact._listbledevicesmacadress.runVoidMethod ("Add",(Object)((_macaddress)));
 };
 BA.debugLineNum = 126;BA.debugLine="End Sub";
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
public static RemoteObject  _ble_disconnected() throws Exception{
try {
		Debug.PushSubsStack("ble_Disconnected (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,176);
if (RapidSub.canDelegate("ble_disconnected")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","ble_disconnected");
 BA.debugLineNum = 176;BA.debugLine="Sub ble_Disconnected";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="ConnectState = cstateDisconnect";
Debug.ShouldStop(65536);
bt_interact._connectstate = bt_interact._cstatedisconnect;
 BA.debugLineNum = 178;BA.debugLine="Manager.refreshDeviceCache";
Debug.ShouldStop(131072);
bt_interact._manager.runVoidMethod ("refreshDeviceCache");
 BA.debugLineNum = 179;BA.debugLine="Manager.Close";
Debug.ShouldStop(262144);
bt_interact._manager.runVoidMethod ("Close");
 BA.debugLineNum = 180;BA.debugLine="Log(\"Disconnected\")";
Debug.ShouldStop(524288);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Disconnected")));
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("ble_DiscoveryFinished (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,128);
if (RapidSub.canDelegate("ble_discoveryfinished")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","ble_discoveryfinished");
int _i = 0;
 BA.debugLineNum = 128;BA.debugLine="Sub ble_DiscoveryFinished";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="Log(\"Search finished\")";
Debug.ShouldStop(1);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Search finished")));
 BA.debugLineNum = 130;BA.debugLine="If(listBLEDevicesName.Size) = 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",(bt_interact._listbledevicesname.runMethod(true,"getSize")),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 131;BA.debugLine="scan_status = -1";
Debug.ShouldStop(4);
bt_interact._scan_status = BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 132;BA.debugLine="Log(\"No Devices Found. Ending Service.\")";
Debug.ShouldStop(8);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("No Devices Found. Ending Service.")));
 BA.debugLineNum = 134;BA.debugLine="Service_Destroy";
Debug.ShouldStop(32);
_service_destroy();
 }else {
 BA.debugLineNum = 136;BA.debugLine="scan_status = listBLEDevicesName.Size";
Debug.ShouldStop(128);
bt_interact._scan_status = bt_interact._listbledevicesname.runMethod(true,"getSize");
 BA.debugLineNum = 137;BA.debugLine="For i = 0 To scan_status - 1";
Debug.ShouldStop(256);
{
final int step99 = 1;
final int limit99 = RemoteObject.solve(new RemoteObject[] {bt_interact._scan_status,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step99 > 0 && _i <= limit99) || (step99 < 0 && _i >= limit99); _i = ((int)(0 + _i + step99))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 138;BA.debugLine="Log(\"found \" & listBLEDevicesName.Get(i))";
Debug.ShouldStop(512);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("found "),bt_interact._listbledevicesname.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 142;BA.debugLine="connection_tries = 0";
Debug.ShouldStop(8192);
bt_interact._connection_tries = BA.numberCast(int.class, 0);
 BA.debugLineNum = 143;BA.debugLine="device_n = 0";
Debug.ShouldStop(16384);
bt_interact._device_n = BA.numberCast(int.class, 0);
 BA.debugLineNum = 144;BA.debugLine="connect_a_device(device_n)";
Debug.ShouldStop(32768);
_connect_a_device(bt_interact._device_n);
 BA.debugLineNum = 145;BA.debugLine="End Sub";
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
public static RemoteObject  _ble_timer_tick() throws Exception{
try {
		Debug.PushSubsStack("ble_timer_Tick (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,216);
if (RapidSub.canDelegate("ble_timer_tick")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","ble_timer_tick");
 BA.debugLineNum = 216;BA.debugLine="Sub ble_timer_Tick";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="Log(\"Entering timer with switch \" & timer_switch)";
Debug.ShouldStop(16777216);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Entering timer with switch "),bt_interact._timer_switch)));
 BA.debugLineNum = 218;BA.debugLine="ble_timer.Enabled = False 'always disable. Someti";
Debug.ShouldStop(33554432);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 221;BA.debugLine="If timer_switch = \"find_devices\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",bt_interact._timer_switch,BA.ObjectToString("find_devices"))) { 
 BA.debugLineNum = 222;BA.debugLine="scan_bt_devices";
Debug.ShouldStop(536870912);
_scan_bt_devices();
 BA.debugLineNum = 223;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 227;BA.debugLine="If timer_switch = \"try_connect\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",bt_interact._timer_switch,BA.ObjectToString("try_connect"))) { 
 BA.debugLineNum = 228;BA.debugLine="connection_tries = connection_tries + 1";
Debug.ShouldStop(8);
bt_interact._connection_tries = RemoteObject.solve(new RemoteObject[] {bt_interact._connection_tries,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 229;BA.debugLine="If connection_tries > 3 Then 'move on to the nex";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",bt_interact._connection_tries,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 230;BA.debugLine="device_n = device_n + 1";
Debug.ShouldStop(32);
bt_interact._device_n = RemoteObject.solve(new RemoteObject[] {bt_interact._device_n,RemoteObject.createImmutable(1)}, "+",1, 1);
 };
 BA.debugLineNum = 232;BA.debugLine="ble_timer.Enabled = True  're-enable timer";
Debug.ShouldStop(128);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 233;BA.debugLine="connection_tries = 0";
Debug.ShouldStop(256);
bt_interact._connection_tries = BA.numberCast(int.class, 0);
 BA.debugLineNum = 234;BA.debugLine="connect_a_device(device_n)";
Debug.ShouldStop(512);
_connect_a_device(bt_interact._device_n);
 };
 BA.debugLineNum = 238;BA.debugLine="If timer_switch = \"device_timeout\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",bt_interact._timer_switch,BA.ObjectToString("device_timeout"))) { 
 BA.debugLineNum = 240;BA.debugLine="If connection_tries < 2 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("<",bt_interact._connection_tries,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 242;BA.debugLine="connection_tries = connection_tries + 1";
Debug.ShouldStop(131072);
bt_interact._connection_tries = RemoteObject.solve(new RemoteObject[] {bt_interact._connection_tries,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 243;BA.debugLine="ble_timer.Enabled = True";
Debug.ShouldStop(262144);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 244;BA.debugLine="soda_switch";
Debug.ShouldStop(524288);
_soda_switch();
 }else {
 BA.debugLineNum = 246;BA.debugLine="Log(\"deviced timed out; trying next device\")";
Debug.ShouldStop(2097152);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("deviced timed out; trying next device")));
 BA.debugLineNum = 247;BA.debugLine="device_n = device_n + 1";
Debug.ShouldStop(4194304);
bt_interact._device_n = RemoteObject.solve(new RemoteObject[] {bt_interact._device_n,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 248;BA.debugLine="connection_tries = 0";
Debug.ShouldStop(8388608);
bt_interact._connection_tries = BA.numberCast(int.class, 0);
 BA.debugLineNum = 249;BA.debugLine="connect_a_device(device_n)";
Debug.ShouldStop(16777216);
_connect_a_device(bt_interact._device_n);
 };
 };
 BA.debugLineNum = 254;BA.debugLine="If timer_switch = \"bt_download\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",bt_interact._timer_switch,BA.ObjectToString("bt_download"))) { 
 BA.debugLineNum = 256;BA.debugLine="timer_switch = \"DL_finished\"";
Debug.ShouldStop(-2147483648);
bt_interact._timer_switch = BA.ObjectToString("DL_finished");
 BA.debugLineNum = 257;BA.debugLine="ble_timer.Interval = 5000";
Debug.ShouldStop(1);
bt_interact._ble_timer.runMethod(true,"setInterval",BA.numberCast(long.class, 5000));
 BA.debugLineNum = 258;BA.debugLine="ble_timer.Enabled = True";
Debug.ShouldStop(2);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 260;BA.debugLine="soda_stage = 10";
Debug.ShouldStop(8);
bt_interact._soda_stage = BA.numberCast(int.class, 10);
 BA.debugLineNum = 261;BA.debugLine="soda_switch";
Debug.ShouldStop(16);
_soda_switch();
 };
 BA.debugLineNum = 265;BA.debugLine="If timer_switch = \"DL_finished\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",bt_interact._timer_switch,BA.ObjectToString("DL_finished"))) { 
 BA.debugLineNum = 267;BA.debugLine="write_bt_file";
Debug.ShouldStop(1024);
_write_bt_file();
 BA.debugLineNum = 269;BA.debugLine="device_n = device_n + 1";
Debug.ShouldStop(4096);
bt_interact._device_n = RemoteObject.solve(new RemoteObject[] {bt_interact._device_n,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 270;BA.debugLine="connect_a_device(device_n)";
Debug.ShouldStop(8192);
_connect_a_device(bt_interact._device_n);
 };
 BA.debugLineNum = 272;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("bt_finish (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,109);
if (RapidSub.canDelegate("bt_finish")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","bt_finish");
 BA.debugLineNum = 109;BA.debugLine="Sub bt_finish";
Debug.ShouldStop(4096);
 BA.debugLineNum = 111;BA.debugLine="If btAdmin.Enable = True Then btAdmin.Disable";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",bt_interact._btadmin.runMethod(true,"Enable"),bt_interact.mostCurrent.__c.getField(true,"True"))) { 
bt_interact._btadmin.runVoidMethod ("Disable");};
 BA.debugLineNum = 112;BA.debugLine="StopService(\"\")";
Debug.ShouldStop(32768);
bt_interact.mostCurrent.__c.runVoidMethod ("StopService",bt_interact.processBA,(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
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
public static RemoteObject  _connect_a_device(RemoteObject _device_position) throws Exception{
try {
		Debug.PushSubsStack("connect_a_device (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,81);
if (RapidSub.canDelegate("connect_a_device")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","connect_a_device", _device_position);
Debug.locals.put("device_position", _device_position);
 BA.debugLineNum = 81;BA.debugLine="Sub connect_a_device(device_position As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="If device_n >= listBLEDevicesName.Size Then 'gone";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("g",bt_interact._device_n,BA.numberCast(double.class, bt_interact._listbledevicesname.runMethod(true,"getSize")))) { 
 BA.debugLineNum = 83;BA.debugLine="Log(\"No additional devices found. Done.\")";
Debug.ShouldStop(262144);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("No additional devices found. Done.")));
 BA.debugLineNum = 85;BA.debugLine="ble_timer.Enabled = False";
Debug.ShouldStop(1048576);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 86;BA.debugLine="bt_finish";
Debug.ShouldStop(2097152);
_bt_finish();
 BA.debugLineNum = 87;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 89;BA.debugLine="If ConnectState = cstateDisconnect Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",bt_interact._connectstate,BA.numberCast(double.class, bt_interact._cstatedisconnect))) { 
 BA.debugLineNum = 90;BA.debugLine="ConnectState = cstatePreConnect";
Debug.ShouldStop(33554432);
bt_interact._connectstate = bt_interact._cstatepreconnect;
 BA.debugLineNum = 91;BA.debugLine="Log(\"Connecting to \" & listBLEDevicesName.Get(de";
Debug.ShouldStop(67108864);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Connecting to "),bt_interact._listbledevicesname.runMethod(false,"Get",(Object)(_device_position)))));
 BA.debugLineNum = 92;BA.debugLine="Manager.Connect(listBLEDevicesMacAdress.Get(devi";
Debug.ShouldStop(134217728);
bt_interact._manager.runVoidMethod ("Connect",(Object)(BA.ObjectToString(bt_interact._listbledevicesmacadress.runMethod(false,"Get",(Object)(_device_position)))),(Object)(bt_interact.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 95;BA.debugLine="data_buffer = \"\"";
Debug.ShouldStop(1073741824);
bt_interact._data_buffer = BA.ObjectToString("");
 BA.debugLineNum = 97;BA.debugLine="first_read = True";
Debug.ShouldStop(1);
bt_interact._first_read = bt_interact.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 99;BA.debugLine="timer_switch = \"try_connect\"";
Debug.ShouldStop(4);
bt_interact._timer_switch = BA.ObjectToString("try_connect");
 BA.debugLineNum = 100;BA.debugLine="ble_timer.Enabled = True";
Debug.ShouldStop(8);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("disconnect_a_device (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,104);
if (RapidSub.canDelegate("disconnect_a_device")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","disconnect_a_device");
 BA.debugLineNum = 104;BA.debugLine="Sub disconnect_a_device";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="Manager.Disconnect";
Debug.ShouldStop(256);
bt_interact._manager.runVoidMethod ("Disconnect");
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
 //BA.debugLineNum = 28;BA.debugLine="Dim at_active As Boolean = False";
bt_interact._at_active = bt_interact.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 29;BA.debugLine="Dim soda_stage As Int = 0";
bt_interact._soda_stage = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scan_bt_devices() throws Exception{
try {
		Debug.PushSubsStack("scan_bt_devices (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,67);
if (RapidSub.canDelegate("scan_bt_devices")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","scan_bt_devices");
 BA.debugLineNum = 67;BA.debugLine="Sub scan_bt_devices";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="listBLEDevicesName.Clear";
Debug.ShouldStop(16);
bt_interact._listbledevicesname.runVoidMethod ("Clear");
 BA.debugLineNum = 70;BA.debugLine="listBLEDevicesMacAdress.Clear";
Debug.ShouldStop(32);
bt_interact._listbledevicesmacadress.runVoidMethod ("Clear");
 BA.debugLineNum = 71;BA.debugLine="scan_status = 0";
Debug.ShouldStop(64);
bt_interact._scan_status = BA.numberCast(int.class, 0);
 BA.debugLineNum = 72;BA.debugLine="Manager.StopRssiTracking";
Debug.ShouldStop(128);
bt_interact._manager.runVoidMethod ("StopRssiTracking");
 BA.debugLineNum = 73;BA.debugLine="Manager.Disconnect";
Debug.ShouldStop(256);
bt_interact._manager.runVoidMethod ("Disconnect");
 BA.debugLineNum = 74;BA.debugLine="ConnectState = cstateDisconnect";
Debug.ShouldStop(512);
bt_interact._connectstate = bt_interact._cstatedisconnect;
 BA.debugLineNum = 75;BA.debugLine="Manager.Scan(3000, Null)";
Debug.ShouldStop(1024);
bt_interact._manager.runVoidMethod ("Scan",bt_interact.processBA,(Object)(BA.numberCast(long.class, 3000)),(Object)((bt_interact.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 76;BA.debugLine="Log(\"Searching devices...\")";
Debug.ShouldStop(2048);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Searching devices...")));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Service_Create (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,32);
if (RapidSub.canDelegate("service_create")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","service_create");
 BA.debugLineNum = 32;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 34;BA.debugLine="Manager.Initialize(\"BLE\")";
Debug.ShouldStop(2);
bt_interact._manager.runVoidMethod ("Initialize",bt_interact.processBA,(Object)(RemoteObject.createImmutable("BLE")));
 BA.debugLineNum = 35;BA.debugLine="btAdmin.Initialize(\"null\")";
Debug.ShouldStop(4);
bt_interact._btadmin.runVoidMethod ("Initialize",bt_interact.processBA,(Object)(RemoteObject.createImmutable("null")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e29) {
			BA.rdebugUtils.runVoidMethod("setLastException",bt_interact.processBA, e29.toString()); BA.debugLineNum = 37;BA.debugLine="Log(\"Error create service : \" & LastException.Me";
Debug.ShouldStop(16);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error create service : "),bt_interact.mostCurrent.__c.runMethod(false,"LastException",bt_interact.processBA).runMethod(true,"getMessage"))));
 };
 BA.debugLineNum = 39;BA.debugLine="listBLEDevicesName.Initialize";
Debug.ShouldStop(64);
bt_interact._listbledevicesname.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="listBLEDevicesMacAdress.Initialize";
Debug.ShouldStop(128);
bt_interact._listbledevicesmacadress.runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="ble_timer.Initialize(\"ble_timer\",timer_wait)";
Debug.ShouldStop(512);
bt_interact._ble_timer.runVoidMethod ("Initialize",bt_interact.processBA,(Object)(BA.ObjectToString("ble_timer")),(Object)(BA.numberCast(long.class, bt_interact._timer_wait)));
 BA.debugLineNum = 43;BA.debugLine="ble_timer.Enabled = False";
Debug.ShouldStop(1024);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Service_Destroy (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,59);
if (RapidSub.canDelegate("service_destroy")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","service_destroy");
 BA.debugLineNum = 59;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Service_Start (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,46);
if (RapidSub.canDelegate("service_start")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 46;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="timer_wait = 1000";
Debug.ShouldStop(16384);
bt_interact._timer_wait = BA.numberCast(int.class, 1000);
 BA.debugLineNum = 49;BA.debugLine="If btAdmin.IsEnabled = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",bt_interact._btadmin.runMethod(true,"IsEnabled"),bt_interact.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 50;BA.debugLine="btAdmin.Enable";
Debug.ShouldStop(131072);
bt_interact._btadmin.runVoidMethod ("Enable");
 BA.debugLineNum = 51;BA.debugLine="timer_wait = 5000";
Debug.ShouldStop(262144);
bt_interact._timer_wait = BA.numberCast(int.class, 5000);
 };
 BA.debugLineNum = 54;BA.debugLine="timer_switch = \"find_devices\"";
Debug.ShouldStop(2097152);
bt_interact._timer_switch = BA.ObjectToString("find_devices");
 BA.debugLineNum = 55;BA.debugLine="ble_timer.Interval = timer_wait";
Debug.ShouldStop(4194304);
bt_interact._ble_timer.runMethod(true,"setInterval",BA.numberCast(long.class, bt_interact._timer_wait));
 BA.debugLineNum = 56;BA.debugLine="ble_timer.Enabled = True";
Debug.ShouldStop(8388608);
bt_interact._ble_timer.runMethod(true,"setEnabled",bt_interact.mostCurrent.__c.getField(true,"True"));
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
public static RemoteObject  _soda_switch() throws Exception{
try {
		Debug.PushSubsStack("soda_switch (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,287);
if (RapidSub.canDelegate("soda_switch")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","soda_switch");
RemoteObject _bt_power = RemoteObject.createImmutable("");
RemoteObject _bt_indicator = RemoteObject.createImmutable("");
 BA.debugLineNum = 287;BA.debugLine="Sub soda_switch()";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 288;BA.debugLine="Dim bt_power As String = \"B\"";
Debug.ShouldStop(-2147483648);
_bt_power = BA.ObjectToString("B");Debug.locals.put("bt_power", _bt_power);Debug.locals.put("bt_power", _bt_power);
 BA.debugLineNum = 289;BA.debugLine="Dim bt_indicator As String = \"8\"";
Debug.ShouldStop(1);
_bt_indicator = BA.ObjectToString("8");Debug.locals.put("bt_indicator", _bt_indicator);Debug.locals.put("bt_indicator", _bt_indicator);
 BA.debugLineNum = 290;BA.debugLine="at_active = True";
Debug.ShouldStop(2);
bt_interact._at_active = bt_interact.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 291;BA.debugLine="Log(\"Entering soda_switch on soda_stage = \" & so";
Debug.ShouldStop(4);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Entering soda_switch on soda_stage = "),bt_interact._soda_stage)));
 BA.debugLineNum = 293;BA.debugLine="If soda_stage = 0 Then 'send the first command.";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",bt_interact._soda_stage,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 294;BA.debugLine="Log(\"Attempting to start SODA\")";
Debug.ShouldStop(32);
bt_interact.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Attempting to start SODA")));
 BA.debugLineNum = 295;BA.debugLine="writeCharacteristic.SetStringValue(\"AT+PIO\" & b";
Debug.ShouldStop(64);
bt_interact._writecharacteristic.runVoidMethod ("SetStringValue",(Object)(RemoteObject.concat(RemoteObject.createImmutable("AT+PIO"),_bt_indicator,RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 296;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic";
Debug.ShouldStop(128);
bt_interact._manager.runVoidMethod ("WriteCharacteristic",(Object)(bt_interact._writecharacteristic));
 BA.debugLineNum = 297;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 300;BA.debugLine="If soda_stage = 1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",bt_interact._soda_stage,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 301;BA.debugLine="writeCharacteristic.SetStringValue(\"AT+PIO\" & b";
Debug.ShouldStop(4096);
bt_interact._writecharacteristic.runVoidMethod ("SetStringValue",(Object)(RemoteObject.concat(RemoteObject.createImmutable("AT+PIO"),_bt_power,RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 302;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic";
Debug.ShouldStop(8192);
bt_interact._manager.runVoidMethod ("WriteCharacteristic",(Object)(bt_interact._writecharacteristic));
 BA.debugLineNum = 303;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 306;BA.debugLine="If soda_stage = 2 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",bt_interact._soda_stage,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 307;BA.debugLine="at_active = False 'end the AT activity";
Debug.ShouldStop(262144);
bt_interact._at_active = bt_interact.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 308;BA.debugLine="writeCharacteristic.SetStringValue(\"!\") 'Signal";
Debug.ShouldStop(524288);
bt_interact._writecharacteristic.runVoidMethod ("SetStringValue",(Object)(RemoteObject.createImmutable("!")));
 BA.debugLineNum = 309;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic";
Debug.ShouldStop(1048576);
bt_interact._manager.runVoidMethod ("WriteCharacteristic",(Object)(bt_interact._writecharacteristic));
 BA.debugLineNum = 310;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 314;BA.debugLine="If soda_stage = 10 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",bt_interact._soda_stage,BA.numberCast(double.class, 10))) { 
 BA.debugLineNum = 315;BA.debugLine="writeCharacteristic.SetStringValue(\"AT+PIO\" & b";
Debug.ShouldStop(67108864);
bt_interact._writecharacteristic.runVoidMethod ("SetStringValue",(Object)(RemoteObject.concat(RemoteObject.createImmutable("AT+PIO"),_bt_indicator,RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 316;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic";
Debug.ShouldStop(134217728);
bt_interact._manager.runVoidMethod ("WriteCharacteristic",(Object)(bt_interact._writecharacteristic));
 BA.debugLineNum = 317;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 320;BA.debugLine="If soda_stage = 11 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",bt_interact._soda_stage,BA.numberCast(double.class, 11))) { 
 BA.debugLineNum = 321;BA.debugLine="writeCharacteristic.SetStringValue(\"AT+PIO\" & b";
Debug.ShouldStop(1);
bt_interact._writecharacteristic.runVoidMethod ("SetStringValue",(Object)(RemoteObject.concat(RemoteObject.createImmutable("AT+PIO"),_bt_power,RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 322;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic";
Debug.ShouldStop(2);
bt_interact._manager.runVoidMethod ("WriteCharacteristic",(Object)(bt_interact._writecharacteristic));
 BA.debugLineNum = 323;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 326;BA.debugLine="If soda_stage = 12 Then 'final clean up";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",bt_interact._soda_stage,BA.numberCast(double.class, 12))) { 
 BA.debugLineNum = 327;BA.debugLine="Manager.Disconnect";
Debug.ShouldStop(64);
bt_interact._manager.runVoidMethod ("Disconnect");
 BA.debugLineNum = 328;BA.debugLine="at_active = False";
Debug.ShouldStop(128);
bt_interact._at_active = bt_interact.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 331;BA.debugLine="End Sub";
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
public static RemoteObject  _write_bt_file() throws Exception{
try {
		Debug.PushSubsStack("write_bt_file (bt_interact) ","bt_interact",1,bt_interact.processBA,bt_interact.mostCurrent,275);
if (RapidSub.canDelegate("write_bt_file")) return bt_interact.remoteMe.runUserSub(false, "bt_interact","write_bt_file");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _k = RemoteObject.createImmutable(0);
 BA.debugLineNum = 275;BA.debugLine="Sub write_bt_file";
Debug.ShouldStop(262144);
 BA.debugLineNum = 276;BA.debugLine="Dim filename As String = listBLEDevicesName.Get(d";
Debug.ShouldStop(524288);
_filename = RemoteObject.concat(bt_interact._listbledevicesname.runMethod(false,"Get",(Object)(bt_interact._device_n)),RemoteObject.createImmutable("_"));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 277;BA.debugLine="Dim K As Int";
Debug.ShouldStop(1048576);
_k = RemoteObject.createImmutable(0);Debug.locals.put("K", _k);
 BA.debugLineNum = 278;BA.debugLine="For k = 0 To 10";
Debug.ShouldStop(2097152);
{
final int step205 = 1;
final int limit205 = 10;
for (_k = BA.numberCast(int.class, 0); (step205 > 0 && _k.<Integer>get().intValue() <= limit205) || (step205 < 0 && _k.<Integer>get().intValue() >= limit205); _k = RemoteObject.createImmutable((int)(0 + _k.<Integer>get().intValue() + step205))) {
Debug.locals.put("K", _k);
 BA.debugLineNum = 279;BA.debugLine="filename = filename & Chr(Rnd(65,90))";
Debug.ShouldStop(4194304);
_filename = RemoteObject.concat(_filename,bt_interact.mostCurrent.__c.runMethod(true,"Chr",(Object)(bt_interact.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 65)),(Object)(BA.numberCast(int.class, 90))))));Debug.locals.put("filename", _filename);
 }
}Debug.locals.put("K", _k);
;
 BA.debugLineNum = 281;BA.debugLine="filename = filename & \".csv\"";
Debug.ShouldStop(16777216);
_filename = RemoteObject.concat(_filename,RemoteObject.createImmutable(".csv"));Debug.locals.put("filename", _filename);
 BA.debugLineNum = 282;BA.debugLine="File.WriteString(file_manager.current_dir,filenam";
Debug.ShouldStop(33554432);
bt_interact.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(bt_interact.mostCurrent._file_manager._current_dir),(Object)(_filename),(Object)(bt_interact._data_buffer));
 BA.debugLineNum = 283;BA.debugLine="data_buffer = \"\"";
Debug.ShouldStop(67108864);
bt_interact._data_buffer = BA.ObjectToString("");
 BA.debugLineNum = 284;BA.debugLine="End Sub";
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