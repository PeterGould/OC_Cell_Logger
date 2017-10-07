package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class activity_db_subs_3 {


public static RemoteObject  _do_query(RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("do_query (activity_db) ","activity_db",2,activity_db.processBA,activity_db.mostCurrent,78);
if (RapidSub.canDelegate("do_query")) return activity_db.remoteMe.runUserSub(false, "activity_db","do_query", _query);
Debug.locals.put("query", _query);
 BA.debugLineNum = 78;BA.debugLine="Sub do_query(query As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="activity_con.ExecNonQuery(query)";
Debug.ShouldStop(16384);
activity_db._activity_con.runVoidMethod ("ExecNonQuery",(Object)(_query));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_lines(RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("get_lines (activity_db) ","activity_db",2,activity_db.processBA,activity_db.mostCurrent,56);
if (RapidSub.canDelegate("get_lines")) return activity_db.remoteMe.runUserSub(false, "activity_db","get_lines", _query);
RemoteObject _cursor1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _j = RemoteObject.createImmutable(0);
RemoteObject _a_col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("query", _query);
 BA.debugLineNum = 56;BA.debugLine="Sub get_lines(query As String)  As List";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim Cursor1 As Cursor";
Debug.ShouldStop(16777216);
_cursor1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Cursor1", _cursor1);
 BA.debugLineNum = 58;BA.debugLine="Dim rows As List";
Debug.ShouldStop(33554432);
_rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("rows", _rows);
 BA.debugLineNum = 59;BA.debugLine="Dim i As Int";
Debug.ShouldStop(67108864);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 60;BA.debugLine="Dim j As Int";
Debug.ShouldStop(134217728);
_j = RemoteObject.createImmutable(0);Debug.locals.put("j", _j);
 BA.debugLineNum = 61;BA.debugLine="rows.Initialize";
Debug.ShouldStop(268435456);
_rows.runVoidMethod ("Initialize");
 BA.debugLineNum = 62;BA.debugLine="Cursor1 = activity_con.ExecQuery(query)";
Debug.ShouldStop(536870912);
_cursor1.setObject(activity_db._activity_con.runMethod(false,"ExecQuery",(Object)(_query)));
 BA.debugLineNum = 63;BA.debugLine="If Cursor1.RowCount < 1 Then Return rows";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("<",_cursor1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1))) { 
if (true) return _rows;};
 BA.debugLineNum = 64;BA.debugLine="For j = 0 To Cursor1.RowCount - 1";
Debug.ShouldStop(-2147483648);
{
final int step49 = 1;
final int limit49 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_j = BA.numberCast(int.class, 0); (step49 > 0 && _j.<Integer>get().intValue() <= limit49) || (step49 < 0 && _j.<Integer>get().intValue() >= limit49); _j = RemoteObject.createImmutable((int)(0 + _j.<Integer>get().intValue() + step49))) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 65;BA.debugLine="Cursor1.Position = j";
Debug.ShouldStop(1);
_cursor1.runMethod(true,"setPosition",_j);
 BA.debugLineNum = 66;BA.debugLine="Dim a_col As List";
Debug.ShouldStop(2);
_a_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("a_col", _a_col);
 BA.debugLineNum = 67;BA.debugLine="a_col.Initialize";
Debug.ShouldStop(4);
_a_col.runVoidMethod ("Initialize");
 BA.debugLineNum = 68;BA.debugLine="For i = 0 To Cursor1.ColumnCount - 1";
Debug.ShouldStop(8);
{
final int step53 = 1;
final int limit53 = RemoteObject.solve(new RemoteObject[] {_cursor1.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = BA.numberCast(int.class, 0); (step53 > 0 && _i.<Integer>get().intValue() <= limit53) || (step53 < 0 && _i.<Integer>get().intValue() >= limit53); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step53))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 69;BA.debugLine="a_col.Add(Cursor1.GetString2(i))";
Debug.ShouldStop(16);
_a_col.runVoidMethod ("Add",(Object)((_cursor1.runMethod(true,"GetString2",(Object)(_i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 71;BA.debugLine="rows.Add(a_col)";
Debug.ShouldStop(64);
_rows.runVoidMethod ("Add",(Object)((_a_col.getObject())));
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 73;BA.debugLine="Cursor1.Close";
Debug.ShouldStop(256);
_cursor1.runVoidMethod ("Close");
 BA.debugLineNum = 74;BA.debugLine="Return(rows)";
Debug.ShouldStop(512);
if (true) return (_rows);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
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
 //BA.debugLineNum = 10;BA.debugLine="Type schedule_holder(action As String, period As";
;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (activity_db) ","activity_db",2,activity_db.processBA,activity_db.mostCurrent,13);
if (RapidSub.canDelegate("service_create")) return activity_db.remoteMe.runUserSub(false, "activity_db","service_create");
RemoteObject _new_db = RemoteObject.createImmutable(false);
 BA.debugLineNum = 13;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="db_path = File.DirDefaultExternal & \"/\" & db_dir";
Debug.ShouldStop(8192);
activity_db._db_path = RemoteObject.concat(activity_db.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal"),RemoteObject.createImmutable("/"),activity_db._db_dir);
 BA.debugLineNum = 15;BA.debugLine="If(db_name.EndsWith(\".db\")) = False Then db_name";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",(activity_db._db_name.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".db")))),activity_db.mostCurrent.__c.getField(true,"False"))) { 
activity_db._db_name = RemoteObject.concat(activity_db._db_name,RemoteObject.createImmutable(".db"));};
 BA.debugLineNum = 16;BA.debugLine="Dim new_db As Boolean";
Debug.ShouldStop(32768);
_new_db = RemoteObject.createImmutable(false);Debug.locals.put("new_db", _new_db);
 BA.debugLineNum = 18;BA.debugLine="If File.IsDirectory(File.DirDefaultExternal,db_di";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",activity_db.mostCurrent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(activity_db.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(activity_db._db_dir)),activity_db.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 19;BA.debugLine="File.MakeDir(File.DirDefaultExternal, db_dir)";
Debug.ShouldStop(262144);
activity_db.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(activity_db.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(activity_db._db_dir));
 };
 BA.debugLineNum = 22;BA.debugLine="Log(\"creating activity_database at \" & db_path)";
Debug.ShouldStop(2097152);
activity_db.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("creating activity_database at "),activity_db._db_path)));
 BA.debugLineNum = 23;BA.debugLine="new_db = File.Exists(db_path, db_name) = False";
Debug.ShouldStop(4194304);
_new_db = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",activity_db.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(activity_db._db_path),(Object)(activity_db._db_name)),activity_db.mostCurrent.__c.getField(true,"False")));Debug.locals.put("new_db", _new_db);
 BA.debugLineNum = 24;BA.debugLine="activity_con.Initialize(db_path, db_name, True)";
Debug.ShouldStop(8388608);
activity_db._activity_con.runVoidMethod ("Initialize",(Object)(activity_db._db_path),(Object)(activity_db._db_name),(Object)(activity_db.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 25;BA.debugLine="If new_db Then";
Debug.ShouldStop(16777216);
if (_new_db.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 26;BA.debugLine="activity_con.ExecNonQuery(\"CREATE TABLE action_l";
Debug.ShouldStop(33554432);
activity_db._activity_con.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE action_log (action TEXT, timestamp TEXT)")));
 BA.debugLineNum = 27;BA.debugLine="activity_con.ExecNonQuery(\"Create Table schedule";
Debug.ShouldStop(67108864);
activity_db._activity_con.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Create Table scheduler (action TEXT, period TEXT, unit TEXT, time1 TEXT, time2 TEXT)")));
 BA.debugLineNum = 28;BA.debugLine="activity_con.ExecNonQuery(\"create table schedule";
Debug.ShouldStop(134217728);
activity_db._activity_con.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("create table schedule (action TEXT, next_time integer, next_rt Text)")));
 BA.debugLineNum = 30;BA.debugLine="activity_con.ExecNonQuery(\"Insert into scheduler";
Debug.ShouldStop(536870912);
activity_db._activity_con.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Insert into scheduler values ('picture','1','day','12','12')")));
 BA.debugLineNum = 31;BA.debugLine="activity_con.ExecNonQuery(\"Insert into scheduler";
Debug.ShouldStop(1073741824);
activity_db._activity_con.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Insert into scheduler values ('bluetooth','1','day','12','12')")));
 BA.debugLineNum = 32;BA.debugLine="activity_con.ExecNonQuery(\"Insert into scheduler";
Debug.ShouldStop(-2147483648);
activity_db._activity_con.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("Insert into scheduler values ('transmit','1','day','12','12')")));
 };
 BA.debugLineNum = 34;BA.debugLine="write_activity(\"Activity database started.\")";
Debug.ShouldStop(2);
_write_activity(RemoteObject.createImmutable("Activity database started."));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Service_Destroy (activity_db) ","activity_db",2,activity_db.processBA,activity_db.mostCurrent,41);
if (RapidSub.canDelegate("service_destroy")) return activity_db.remoteMe.runUserSub(false, "activity_db","service_destroy");
 BA.debugLineNum = 41;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="activity_con.Close";
Debug.ShouldStop(512);
activity_db._activity_con.runVoidMethod ("Close");
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
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (activity_db) ","activity_db",2,activity_db.processBA,activity_db.mostCurrent,37);
if (RapidSub.canDelegate("service_start")) return activity_db.remoteMe.runUserSub(false, "activity_db","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 37;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="If activity_con.IsInitialized = False Then activi";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",activity_db._activity_con.runMethod(true,"IsInitialized"),activity_db.mostCurrent.__c.getField(true,"False"))) { 
activity_db._activity_con.runVoidMethod ("Initialize",(Object)(activity_db._db_path),(Object)(activity_db._db_name),(Object)(activity_db.mostCurrent.__c.getField(true,"True")));};
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update_schedule() throws Exception{
try {
		Debug.PushSubsStack("update_schedule (activity_db) ","activity_db",2,activity_db.processBA,activity_db.mostCurrent,82);
if (RapidSub.canDelegate("update_schedule")) return activity_db.remoteMe.runUserSub(false, "activity_db","update_schedule");
RemoteObject _sched1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _next_time = RemoteObject.createImmutable(0L);
RemoteObject _period = RemoteObject.createImmutable(0L);
RemoteObject _unit = RemoteObject.createImmutable("");
RemoteObject _action = RemoteObject.createImmutable("");
RemoteObject _time1 = RemoteObject.createImmutable(0L);
RemoteObject _time2 = RemoteObject.createImmutable(0L);
RemoteObject _now = RemoteObject.createImmutable(0L);
RemoteObject _now_tod = RemoteObject.createImmutable(0L);
RemoteObject _k = RemoteObject.createImmutable(0);
RemoteObject _tickle = RemoteObject.createImmutable(0L);
RemoteObject _a_line = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 82;BA.debugLine="Sub update_schedule";
Debug.ShouldStop(131072);
 BA.debugLineNum = 84;BA.debugLine="Dim sched1 As List";
Debug.ShouldStop(524288);
_sched1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("sched1", _sched1);
 BA.debugLineNum = 85;BA.debugLine="Dim next_time As Long";
Debug.ShouldStop(1048576);
_next_time = RemoteObject.createImmutable(0L);Debug.locals.put("next_time", _next_time);
 BA.debugLineNum = 86;BA.debugLine="Dim period As Long";
Debug.ShouldStop(2097152);
_period = RemoteObject.createImmutable(0L);Debug.locals.put("period", _period);
 BA.debugLineNum = 87;BA.debugLine="Dim unit As String";
Debug.ShouldStop(4194304);
_unit = RemoteObject.createImmutable("");Debug.locals.put("unit", _unit);
 BA.debugLineNum = 88;BA.debugLine="Dim action As String";
Debug.ShouldStop(8388608);
_action = RemoteObject.createImmutable("");Debug.locals.put("action", _action);
 BA.debugLineNum = 89;BA.debugLine="Dim time1 As Long";
Debug.ShouldStop(16777216);
_time1 = RemoteObject.createImmutable(0L);Debug.locals.put("time1", _time1);
 BA.debugLineNum = 90;BA.debugLine="Dim time2 As Long";
Debug.ShouldStop(33554432);
_time2 = RemoteObject.createImmutable(0L);Debug.locals.put("time2", _time2);
 BA.debugLineNum = 91;BA.debugLine="Dim now As Long";
Debug.ShouldStop(67108864);
_now = RemoteObject.createImmutable(0L);Debug.locals.put("now", _now);
 BA.debugLineNum = 92;BA.debugLine="Dim now_tod As Long";
Debug.ShouldStop(134217728);
_now_tod = RemoteObject.createImmutable(0L);Debug.locals.put("now_tod", _now_tod);
 BA.debugLineNum = 93;BA.debugLine="Dim k As Int";
Debug.ShouldStop(268435456);
_k = RemoteObject.createImmutable(0);Debug.locals.put("k", _k);
 BA.debugLineNum = 94;BA.debugLine="Dim next_time As Long";
Debug.ShouldStop(536870912);
_next_time = RemoteObject.createImmutable(0L);Debug.locals.put("next_time", _next_time);
 BA.debugLineNum = 95;BA.debugLine="Dim tickle As Long";
Debug.ShouldStop(1073741824);
_tickle = RemoteObject.createImmutable(0L);Debug.locals.put("tickle", _tickle);
 BA.debugLineNum = 96;BA.debugLine="sched1.Initialize";
Debug.ShouldStop(-2147483648);
_sched1.runVoidMethod ("Initialize");
 BA.debugLineNum = 97;BA.debugLine="sched1 = get_lines(\"select action,period,unit,tim";
Debug.ShouldStop(1);
_sched1 = _get_lines(RemoteObject.createImmutable("select action,period,unit,time1,time2 from scheduler"));Debug.locals.put("sched1", _sched1);
 BA.debugLineNum = 99;BA.debugLine="do_query(\"delete from schedule\")";
Debug.ShouldStop(4);
_do_query(RemoteObject.createImmutable("delete from schedule"));
 BA.debugLineNum = 100;BA.debugLine="now = DateTime.Now";
Debug.ShouldStop(8);
_now = activity_db.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);
 BA.debugLineNum = 101;BA.debugLine="now_tod = now - DateTime.GetHour(now)*DateTime.Ti";
Debug.ShouldStop(16);
_now_tod = RemoteObject.solve(new RemoteObject[] {_now,activity_db.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(_now)),activity_db.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour"),activity_db.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(_now)),activity_db.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute"),activity_db.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetSecond",(Object)(_now)),activity_db.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "-*-*-*",3, 2);Debug.locals.put("now_tod", _now_tod);
 BA.debugLineNum = 103;BA.debugLine="For k = 0 To sched1.Size - 1";
Debug.ShouldStop(64);
{
final int step82 = 1;
final int limit82 = RemoteObject.solve(new RemoteObject[] {_sched1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_k = BA.numberCast(int.class, 0); (step82 > 0 && _k.<Integer>get().intValue() <= limit82) || (step82 < 0 && _k.<Integer>get().intValue() >= limit82); _k = RemoteObject.createImmutable((int)(0 + _k.<Integer>get().intValue() + step82))) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 104;BA.debugLine="Dim a_line As List";
Debug.ShouldStop(128);
_a_line = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("a_line", _a_line);
 BA.debugLineNum = 105;BA.debugLine="a_line.Initialize";
Debug.ShouldStop(256);
_a_line.runVoidMethod ("Initialize");
 BA.debugLineNum = 106;BA.debugLine="a_line = sched1.Get(k)";
Debug.ShouldStop(512);
_a_line.setObject(_sched1.runMethod(false,"Get",(Object)(_k)));
 BA.debugLineNum = 107;BA.debugLine="action = a_line.Get(0)";
Debug.ShouldStop(1024);
_action = BA.ObjectToString(_a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("action", _action);
 BA.debugLineNum = 108;BA.debugLine="period = a_line.Get(1)";
Debug.ShouldStop(2048);
_period = BA.numberCast(long.class, _a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("period", _period);
 BA.debugLineNum = 109;BA.debugLine="unit = a_line.get(2)";
Debug.ShouldStop(4096);
_unit = BA.ObjectToString(_a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("unit", _unit);
 BA.debugLineNum = 110;BA.debugLine="time1 = a_line.Get(3)";
Debug.ShouldStop(8192);
_time1 = BA.numberCast(long.class, _a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 3))));Debug.locals.put("time1", _time1);
 BA.debugLineNum = 111;BA.debugLine="time2 = a_line.Get(4)";
Debug.ShouldStop(16384);
_time2 = BA.numberCast(long.class, _a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 4))));Debug.locals.put("time2", _time2);
 BA.debugLineNum = 113;BA.debugLine="next_time = now_tod + time1*DateTime.TicksPerHou";
