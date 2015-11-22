package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_1 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Activity.LoadLayout(\"logger_layout\")";
Debug.ShouldStop(33554432);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("logger_layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="show_launch_state";
Debug.ShouldStop(67108864);
_show_launch_state();
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,30);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Dim launch_button As Button";
main.mostCurrent._launch_button = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _launch_button_click() throws Exception{
try {
		Debug.PushSubsStack("launch_button_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,48);
if (RapidSub.canDelegate("launch_button_click")) return main.remoteMe.runUserSub(false, "main","launch_button_click");
 BA.debugLineNum = 48;BA.debugLine="Sub launch_button_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="If launch_button.Tag <> \"running\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",main.mostCurrent._launch_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("running")))) { 
 BA.debugLineNum = 51;BA.debugLine="If IsPaused(activity_db) Then";
Debug.ShouldStop(262144);
if (main.mostCurrent.__c.runMethod(true,"IsPaused",main.mostCurrent.activityBA,(Object)((main.mostCurrent._activity_db.getObject()))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 52;BA.debugLine="StartService(activity_db)";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("StartService",main.mostCurrent.activityBA,(Object)((main.mostCurrent._activity_db.getObject())));
 BA.debugLineNum = 53;BA.debugLine="CallSubDelayed2(activity_db,\"write_activity\",\"";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",main.mostCurrent.activityBA,(Object)((main.mostCurrent._activity_db.getObject())),(Object)(BA.ObjectToString("write_activity")),(Object)((RemoteObject.createImmutable("App started"))));
 };
 BA.debugLineNum = 55;BA.debugLine="If IsPaused(file_manager) Then StartService(file";
Debug.ShouldStop(4194304);
if (main.mostCurrent.__c.runMethod(true,"IsPaused",main.mostCurrent.activityBA,(Object)((main.mostCurrent._file_manager.getObject()))).<Boolean>get().booleanValue()) { 
main.mostCurrent.__c.runVoidMethod ("StartService",main.mostCurrent.activityBA,(Object)((main.mostCurrent._file_manager.getObject())));};
 BA.debugLineNum = 56;BA.debugLine="StartService(main_controller)";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("StartService",main.mostCurrent.activityBA,(Object)((main.mostCurrent._main_controller.getObject())));
 BA.debugLineNum = 58;BA.debugLine="my_phone.SetScreenBrightness(0.1)";
Debug.ShouldStop(33554432);
main._my_phone.runVoidMethod ("SetScreenBrightness",main.processBA,(Object)(BA.numberCast(float.class, 0.1)));
 BA.debugLineNum = 59;BA.debugLine="my_phone_state.PartialLock";
Debug.ShouldStop(67108864);
main._my_phone_state.runVoidMethod ("PartialLock",main.processBA);
 BA.debugLineNum = 60;BA.debugLine="launch_button.Tag = \"running\"";
Debug.ShouldStop(134217728);
main.mostCurrent._launch_button.runMethod(false,"setTag",RemoteObject.createImmutable(("running")));
 BA.debugLineNum = 61;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 64;BA.debugLine="If launch_button.Tag = \"running\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",main.mostCurrent._launch_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("running")))) { 
 BA.debugLineNum = 65;BA.debugLine="my_phone_state.ReleasePartialLock";
Debug.ShouldStop(1);
main._my_phone_state.runVoidMethod ("ReleasePartialLock");
 BA.debugLineNum = 66;BA.debugLine="my_phone_state.ReleaseKeepAlive";
Debug.ShouldStop(2);
main._my_phone_state.runVoidMethod ("ReleaseKeepAlive");
 BA.debugLineNum = 67;BA.debugLine="StopService(main_controller)";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("StopService",main.mostCurrent.activityBA,(Object)((main.mostCurrent._main_controller.getObject())));
 BA.debugLineNum = 68;BA.debugLine="my_phone.SetScreenBrightness(0.7)";
Debug.ShouldStop(8);
main._my_phone.runVoidMethod ("SetScreenBrightness",main.processBA,(Object)(BA.numberCast(float.class, 0.7)));
 BA.debugLineNum = 69;BA.debugLine="launch_button.Tag = \"stopped\"";
Debug.ShouldStop(16);
main.mostCurrent._launch_button.runMethod(false,"setTag",RemoteObject.createImmutable(("stopped")));
 };
 BA.debugLineNum = 71;BA.debugLine="show_launch_state";
