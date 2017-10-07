
package com.olympiacircuits;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class activity_db implements IRemote{
	public static activity_db mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public activity_db() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.olympiacircuits.activity_db", "com.olympiacircuits.activity_db");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("com.olympiacircuits.activity_db");
		pcBA = new PCBA(this, activity_db.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _activity_con = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _db_dir = RemoteObject.createImmutable("");
public static RemoteObject _db_name = RemoteObject.createImmutable("");
public static RemoteObject _db_path = RemoteObject.createImmutable("");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static RemoteObject _modrequest = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.modrequest");
public static RemoteObject _svcmonitoring = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring");
public static com.olympiacircuits.main _main = null;
public static com.olympiacircuits.bt_interact _bt_interact = null;
public static com.olympiacircuits.file_manager _file_manager = null;
public static com.olympiacircuits.camera_activity _camera_activity = null;
public static com.olympiacircuits.main_controller _main_controller = null;
public static com.olympiacircuits.setup _setup = null;
  public Object[] GetGlobals() {
		return new Object[] {"activity_con",activity_db._activity_con,"bt_interact",Debug.moduleToString(com.olympiacircuits.bt_interact.class),"camera_activity",Debug.moduleToString(com.olympiacircuits.camera_activity.class),"db_dir",activity_db._db_dir,"db_name",activity_db._db_name,"db_path",activity_db._db_path,"file_manager",Debug.moduleToString(com.olympiacircuits.file_manager.class),"HttpUtils2Service",activity_db.mostCurrent._httputils2service,"Main",Debug.moduleToString(com.olympiacircuits.main.class),"main_controller",Debug.moduleToString(com.olympiacircuits.main_controller.class),"modRequest",activity_db.mostCurrent._modrequest,"Service",activity_db.mostCurrent._service,"setup",Debug.moduleToString(com.olympiacircuits.setup.class),"svcMonitoring",activity_db.mostCurrent._svcmonitoring};
}
}