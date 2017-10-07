
package com.olympiacircuits;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class cameraexclass implements IRemote{
	public static cameraexclass mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public cameraexclass() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return false;
	}
    public static PCBA staticBA = new PCBA(null, cameraexclass.class);
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
		pcBA = new PCBA(null, cameraexclass.class);
		return pcBA;
	}


public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _nativecam = RemoteObject.declareNull("Object");
public static RemoteObject _cam = RemoteObject.declareNull("anywheresoftware.b4a.objects.CameraW");
public static RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
public static RemoteObject _target = RemoteObject.declareNull("Object");
public static RemoteObject _event = RemoteObject.createImmutable("");
public static RemoteObject _front = RemoteObject.createImmutable(false);
public static RemoteObject _parameters = RemoteObject.declareNull("Object");
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
		return new Object[] {"cam",_ref.getField(false, "_cam"),"event",_ref.getField(false, "_event"),"Front",_ref.getField(false, "_front"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"modRequest",_ref.getField(false, "_modrequest"),"nativeCam",_ref.getField(false, "_nativecam"),"parameters",_ref.getField(false, "_parameters"),"r",_ref.getField(false, "_r"),"svcMonitoring",_ref.getField(false, "_svcmonitoring"),"target",_ref.getField(false, "_target")};
}
}