
package com.olympiacircuits;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class main_controller implements IRemote{
	public static main_controller mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main_controller() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.olympiacircuits.main_controller", "com.olympiacircuits.main_controller");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("com.olympiacircuits.main_controller");
		pcBA = new PCBA(this, main_controller.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.httputils2service");
public static RemoteObject _modrequest = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.modrequest");
public static RemoteObject _svcmonitoring = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring");
public static com.olympiacircuits.main _main = null;
public static com.olympiacircuits.bt_interact _bt_interact = null;
public static com.olympiacircuits.activity_db _activity_db = null;
public static com.olympiacircuits.file_manager _file_manager = null;
public static com.olympiacircuits.camera_activity _camera_activity = null;
  public Object[] GetGlobals() {
		return new Object[] {"activity_db",Debug.moduleToString(com.olympiacircuits.activity_db.class),"bt_interact",Debug.moduleToString(com.olympiacircuits.bt_interact.class),"camera_activity",Debug.moduleToString(com.olympiacircuits.camera_activity.class),"file_manager",Debug.moduleToString(com.olympiacircuits.file_manager.class),"HttpUtils2Service",main_controller.mostCurrent._httputils2service,"Main",Debug.moduleToString(com.olympiacircuits.main.class),"modRequest",main_controller.mostCurrent._modrequest,"Service",main_controller.mostCurrent._service,"svcMonitoring",main_controller.mostCurrent._svcmonitoring};
}
}