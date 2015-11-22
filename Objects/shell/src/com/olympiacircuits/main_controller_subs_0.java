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
		Debug.PushSubsStack("Service_Create (main_controller) ","main_controller",8,main_controller.processBA,main_controller.mostCurrent,12);
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
		Debug.PushSubsStack("Service_Destroy (main_controller) ","main_controller",8,main_controller.processBA,main_controller.mostCurrent,25);
if (RapidSub.canDelegate("service_destroy")) return main_controller.remoteMe.runUserSub(false, "main_controller","service_destroy");
 BA.debugLineNum = 25;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Service_Start (main_controller) ","main_controller",8,main_controller.processBA,main_controller.mostCurrent,16);
if (RapidSub.canDelegate("service_start")) return main_controller.remoteMe.runUserSub(false, "main_controller","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 16;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 18;BA.debugLine="StartServiceAt(\"\",DateTime.Now + 30*30*1000,True)";
Debug.ShouldStop(131072);
main_controller.mostCurrent.__c.runVoidMethod ("StartServiceAt",main_controller.processBA,(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.solve(new RemoteObject[] {main_controller.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(30),RemoteObject.createImmutable(30),RemoteObject.createImmutable(1000)}, "+**",1, 2)),(Object)(main_controller.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 22;BA.debugLine="StartActivity(camera_activity)";
Debug.ShouldStop(2097152);
main_controller.mostCurrent.__c.runVoidMethod ("StartActivity",main_controller.processBA,(Object)((main_controller.mostCurrent._camera_activity.getObject())));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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