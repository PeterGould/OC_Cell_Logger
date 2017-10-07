
package com.olympiacircuits;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class customlistview implements IRemote{
	public static customlistview mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public customlistview() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return false;
	}
    public static PCBA staticBA = new PCBA(null, customlistview.class);
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
		pcBA = new PCBA(null, customlistview.class);
		return pcBA;
	}


public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _panels = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dividerheight = RemoteObject.createImmutable(0f);
public static RemoteObject _presseddrawable = RemoteObject.declareNull("Object");
public static RemoteObject _eventname = RemoteObject.createImmutable("");
public static RemoteObject _callback = RemoteObject.declareNull("Object");
public static RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
public static RemoteObject _defaulttextsize = RemoteObject.createImmutable(0);
public static RemoteObject _defaulttextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _defaulttextbackgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _defaulttextbackground = RemoteObject.declareNull("Object");
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
		return new Object[] {"CallBack",_ref.getField(false, "_callback"),"DefaultTextBackground",_ref.getField(false, "_defaulttextbackground"),"DefaultTextBackgroundColor",_ref.getField(false, "_defaulttextbackgroundcolor"),"DefaultTextColor",_ref.getField(false, "_defaulttextcolor"),"DefaultTextSize",_ref.getField(false, "_defaulttextsize"),"dividerHeight",_ref.getField(false, "_dividerheight"),"EventName",_ref.getField(false, "_eventname"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"items",_ref.getField(false, "_items"),"modRequest",_ref.getField(false, "_modrequest"),"panels",_ref.getField(false, "_panels"),"pressedDrawable",_ref.getField(false, "_presseddrawable"),"su",_ref.getField(false, "_su"),"sv",_ref.getField(false, "_sv"),"svcMonitoring",_ref.getField(false, "_svcmonitoring")};
}
}