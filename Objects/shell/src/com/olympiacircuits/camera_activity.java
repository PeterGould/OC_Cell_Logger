
package com.olympiacircuits;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class camera_activity implements IRemote{
	public static camera_activity mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public camera_activity() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.olympiacircuits.camera_activity", "com.olympiacircuits.camera_activity");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, camera_activity.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _a_camera = RemoteObject.declareNull("com.olympiacircuits.auto_camera");
public static RemoteObject _pic_panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.httputils2service");
public static RemoteObject _modrequest = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.modrequest");
public static RemoteObject _svcmonitoring = RemoteObject.declareNull("anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring");
public static com.olympiacircuits.main _main = null;
public static com.olympiacircuits.bt_interact _bt_interact = null;
public static com.olympiacircuits.activity_db _activity_db = null;
public static com.olympiacircuits.file_manager _file_manager = null;
public static com.olympiacircuits.main_controller _main_controller = null;
  public Object[] GetGlobals() {
		return new Object[] {"a_camera",camera_activity.mostCurrent._a_camera,"Activity",camera_activity.mostCurrent._activity,"activity_db",Debug.moduleToString(com.olympiacircuits.activity_db.class),"bt_interact",Debug.moduleToString(com.olympiacircuits.bt_interact.class),"file_manager",Debug.moduleToString(com.olympiacircuits.file_manager.class),"HttpUtils2Service",camera_activity.mostCurrent._httputils2service,"Main",Debug.moduleToString(com.olympiacircuits.main.class),"main_controller",Debug.moduleToString(com.olympiacircuits.main_controller.class),"modRequest",camera_activity.mostCurrent._modrequest,"pic_panel",camera_activity.mostCurrent._pic_panel,"svcMonitoring",camera_activity.mostCurrent._svcmonitoring};
}
}