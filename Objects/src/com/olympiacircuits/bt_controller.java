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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public anywheresoftware.b4a.samples.gmailcontacts.modrequest _modrequest = null;
public anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring _svcmonitoring = null;
public com.olympiacircuits.main _main = null;
public com.olympiacircuits.bt_interact _bt_interact = null;
public com.olympiacircuits.activity_db _activity_db = null;
public com.olympiacircuits.file_manager _file_manager = null;
public com.olympiacircuits.camera_activity _camera_activity = null;
public com.olympiacircuits.main_controller _main_controller = null;
public com.olympiacircuits.setup _setup = null;
public String  _ble_characteristicchanged(com.olympiacircuits.bt_controller __ref,anywheresoftware.b4a.objects.BleManager.GattCharacteristic _characteristic) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub ble_CharacteristicChanged (Characteristic As B";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Log(\"Read -> \" & Characteristic.GetStringValue(0)";
__c.Log("Read -> "+_characteristic.GetStringValue((int) (0)));
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return "";
}
public String  _ble_connected(com.olympiacircuits.bt_controller __ref,anywheresoftware.b4a.objects.collections.Map _services) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub ble_Connected (Services As Map)";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="If ConnectState = cstatePreConnect Then";
if (__ref._connectstate==__ref._cstatepreconnect) { 
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="ConnectState = cstateConnect";
__ref._connectstate = __ref._cstateconnect;
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Log(\"Connected\")";
__c.Log("Connected");
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="bleService = Services.GetValueAt(2)";
__ref._bleservice.setObject((android.bluetooth.BluetoothGattService)(_services.GetValueAt((int) (2))));
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="readCharacteristic = bleService.GetCharacteri";
__ref._readcharacteristic.setObject((android.bluetooth.BluetoothGattCharacteristic)(__ref._bleservice.GetCharacteristics().GetValueAt((int) (0))));
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="Manager.ReadCharacteristic(readCharacteristic";
__ref._manager.ReadCharacteristic(__ref._readcharacteristic);
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="Manager.SetCharacteristicNotification(readCha";
__ref._manager.SetCharacteristicNotification(__ref._readcharacteristic,__c.True);
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="writeCharacteristic = bleService.GetCharacter";
__ref._writecharacteristic.setObject((android.bluetooth.BluetoothGattCharacteristic)(__ref._bleservice.GetCharacteristics().GetValueAt((int) (0))));
 };
RDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="End Sub";
return "";
}
public String  _ble_devicefound(com.olympiacircuits.bt_controller __ref,String _name,String _macaddress) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub ble_DeviceFound (Name As String, MacAddress As";
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="Log(\"found BT \" & Name)";
__c.Log("found BT "+_name);
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="If Name.SubString2(0,4) = \"SODA\" Then";
if ((_name.substring((int) (0),(int) (4))).equals("SODA")) { 
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="listBLEDevicesName.Add(Name)";
__ref._listbledevicesname.Add((Object)(_name));
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="listBLEDevicesMacAdress.Add(MacAddress)";
__ref._listbledevicesmacadress.Add((Object)(_macaddress));
 };
RDebugUtils.currentLine=8060935;
 //BA.debugLineNum = 8060935;BA.debugLine="End Sub";
return "";
}
public String  _ble_disconnected(com.olympiacircuits.bt_controller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub ble_Disconnected";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="ConnectState = cstateDisconnect";
__ref._connectstate = __ref._cstatedisconnect;
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Manager.refreshDeviceCache";
__ref._manager.refreshDeviceCache();
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="Manager.Close";
__ref._manager.Close();
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="Log(\"Disconnected\")";
__c.Log("Disconnected");
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="End Sub";
return "";
}
public String  _ble_discoveryfinished(com.olympiacircuits.bt_controller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
int _i = 0;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub ble_DiscoveryFinished";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Log(\"Search finished\")";
__c.Log("Search finished");
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="If(listBLEDevicesName.Size) = 0 Then";
if ((__ref._listbledevicesname.getSize())==0) { 
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="scan_status = -1";
__ref._scan_status = (int) (-1);
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="Log(\"No Devices Found\")";
__c.Log("No Devices Found");
 }else {
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="scan_status = listBLEDevicesName.Size";
__ref._scan_status = __ref._listbledevicesname.getSize();
RDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="For i = 0 To scan_status - 1";
{
final int step56 = 1;
final int limit56 = (int) (__ref._scan_status-1);
for (_i = (int) (0); (step56 > 0 && _i <= limit56) || (step56 < 0 && _i >= limit56); _i = ((int)(0 + _i + step56))) {
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="Log(\"found \" & listBLEDevicesName.Get(i))";
__c.Log("found "+BA.ObjectToString(__ref._listbledevicesname.Get(_i)));
 }
};
 };
RDebugUtils.currentLine=8126476;
 //BA.debugLineNum = 8126476;BA.debugLine="connect_a_device(0)";
__ref._connect_a_device(null,(int) (0));
RDebugUtils.currentLine=8126477;
 //BA.debugLineNum = 8126477;BA.debugLine="End Sub";
return "";
}
public String  _connect_a_device(com.olympiacircuits.bt_controller __ref,int _device_position) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub connect_a_device(device_position As Int)";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="If ConnectState = cstateDisconnect Then";
if (__ref._connectstate==__ref._cstatedisconnect) { 
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="ConnectState = cstatePreConnect";
__ref._connectstate = __ref._cstatepreconnect;
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="pass_message = listBLEDevicesName.Get(device_pos";
__ref._pass_message = BA.ObjectToString(__ref._listbledevicesname.Get(_device_position));
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="Manager.Connect(listBLEDevicesMacAdress.Get(devi";
__ref._manager.Connect(BA.ObjectToString(__ref._listbledevicesmacadress.Get(_device_position)),__c.True);
 };
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="End Sub";
return "";
}
public String  _connectbt(com.olympiacircuits.bt_controller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub connectBT";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="scan_status = 0";
__ref._scan_status = (int) (0);
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Manager.StopRssiTracking";
__ref._manager.StopRssiTracking();
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="Manager.Disconnect";
__ref._manager.Disconnect();
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="ConnectState = cstateDisconnect";
__ref._connectstate = __ref._cstatedisconnect;
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="Manager.Scan(3000, Null)";
__ref._manager.Scan(ba,(long) (3000),(String[])(__c.Null));
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="listBLEDevicesName.clear";
__ref._listbledevicesname.Clear();
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="listBLEDevicesMacAdress.clear";
__ref._listbledevicesmacadress.Clear();
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="Log(\"Searching devices...\")";
__c.Log("Searching devices...");
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="End Sub";
return "";
}
public String  _disconnect_a_device(com.olympiacircuits.bt_controller __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bt_controller";
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub disconnect_a_device";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Manager.Disconnect";
__ref._manager.Disconnect();
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="End Sub";
return "";
}
public boolean  _initialize(com.olympiacircuits.bt_controller __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bt_controller";
boolean _wait = false;
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub Initialize As Boolean";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Dim wait As Boolean = False";
_wait = __c.False;
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Try";
try {RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="Manager.Initialize(\"BLE\")";
__ref._manager.Initialize(ba,"BLE");
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="btAdmin.Initialize(\"null\")";
__ref._btadmin.Initialize(ba,"null");
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="If btAdmin.IsEnabled = False Then";
if (__ref._btadmin.IsEnabled()==__c.False) { 
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="btAdmin.Enable";
__ref._btadmin.Enable();
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="wait = True";
_wait = __c.True;
 };
 } 
       catch (Exception e26) {
			ba.setLastException(e26);RDebugUtils.currentLine=7929866;
 //BA.debugLineNum = 7929866;BA.debugLine="Log(\"Error create service : \" & LastException.Me";
__c.Log("Error create service : "+__c.LastException(getActivityBA()).getMessage());
 };
RDebugUtils.currentLine=7929868;
 //BA.debugLineNum = 7929868;BA.debugLine="listBLEDevicesName.Initialize";
__ref._listbledevicesname.Initialize();
RDebugUtils.currentLine=7929869;
 //BA.debugLineNum = 7929869;BA.debugLine="listBLEDevicesMacAdress.Initialize";
__ref._listbledevicesmacadress.Initialize();
RDebugUtils.currentLine=7929870;
 //BA.debugLineNum = 7929870;BA.debugLine="Return(wait)";
if (true) return (_wait);
RDebugUtils.currentLine=7929871;
 //BA.debugLineNum = 7929871;BA.debugLine="End Sub";
return false;
}
}