Debug.ShouldStop(65536);
_next_time = RemoteObject.solve(new RemoteObject[] {_now_tod,_time1,activity_db.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "+*",1, 2);Debug.locals.put("next_time", _next_time);
 BA.debugLineNum = 114;BA.debugLine="tickle = DateTime.TicksPerHour";
Debug.ShouldStop(131072);
_tickle = activity_db.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour");Debug.locals.put("tickle", _tickle);
 BA.debugLineNum = 115;BA.debugLine="If unit = \"min\" Then tickle = DateTime.TicksPerM";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_unit,BA.ObjectToString("min"))) { 
_tickle = activity_db.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute");Debug.locals.put("tickle", _tickle);};
 BA.debugLineNum = 116;BA.debugLine="If unit = \"sec\" Then tickle = DateTime.TicksPerS";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_unit,BA.ObjectToString("sec"))) { 
_tickle = activity_db.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond");Debug.locals.put("tickle", _tickle);};
 BA.debugLineNum = 117;BA.debugLine="If unit = \"day\" Then 'need to handle days a litt";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_unit,BA.ObjectToString("day"))) { 
 BA.debugLineNum = 118;BA.debugLine="tickle = DateTime.TicksPerDay";
Debug.ShouldStop(2097152);
_tickle = activity_db.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerDay");Debug.locals.put("tickle", _tickle);
 BA.debugLineNum = 119;BA.debugLine="next_time = next_time + DateTime.GetDayOfYear(n";
Debug.ShouldStop(4194304);
_next_time = RemoteObject.solve(new RemoteObject[] {_next_time,activity_db.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfYear",(Object)(_now)),_period}, "+%",1, 2);Debug.locals.put("next_time", _next_time);
 };
 BA.debugLineNum = 122;BA.debugLine="Do While next_time <= now	'find the next eligibl";
Debug.ShouldStop(33554432);
while (RemoteObject.solveBoolean("k",_next_time,BA.numberCast(double.class, _now))) {
 BA.debugLineNum = 123;BA.debugLine="next_time = next_time + tickle*period";
Debug.ShouldStop(67108864);
_next_time = RemoteObject.solve(new RemoteObject[] {_next_time,_tickle,_period}, "+*",1, 2);Debug.locals.put("next_time", _next_time);
 BA.debugLineNum = 125;BA.debugLine="If next_time > now_tod + time2*DateTime.TicksPe";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_next_time,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_now_tod,_time2,activity_db.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "+*",1, 2))) && RemoteObject.solveBoolean("!",_unit,BA.ObjectToString("day"))) { 
 BA.debugLineNum = 126;BA.debugLine="next_time = now_tod + 24*DateTime.TicksPerHour";
Debug.ShouldStop(536870912);
_next_time = RemoteObject.solve(new RemoteObject[] {_now_tod,RemoteObject.createImmutable(24),activity_db.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour"),_time1,activity_db.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "+*+*",2, 2);Debug.locals.put("next_time", _next_time);
 };
 }
;
 BA.debugLineNum = 130;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Se";
Debug.ShouldStop(2);
activity_db.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 131;BA.debugLine="do_query(\"insert into schedule values ('\" & acti";
Debug.ShouldStop(4);
_do_query(RemoteObject.concat(RemoteObject.createImmutable("insert into schedule values ('"),_action,RemoteObject.createImmutable("', "),_next_time,RemoteObject.createImmutable(" , '"),activity_db.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_next_time)),RemoteObject.createImmutable("')")));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("write_activity (activity_db) ","activity_db",2,activity_db.processBA,activity_db.mostCurrent,46);
if (RapidSub.canDelegate("write_activity")) return activity_db.remoteMe.runUserSub(false, "activity_db","write_activity", _event_string);
RemoteObject _dt = RemoteObject.createImmutable("");
RemoteObject _now = RemoteObject.createImmutable(0L);
Debug.locals.put("event_string", _event_string);
 BA.debugLineNum = 46;BA.debugLine="Sub write_activity(event_string As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Dim dt As String";
Debug.ShouldStop(16384);
_dt = RemoteObject.createImmutable("");Debug.locals.put("dt", _dt);
 BA.debugLineNum = 48;BA.debugLine="Dim now As Long";
Debug.ShouldStop(32768);
_now = RemoteObject.createImmutable(0L);Debug.locals.put("now", _now);
 BA.debugLineNum = 49;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' See";
Debug.ShouldStop(65536);
activity_db.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 50;BA.debugLine="now = DateTime.Now";
Debug.ShouldStop(131072);
_now = activity_db.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);
 BA.debugLineNum = 51;BA.debugLine="dt = DateTime.Date(now)";
Debug.ShouldStop(262144);
_dt = activity_db.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now));Debug.locals.put("dt", _dt);
 BA.debugLineNum = 52;BA.debugLine="activity_con.ExecNonQuery2(\"Insert INTO action_lo";
Debug.ShouldStop(524288);
activity_db._activity_con.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("Insert INTO action_log Values(?,?)")),(Object)(activity_db.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_event_string),(_dt)})))));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
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
}