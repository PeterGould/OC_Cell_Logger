package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_controller_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (main_controller) ","main_controller",6,main_controller.processBA,main_controller.mostCurrent,12);
if (RapidSub.canDelegate("service_create")) return main_controller.remoteMe.runUserSub(false, "main_controller","service_create");
 BA.debugLineNum = 12;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (main_controller) ","main_controller",6,main_controller.processBA,main_controller.mostCurrent,38);
if (RapidSub.canDelegate("service_destroy")) return main_controller.remoteMe.runUserSub(false, "main_controller","service_destroy");
 BA.debugLineNum = 38;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (main_controller) ","main_controller",6,main_controller.processBA,main_controller.mostCurrent,16);
if (RapidSub.canDelegate("service_start")) return main_controller.remoteMe.runUserSub(false, "main_controller","service_start", _startingintent);
RemoteObject _main_notice = RemoteObject.declareNull("anywheresoftware.b4a.objects.NotificationWrapper");
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 16;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 18;BA.debugLine="StartServiceAt(\"\",DateTime.Now + 30*60*1000,True)";
Debug.ShouldStop(131072);
main_controller.mostCurrent.__c.runVoidMethod ("StartServiceAt",main_controller.processBA,(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.solve(new RemoteObject[] {main_controller.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(30),RemoteObject.createImmutable(60),RemoteObject.createImmutable(1000)}, "+**",1, 2)),(Object)(main_controller.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 20;BA.debugLine="Dim main_notice As Notification";
Debug.ShouldStop(524288);
_main_notice = RemoteObject.createNew ("anywheresoftware.b4a.objects.NotificationWrapper");Debug.locals.put("main_notice", _main_notice);
 BA.debugLineNum = 21;BA.debugLine="main_notice.Initialize";
Debug.ShouldStop(1048576);
_main_notice.runVoidMethod ("Initialize");
 BA.debugLineNum = 22;BA.debugLine="main_notice.Icon = \"icon\"";
Debug.ShouldStop(2097152);
_main_notice.runVoidMethod ("setIcon",BA.ObjectToString("icon"));
 BA.debugLineNum = 23;BA.debugLine="main_notice.SetInfo(\"OC Logger\",\"Logger Runnin";
Debug.ShouldStop(4194304);
_main_notice.runVoidMethod ("SetInfo",main_controller.processBA,(Object)(BA.ObjectToString("OC Logger")),(Object)(BA.ObjectToString("Logger Running")),(Object)((main_controller.mostCurrent._main.getObject())));
 BA.debugLineNum = 24;BA.debugLine="main_notice.Sound=False";
Debug.ShouldStop(8388608);
_main_notice.runVoidMethod ("setSound",main_controller.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 25;BA.debugLine="main_notice.Vibrate=False";
Debug.ShouldStop(16777216);
_main_notice.runVoidMethod ("setVibrate",main_controller.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 26;BA.debugLine="main_notice.Light=False";
Debug.ShouldStop(33554432);
_main_notice.runVoidMethod ("setLight",main_controller.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 27;BA.debugLine="main_notice.OnGoingEvent = True";
Debug.ShouldStop(67108864);
_main_notice.runVoidMethod ("setOnGoingEvent",main_controller.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 29;BA.debugLine="Service.StartForeground(1,main_notice)";
Debug.ShouldStop(268435456);
main_controller.mostCurrent._service.runVoidMethod ("StartForeground",(Object)(BA.numberCast(int.class, 1)),(Object)((_main_notice.getObject())));
 BA.debugLineNum = 31;BA.debugLine="If IsPaused(activity_db) Then StartService(activ";
Debug.ShouldStop(1073741824);
if (main_controller.mostCurrent.__c.runMethod(true,"IsPaused",main_controller.processBA,(Object)((main_controller.mostCurrent._activity_db.getObject()))).<Boolean>get().booleanValue()) { 
main_controller.mostCurrent.__c.runVoidMethod ("StartService",main_controller.processBA,(Object)((main_controller.mostCurrent._activity_db.getObject())));};
 BA.debugLineNum = 32;BA.debugLine="If IsPaused(file_manager) Then StartService(file";
Debug.ShouldStop(-2147483648);
if (main_controller.mostCurrent.__c.runMethod(true,"IsPaused",main_controller.processBA,(Object)((main_controller.mostCurrent._file_manager.getObject()))).<Boolean>get().booleanValue()) { 
main_controller.mostCurrent.__c.runVoidMethod ("StartService",main_controller.processBA,(Object)((main_controller.mostCurrent._file_manager.getObject())));};
 BA.debugLineNum = 34;BA.debugLine="StartActivity(camera_activity)";
Debug.ShouldStop(2);
main_controller.mostCurrent.__c.runVoidMethod ("StartActivity",main_controller.processBA,(Object)((main_controller.mostCurrent._camera_activity.getObject())));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}