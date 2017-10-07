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
public static boolean _at_active = false;
public static int _soda_stage = 0;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public anywheresoftware.b4a.samples.gmailcontacts.modrequest _modrequest = null;
public anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring _svcmonitoring = null;
public com.olympiacircuits.main _main = null;
public com.olympiacircuits.activity_db _activity_db = null;
public com.olympiacircuits.file_manager _file_manager = null;
public com.olympiacircuits.camera_activity _camera_activity = null;
public com.olympiacircuits.main_controller _main_controller = null;
public com.olympiacircuits.setup _setup = null;
public static String  _ble_characteristicchanged(anywheresoftware.b4a.objects.BleManager.GattCharacteristic _characteristic) throws Exception{
RDebugUtils.currentModule="bt_interact";
String _capture = "";
byte[] _capture_byte = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub ble_CharacteristicChanged (Characteristic As B";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="If Characteristic = writeCharacteristic Then Log(";
if ((_characteristic).equals(_writecharacteristic)) { 
anywheresoftware.b4a.keywords.Common.Log("write");};
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If Characteristic = readCharacteristic Then Log(\"";
if ((_characteristic).equals(_readcharacteristic)) { 
anywheresoftware.b4a.keywords.Common.Log("read");};
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="If Characteristic = readCharacteristic And Charac";
if ((_characteristic).equals(_readcharacteristic) && (_characteristic).equals(_writecharacteristic)) { 
anywheresoftware.b4a.keywords.Common.Log("both");};
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Dim capture As String = \"\"";
_capture = "";
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Dim  capture_byte() As Byte = readCharacteristic.";
_capture_byte = _readcharacteristic.GetValue();
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="capture = conv.StringFromBytes(capture_byte,\"UTF8";
_capture = _conv.StringFromBytes(_capture_byte,"UTF8");
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="Log(capture)";
anywheresoftware.b4a.keywords.Common.Log(_capture);
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="If at_active = True Then";
if (_at_active==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="at_active = False";
_at_active = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="soda_stage = soda_stage + 1 'acknowledge a reply";
_soda_stage = (int) (_soda_stage+1);
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="soda_switch 'call the next step";
_soda_switch();
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="If first_read = True Then";
if (_first_read==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="ble_timer.Enabled = False";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="timer_switch = \"bt_download\"";
_timer_switch = "bt_download";
 };
RDebugUtils.currentLine=1114133;
 //BA.debugLineNum = 1114133;BA.debugLine="ble_timer.Enabled = False";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="ble_timer.Interval = 500";
_ble_timer.setInterval((long) (500));
RDebugUtils.currentLine=1114135;
 //BA.debugLineNum = 1114135;BA.debugLine="ble_timer.Enabled = True";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1114136;
 //BA.debugLineNum = 1114136;BA.debugLine="data_buffer = data_buffer & capture";
_data_buffer = _data_buffer+_capture;
RDebugUtils.currentLine=1114138;
 //BA.debugLineNum = 1114138;BA.debugLine="writeCharacteristic.SetStringValue(\"!\")";
_writecharacteristic.SetStringValue("!");
RDebugUtils.currentLine=1114139;
 //BA.debugLineNum = 1114139;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic)";
_manager.WriteCharacteristic(_writecharacteristic);
RDebugUtils.currentLine=1114140;
 //BA.debugLineNum = 1114140;BA.debugLine="End Sub";
return "";
}
public static String  _soda_switch() throws Exception{
RDebugUtils.currentModule="bt_interact";
String _bt_power = "";
String _bt_indicator = "";
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Sub soda_switch()";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Dim bt_power As String = \"B\"";
_bt_power = "B";
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="Dim bt_indicator As String = \"8\"";
_bt_indicator = "8";
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="at_active = True";
_at_active = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="Log(\"Entering soda_switch on soda_stage = \" & so";
anywheresoftware.b4a.keywords.Common.Log("Entering soda_switch on soda_stage = "+BA.NumberToString(_soda_stage));
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="If soda_stage = 0 Then 'send the first command.";
if (_soda_stage==0) { 
RDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="Log(\"Attempting to start SODA\")";
anywheresoftware.b4a.keywords.Common.Log("Attempting to start SODA");
RDebugUtils.currentLine=10354696;
 //BA.debugLineNum = 10354696;BA.debugLine="writeCharacteristic.SetStringValue(\"AT+PIO\" & b";
_writecharacteristic.SetStringValue("AT+PIO"+_bt_indicator+"1");
RDebugUtils.currentLine=10354697;
 //BA.debugLineNum = 10354697;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic";
_manager.WriteCharacteristic(_writecharacteristic);
RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10354701;
 //BA.debugLineNum = 10354701;BA.debugLine="If soda_stage = 1 Then";
if (_soda_stage==1) { 
RDebugUtils.currentLine=10354702;
 //BA.debugLineNum = 10354702;BA.debugLine="writeCharacteristic.SetStringValue(\"AT+PIO\" & b";
_writecharacteristic.SetStringValue("AT+PIO"+_bt_power+"1");
RDebugUtils.currentLine=10354703;
 //BA.debugLineNum = 10354703;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic";
_manager.WriteCharacteristic(_writecharacteristic);
RDebugUtils.currentLine=10354704;
 //BA.debugLineNum = 10354704;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10354707;
 //BA.debugLineNum = 10354707;BA.debugLine="If soda_stage = 2 Then";
if (_soda_stage==2) { 
RDebugUtils.currentLine=10354708;
 //BA.debugLineNum = 10354708;BA.debugLine="at_active = False 'end the AT activity";
_at_active = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=10354709;
 //BA.debugLineNum = 10354709;BA.debugLine="writeCharacteristic.SetStringValue(\"!\") 'Signal";
_writecharacteristic.SetStringValue("!");
RDebugUtils.currentLine=10354710;
 //BA.debugLineNum = 10354710;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic";
_manager.WriteCharacteristic(_writecharacteristic);
RDebugUtils.currentLine=10354711;
 //BA.debugLineNum = 10354711;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10354715;
 //BA.debugLineNum = 10354715;BA.debugLine="If soda_stage = 10 Then";
if (_soda_stage==10) { 
RDebugUtils.currentLine=10354716;
 //BA.debugLineNum = 10354716;BA.debugLine="writeCharacteristic.SetStringValue(\"AT+PIO\" & b";
_writecharacteristic.SetStringValue("AT+PIO"+_bt_indicator+"0");
RDebugUtils.currentLine=10354717;
 //BA.debugLineNum = 10354717;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic";
_manager.WriteCharacteristic(_writecharacteristic);
RDebugUtils.currentLine=10354718;
 //BA.debugLineNum = 10354718;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10354721;
 //BA.debugLineNum = 10354721;BA.debugLine="If soda_stage = 11 Then";
if (_soda_stage==11) { 
RDebugUtils.currentLine=10354722;
 //BA.debugLineNum = 10354722;BA.debugLine="writeCharacteristic.SetStringValue(\"AT+PIO\" & b";
_writecharacteristic.SetStringValue("AT+PIO"+_bt_power+"0");
RDebugUtils.currentLine=10354723;
 //BA.debugLineNum = 10354723;BA.debugLine="Manager.WriteCharacteristic(writeCharacteristic";
_manager.WriteCharacteristic(_writecharacteristic);
RDebugUtils.currentLine=10354724;
 //BA.debugLineNum = 10354724;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10354727;
 //BA.debugLineNum = 10354727;BA.debugLine="If soda_stage = 12 Then 'final clean up";
if (_soda_stage==12) { 
RDebugUtils.currentLine=10354728;
 //BA.debugLineNum = 10354728;BA.debugLine="Manager.Disconnect";
_manager.Disconnect();
RDebugUtils.currentLine=10354729;
 //BA.debugLineNum = 10354729;BA.debugLine="at_active = False";
_at_active = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=10354732;
 //BA.debugLineNum = 10354732;BA.debugLine="End Sub";
return "";
}
public static String  _ble_connected(anywheresoftware.b4a.objects.collections.Map _services) throws Exception{
RDebugUtils.currentModule="bt_interact";
int _k = 0;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub ble_Connected (Services As Map)";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="ble_timer.Enabled = False";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="If ConnectState = cstatePreConnect Then";
if (_connectstate==_cstatepreconnect) { 
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="ConnectState = cstateConnect";
_connectstate = _cstateconnect;
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Log(\"Connected\")";
anywheresoftware.b4a.keywords.Common.Log("Connected");
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="bleService = Services.GetValueAt(2)";
_bleservice.setObject((android.bluetooth.BluetoothGattService)(_services.GetValueAt((int) (2))));
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="readCharacteristic = bleService.GetCharacteri";
_readcharacteristic.setObject((android.bluetooth.BluetoothGattCharacteristic)(_bleservice.GetCharacteristics().GetValueAt((int) (0))));
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Manager.ReadCharacteristic(readCharacteristic";
_manager.ReadCharacteristic(_readcharacteristic);
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Manager.SetCharacteristicNotification(readCha";
_manager.SetCharacteristicNotification(_readcharacteristic,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="writeCharacteristic = bleService.GetCharacter";
_writecharacteristic.setObject((android.bluetooth.BluetoothGattCharacteristic)(_bleservice.GetCharacteristics().GetValueAt((int) (0))));
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="For k = 0 To bleService.GetCharacteristics.Size";
{
final int step117 = 1;
final int limit117 = (int) (_bleservice.GetCharacteristics().getSize()-1);
for (_k = (int) (0); (step117 > 0 && _k <= limit117) || (step117 < 0 && _k >= limit117); _k = ((int)(0 + _k + step117))) {
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Log(k)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_k));
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Log(bleService.GetCharacteristics.GetKeyAt(k))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_bleservice.GetCharacteristics().GetKeyAt(_k)));
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="Log(bleService.GetCharacteristics.GetValueAt(k)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_bleservice.GetCharacteristics().GetValueAt(_k)));
 }
};
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="timer_switch = \"device_timeout\"";
_timer_switch = "device_timeout";
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="ble_timer.Interval = 2000";
_ble_timer.setInterval((long) (2000));
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="connection_tries = 0";
_connection_tries = (int) (0);
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="ble_timer.Enabled = True";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="soda_stage = 0";
_soda_stage = (int) (0);
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="soda_switch 'sub routine that handles setup";
_soda_switch();
 };
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="End Sub";
return "";
}
public static String  _ble_devicefound(String _name,String _macaddress) throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub ble_DeviceFound (Name As String, MacAddress As";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="If Name = Null Then Return";
if (_name== null) { 
if (true) return "";};
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Log(\"found BT \" & Name)";
anywheresoftware.b4a.keywords.Common.Log("found BT "+_name);
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Name = Name.ToUpperCase ' makes it case insensiti";
_name = _name.toUpperCase();
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="If Name.SubString2(0,4) = \"SODA\" Then";
if ((_name.substring((int) (0),(int) (4))).equals("SODA")) { 
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="listBLEDevicesName.Add(Name)";
_listbledevicesname.Add((Object)(_name));
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="listBLEDevicesMacAdress.Add(MacAddress)";
_listbledevicesmacadress.Add((Object)(_macaddress));
 };
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="End Sub";
return "";
}
public static String  _ble_disconnected() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub ble_Disconnected";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="ConnectState = cstateDisconnect";
_connectstate = _cstatedisconnect;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Manager.refreshDeviceCache";
_manager.refreshDeviceCache();
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Manager.Close";
_manager.Close();
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Log(\"Disconnected\")";
anywheresoftware.b4a.keywords.Common.Log("Disconnected");
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="End Sub";
return "";
}
public static String  _ble_discoveryfinished() throws Exception{
RDebugUtils.currentModule="bt_interact";
int _i = 0;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub ble_DiscoveryFinished";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Log(\"Search finished\")";
anywheresoftware.b4a.keywords.Common.Log("Search finished");
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="If(listBLEDevicesName.Size) = 0 Then";
if ((_listbledevicesname.getSize())==0) { 
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="scan_status = -1";
_scan_status = (int) (-1);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Log(\"No Devices Found. Ending Service.\")";
anywheresoftware.b4a.keywords.Common.Log("No Devices Found. Ending Service.");
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Service_Destroy";
_service_destroy();
 }else {
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="scan_status = listBLEDevicesName.Size";
_scan_status = _listbledevicesname.getSize();
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="For i = 0 To scan_status - 1";
{
final int step99 = 1;
final int limit99 = (int) (_scan_status-1);
for (_i = (int) (0); (step99 > 0 && _i <= limit99) || (step99 < 0 && _i >= limit99); _i = ((int)(0 + _i + step99))) {
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Log(\"found \" & listBLEDevicesName.Get(i))";
anywheresoftware.b4a.keywords.Common.Log("found "+BA.ObjectToString(_listbledevicesname.Get(_i)));
 }
};
 };
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="connection_tries = 0";
_connection_tries = (int) (0);
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="device_n = 0";
_device_n = (int) (0);
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="connect_a_device(device_n)";
_connect_a_device(_device_n);
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public static String  _connect_a_device(int _device_position) throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub connect_a_device(device_position As Int)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="If device_n >= listBLEDevicesName.Size Then 'gone";
if (_device_n>=_listbledevicesname.getSize()) { 
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Log(\"No additional devices found. Done.\")";
anywheresoftware.b4a.keywords.Common.Log("No additional devices found. Done.");
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="ble_timer.Enabled = False";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="bt_finish";
_bt_finish();
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="If ConnectState = cstateDisconnect Then";
if (_connectstate==_cstatedisconnect) { 
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="ConnectState = cstatePreConnect";
_connectstate = _cstatepreconnect;
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="Log(\"Connecting to \" & listBLEDevicesName.Get(de";
anywheresoftware.b4a.keywords.Common.Log("Connecting to "+BA.ObjectToString(_listbledevicesname.Get(_device_position)));
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="Manager.Connect(listBLEDevicesMacAdress.Get(devi";
_manager.Connect(BA.ObjectToString(_listbledevicesmacadress.Get(_device_position)),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="data_buffer = \"\"";
_data_buffer = "";
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="first_read = True";
_first_read = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="timer_switch = \"try_connect\"";
_timer_switch = "try_connect";
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="ble_timer.Enabled = True";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="End Sub";
return "";
}
public static String  _ble_timer_tick() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub ble_timer_Tick";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Log(\"Entering timer with switch \" & timer_switch)";
anywheresoftware.b4a.keywords.Common.Log("Entering timer with switch "+_timer_switch);
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="ble_timer.Enabled = False 'always disable. Someti";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="If timer_switch = \"find_devices\" Then";
if ((_timer_switch).equals("find_devices")) { 
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="scan_bt_devices";
_scan_bt_devices();
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="If timer_switch = \"try_connect\" Then";
if ((_timer_switch).equals("try_connect")) { 
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="connection_tries = connection_tries + 1";
_connection_tries = (int) (_connection_tries+1);
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="If connection_tries > 3 Then 'move on to the nex";
if (_connection_tries>3) { 
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="device_n = device_n + 1";
_device_n = (int) (_device_n+1);
 };
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="ble_timer.Enabled = True  're-enable timer";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="connection_tries = 0";
_connection_tries = (int) (0);
RDebugUtils.currentLine=1179666;
 //BA.debugLineNum = 1179666;BA.debugLine="connect_a_device(device_n)";
_connect_a_device(_device_n);
 };
RDebugUtils.currentLine=1179670;
 //BA.debugLineNum = 1179670;BA.debugLine="If timer_switch = \"device_timeout\" Then";
if ((_timer_switch).equals("device_timeout")) { 
RDebugUtils.currentLine=1179672;
 //BA.debugLineNum = 1179672;BA.debugLine="If connection_tries < 2 Then";
if (_connection_tries<2) { 
RDebugUtils.currentLine=1179674;
 //BA.debugLineNum = 1179674;BA.debugLine="connection_tries = connection_tries + 1";
_connection_tries = (int) (_connection_tries+1);
RDebugUtils.currentLine=1179675;
 //BA.debugLineNum = 1179675;BA.debugLine="ble_timer.Enabled = True";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1179676;
 //BA.debugLineNum = 1179676;BA.debugLine="soda_switch";
_soda_switch();
 }else {
RDebugUtils.currentLine=1179678;
 //BA.debugLineNum = 1179678;BA.debugLine="Log(\"deviced timed out; trying next device\")";
anywheresoftware.b4a.keywords.Common.Log("deviced timed out; trying next device");
RDebugUtils.currentLine=1179679;
 //BA.debugLineNum = 1179679;BA.debugLine="device_n = device_n + 1";
_device_n = (int) (_device_n+1);
RDebugUtils.currentLine=1179680;
 //BA.debugLineNum = 1179680;BA.debugLine="connection_tries = 0";
_connection_tries = (int) (0);
RDebugUtils.currentLine=1179681;
 //BA.debugLineNum = 1179681;BA.debugLine="connect_a_device(device_n)";
_connect_a_device(_device_n);
 };
 };
RDebugUtils.currentLine=1179686;
 //BA.debugLineNum = 1179686;BA.debugLine="If timer_switch = \"bt_download\" Then";
if ((_timer_switch).equals("bt_download")) { 
RDebugUtils.currentLine=1179688;
 //BA.debugLineNum = 1179688;BA.debugLine="timer_switch = \"DL_finished\"";
_timer_switch = "DL_finished";
RDebugUtils.currentLine=1179689;
 //BA.debugLineNum = 1179689;BA.debugLine="ble_timer.Interval = 5000";
_ble_timer.setInterval((long) (5000));
RDebugUtils.currentLine=1179690;
 //BA.debugLineNum = 1179690;BA.debugLine="ble_timer.Enabled = True";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1179692;
 //BA.debugLineNum = 1179692;BA.debugLine="soda_stage = 10";
_soda_stage = (int) (10);
RDebugUtils.currentLine=1179693;
 //BA.debugLineNum = 1179693;BA.debugLine="soda_switch";
_soda_switch();
 };
RDebugUtils.currentLine=1179697;
 //BA.debugLineNum = 1179697;BA.debugLine="If timer_switch = \"DL_finished\" Then";
if ((_timer_switch).equals("DL_finished")) { 
RDebugUtils.currentLine=1179699;
 //BA.debugLineNum = 1179699;BA.debugLine="write_bt_file";
_write_bt_file();
RDebugUtils.currentLine=1179701;
 //BA.debugLineNum = 1179701;BA.debugLine="device_n = device_n + 1";
_device_n = (int) (_device_n+1);
RDebugUtils.currentLine=1179702;
 //BA.debugLineNum = 1179702;BA.debugLine="connect_a_device(device_n)";
_connect_a_device(_device_n);
 };
RDebugUtils.currentLine=1179704;
 //BA.debugLineNum = 1179704;BA.debugLine="End Sub";
return "";
}
public static String  _scan_bt_devices() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub scan_bt_devices";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="listBLEDevicesName.Clear";
_listbledevicesname.Clear();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="listBLEDevicesMacAdress.Clear";
_listbledevicesmacadress.Clear();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="scan_status = 0";
_scan_status = (int) (0);
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Manager.StopRssiTracking";
_manager.StopRssiTracking();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Manager.Disconnect";
_manager.Disconnect();
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="ConnectState = cstateDisconnect";
_connectstate = _cstatedisconnect;
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Manager.Scan(3000, Null)";
_manager.Scan(processBA,(long) (3000),(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Log(\"Searching devices...\")";
anywheresoftware.b4a.keywords.Common.Log("Searching devices...");
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="End Sub";
return "";
}
public static String  _write_bt_file() throws Exception{
RDebugUtils.currentModule="bt_interact";
String _filename = "";
int _k = 0;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub write_bt_file";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim filename As String = listBLEDevicesName.Get(d";
_filename = BA.ObjectToString(_listbledevicesname.Get(_device_n))+"_";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Dim K As Int";
_k = 0;
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="For k = 0 To 10";
{
final int step205 = 1;
final int limit205 = (int) (10);
for (_k = (int) (0); (step205 > 0 && _k <= limit205) || (step205 < 0 && _k >= limit205); _k = ((int)(0 + _k + step205))) {
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="filename = filename & Chr(Rnd(65,90))";
_filename = _filename+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(anywheresoftware.b4a.keywords.Common.Rnd((int) (65),(int) (90))));
 }
};
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="filename = filename & \".csv\"";
_filename = _filename+".csv";
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="File.WriteString(file_manager.current_dir,filenam";
anywheresoftware.b4a.keywords.Common.File.WriteString(mostCurrent._file_manager._current_dir,_filename,_data_buffer);
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="data_buffer = \"\"";
_data_buffer = "";
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="End Sub";
return "";
}
public static String  _bt_finish() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub bt_finish";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="If btAdmin.Enable = True Then btAdmin.Disable";
if (_btadmin.Enable()==anywheresoftware.b4a.keywords.Common.True) { 
_btadmin.Disable();};
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="StopService(\"\")";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(""));
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="End Sub";
return "";
}
public static String  _disconnect_a_device() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub disconnect_a_device";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Manager.Disconnect";
_manager.Disconnect();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Try";
try {RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Manager.Initialize(\"BLE\")";
_manager.Initialize(processBA,"BLE");
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="btAdmin.Initialize(\"null\")";
_btadmin.Initialize(processBA,"null");
 } 
       catch (Exception e29) {
			processBA.setLastException(e29);RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Log(\"Error create service : \" & LastException.Me";
anywheresoftware.b4a.keywords.Common.Log("Error create service : "+anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
 };
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="listBLEDevicesName.Initialize";
_listbledevicesname.Initialize();
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="listBLEDevicesMacAdress.Initialize";
_listbledevicesmacadress.Initialize();
RDebugUtils.currentLine=393226;
 //BA.debugLineNum = 393226;BA.debugLine="ble_timer.Initialize(\"ble_timer\",timer_wait)";
_ble_timer.Initialize(processBA,"ble_timer",(long) (_timer_wait));
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="ble_timer.Enabled = False";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="bt_interact";
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="timer_wait = 1000";
_timer_wait = (int) (1000);
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="If btAdmin.IsEnabled = False Then";
if (_btadmin.IsEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="btAdmin.Enable";
_btadmin.Enable();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="timer_wait = 5000";
_timer_wait = (int) (5000);
 };
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="timer_switch = \"find_devices\"";
_timer_switch = "find_devices";
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="ble_timer.Interval = timer_wait";
_ble_timer.setInterval((long) (_timer_wait));
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="ble_timer.Enabled = True";
_ble_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="End Sub";
return "";
}
}