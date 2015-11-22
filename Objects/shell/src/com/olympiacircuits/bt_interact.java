
package com.olympiacircuits;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class bt_interact implements IRemote{
	public static bt_interact mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public bt_interact() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.olympiacircuits.bt_interact", "com.olympiacircuits.bt_interact");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("com.olympiacircuits.bt_interact");
		pcBA = new PCBA(this, bt_interact.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _scan_status = RemoteObject.createImmutable(0);
public static RemoteObject _manager = RemoteObject.declareNull("anywheresoftware.b4a.objects.BleManager");
public static RemoteObject _btadmin = RemoteObject.declareNull("anywheresoftware.b4a.objects.Serial.BluetoothAdmin");
public static RemoteObject _readcharacteristic = RemoteObject.declareNull("anywheresoftware.b4a.objects.BleManager.GattCharacteristic");
public static RemoteObject _writecharacteristic = RemoteObject.declareNull("anywheresoftware.b4a.objects.BleManager.GattCharacteristic");
public static RemoteObject _bleservice = RemoteObject.declareNull("anywheresoftware.b4a.objects.BleManager.GattServiceWrapper");
public static RemoteObject _listbledevicesname = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listbledevicesmacadress = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _connectstate = RemoteObject.createImmutable(0);
public static RemoteObject _cstatedisconnect = RemoteObject.createImmutable(0);
public static RemoteObject _cstatepreconnect = RemoteObject.createImmutable(0);
public static RemoteObject _cstateconnect = RemoteObject.createImmutable(0);
public static RemoteObject _connection_tries = RemoteObject.createImmutable(0);
public static RemoteObject _device_n = RemoteObject.createImmutable(0);
public static RemoteObject _first_read = RemoteObject.createImmutable(false);
public static RemoteObject _ble_timer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _timer_switch = RemoteObject.createImmutable("");
public static RemoteObject _timer_wait = RemoteObject.createImmutable(0);
public static RemoteObject _data_buffer = RemoteObject.createImmutable("");
public static RemoteObject _conv = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.httputils2service");
public static RemoteObject _modrequest = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.modrequest");
public static RemoteObject _svcmonitoring = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring");
public static com.olympiacircuits.main _main = null;
public static com.olympiacircuits.activity_db _activity_db = null;
public static com.olympiacircuits.file_manager _file_manager = null;
public static com.olympiacircuits.camera_activity _camera_activity = null;
public static com.olympiacircuits.main_controller _main_controller = null;
  public Object[] GetGlobals() {
		return new Object[] {"activity_db",Debug.moduleToString(com.olympiacircuits.activity_db.class),"ble_timer",bt_interact._ble_timer,"bleService",bt_interact._bleservice,"btAdmin",bt_interact._btadmin,"camera_activity",Debug.moduleToString(com.olympiacircuits.camera_activity.class),"connection_tries",bt_interact._connection_tries,"ConnectState",bt_interact._connectstate,"conv",bt_interact._conv,"cstateConnect",bt_interact._cstateconnect,"cstateDisconnect",bt_interact._cstatedisconnect,"cstatePreConnect",bt_interact._cstatepreconnect,"data_buffer",bt_interact._data_buffer,"device_n",bt_interact._device_n,"file_manager",Debug.moduleToString(com.olympiacircuits.file_manager.class),"first_read",bt_interact._first_read,"HttpUtils2Service",bt_interact.mostCurrent._httputils2service,"listBLEDevicesMacAdress",bt_interact._listbledevicesmacadress,"listBLEDevicesName",bt_interact._listbledevicesname,"Main",Debug.moduleToString(com.olympiacircuits.main.class),"main_controller",Debug.moduleToString(com.olympiacircuits.main_controller.class),"Manager",bt_interact._manager,"modRequest",bt_interact.mostCurrent._modrequest,"readCharacteristic",bt_interact._readcharacteristic,"scan_status",bt_interact._scan_status,"Service",bt_interact.mostCurrent._service,"svcMonitoring",bt_interact.mostCurrent._svcmonitoring,"timer_switch",bt_interact._timer_switch,"timer_wait",bt_interact._timer_wait,"writeCharacteristic",bt_interact._writecharacteristic};
}
}