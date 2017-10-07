package com.olympiacircuits;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class activity_db extends android.app.Service {
	public static class activity_db_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
			android.content.Intent in = new android.content.Intent(context, activity_db.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
			context.startService(in);
		}

	}
    static activity_db mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return activity_db.class;
	}
	@Override
	public void onCreate() {
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "com.olympiacircuits", "com.olympiacircuits.activity_db");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "com.olympiacircuits.activity_db", processBA, _service);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, true) == false) {
				
		}
		else {
            BA.LogInfo("** Service (activity_db) Create **");
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
                    BA.LogInfo("** Service (activity_db) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
				}
			};
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (activity_db) Start **");
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
        BA.LogInfo("** Service (activity_db) Destroy **");
		processBA.raiseEvent(null, "service_destroy");
        processBA.service = null;
		mostCurrent = null;
		processBA.setActivityPaused(true);
        processBA.runHook("ondestroy", this, null);
	}

public static class _schedule_holder{
public boolean IsInitialized;
public String action;
public int period;
public String unit;
public int time1;
public int time2;
public void Initialize() {
IsInitialized = true;
action = "";
period = 0;
unit = "";
time1 = 0;
time2 = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _activity_con = null;
public static String _db_dir = "";
public static String _db_name = "";
public static String _db_path = "";
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public anywheresoftware.b4a.samples.gmailcontacts.modrequest _modrequest = null;
public anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring _svcmonitoring = null;
public com.olympiacircuits.main _main = null;
public com.olympiacircuits.bt_interact _bt_interact = null;
public com.olympiacircuits.file_manager _file_manager = null;
public com.olympiacircuits.camera_activity _camera_activity = null;
public com.olympiacircuits.main_controller _main_controller = null;
public com.olympiacircuits.setup _setup = null;
public static String  _do_query(String _query) throws Exception{
RDebugUtils.currentModule="activity_db";
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub do_query(query As String)";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="activity_con.ExecNonQuery(query)";
_activity_con.ExecNonQuery(_query);
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _get_lines(String _query) throws Exception{
RDebugUtils.currentModule="activity_db";
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor1 = null;
anywheresoftware.b4a.objects.collections.List _rows = null;
int _i = 0;
int _j = 0;
anywheresoftware.b4a.objects.collections.List _a_col = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub get_lines(query As String)  As List";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim Cursor1 As Cursor";
_cursor1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Dim j As Int";
_j = 0;
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="rows.Initialize";
_rows.Initialize();
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="Cursor1 = activity_con.ExecQuery(query)";
_cursor1.setObject((android.database.Cursor)(_activity_con.ExecQuery(_query)));
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="If Cursor1.RowCount < 1 Then Return rows";
if (_cursor1.getRowCount()<1) { 
if (true) return _rows;};
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="For j = 0 To Cursor1.RowCount - 1";
{
final int step49 = 1;
final int limit49 = (int) (_cursor1.getRowCount()-1);
for (_j = (int) (0); (step49 > 0 && _j <= limit49) || (step49 < 0 && _j >= limit49); _j = ((int)(0 + _j + step49))) {
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="Cursor1.Position = j";
_cursor1.setPosition(_j);
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="Dim a_col As List";
_a_col = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="a_col.Initialize";
_a_col.Initialize();
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="For i = 0 To Cursor1.ColumnCount - 1";
{
final int step53 = 1;
final int limit53 = (int) (_cursor1.getColumnCount()-1);
for (_i = (int) (0); (step53 > 0 && _i <= limit53) || (step53 < 0 && _i >= limit53); _i = ((int)(0 + _i + step53))) {
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="a_col.Add(Cursor1.GetString2(i))";
_a_col.Add((Object)(_cursor1.GetString2(_i)));
 }
};
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="rows.Add(a_col)";
_rows.Add((Object)(_a_col.getObject()));
 }
};
RDebugUtils.currentLine=1638417;
 //BA.debugLineNum = 1638417;BA.debugLine="Cursor1.Close";
_cursor1.Close();
RDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="Return(rows)";
if (true) return (_rows);
RDebugUtils.currentLine=1638419;
 //BA.debugLineNum = 1638419;BA.debugLine="End Sub";
return null;
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="activity_db";
boolean _new_db = false;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="db_path = File.DirDefaultExternal & \"/\" & db_dir";
_db_path = anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal()+"/"+_db_dir;
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="If(db_name.EndsWith(\".db\")) = False Then db_name";
if ((_db_name.endsWith(".db"))==anywheresoftware.b4a.keywords.Common.False) { 
_db_name = _db_name+".db";};
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Dim new_db As Boolean";
_new_db = false;
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="If File.IsDirectory(File.DirDefaultExternal,db_di";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_db_dir)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="File.MakeDir(File.DirDefaultExternal, db_dir)";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),_db_dir);
 };
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="Log(\"creating activity_database at \" & db_path)";
anywheresoftware.b4a.keywords.Common.Log("creating activity_database at "+_db_path);
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="new_db = File.Exists(db_path, db_name) = False";
_new_db = anywheresoftware.b4a.keywords.Common.File.Exists(_db_path,_db_name)==anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="activity_con.Initialize(db_path, db_name, True)";
_activity_con.Initialize(_db_path,_db_name,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="If new_db Then";
if (_new_db) { 
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="activity_con.ExecNonQuery(\"CREATE TABLE action_l";
_activity_con.ExecNonQuery("CREATE TABLE action_log (action TEXT, timestamp TEXT)");
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="activity_con.ExecNonQuery(\"Create Table schedule";
_activity_con.ExecNonQuery("Create Table scheduler (action TEXT, period TEXT, unit TEXT, time1 TEXT, time2 TEXT)");
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="activity_con.ExecNonQuery(\"create table schedule";
_activity_con.ExecNonQuery("create table schedule (action TEXT, next_time integer, next_rt Text)");
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="activity_con.ExecNonQuery(\"Insert into scheduler";
_activity_con.ExecNonQuery("Insert into scheduler values ('picture','1','day','12','12')");
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="activity_con.ExecNonQuery(\"Insert into scheduler";
_activity_con.ExecNonQuery("Insert into scheduler values ('bluetooth','1','day','12','12')");
RDebugUtils.currentLine=1376275;
 //BA.debugLineNum = 1376275;BA.debugLine="activity_con.ExecNonQuery(\"Insert into scheduler";
_activity_con.ExecNonQuery("Insert into scheduler values ('transmit','1','day','12','12')");
 };
RDebugUtils.currentLine=1376277;
 //BA.debugLineNum = 1376277;BA.debugLine="write_activity(\"Activity database started.\")";
_write_activity("Activity database started.");
RDebugUtils.currentLine=1376278;
 //BA.debugLineNum = 1376278;BA.debugLine="End Sub";
return "";
}
public static String  _write_activity(String _event_string) throws Exception{
RDebugUtils.currentModule="activity_db";
String _dt = "";
long _now = 0L;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub write_activity(event_string As String)";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim dt As String";
_dt = "";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Dim now As Long";
_now = 0L;
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' See";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="now = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="dt = DateTime.Date(now)";
_dt = anywheresoftware.b4a.keywords.Common.DateTime.Date(_now);
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="activity_con.ExecNonQuery2(\"Insert INTO action_lo";
_activity_con.ExecNonQuery2("Insert INTO action_log Values(?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_event_string),(Object)(_dt)}));
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="activity_db";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="activity_con.Close";
_activity_con.Close();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="activity_db";
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="If activity_con.IsInitialized = False Then activi";
if (_activity_con.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_activity_con.Initialize(_db_path,_db_name,anywheresoftware.b4a.keywords.Common.True);};
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
}