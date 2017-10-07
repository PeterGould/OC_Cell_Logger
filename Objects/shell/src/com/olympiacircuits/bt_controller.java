
package com.olympiacircuits;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class bt_controller implements IRemote{
	public static bt_controller mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public bt_controller() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return false;
	}
    public static PCBA staticBA = new PCBA(null, bt_controller.class);
    private PCBA pcBA;
    public RemoteObject ba;
    public RemoteObject ref;
	public RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), RemoteObject.addItemToArray(ref, args));
	}
    public void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        ref = (RemoteObject) args[0];
        ba = (RemoteObject) args[2];
		pcBA = new PCBA(null, bt_controller.class);
		return pcBA;
	}


public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _scan_status = RemoteObject.createImmutable(0);
public static RemoteObject _pass_message = RemoteObject.createImmutable("");
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
public static RemoteObject _ble_timer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static RemoteObject _modrequest = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.modrequest");
public static RemoteObject _svcmonitoring = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring");
public static com.olympiacircuits.main _main = null;
public static com.olympiacircuits.bt_interact _bt_interact = null;
public static com.olympiacircuits.activity_db _activity_db = null;
public static com.olympiacircuits.file_manager _file_manager = null;
public static com.olympiacircuits.camera_activity _camera_activity = null;
public static com.olympiacircuits.main_controller _main_controller = null;
public static com.olympiacircuits.setup _setup = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ble_timer",_ref.getField(false, "_ble_timer"),"bleService",_ref.getField(false, "_bleservice"),"btAdmin",_ref.getField(false, "_btadmin"),"ConnectState",_ref.getField(false, "_connectstate"),"cstateConnect",_ref.getField(false, "_cstateconnect"),"cstateDisconnect",_ref.getField(false, "_cstatedisconnect"),"cstatePreConnect",_ref.getField(false, "_cstatepreconnect"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"listBLEDevicesMacAdress",_ref.getField(false, "_listbledevicesmacadress"),"listBLEDevicesName",_ref.getField(false, "_listbledevicesname"),"Manager",_ref.getField(false, "_manager"),"modRequest",_ref.getField(false, "_modrequest"),"pass_message",_ref.getField(false, "_pass_message"),"readCharacteristic",_ref.getField(false, "_readcharacteristic"),"scan_status",_ref.getField(false, "_scan_status"),"svcMonitoring",_ref.getField(false, "_svcmonitoring"),"writeCharacteristic",_ref.getField(false, "_writecharacteristic")};
}
}