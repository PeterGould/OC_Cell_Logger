package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class camera_activity_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (camera_activity) ","camera_activity",5,camera_activity.mostCurrent.activityBA,camera_activity.mostCurrent,17);
if (RapidSub.canDelegate("activity_create")) return camera_activity.remoteMe.runUserSub(false, "camera_activity","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 17;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="pic_panel.Initialize(\"pic_panel\")";
Debug.ShouldStop(131072);
camera_activity.mostCurrent._pic_panel.runVoidMethod ("Initialize",camera_activity.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pic_panel")));
 BA.debugLineNum = 19;BA.debugLine="Activity.AddView(pic_panel,1%x,1%y,90%x,90%y)";
Debug.ShouldStop(262144);
camera_activity.mostCurrent._activity.runVoidMethod ("AddView",(Object)((camera_activity.mostCurrent._pic_panel.getObject())),(Object)(camera_activity.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),camera_activity.mostCurrent.activityBA)),(Object)(camera_activity.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),camera_activity.mostCurrent.activityBA)),(Object)(camera_activity.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),camera_activity.mostCurrent.activityBA)),(Object)(camera_activity.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),camera_activity.mostCurrent.activityBA)));
 BA.debugLineNum = 20;BA.debugLine="a_camera.Initialize(pic_panel,CallSub(file_manage";
Debug.ShouldStop(524288);
camera_activity.mostCurrent._a_camera.runClassMethod (com.olympiacircuits.auto_camera.class, "_initialize",camera_activity.mostCurrent.activityBA,(Object)(camera_activity.mostCurrent._pic_panel),(Object)(BA.ObjectToString(camera_activity.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",camera_activity.mostCurrent.activityBA,(Object)((camera_activity.mostCurrent._file_manager.getObject())),(Object)(RemoteObject.createImmutable("get_current_dir"))))),(Object)(RemoteObject.createImmutable("take_picture")));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (camera_activity) ","camera_activity",5,camera_activity.mostCurrent.activityBA,camera_activity.mostCurrent,27);
if (RapidSub.canDelegate("activity_pause")) return camera_activity.remoteMe.runUserSub(false, "camera_activity","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (camera_activity) ","camera_activity",5,camera_activity.mostCurrent.activityBA,camera_activity.mostCurrent,23);
if (RapidSub.canDelegate("activity_resume")) return camera_activity.remoteMe.runUserSub(false, "camera_activity","activity_resume");
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _close_self() throws Exception{
try {
		Debug.PushSubsStack("close_self (camera_activity) ","camera_activity",5,camera_activity.mostCurrent.activityBA,camera_activity.mostCurrent,31);
if (RapidSub.canDelegate("close_self")) return camera_activity.remoteMe.runUserSub(false, "camera_activity","close_self");
 BA.debugLineNum = 31;BA.debugLine="Sub close_self";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Activity.Finish";
Debug.ShouldStop(-2147483648);
camera_activity.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 13;BA.debugLine="Dim a_camera As auto_camera";
camera_activity.mostCurrent._a_camera = RemoteObject.createNew ("com.olympiacircuits.auto_camera");
 //BA.debugLineNum = 14;BA.debugLine="Dim pic_panel As Panel";
camera_activity.mostCurrent._pic_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}