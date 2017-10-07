package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="If FirstTime Then 'launch the helper activities";
Debug.ShouldStop(33554432);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 27;BA.debugLine="If IsPaused(activity_db) Then";
Debug.ShouldStop(67108864);
if (main.mostCurrent.__c.runMethod(true,"IsPaused",main.mostCurrent.activityBA,(Object)((main.mostCurrent._activity_db.getObject()))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 28;BA.debugLine="StartService(activity_db)";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("StartService",main.mostCurrent.activityBA,(Object)((main.mostCurrent._activity_db.getObject())));
 BA.debugLineNum = 29;BA.debugLine="CallSubDelayed2(activity_db,\"write_activity\"";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",main.mostCurrent.activityBA,(Object)((main.mostCurrent._activity_db.getObject())),(Object)(BA.ObjectToString("write_activity")),(Object)((RemoteObject.createImmutable("App started"))));
 };
 BA.debugLineNum = 31;BA.debugLine="If IsPaused(file_manager) Then StartService(file";
Debug.ShouldStop(1073741824);
if (main.mostCurrent.__c.runMethod(true,"IsPaused",main.mostCurrent.activityBA,(Object)((main.mostCurrent._file_manager.getObject()))).<Boolean>get().booleanValue()) { 
main.mostCurrent.__c.runVoidMethod ("StartService",main.mostCurrent.activityBA,(Object)((main.mostCurrent._file_manager.getObject())));};
 };
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"logger_layout\")";
Debug.ShouldStop(1);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("logger_layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="StartActivity(setup)";
Debug.ShouldStop(2);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((main.mostCurrent._setup.getObject())));
 BA.debugLineNum = 35;BA.debugLine="show_launch_state";
Debug.ShouldStop(4);
_show_launch_state();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,42);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,38);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 22;BA.debugLine="Dim launch_button As Button";
main.mostCurrent._launch_button = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _launch_button_click() throws Exception{
try {
		Debug.PushSubsStack("launch_button_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,50);
if (RapidSub.canDelegate("launch_button_click")) return main.remoteMe.runUserSub(false, "main","launch_button_click");
 BA.debugLineNum = 50;BA.debugLine="Sub launch_button_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="If launch_button.Tag <> \"running\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",main.mostCurrent._launch_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("running")))) { 
 BA.debugLineNum = 53;BA.debugLine="StartService(main_controller)";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethod ("StartService",main.mostCurrent.activityBA,(Object)((main.mostCurrent._main_controller.getObject())));
 BA.debugLineNum = 55;BA.debugLine="my_phone.SetScreenBrightness(0.0)";
Debug.ShouldStop(4194304);
main._my_phone.runVoidMethod ("SetScreenBrightness",main.processBA,(Object)(BA.numberCast(float.class, 0.0)));
 BA.debugLineNum = 56;BA.debugLine="my_phone_state.PartialLock";
Debug.ShouldStop(8388608);
main._my_phone_state.runVoidMethod ("PartialLock",main.processBA);
 BA.debugLineNum = 57;BA.debugLine="launch_button.Tag = \"running\"";
Debug.ShouldStop(16777216);
main.mostCurrent._launch_button.runMethod(false,"setTag",RemoteObject.createImmutable(("running")));
 BA.debugLineNum = 58;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 61;BA.debugLine="If launch_button.Tag = \"running\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",main.mostCurrent._launch_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("running")))) { 
 BA.debugLineNum = 62;BA.debugLine="my_phone_state.ReleasePartialLock";
Debug.ShouldStop(536870912);
main._my_phone_state.runVoidMethod ("ReleasePartialLock");
 BA.debugLineNum = 63;BA.debugLine="my_phone_state.ReleaseKeepAlive";
Debug.ShouldStop(1073741824);
main._my_phone_state.runVoidMethod ("ReleaseKeepAlive");
 BA.debugLineNum = 64;BA.debugLine="StopService(main_controller)";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethod ("StopService",main.mostCurrent.activityBA,(Object)((main.mostCurrent._main_controller.getObject())));
 BA.debugLineNum = 65;BA.debugLine="my_phone.SetScreenBrightness(0.7)";
Debug.ShouldStop(1);
main._my_phone.runVoidMethod ("SetScreenBrightness",main.processBA,(Object)(BA.numberCast(float.class, 0.7)));
 BA.debugLineNum = 66;BA.debugLine="launch_button.Tag = \"stopped\"";
Debug.ShouldStop(2);
main.mostCurrent._launch_button.runMethod(false,"setTag",RemoteObject.createImmutable(("stopped")));
 };
 BA.debugLineNum = 68;BA.debugLine="show_launch_state";