Debug.ShouldStop(64);
_show_launch_state();
 BA.debugLineNum = 72;BA.debugLine="End Sub";
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
bt_interact_subs_0._process_globals();
activity_db_subs_0._process_globals();
file_manager_subs_0._process_globals();
camera_activity_subs_0._process_globals();
main_controller_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("com.olympiacircuits.main");
bt_interact.myClass = BA.getDeviceClass ("com.olympiacircuits.bt_interact");
activity_db.myClass = BA.getDeviceClass ("com.olympiacircuits.activity_db");
file_manager.myClass = BA.getDeviceClass ("com.olympiacircuits.file_manager");
auto_camera.myClass = BA.getDeviceClass ("com.olympiacircuits.auto_camera");
cameraexclass.myClass = BA.getDeviceClass ("com.olympiacircuits.cameraexclass");
bt_controller.myClass = BA.getDeviceClass ("com.olympiacircuits.bt_controller");
camera_activity.myClass = BA.getDeviceClass ("com.olympiacircuits.camera_activity");
main_controller.myClass = BA.getDeviceClass ("com.olympiacircuits.main_controller");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim my_phone As Phone";
main._my_phone = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 17;BA.debugLine="Dim my_phone_state As PhoneWakeState";
main._my_phone_state = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneWakeState");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_check_click() throws Exception{
try {
		Debug.PushSubsStack("service_check_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,75);
if (RapidSub.canDelegate("service_check_click")) return main.remoteMe.runUserSub(false, "main","service_check_click");
RemoteObject _running = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
RemoteObject _a_dialog = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog");
 BA.debugLineNum = 75;BA.debugLine="Sub service_check_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="Dim running As ListView";
Debug.ShouldStop(2048);
_running = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");Debug.locals.put("running", _running);
 BA.debugLineNum = 77;BA.debugLine="Dim a_dialog As CustomDialog";
Debug.ShouldStop(4096);
_a_dialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog");Debug.locals.put("a_dialog", _a_dialog);
 BA.debugLineNum = 78;BA.debugLine="running.Initialize(\"running\")";
Debug.ShouldStop(8192);
_running.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("running")));
 BA.debugLineNum = 79;BA.debugLine="running.AddSingleLine(\"None\")";
Debug.ShouldStop(16384);
_running.runVoidMethod ("AddSingleLine",(Object)(RemoteObject.createImmutable("None")));
 BA.debugLineNum = 80;BA.debugLine="If IsPaused(main_controller) = False Then running";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.runMethod(true,"IsPaused",main.mostCurrent.activityBA,(Object)((main.mostCurrent._main_controller.getObject()))),main.mostCurrent.__c.getField(true,"False"))) { 
_running.runVoidMethod ("AddSingleLine",(Object)(RemoteObject.createImmutable("main_controller")));};
 BA.debugLineNum = 81;BA.debugLine="If IsPaused(file_manager) = False Then running.Ad";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.runMethod(true,"IsPaused",main.mostCurrent.activityBA,(Object)((main.mostCurrent._file_manager.getObject()))),main.mostCurrent.__c.getField(true,"False"))) { 
_running.runVoidMethod ("AddSingleLine",(Object)(RemoteObject.createImmutable("file_manager")));};
 BA.debugLineNum = 82;BA.debugLine="If IsPaused(activity_db) = False Then running.Add";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.runMethod(true,"IsPaused",main.mostCurrent.activityBA,(Object)((main.mostCurrent._activity_db.getObject()))),main.mostCurrent.__c.getField(true,"False"))) { 
_running.runVoidMethod ("AddSingleLine",(Object)(RemoteObject.createImmutable("activity_db")));};
 BA.debugLineNum = 83;BA.debugLine="If running.Size > 1 Then running.RemoveAt(0)";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_running.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
_running.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));};
 BA.debugLineNum = 84;BA.debugLine="a_dialog.AddView(running,5%x,5%y,80%x,80%y)";
Debug.ShouldStop(524288);
_a_dialog.runVoidMethod ("AddView",(Object)((_running.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 85;BA.debugLine="a_dialog.Show(\"Services\",\"\",\"Close\",\"\",Null)";
Debug.ShouldStop(1048576);
_a_dialog.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Services")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Close")),(Object)(BA.ObjectToString("")),main.mostCurrent.activityBA,(Object)((main.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setup(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("setup (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,41);
if (RapidSub.canDelegate("setup")) return main.remoteMe.runUserSub(false, "main","setup", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 41;BA.debugLine="Sub setup(FirstTime As Boolean)";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show_launch_state() throws Exception{
try {
		Debug.PushSubsStack("show_launch_state (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,91);
if (RapidSub.canDelegate("show_launch_state")) return main.remoteMe.runUserSub(false, "main","show_launch_state");
 BA.debugLineNum = 91;BA.debugLine="Sub show_launch_state";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="If launch_button.Tag = \"stopped\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",main.mostCurrent._launch_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("stopped")))) { 
 BA.debugLineNum = 93;BA.debugLine="launch_button.Color = Colors.Green";
Debug.ShouldStop(268435456);
main.mostCurrent._launch_button.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 94;BA.debugLine="launch_button.Text = \"Launch\"";
Debug.ShouldStop(536870912);
main.mostCurrent._launch_button.runMethod(true,"setText",RemoteObject.createImmutable(("Launch")));
 };
 BA.debugLineNum = 96;BA.debugLine="If launch_button.Tag = \"running\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",main.mostCurrent._launch_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("running")))) { 
 BA.debugLineNum = 97;BA.debugLine="launch_button.Color = Colors.Red";
Debug.ShouldStop(1);
main.mostCurrent._launch_button.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 98;BA.debugLine="launch_button.Text = \"Running\"";
Debug.ShouldStop(2);
main.mostCurrent._launch_button.runMethod(true,"setText",RemoteObject.createImmutable(("Running")));
 };
 BA.debugLineNum = 100;BA.debugLine="End Sub";
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