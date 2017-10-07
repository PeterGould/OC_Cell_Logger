
package com.olympiacircuits;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class file_manager implements IRemote{
	public static file_manager mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public file_manager() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.olympiacircuits.file_manager", "com.olympiacircuits.file_manager");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("com.olympiacircuits.file_manager");
		pcBA = new PCBA(this, file_manager.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root_dir = RemoteObject.createImmutable("");
public static RemoteObject _sub_dir = RemoteObject.createImmutable("");
public static RemoteObject _current_dir = RemoteObject.createImmutable("");
public static RemoteObject _clientid = RemoteObject.createImmutable("");
public static RemoteObject _clientsecret = RemoteObject.createImmutable("");
public static RemoteObject _cls_drive = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.libgoogledrive");
public static RemoteObject _my_wifi = RemoteObject.declareNull("wifi.MLwifi");
public static RemoteObject _file_timer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _timer_switch = RemoteObject.createImmutable("");
public static RemoteObject _stage_file = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static RemoteObject _modrequest = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.modrequest");
public static RemoteObject _svcmonitoring = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring");
public static com.olympiacircuits.main _main = null;
public static com.olympiacircuits.bt_interact _bt_interact = null;
public static com.olympiacircuits.activity_db _activity_db = null;
public static com.olympiacircuits.camera_activity _camera_activity = null;
public static com.olympiacircuits.main_controller _main_controller = null;
public static com.olympiacircuits.setup _setup = null;
  public Object[] GetGlobals() {
		return new Object[] {"activity_db",Debug.moduleToString(com.olympiacircuits.activity_db.class),"bt_interact",Debug.moduleToString(com.olympiacircuits.bt_interact.class),"camera_activity",Debug.moduleToString(com.olympiacircuits.camera_activity.class),"clientId",file_manager._clientid,"clientSecret",file_manager._clientsecret,"cls_drive",file_manager._cls_drive,"current_dir",file_manager._current_dir,"file_timer",file_manager._file_timer,"HttpUtils2Service",file_manager.mostCurrent._httputils2service,"Main",Debug.moduleToString(com.olympiacircuits.main.class),"main_controller",Debug.moduleToString(com.olympiacircuits.main_controller.class),"modRequest",file_manager.mostCurrent._modrequest,"my_wifi",file_manager._my_wifi,"root_dir",file_manager._root_dir,"Service",file_manager.mostCurrent._service,"setup",Debug.moduleToString(com.olympiacircuits.setup.class),"stage_file",file_manager._stage_file,"sub_dir",file_manager._sub_dir,"svcMonitoring",file_manager.mostCurrent._svcmonitoring,"timer_switch",file_manager._timer_switch};
}
}