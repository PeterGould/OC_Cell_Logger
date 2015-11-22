package com.olympiacircuits;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class bt_controller extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.olympiacircuits.bt_controller");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "com.olympiacircuits.bt_controller",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public int _scan_status = 0;
public String _pass_message = "";
public anywheresoftware.b4a.objects.BleManager _manager = null;
public anywheresoftware.b4a.objects.Serial.BluetoothAdmin _btadmin = null;
public anywheresoftware.b4a.objects.BleManager.GattCharacteristic _readcharacteristic = null;
public anywheresoftware.b4a.objects.BleManager.GattCharacteristic _writecharacteristic = null;
public anywheresoftware.b4a.objects.BleManager.GattServiceWrapper _bleservice = null;
public anywheresoftware.b4a.objects.collections.List _listbledevicesname = null;
public anywheresoftware.b4a.objects.collections.List _listbledevicesmacadress = null;
public int _connectstate = 0;
public int _cstatedisconnect = 0;
public int _cstatepreconnect = 0;
public int _cstateconnect = 0;
public anywheresoftware.b4a.objects.Timer _ble_timer = null;
public anywheresoftware.b4a.samples.gmailcontacts.httputils2service _httputils2service = null;
public anywheresoftware.b4a.samples.gmailcontacts.modrequest _modrequest = null;
public anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring _svcmonitoring = null;
public com.olympiacircuits.main _main = null;
public com.olympiacircuits.bt_interact _bt_interact = null;
public com.olympiacircuits.activity_db _activity_db = null;
public com.olympiacircuits.file_manager _file_manager = null;
public com.olympiacircuits.camera_activity _camera_activity = null;
public com.olympiacircuits.main_controller _main_controller = null;
public String  _ble_characteristicchanged(com.olympiacircuits.bt_controller __ref,anywheresoftware.b4a.objects.BleManager.GattCharacteristic _characteristic) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub ble_CharacteristicChanged (Characteristic As B";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Log(\"Read -> \" & Characteristic.GetStringValue(0)";
__c.Log("Read -> "+_characteristic.GetStringValue((int) (0)));
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return "";
}
public String  _ble_connected(com.olympiacircuits.bt_controller __ref,anywheresoftware.b4a.objects.collections.Map _services) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub ble_Connected (Services As Map)";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="If ConnectState = cstatePreConnect Then";
if (__ref._connectstate==__ref._cstatepreconnect) { 
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="ConnectState = cstateConnect";
__ref._connectstate = __ref._cstateconnect;
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="Log(\"Connected\")";
__c.Log("Connected");
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="bleService = Services.GetValueAt(2)";
__ref._bleservice.setObject((android.bluetooth.BluetoothGattService)(_services.GetValueAt((int) (2))));
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="readCharacteristic = bleService.GetCharacteri";
__ref._readcharacteristic.setObject((android.bluetooth.BluetoothGattCharacteristic)(__ref._bleservice.GetCharacteristics().GetValueAt((int) (0))));
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="Manager.ReadCharacteristic(readCharacteristic";
__ref._manager.ReadCharacteristic(__ref._readcharacteristic);
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="Manager.SetCharacteristicNotification(readCha";
__ref._manager.SetCharacteristicNotification(__ref._readcharacteristic,__c.True);
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="writeCharacteristic = bleService.GetCharacter";
__ref._writecharacteristic.setObject((android.bluetooth.BluetoothGattCharacteristic)(__ref._bleservice.GetCharacteristics().GetValueAt((int) (0))));
 };
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="End Sub";
return "";
}
public String  _ble_devicefound(com.olympiacircuits.bt_controller __ref,String _name,String _macaddress) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub ble_DeviceFound (Name As String, MacAddress As";
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Log(\"found BT \" & Name)";
__c.Log("found BT "+_name);
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="If Name.SubString2(0,4) = \"SODA\" Then";
if ((_name.substring((int) (0),(int) (4))).equals("SODA")) { 
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="listBLEDevicesName.Add(Name)";
__ref._listbledevicesname.Add((Object)(_name));
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="listBLEDevicesMacAdress.Add(MacAddress)";
__ref._listbledevicesmacadress.Add((Object)(_macaddress));
 };
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="End Sub";
return "";
}
public String  _ble_disconnected(com.olympiacircuits.bt_controller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub ble_Disconnected";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="ConnectState = cstateDisconnect";
__ref._connectstate = __ref._cstatedisconnect;
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Manager.refreshDeviceCache";
__ref._manager.refreshDeviceCache();
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="Manager.Close";
__ref._manager.Close();
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Log(\"Disconnected\")";
__c.Log("Disconnected");
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="End Sub";
return "";
}
public String  _ble_discoveryfinished(com.olympiacircuits.bt_controller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
int _i = 0;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub ble_DiscoveryFinished";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Log(\"Search finished\")";
__c.Log("Search finished");
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="If(listBLEDevicesName.Size) = 0 Then";
if ((__ref._listbledevicesname.getSize())==0) { 
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="scan_status = -1";
__ref._scan_status = (int) (-1);
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Log(\"No Devices Found\")";
__c.Log("No Devices Found");
 }else {
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="scan_status = listBLEDevicesName.Size";
__ref._scan_status = __ref._listbledevicesname.getSize();
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="For i = 0 To scan_status - 1";
{
final int step57 = 1;
final int limit57 = (int) (__ref._scan_status-1);
for (_i = (int) (0); (step57 > 0 && _i <= limit57) || (step57 < 0 && _i >= limit57); _i = ((int)(0 + _i + step57))) {
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="Log(\"found \" & listBLEDevicesName.Get(i))";
__c.Log("found "+BA.ObjectToString(__ref._listbledevicesname.Get(_i)));
 }
};
 };
RDebugUtils.currentLine=5111820;
 //BA.debugLineNum = 5111820;BA.debugLine="connect_a_device(0)";
__ref._connect_a_device(null,(int) (0));
RDebugUtils.currentLine=5111821;
 //BA.debugLineNum = 5111821;BA.debugLine="End Sub";
return "";
}
public String  _connect_a_device(com.olympiacircuits.bt_controller __ref,int _device_position) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub connect_a_device(device_position As Int)";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="If ConnectState = cstateDisconnect Then";
if (__ref._connectstate==__ref._cstatedisconnect) { 
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="ConnectState = cstatePreConnect";
__ref._connectstate = __ref._cstatepreconnect;
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="pass_message = listBLEDevicesName.Get(device_pos";
__ref._pass_message = BA.ObjectToString(__ref._listbledevicesname.Get(_device_position));
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="Manager.Connect(listBLEDevicesMacAdress.Get(devi";
__ref._manager.Connect(BA.ObjectToString(__ref._listbledevicesmacadress.Get(_device_position)),__c.True);
 };
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="End Sub";
return "";
}
public String  _connectbt(com.olympiacircuits.bt_controller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub connectBT";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="scan_status = 0";
__ref._scan_status = (int) (0);
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Manager.StopRssiTracking";
__ref._manager.StopRssiTracking();
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Manager.Disconnect";
__ref._manager.Disconnect();
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="ConnectState = cstateDisconnect";
__ref._connectstate = __ref._cstatedisconnect;
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="Manager.Scan(3000, Null)";
__ref._manager.Scan(ba,(long) (3000),(String[])(__c.Null));
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="listBLEDevicesName.clear";
__ref._listbledevicesname.Clear();
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="listBLEDevicesMacAdress.clear";
__ref._listbledevicesmacadress.Clear();
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="Log(\"Searching devices...\")";
__c.Log("Searching devices...");
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="ToastMessageShow( \"Searching devices...\" ,True)";
__c.ToastMessageShow("Searching devices...",__c.True);
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="End Sub";
return "";
}
public String  _disconnect_a_device(com.olympiacircuits.bt_controller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub disconnect_a_device";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Manager.Disconnect";
__ref._manager.Disconnect();
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return "";
}
public boolean  _initialize(com.olympiacircuits.bt_controller __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bt_controller";
boolean _wait = false;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub Initialize As Boolean";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim wait As Boolean = False";
_wait = __c.False;
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Try";
try {RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Manager.Initialize(\"BLE\")";
__ref._manager.Initialize(ba,"BLE");
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="btAdmin.Initialize(\"null\")";
__ref._btadmin.Initialize(ba,"null");
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="If btAdmin.IsEnabled = False Then";
if (__ref._btadmin.IsEnabled()==__c.False) { 
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="btAdmin.Enable";
__ref._btadmin.Enable();
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="wait = True";
_wait = __c.True;
 };
 } 
       catch (Exception e26) {
			ba.setLastException(e26);RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="Log(\"Error create service : \" & LastException.Me";
__c.Log("Error create service : "+__c.LastException(getActivityBA()).getMessage());
 };
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="listBLEDevicesName.Initialize";
__ref._listbledevicesname.Initialize();
RDebugUtils.currentLine=4915213;
 //BA.debugLineNum = 4915213;BA.debugLine="listBLEDevicesMacAdress.Initialize";
__ref._listbledevicesmacadress.Initialize();
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="Return(wait)";
if (true) return (_wait);
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="End Sub";
return false;
}
}