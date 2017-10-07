package com.olympiacircuits;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class main_controller extends android.app.Service {
	public static class main_controller_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
			android.content.Intent in = new android.content.Intent(context, main_controller.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
			context.startService(in);
		}

	}
    static main_controller mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return main_controller.class;
	}
	@Override
	public void onCreate() {
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "com.olympiacircuits", "com.olympiacircuits.main_controller");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "com.olympiacircuits.main_controller", processBA, _service);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, true) == false) {
				
		}
		else {
            BA.LogInfo("** Service (main_controller) Create **");
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
                    BA.LogInfo("** Service (main_controller) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
				}
			};
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (main_controller) Start **");
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
        BA.LogInfo("** Service (main_controller) Destroy **");
		processBA.raiseEvent(null, "service_destroy");
        processBA.service = null;
		mostCurrent = null;
		processBA.setActivityPaused(true);
        processBA.runHook("ondestroy", this, null);
	}

public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public anywheresoftware.b4a.samples.gmailcontacts.modrequest _modrequest = null;
public anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring _svcmonitoring = null;
public com.olympiacircuits.main _main = null;
public com.olympiacircuits.bt_interact _bt_interact = null;
public com.olympiacircuits.activity_db _activity_db = null;
public com.olympiacircuits.file_manager _file_manager = null;
public com.olympiacircuits.camera_activity _camera_activity = null;
public com.olympiacircuits.setup _setup = null;
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="main_controller";
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="main_controller";
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="main_controller";
anywheresoftware.b4a.objects.NotificationWrapper _main_notice = null;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="StartServiceAt(\"\",DateTime.Now + 30*60*1000,True)";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,(Object)(""),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+30*60*1000),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="Dim main_notice As Notification";
_main_notice = new anywheresoftware.b4a.objects.NotificationWrapper();
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="main_notice.Initialize";
_main_notice.Initialize();
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="main_notice.Icon = \"icon\"";
_main_notice.setIcon("icon");
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="main_notice.SetInfo(\"OC Logger\",\"Logger Runnin";
_main_notice.SetInfo(processBA,"OC Logger","Logger Running",(Object)(mostCurrent._main.getObject()));
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="main_notice.Sound=False";
_main_notice.setSound(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="main_notice.Vibrate=False";
_main_notice.setVibrate(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="main_notice.Light=False";
_main_notice.setLight(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="main_notice.OnGoingEvent = True";
_main_notice.setOnGoingEvent(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="Service.StartForeground(1,main_notice)";
mostCurrent._service.StartForeground((int) (1),(android.app.Notification)(_main_notice.getObject()));
RDebugUtils.currentLine=3735567;
 //BA.debugLineNum = 3735567;BA.debugLine="If IsPaused(activity_db) Then StartService(activ";
if (anywheresoftware.b4a.keywords.Common.IsPaused(processBA,(Object)(mostCurrent._activity_db.getObject()))) { 
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._activity_db.getObject()));};
RDebugUtils.currentLine=3735568;
 //BA.debugLineNum = 3735568;BA.debugLine="If IsPaused(file_manager) Then StartService(file";
if (anywheresoftware.b4a.keywords.Common.IsPaused(processBA,(Object)(mostCurrent._file_manager.getObject()))) { 
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._file_manager.getObject()));};
RDebugUtils.currentLine=3735570;
 //BA.debugLineNum = 3735570;BA.debugLine="StartActivity(camera_activity)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._camera_activity.getObject()));
RDebugUtils.currentLine=3735572;
 //BA.debugLineNum = 3735572;BA.debugLine="End Sub";
return "";
}
}