package com.olympiacircuits;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class bt_interact extends android.app.Service {
	public static class bt_interact_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
			android.content.Intent in = new android.content.Intent(context, bt_interact.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
			context.startService(in);
		}

	}
    static bt_interact mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return bt_interact.class;
	}
	@Override
	public void onCreate() {
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "com.olympiacircuits", "com.olympiacircuits.bt_interact");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        processBA.setActivityPaused(false);
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "com.olympiacircuits.bt_interact", processBA, _service);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, true) == false) {
				
		}
		else {
            BA.LogInfo("** Service (bt_interact) Create **");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			if (ServiceHelper.StarterHelper.waitForLayout != null)
				BA.handler.post(ServiceHelper.StarterHelper.waitForLayout);
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA))
			handleStart(intent);
		else {
			ServiceHelper.StarterHelper.waitForLayout = new Runnable() {
				public void run() {
                    BA.LogInfo("** Service (bt_interact) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
				}
			};
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (bt_interact) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = new anywheresoftware.b4a.objects.IntentWrapper();
    			if (intent != null) {
    				if (intent.hasExtra("b4a_internal_intent"))
    					iw.setObject((android.content.Intent) intent.getParcelableExtra("b4a_internal_intent"));
    				else
    					iw.setObject(intent);
    			}
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
	@Override
	public void onDestroy() {
        BA.LogInfo("** Service (bt_interact) Destroy **");
		processBA.raiseEvent(null, "service_destroy");
        processBA.service = null;
		mostCurrent = null;
		processBA.setActivityPaused(true);
        processBA.runHook("ondestroy", this, null);
	}

public anywheresoftware.b4a.keywords.Common __c = null;
public static int _scan_status = 0;
public static anywheresoftware.b4a.objects.BleManager _manager = null;
public static anywheresoftware.b4a.objects.Serial.BluetoothAdmin _btadmin = null;
public static anywheresoftware.b4a.objects.BleManager.GattCharacteristic _readcharacteristic = null;
public static anywheresoftware.b4a.objects.BleManager.GattCharacteristic _writecharacteristic = null;
public static anywheresoftware.b4a.objects.BleManager.GattServiceWrapper _bleservice = null;
public static anywheresoftware.b4a.objects.collections.List _listbledevicesname = null;
public static anywheresoftware.b4a.objects.collections.List _listbledevicesmacadress = null;
public static int _connectstate = 0;
public static int _cstatedisconnect = 0;
public static int _cstatepreconnect = 0;
public static int _cstateconnect = 0;
public static int _connection_tries = 0;
public static int _device_n = 0;
public static boolean _first_read = false;
public static anywheresoftware.b4a.objects.Timer _ble_timer = null;
public static String _timer_switch = "";
public static int _timer_wait = 0;
public static String _data_buffer = "";
public static anywheresoftware.b4a.agraham.byteconverter.ByteConverter _conv = null;
public anywheresoftware.b4a.samples.gmailcontacts.httputils2service _httputils2service = null;
public anywheresoftware.b4a.samples.gmailcontacts.modrequest _modrequest = null;
public anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring _svcmonitoring = null;
public com.olympiacircuits.main _main = null;
public com.olympiacircuits.activity_db _activity_db = null;
public com.olympiacircuits.file_manager _file_manager = null;
public com.olympiacircuits.camera_activity _camera_activity = null;
public com.olympiacircuits.main_controller _main_controller = null;
public static String  _ble_characteristicchanged(anywheresoftware.b4a.objects.BleManager.GattCharacteristic _characteristic) throws Exception{
RDebugUtils.currentModule="bt_interact";
String _capture = "";
byte[] _capture_byte = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub ble_CharacteristicChanged (Characteristic As B";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="If first_read = True Then";
if (_first_read==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="ble_timer.Enabled = False";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="timer_switch = \"bt_download\"";
_timer_switch = "bt_download";
 };
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="ble_timer.Enabled = False";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="ble_timer.Interval = 500";
_ble_timer.setInterval((long) (500));
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="ble_timer.Enabled = True";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="Dim capture As String = \"\"";
_capture = "";
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="Dim  capture_byte() As Byte = readCharacteristic.";
_capture_byte = _readcharacteristic.GetValue();
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="capture = conv.StringFromBytes(capture_byte,\"UTF8";
_capture = _conv.StringFromBytes(_capture_byte,"UTF8");
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="Log(capture)";
anywheresoftware.b4a.keywords.Common.Log(_capture);
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="data_buffer = data_buffer & capture";
_data_buffer = _data_buffer+_capture;
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="writeCharacteristic.SetStringValue(\"!\")";
_writecharacteristic.SetStringValue("!");
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic)";
_manager.WriteCharacteristic(_writecharacteristic);
RDebugUtils.currentLine=1310738;
 //BA.debugLineNum = 1310738;BA.debugLine="End Sub";
return "";
}
public static String  _ble_connected(anywheresoftware.b4a.objects.collections.Map _services) throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub ble_Connected (Services As Map)";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="ble_timer.Enabled = False";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="If ConnectState = cstatePreConnect Then";
if (_connectstate==_cstatepreconnect) { 
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="ConnectState = cstateConnect";
_connectstate = _cstateconnect;
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Log(\"Connected\")";
anywheresoftware.b4a.keywords.Common.Log("Connected");
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="bleService = Services.GetValueAt(2)";
_bleservice.setObject((android.bluetooth.BluetoothGattService)(_services.GetValueAt((int) (2))));
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="readCharacteristic = bleService.GetCharacteri";
_readcharacteristic.setObject((android.bluetooth.BluetoothGattCharacteristic)(_bleservice.GetCharacteristics().GetValueAt((int) (0))));
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="Manager.ReadCharacteristic(readCharacteristic";
_manager.ReadCharacteristic(_readcharacteristic);
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="Manager.SetCharacteristicNotification(readCha";
_manager.SetCharacteristicNotification(_readcharacteristic,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="writeCharacteristic = bleService.GetCharacter";
_writecharacteristic.setObject((android.bluetooth.BluetoothGattCharacteristic)(_bleservice.GetCharacteristics().GetValueAt((int) (0))));
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="timer_switch = \"device_timeout\"";
_timer_switch = "device_timeout";
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="ble_timer.Interval = 1000";
_ble_timer.setInterval((long) (1000));
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="connection_tries = 0";
_connection_tries = (int) (0);
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="ble_timer.Enabled = True";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="writeCharacteristic.SetStringValue(\"T\")";
_writecharacteristic.SetStringValue("T");
RDebugUtils.currentLine=1179666;
 //BA.debugLineNum = 1179666;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic)";
_manager.WriteCharacteristic(_writecharacteristic);
 };
RDebugUtils.currentLine=1179668;
 //BA.debugLineNum = 1179668;BA.debugLine="End Sub";
return "";
}
public static String  _ble_devicefound(String _name,String _macaddress) throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub ble_DeviceFound (Name As String, MacAddress As";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Log(\"found BT \" & Name)";
anywheresoftware.b4a.keywords.Common.Log("found BT "+_name);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="If Name.SubString2(0,4) = \"SODA\" Then";
if ((_name.substring((int) (0),(int) (4))).equals("SODA")) { 
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="listBLEDevicesName.Add(Name)";
_listbledevicesname.Add((Object)(_name));
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="listBLEDevicesMacAdress.Add(MacAddress)";
_listbledevicesmacadress.Add((Object)(_macaddress));
 };
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="End Sub";
return "";
}
public static String  _ble_disconnected() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub ble_Disconnected";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="ConnectState = cstateDisconnect";
_connectstate = _cstatedisconnect;
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Manager.refreshDeviceCache";
_manager.refreshDeviceCache();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Manager.Close";
_manager.Close();
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Log(\"Disconnected\")";
anywheresoftware.b4a.keywords.Common.Log("Disconnected");
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="End Sub";
return "";
}
public static String  _ble_discoveryfinished() throws Exception{
RDebugUtils.currentModule="bt_interact";
int _i = 0;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub ble_DiscoveryFinished";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Log(\"Search finished\")";
anywheresoftware.b4a.keywords.Common.Log("Search finished");
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If(listBLEDevicesName.Size) = 0 Then";
if ((_listbledevicesname.getSize())==0) { 
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="scan_status = -1";
_scan_status = (int) (-1);
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Log(\"No Devices Found. Ending Service.\")";
anywheresoftware.b4a.keywords.Common.Log("No Devices Found. Ending Service.");
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Service_Destroy";
_service_destroy();
 }else {
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="scan_status = listBLEDevicesName.Size";
_scan_status = _listbledevicesname.getSize();
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="For i = 0 To scan_status - 1";
{
final int step95 = 1;
final int limit95 = (int) (_scan_status-1);
for (_i = (int) (0); (step95 > 0 && _i <= limit95) || (step95 < 0 && _i >= limit95); _i = ((int)(0 + _i + step95))) {
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Log(\"found \" & listBLEDevicesName.Get(i))";
anywheresoftware.b4a.keywords.Common.Log("found "+BA.ObjectToString(_listbledevicesname.Get(_i)));
 }
};
 };
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="connection_tries = 0";
_connection_tries = (int) (0);
RDebugUtils.currentLine=1114127;
 //BA.debugLineNum = 1114127;BA.debugLine="device_n = 0";
_device_n = (int) (0);
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="connect_a_device(device_n)";
_connect_a_device(_device_n);
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _connect_a_device(int _device_position) throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub connect_a_device(device_position As Int)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="If device_n >= listBLEDevicesName.Size Then 'gone";
if (_device_n>=_listbledevicesname.getSize()) { 
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Log(\"No additional devices found. Done.\")";
anywheresoftware.b4a.keywords.Common.Log("No additional devices found. Done.");
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="ble_timer.Enabled = False";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="bt_finish";
_bt_finish();
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="If ConnectState = cstateDisconnect Then";
if (_connectstate==_cstatedisconnect) { 
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="ConnectState = cstatePreConnect";
_connectstate = _cstatepreconnect;
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="Log(\"Connecting to \" & listBLEDevicesName.Get(de";
anywheresoftware.b4a.keywords.Common.Log("Connecting to "+BA.ObjectToString(_listbledevicesname.Get(_device_position)));
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="Manager.Connect(listBLEDevicesMacAdress.Get(devi";
_manager.Connect(BA.ObjectToString(_listbledevicesmacadress.Get(_device_position)),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=851982;
 //BA.debugLineNum = 851982;BA.debugLine="data_buffer = \"\"";
_data_buffer = "";
RDebugUtils.currentLine=851984;
 //BA.debugLineNum = 851984;BA.debugLine="first_read = True";
_first_read = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="ble_timer.Enabled = True";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="End Sub";
return "";
}
public static String  _ble_timer_tick() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub ble_timer_Tick";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Log(\"Entering timer with switch \" & timer_switch)";
anywheresoftware.b4a.keywords.Common.Log("Entering timer with switch "+_timer_switch);
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="ble_timer.Enabled = False 'always disable. Someti";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="If timer_switch = \"find_devices\" Then";
if ((_timer_switch).equals("find_devices")) { 
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="scan_bt_devices";
_scan_bt_devices();
 };
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="If timer_switch = \"try_connect\" Then";
if ((_timer_switch).equals("try_connect")) { 
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="connection_tries = connection_tries + 1";
_connection_tries = (int) (_connection_tries+1);
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="If connection_tries > 3 Then 'move on to the nex";
if (_connection_tries>3) { 
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="device_n = device_n + 1";
_device_n = (int) (_device_n+1);
 };
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="ble_timer.Enabled = True  're-enable timer";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="connect_a_device(device_n)";
_connect_a_device(_device_n);
 };
RDebugUtils.currentLine=1376276;
 //BA.debugLineNum = 1376276;BA.debugLine="If timer_switch = \"device_timeout\" Then";
if ((_timer_switch).equals("device_timeout")) { 
RDebugUtils.currentLine=1376278;
 //BA.debugLineNum = 1376278;BA.debugLine="If connection_tries < 2 Then";
if (_connection_tries<2) { 
RDebugUtils.currentLine=1376279;
 //BA.debugLineNum = 1376279;BA.debugLine="writeCharacteristic.SetStringValue(\"T\")";
_writecharacteristic.SetStringValue("T");
RDebugUtils.currentLine=1376280;
 //BA.debugLineNum = 1376280;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristi";
_manager.WriteCharacteristic(_writecharacteristic);
RDebugUtils.currentLine=1376281;
 //BA.debugLineNum = 1376281;BA.debugLine="connection_tries = connection_tries + 1";
_connection_tries = (int) (_connection_tries+1);
RDebugUtils.currentLine=1376282;
 //BA.debugLineNum = 1376282;BA.debugLine="ble_timer.Enabled = True";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=1376284;
 //BA.debugLineNum = 1376284;BA.debugLine="Log(\"deviced timed out; trying next device\")";
anywheresoftware.b4a.keywords.Common.Log("deviced timed out; trying next device");
RDebugUtils.currentLine=1376285;
 //BA.debugLineNum = 1376285;BA.debugLine="device_n = device_n + 1";
_device_n = (int) (_device_n+1);
RDebugUtils.currentLine=1376286;
 //BA.debugLineNum = 1376286;BA.debugLine="connect_a_device(device_n)";
_connect_a_device(_device_n);
 };
 };
RDebugUtils.currentLine=1376291;
 //BA.debugLineNum = 1376291;BA.debugLine="If timer_switch = \"bt_download\" Then";
if ((_timer_switch).equals("bt_download")) { 
RDebugUtils.currentLine=1376293;
 //BA.debugLineNum = 1376293;BA.debugLine="Manager.SetCharacteristicNotification(readCharac";
_manager.SetCharacteristicNotification(_readcharacteristic,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1376295;
 //BA.debugLineNum = 1376295;BA.debugLine="Manager.Disconnect";
_manager.Disconnect();
RDebugUtils.currentLine=1376297;
 //BA.debugLineNum = 1376297;BA.debugLine="write_bt_file";
_write_bt_file();
RDebugUtils.currentLine=1376299;
 //BA.debugLineNum = 1376299;BA.debugLine="device_n = device_n + 1";
_device_n = (int) (_device_n+1);
RDebugUtils.currentLine=1376300;
 //BA.debugLineNum = 1376300;BA.debugLine="connect_a_device(device_n)";
_connect_a_device(_device_n);
 };
RDebugUtils.currentLine=1376302;
 //BA.debugLineNum = 1376302;BA.debugLine="End Sub";
return "";
}
public static String  _scan_bt_devices() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub scan_bt_devices";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="scan_status = 0";
_scan_status = (int) (0);
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Manager.StopRssiTracking";
_manager.StopRssiTracking();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="Manager.Disconnect";
_manager.Disconnect();
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="ConnectState = cstateDisconnect";
_connectstate = _cstatedisconnect;
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="Manager.Scan(3000, Null)";
_manager.Scan(processBA,(long) (3000),(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="listBLEDevicesName.clear";
_listbledevicesname.Clear();
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="listBLEDevicesMacAdress.clear";
_listbledevicesmacadress.Clear();
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="Log(\"Searching devices...\")";
anywheresoftware.b4a.keywords.Common.Log("Searching devices...");
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="ToastMessageShow( \"Searching devices...\" ,True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow("Searching devices...",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="End Sub";
return "";
}
public static String  _write_bt_file() throws Exception{
RDebugUtils.currentModule="bt_interact";
String _filename = "";
int _k = 0;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub write_bt_file";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim filename As String = listBLEDevicesName.Get(d";
_filename = BA.ObjectToString(_listbledevicesname.Get(_device_n))+"_";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Dim K As Int";
_k = 0;
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="For k = 0 To 10";
{
final int step180 = 1;
final int limit180 = (int) (10);
for (_k = (int) (0); (step180 > 0 && _k <= limit180) || (step180 < 0 && _k >= limit180); _k = ((int)(0 + _k + step180))) {
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="filename = filename & Chr(Rnd(65,90))";
_filename = _filename+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(anywheresoftware.b4a.keywords.Common.Rnd((int) (65),(int) (90))));
 }
};
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="filename = filename & \".csv\"";
_filename = _filename+".csv";
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="File.WriteString(file_manager.current_dir,filenam";
anywheresoftware.b4a.keywords.Common.File.WriteString(mostCurrent._file_manager._current_dir,_filename,_data_buffer);
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="data_buffer = \"\"";
_data_buffer = "";
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="End Sub";
return "";
}
public static String  _bt_finish() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub bt_finish";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If btAdmin.Enable = True Then btAdmin.Disable";
if (_btadmin.Enable()==anywheresoftware.b4a.keywords.Common.True) { 
_btadmin.Disable();};
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Service_Destroy";
_service_destroy();
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="End Sub";
return "";
}
public static String  _disconnect_a_device() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub disconnect_a_device";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Manager.Disconnect";
_manager.Disconnect();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Try";
try {RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Manager.Initialize(\"BLE\")";
_manager.Initialize(processBA,"BLE");
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="btAdmin.Initialize(\"null\")";
_btadmin.Initialize(processBA,"null");
 } 
       catch (Exception e27) {
			processBA.setLastException(e27);RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Log(\"Error create service : \" & LastException.Me";
anywheresoftware.b4a.keywords.Common.Log("Error create service : "+anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
 };
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="listBLEDevicesName.Initialize";
_listbledevicesname.Initialize();
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="listBLEDevicesMacAdress.Initialize";
_listbledevicesmacadress.Initialize();
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="ble_timer.Initialize(\"ble_timer\",timer_wait)";
_ble_timer.Initialize(processBA,"ble_timer",(long) (_timer_wait));
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="ble_timer.Enabled = False";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="timer_wait = 1000";
_timer_wait = (int) (1000);
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="If btAdmin.IsEnabled = False Then";
if (_btadmin.IsEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="btAdmin.Enable";
_btadmin.Enable();
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="timer_wait = 5000";
_timer_wait = (int) (5000);
 };
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="timer_switch = \"find_devices\"";
_timer_switch = "find_devices";
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="ble_timer.Interval = timer_wait";
_ble_timer.setInterval((long) (_timer_wait));
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="ble_timer.Enabled = True";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="End Sub";
return "";
}
}