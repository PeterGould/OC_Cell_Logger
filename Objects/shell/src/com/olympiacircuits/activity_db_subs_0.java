package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class activity_db_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim activity_con As SQL";
activity_db._activity_con = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 7;BA.debugLine="Dim db_dir As String = \"activites\"";
activity_db._db_dir = BA.ObjectToString("activites");
 //BA.debugLineNum = 8;BA.debugLine="Dim db_name As String = \"activity_database.db\"";
activity_db._db_name = BA.ObjectToString("activity_database.db");
 //BA.debugLineNum = 9;BA.debugLine="Dim db_path As String";
activity_db._db_path = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (activity_db) ","activity_db",2,activity_db.processBA,activity_db.mostCurrent,12);
if (RapidSub.canDelegate("service_create")) return activity_db.remoteMe.runUserSub(false, "activity_db","service_create");
RemoteObject _new_db = RemoteObject.createImmutable(false);
 BA.debugLineNum = 12;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="db_path = File.DirDefaultExternal & \"/\" & db_dir";
Debug.ShouldStop(4096);
activity_db._db_path = RemoteObject.concat(activity_db.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/"),activity_db._db_dir);
 BA.debugLineNum = 14;BA.debugLine="If(db_name.EndsWith(\".db\")) = False Then db_name";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",(activity_db._db_name.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".db")))),activity_db.mostCurrent.__c.getField(true,"False"))) { 
activity_db._db_name = RemoteObject.concat(activity_db._db_name,RemoteObject.createImmutable(".db"));};
 BA.debugLineNum = 15;BA.debugLine="Dim new_db As Boolean";
Debug.ShouldStop(16384);
_new_db = RemoteObject.createImmutable(false);Debug.locals.put("new_db", _new_db);
 BA.debugLineNum = 17;BA.debugLine="If File.IsDirectory(File.DirDefaultExternal,db_di";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",activity_db.mostCurrent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(activity_db.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(activity_db._db_dir)),activity_db.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 18;BA.debugLine="File.MakeDir(File.DirDefaultExternal, db_dir)";
Debug.ShouldStop(131072);
activity_db.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(activity_db.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(activity_db._db_dir));
 };
 BA.debugLineNum = 21;BA.debugLine="Log(\"creating activity_database at \" & db_path)";
Debug.ShouldStop(1048576);
activity_db.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("creating activity_database at "),activity_db._db_path)));
 BA.debugLineNum = 22;BA.debugLine="new_db = File.Exists(db_path, db_name) = False";
Debug.ShouldStop(2097152);
_new_db = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",activity_db.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(activity_db._db_path),(Object)(activity_db._db_name)),activity_db.mostCurrent.__c.getField(true,"False")));Debug.locals.put("new_db", _new_db);
 BA.debugLineNum = 23;BA.debugLine="activity_con.Initialize(db_path, db_name, True)";
Debug.ShouldStop(4194304);
activity_db._activity_con.runVoidMethod ("Initialize",(Object)(activity_db._db_path),(Object)(activity_db._db_name),(Object)(activity_db.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 24;BA.debugLine="If new_db Then";
Debug.ShouldStop(8388608);
if (_new_db.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 25;BA.debugLine="activity_con.ExecNonQuery(\"CREATE TABLE action_l";
Debug.ShouldStop(16777216);
activity_db._activity_con.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE action_log (action TEXT, timestamp TEXT)")));
 };
 BA.debugLineNum = 27;BA.debugLine="write_activity(\"Activity database started.\")";
Debug.ShouldStop(67108864);
_write_activity(RemoteObject.createImmutable("Activity database started."));
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
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (activity_db) ","activity_db",2,activity_db.processBA,activity_db.mostCurrent,34);
if (RapidSub.canDelegate("service_destroy")) return activity_db.remoteMe.runUserSub(false, "activity_db","service_destroy");
 BA.debugLineNum = 34;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="activity_con.Close";
Debug.ShouldStop(4);
activity_db._activity_con.runVoidMethod ("Close");
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
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (activity_db) ","activity_db",2,activity_db.processBA,activity_db.mostCurrent,30);
if (RapidSub.canDelegate("service_start")) return activity_db.remoteMe.runUserSub(false, "activity_db","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 30;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="If activity_con.IsInitialized = False Then activi";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",activity_db._activity_con.runMethod(true,"IsInitialized"),activity_db.mostCurrent.__c.getField(true,"False"))) { 
activity_db._activity_con.runVoidMethod ("Initialize",(Object)(activity_db._db_path),(Object)(activity_db._db_name),(Object)(activity_db.mostCurrent.__c.getField(true,"True")));};
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
public static RemoteObject  _write_activity(RemoteObject _event_string) throws Exception{
try {
		Debug.PushSubsStack("write_activity (activity_db) ","activity_db",2,activity_db.processBA,activity_db.mostCurrent,39);
if (RapidSub.canDelegate("write_activity")) return activity_db.remoteMe.runUserSub(false, "activity_db","write_activity", _event_string);
RemoteObject _dt = RemoteObject.createImmutable("");
RemoteObject _now = RemoteObject.createImmutable(0L);
Debug.locals.put("event_string", _event_string);
 BA.debugLineNum = 39;BA.debugLine="Sub write_activity(event_string As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Dim dt As String";
Debug.ShouldStop(128);
_dt = RemoteObject.createImmutable("");Debug.locals.put("dt", _dt);
 BA.debugLineNum = 41;BA.debugLine="Dim now As Long";
Debug.ShouldStop(256);
_now = RemoteObject.createImmutable(0L);Debug.locals.put("now", _now);
 BA.debugLineNum = 42;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' See";
Debug.ShouldStop(512);
activity_db.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 43;BA.debugLine="now = DateTime.Now";
Debug.ShouldStop(1024);
_now = activity_db.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);
 BA.debugLineNum = 44;BA.debugLine="dt = DateTime.Date(now)";
Debug.ShouldStop(2048);
_dt = activity_db.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now));Debug.locals.put("dt", _dt);
 BA.debugLineNum = 45;BA.debugLine="activity_con.ExecNonQuery2(\"Insert INTO action_lo";
Debug.ShouldStop(4096);
activity_db._activity_con.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("Insert INTO action_log Values(?,?)")),(Object)(activity_db.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_event_string),(_dt)})))));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
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
}