Debug.ShouldStop(8);
_show_launch_state();
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
setup_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("com.olympiacircuits.main");
bt_interact.myClass = BA.getDeviceClass ("com.olympiacircuits.bt_interact");
activity_db.myClass = BA.getDeviceClass ("com.olympiacircuits.activity_db");
file_manager.myClass = BA.getDeviceClass ("com.olympiacircuits.file_manager");
auto_camera.myClass = BA.getDeviceClass ("com.olympiacircuits.auto_camera");
camera_activity.myClass = BA.getDeviceClass ("com.olympiacircuits.camera_activity");
main_controller.myClass = BA.getDeviceClass ("com.olympiacircuits.main_controller");
setup.myClass = BA.getDeviceClass ("com.olympiacircuits.setup");
customlistview.myClass = BA.getDeviceClass ("com.olympiacircuits.customlistview");
cameraexclass.myClass = BA.getDeviceClass ("com.olympiacircuits.cameraexclass");
bt_controller.myClass = BA.getDeviceClass ("com.olympiacircuits.bt_controller");
		
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
		Debug.PushSubsStack("service_check_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,72);
if (RapidSub.canDelegate("service_check_click")) return main.remoteMe.runUserSub(false, "main","service_check_click");
RemoteObject _running = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
RemoteObject _a_dialog = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog");
 BA.debugLineNum = 72;BA.debugLine="Sub service_check_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Dim running As ListView";
Debug.ShouldStop(256);
_running = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");Debug.locals.put("running", _running);
 BA.debugLineNum = 74;BA.debugLine="Dim a_dialog As CustomDialog";
Debug.ShouldStop(512);
_a_dialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog");Debug.locals.put("a_dialog", _a_dialog);
 BA.debugLineNum = 75;BA.debugLine="running.Initialize(\"running\")";
Debug.ShouldStop(1024);
_running.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("running")));
 BA.debugLineNum = 76;BA.debugLine="running.AddSingleLine(\"None\")";
Debug.ShouldStop(2048);
_running.runVoidMethod ("AddSingleLine",(Object)(RemoteObject.createImmutable("None")));
 BA.debugLineNum = 77;BA.debugLine="If IsPaused(main_controller) = False Then running";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.runMethod(true,"IsPaused",main.mostCurrent.activityBA,(Object)((main.mostCurrent._main_controller.getObject()))),main.mostCurrent.__c.getField(true,"False"))) { 
_running.runVoidMethod ("AddSingleLine",(Object)(RemoteObject.createImmutable("main_controller")));};
 BA.debugLineNum = 78;BA.debugLine="If IsPaused(file_manager) = False Then running.Ad";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.runMethod(true,"IsPaused",main.mostCurrent.activityBA,(Object)((main.mostCurrent._file_manager.getObject()))),main.mostCurrent.__c.getField(true,"False"))) { 
_running.runVoidMethod ("AddSingleLine",(Object)(RemoteObject.createImmutable("file_manager")));};
 BA.debugLineNum = 79;BA.debugLine="If IsPaused(activity_db) = False Then running.Add";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.runMethod(true,"IsPaused",main.mostCurrent.activityBA,(Object)((main.mostCurrent._activity_db.getObject()))),main.mostCurrent.__c.getField(true,"False"))) { 
_running.runVoidMethod ("AddSingleLine",(Object)(RemoteObject.createImmutable("activity_db")));};
 BA.debugLineNum = 80;BA.debugLine="If IsPaused(bt_interact) = False Then running.Add";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.runMethod(true,"IsPaused",main.mostCurrent.activityBA,(Object)((main.mostCurrent._bt_interact.getObject()))),main.mostCurrent.__c.getField(true,"False"))) { 
_running.runVoidMethod ("AddSingleLine",(Object)(RemoteObject.createImmutable("bt_interact")));};
 BA.debugLineNum = 81;BA.debugLine="If running.Size > 1 Then running.RemoveAt(0)";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_running.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
_running.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, 0)));};
 BA.debugLineNum = 82;BA.debugLine="a_dialog.AddView(running,5%x,5%y,80%x,80%y)";
Debug.ShouldStop(131072);
_a_dialog.runVoidMethod ("AddView",(Object)((_running.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 83;BA.debugLine="a_dialog.Show(\"Services\",\"\",\"Close\",\"\",Null)";
Debug.ShouldStop(262144);
_a_dialog.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Services")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Close")),(Object)(BA.ObjectToString("")),main.mostCurrent.activityBA,(Object)((main.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("show_launch_state (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,92);
if (RapidSub.canDelegate("show_launch_state")) return main.remoteMe.runUserSub(false, "main","show_launch_state");
 BA.debugLineNum = 92;BA.debugLine="Sub show_launch_state";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="If launch_button.Tag = \"stopped\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",main.mostCurrent._launch_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("stopped")))) { 
 BA.debugLineNum = 94;BA.debugLine="launch_button.Color = Colors.Green";
Debug.ShouldStop(536870912);
main.mostCurrent._launch_button.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 95;BA.debugLine="launch_button.Text = \"Launch\"";
Debug.ShouldStop(1073741824);
main.mostCurrent._launch_button.runMethod(true,"setText",RemoteObject.createImmutable(("Launch")));
 };
 BA.debugLineNum = 97;BA.debugLine="If launch_button.Tag = \"running\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",main.mostCurrent._launch_button.runMethod(false,"getTag"),RemoteObject.createImmutable(("running")))) { 
 BA.debugLineNum = 98;BA.debugLine="launch_button.Color = Colors.Red";
Debug.ShouldStop(2);
main.mostCurrent._launch_button.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 99;BA.debugLine="launch_button.Text = \"Running\"";
Debug.ShouldStop(4);
main.mostCurrent._launch_button.runMethod(true,"setText",RemoteObject.createImmutable(("Running")));
 };
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _test_button_click() throws Exception{
try {
		Debug.PushSubsStack("test_button_click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,86);
if (RapidSub.canDelegate("test_button_click")) return main.remoteMe.runUserSub(false, "main","test_button_click");
 BA.debugLineNum = 86;BA.debugLine="Sub test_button_click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="StartService(bt_interact)";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("StartService",main.mostCurrent.activityBA,(Object)((main.mostCurrent._bt_interact.getObject())));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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