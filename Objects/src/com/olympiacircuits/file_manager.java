package com.olympiacircuits;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class file_manager extends android.app.Service {
	public static class file_manager_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
			android.content.Intent in = new android.content.Intent(context, file_manager.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
			context.startService(in);
		}

	}
    static file_manager mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return file_manager.class;
	}
	@Override
	public void onCreate() {
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "com.olympiacircuits", "com.olympiacircuits.file_manager");
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
			processBA.raiseEvent2(null, true, "CREATE", true, "com.olympiacircuits.file_manager", processBA, _service);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, true) == false) {
				
		}
		else {
            BA.LogInfo("** Service (file_manager) Create **");
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
                    BA.LogInfo("** Service (file_manager) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
				}
			};
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (file_manager) Start **");
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
        BA.LogInfo("** Service (file_manager) Destroy **");
		processBA.raiseEvent(null, "service_destroy");
        processBA.service = null;
		mostCurrent = null;
		processBA.setActivityPaused(true);
        processBA.runHook("ondestroy", this, null);
	}

public anywheresoftware.b4a.keywords.Common __c = null;
public static String _root_dir = "";
public static String _sub_dir = "";
public static String _current_dir = "";
public static String _clientid = "";
public static String _clientsecret = "";
public static anywheresoftware.b4a.samples.gmailcontacts.libgoogledrive _cls_drive = null;
public anywheresoftware.b4a.samples.gmailcontacts.httputils2service _httputils2service = null;
public anywheresoftware.b4a.samples.gmailcontacts.modrequest _modrequest = null;
public anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring _svcmonitoring = null;
public com.olympiacircuits.main _main = null;
public com.olympiacircuits.bt_interact _bt_interact = null;
public com.olympiacircuits.activity_db _activity_db = null;
public com.olympiacircuits.camera_activity _camera_activity = null;
public com.olympiacircuits.main_controller _main_controller = null;
public static String  _archive_current_dir() throws Exception{
RDebugUtils.currentModule="file_manager";
flm.b4a.archiver.ArchiverForB4A _an_archive = null;
String _archive_name = "";
anywheresoftware.b4a.objects.collections.List _file_list = null;
String[] _file_array = null;
int _i = 0;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub archive_current_dir";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim an_archive As Archiver";
_an_archive = new flm.b4a.archiver.ArchiverForB4A();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Dim archive_name As String";
_archive_name = "";
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="archive_name = sub_dir & \".zip\"";
_archive_name = _sub_dir+".zip";
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Dim file_list As List";
_file_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Dim file_array() As String";
_file_array = new String[(int) (0)];
java.util.Arrays.fill(_file_array,"");
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="file_list = File.ListFiles(current_dir)";
_file_list = anywheresoftware.b4a.keywords.Common.File.ListFiles(_current_dir);
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="For i = 0 To file_list.Size - 1";
{
final int step40 = 1;
final int limit40 = (int) (_file_list.getSize()-1);
for (_i = (int) (0); (step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40); _i = ((int)(0 + _i + step40))) {
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="file_array(i) = file_list.Get(i)";
_file_array[_i] = BA.ObjectToString(_file_list.Get(_i));
 }
};
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="an_archive.AsyncZipFiles(current_dir,file_array,r";
_an_archive.AsyncZipFiles(processBA,_current_dir,_file_array,_root_dir+"/archive",_archive_name,"zip");
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="End Sub";
return "";
}
public static String  _gdrive_connected(anywheresoftware.b4a.objects.collections.Map _items) throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub gdrive_Connected(Items As Map)";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="ToastMessageShow(\"Connected to Google Drive.\", Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow("Connected to Google Drive.",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="End Sub";
return "";
}
public static String  _get_current_dir() throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub get_current_dir As String";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Return(current_dir)";
if (true) return (_current_dir);
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public static String  _google_drive_upload() throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub google_drive_upload";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Log(\"launching google drive\")";
anywheresoftware.b4a.keywords.Common.Log("launching google drive");
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="cls_drive.Initialize(Me, \"gdrive\", clientId, clie";
_cls_drive._initialize(processBA,file_manager.getObject(),"gdrive",_clientid,_clientsecret);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="cls_drive.ConnectToDrive";
_cls_drive._connecttodrive();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="file_manager";
long _now = 0L;
String _try_dir = "";
int _add_on = 0;
String _add_string = "";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim now As Long";
_now = 0L;
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim try_dir As String";
_try_dir = "";
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Dim add_on As Int = 1";
_add_on = (int) (1);
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Dim add_string As String = \"\"";
_add_string = "";
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\" ' See this pag";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="now = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="try_dir = \"data_\" & DateTime.Date(now)";
_try_dir = "data_"+anywheresoftware.b4a.keywords.Common.DateTime.Date(_now);
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="Do While File.IsDirectory(root_dir,try_dir & add_";
while (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_root_dir,_try_dir+_add_string)==anywheresoftware.b4a.keywords.Common.True) {
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="add_string = \"_\" & add_on";
_add_string = "_"+BA.NumberToString(_add_on);
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="add_on = add_on + 1";
_add_on = (int) (_add_on+1);
 }
;
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="sub_dir = try_dir & add_string";
_sub_dir = _try_dir+_add_string;
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="File.MakeDir(root_dir,sub_dir)";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_root_dir,_sub_dir);
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="If File.IsDirectory(root_dir,\"archive\") = False T";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_root_dir,"archive")==anywheresoftware.b4a.keywords.Common.False) { 
anywheresoftware.b4a.keywords.Common.File.MakeDir(_root_dir,"archive");};
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="current_dir = root_dir & \"/\" & sub_dir";
_current_dir = _root_dir+"/"+_sub_dir;
RDebugUtils.currentLine=1900563;
 //BA.debugLineNum = 1900563;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public static String  _zip_zipdone(boolean _success) throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub zip_zipDone(success As Boolean)";
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return "";
}
}