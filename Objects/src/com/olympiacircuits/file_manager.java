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
public static wifi.MLwifi _my_wifi = null;
public static anywheresoftware.b4a.objects.Timer _file_timer = null;
public static String _timer_switch = "";
public static anywheresoftware.b4a.objects.collections.List _stage_file = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public anywheresoftware.b4a.samples.gmailcontacts.modrequest _modrequest = null;
public anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring _svcmonitoring = null;
public com.olympiacircuits.main _main = null;
public com.olympiacircuits.bt_interact _bt_interact = null;
public com.olympiacircuits.activity_db _activity_db = null;
public com.olympiacircuits.camera_activity _camera_activity = null;
public com.olympiacircuits.main_controller _main_controller = null;
public com.olympiacircuits.setup _setup = null;
public static String  _archive_current_dir() throws Exception{
RDebugUtils.currentModule="file_manager";
flm.b4a.archiver.ArchiverForB4A _an_archive = null;
String _archive_name = "";
anywheresoftware.b4a.objects.collections.List _file_list = null;
int _i = 0;
String[] _file_array = null;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub archive_current_dir";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim an_archive As Archiver";
_an_archive = new flm.b4a.archiver.ArchiverForB4A();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Dim archive_name As String";
_archive_name = "";
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="archive_name = sub_dir & \".zip\"";
_archive_name = _sub_dir+".zip";
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Dim file_list As List";
_file_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="file_list = File.ListFiles(current_dir)";
_file_list = anywheresoftware.b4a.keywords.Common.File.ListFiles(_current_dir);
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="If file_list.isInitialized = False Then Return 'n";
if (_file_list.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="Dim file_array(file_list.Size) As String";
_file_array = new String[_file_list.getSize()];
java.util.Arrays.fill(_file_array,"");
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="For i = 1 To file_list.Size";
{
final int step39 = 1;
final int limit39 = _file_list.getSize();
for (_i = (int) (1); (step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39); _i = ((int)(0 + _i + step39))) {
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="file_array(i-1) = file_list.Get(i-1)";
_file_array[(int) (_i-1)] = BA.ObjectToString(_file_list.Get((int) (_i-1)));
 }
};
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="an_archive.AsyncZipFiles(current_dir,file_array,r";
_an_archive.AsyncZipFiles(processBA,_current_dir,_file_array,_root_dir+"/stage/",_archive_name,"zip");
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="End Sub";
return "";
}
public static String  _file_in_stage() throws Exception{
RDebugUtils.currentModule="file_manager";
anywheresoftware.b4a.objects.collections.List _the_files = null;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub file_in_stage";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim the_files As List";
_the_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="stage_file.Clear";
_stage_file.Clear();
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="stage_file.Add(root_dir & \"/stage\")";
_stage_file.Add((Object)(_root_dir+"/stage"));
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="the_files = File.ListFiles(root_dir & \"/stage\")";
_the_files = anywheresoftware.b4a.keywords.Common.File.ListFiles(_root_dir+"/stage");
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="If the_files.IsInitialized = False Or the_files.S";
if (_the_files.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _the_files.getSize()<1) { 
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="stage_file.Add(\"\")";
_stage_file.Add((Object)(""));
 }else {
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="stage_file.Add(the_files.Get(0))";
_stage_file.Add(_the_files.Get((int) (0)));
 };
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="End Sub";
return "";
}
public static String  _file_timer_tick() throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub file_timer_tick";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="file_timer.Enabled = False";
_file_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="If timer_switch = \"wifi_connect\" Then";
if ((_timer_switch).equals("wifi_connect")) { 
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="If my_wifi.isWifiConnected = True Then";
if (_my_wifi.isWifiConnected()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="google_drive_setup";
_google_drive_setup();
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="toggle_network(True)";
_toggle_network(anywheresoftware.b4a.keywords.Common.True);
 };
 };
RDebugUtils.currentLine=2818064;
 //BA.debugLineNum = 2818064;BA.debugLine="If timer_switch = \"network_connect\" Then";
if ((_timer_switch).equals("network_connect")) { 
RDebugUtils.currentLine=2818066;
 //BA.debugLineNum = 2818066;BA.debugLine="If my_wifi.isOnLine Then";
if (_my_wifi.isOnLine()) { 
RDebugUtils.currentLine=2818067;
 //BA.debugLineNum = 2818067;BA.debugLine="google_drive_setup";
_google_drive_setup();
 }else {
RDebugUtils.currentLine=2818069;
 //BA.debugLineNum = 2818069;BA.debugLine="CallSubDelayed2(activity_db,\"write_activity\",\"";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._activity_db.getObject()),"write_activity",(Object)("Unable to establish network connection."));
RDebugUtils.currentLine=2818070;
 //BA.debugLineNum = 2818070;BA.debugLine="turn_off_network";
_turn_off_network();
 };
 };
RDebugUtils.currentLine=2818075;
 //BA.debugLineNum = 2818075;BA.debugLine="If timer_switch = \"drive_upload\" Then";
if ((_timer_switch).equals("drive_upload")) { 
RDebugUtils.currentLine=2818076;
 //BA.debugLineNum = 2818076;BA.debugLine="turn_off_network";
_turn_off_network();
RDebugUtils.currentLine=2818077;
 //BA.debugLineNum = 2818077;BA.debugLine="CallSubDelayed2(activity_db,\"write_activity\",\"Dr";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._activity_db.getObject()),"write_activity",(Object)("Drive upload timed out."));
 };
RDebugUtils.currentLine=2818079;
 //BA.debugLineNum = 2818079;BA.debugLine="End Sub";
return "";
}
public static String  _google_drive_setup() throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub google_drive_setup";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="CallSubDelayed2(activity_db,\"write_activity\",\"Net";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._activity_db.getObject()),"write_activity",(Object)("Network connection established. Beginning upload."));
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="timer_switch = \"drive_upload\"";
_timer_switch = "drive_upload";
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="file_timer.Enabled = False";
_file_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="file_timer.Interval =  3*60*1000";
_file_timer.setInterval((long) (3*60*1000));
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="file_timer.Enabled = True";
_file_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="cls_drive.Initialize(Me, \"gdrive\", clientId, clie";
_cls_drive._initialize(processBA,file_manager.getObject(),"gdrive",_clientid,_clientsecret);
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="cls_drive.ConnectToDrive";
_cls_drive._connecttodrive();
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="End Sub";
return "";
}
public static String  _toggle_network(boolean _state) throws Exception{
RDebugUtils.currentModule="file_manager";
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub toggle_network(state As Boolean)";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext(processBA));
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="r.Target = r.RunMethod2(\"getSystemService\", \"co";
_r.Target = _r.RunMethod2("getSystemService","connectivity","java.lang.String");
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="r.RunMethod2(\"setMobileDataEnabled\", state, \"ja";
_r.RunMethod2("setMobileDataEnabled",BA.ObjectToString(_state),"java.lang.boolean");
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="If state = False Then Return 'all done if turni";
if (_state==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="timer_switch = \"network_connect\"";
_timer_switch = "network_connect";
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="file_timer.Enabled = False";
_file_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="file_timer.Interval =  15*1000 'wait 15 seconds";
_file_timer.setInterval((long) (15*1000));
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="file_timer.Enabled = True";
_file_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="End Sub";
return "";
}
public static String  _turn_off_network() throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub turn_off_network";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="toggle_wifi(False)";
_toggle_wifi(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="toggle_network(False)";
_toggle_network(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Log(\"network connections turned off\")";
anywheresoftware.b4a.keywords.Common.Log("network connections turned off");
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="End Sub";
return "";
}
public static String  _gdrive_connected(anywheresoftware.b4a.objects.collections.Map _items) throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub gdrive_Connected(Items As Map)";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Log(\"connected to google drive\")";
anywheresoftware.b4a.keywords.Common.Log("connected to google drive");
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="upload_files";
_upload_files();
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="End Sub";
return "";
}
public static String  _upload_files() throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub upload_files";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="file_in_stage 'updates the stage_file list";
_file_in_stage();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="If stage_file.Get(1) = \"\" Then 'no more files to";
if ((_stage_file.Get((int) (1))).equals((Object)(""))) { 
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="turn_off_network";
_turn_off_network();
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Log(\"Uploading file \" & stage_file.Get(1))";
anywheresoftware.b4a.keywords.Common.Log("Uploading file "+BA.ObjectToString(_stage_file.Get((int) (1))));
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="cls_drive.UploadFile(stage_file.Get(1),stage_file";
_cls_drive._uploadfile(BA.ObjectToString(_stage_file.Get((int) (1))),BA.ObjectToString(_stage_file.Get((int) (0))),BA.ObjectToString(_stage_file.Get((int) (1))),"","");
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="End Sub";
return "";
}
public static String  _gdrive_fileuploaded(String _fileid) throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub gdrive_FileUploaded(FileID As String)";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="CallSubDelayed2(activity_db,\"write_activity\",File";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._activity_db.getObject()),"write_activity",(Object)(_fileid+" successfully uploaded to Google Drive"));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Log(stage_file.Get(1) & \" uploaded successfully\")";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_stage_file.Get((int) (1)))+" uploaded successfully");
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="File.Copy(stage_file.Get(0),stage_file.Get(1),roo";
anywheresoftware.b4a.keywords.Common.File.Copy(BA.ObjectToString(_stage_file.Get((int) (0))),BA.ObjectToString(_stage_file.Get((int) (1))),_root_dir+"/archive",BA.ObjectToString(_stage_file.Get((int) (1))));
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="If File.Exists(root_dir & \"/archive\", stage_file.";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_root_dir+"/archive",BA.ObjectToString(_stage_file.Get((int) (1))))) { 
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="File.Delete(stage_file.Get(0),stage_file.Get(1))";
anywheresoftware.b4a.keywords.Common.File.Delete(BA.ObjectToString(_stage_file.Get((int) (0))),BA.ObjectToString(_stage_file.Get((int) (1))));
 }else {
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="CallSubDelayed2(activity_db,\"write_activity\",\"T";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._activity_db.getObject()),"write_activity",(Object)("There was a problem archiving data."));
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="upload_files";
_upload_files();
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="End Sub";
return "";
}
public static String  _get_current_dir() throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub get_current_dir As String";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="If current_dir = Null Then";
if (_current_dir== null) { 
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="update_current_dir";
_update_current_dir();
 };
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Return(current_dir)";
if (true) return (_current_dir);
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="End Sub";
return "";
}
public static String  _update_current_dir() throws Exception{
RDebugUtils.currentModule="file_manager";
long _now = 0L;
String _try_dir = "";
int _add_on = 0;
String _add_string = "";
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub update_current_dir";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim now As Long";
_now = 0L;
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim try_dir As String";
_try_dir = "";
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Dim add_on As Int = 1";
_add_on = (int) (1);
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Dim add_string As String = \"\"";
_add_string = "";
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\" ' See this pag";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="now = DateTime.Now";
_now = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="try_dir = \"data_\" & DateTime.Date(now)";
_try_dir = "data_"+anywheresoftware.b4a.keywords.Common.DateTime.Date(_now);
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="Do While File.IsDirectory(root_dir,try_dir & add_";
while (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_root_dir,_try_dir+_add_string)==anywheresoftware.b4a.keywords.Common.True) {
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="add_string = \"_\" & add_on";
_add_string = "_"+BA.NumberToString(_add_on);
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="add_on = add_on + 1";
_add_on = (int) (_add_on+1);
 }
;
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="sub_dir = try_dir & add_string";
_sub_dir = _try_dir+_add_string;
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="File.MakeDir(root_dir,sub_dir)";
anywheresoftware.b4a.keywords.Common.File.MakeDir(_root_dir,_sub_dir);
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="current_dir = root_dir & \"/\" & sub_dir";
_current_dir = _root_dir+"/"+_sub_dir;
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="update_current_dir";
_update_current_dir();
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="If File.IsDirectory(root_dir,\"archive\") = False T";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_root_dir,"archive")==anywheresoftware.b4a.keywords.Common.False) { 
anywheresoftware.b4a.keywords.Common.File.MakeDir(_root_dir,"archive");};
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="If File.IsDirectory(root_dir,\"stage\") = False The";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_root_dir,"stage")==anywheresoftware.b4a.keywords.Common.False) { 
anywheresoftware.b4a.keywords.Common.File.MakeDir(_root_dir,"stage");};
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="file_timer.Initialize(\"file_timer\",15*1000)";
_file_timer.Initialize(processBA,"file_timer",(long) (15*1000));
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="file_timer.Enabled = False";
_file_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="stage_file.Initialize";
_stage_file.Initialize();
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return "";
}
public static String  _toggle_wifi(boolean _state) throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub toggle_wifi(state As Boolean)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="my_wifi.EnableWifi(state)";
_my_wifi.EnableWifi(_state);
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="If state = False Then Return 'all done if turning";
if (_state==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="timer_switch = \"wifi_connect\"";
_timer_switch = "wifi_connect";
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="file_timer.Enabled = False";
_file_timer.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="file_timer.Interval =  15*1000 'wait 15 seconds t";
_file_timer.setInterval((long) (15*1000));
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="file_timer.Enabled = True";
_file_timer.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="End Sub";
return "";
}
public static String  _zip_zipdone(boolean _success,int _nboffiles) throws Exception{
RDebugUtils.currentModule="file_manager";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub zip_zipDone(success As Boolean,nbOfFiles As In";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="If success = False Then Return";
if (_success==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="update_current_dir";
_update_current_dir();
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="If my_wifi.isOnLine = False Then";
if (_my_wifi.isOnLine()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="toggle_wifi(True)";
_toggle_wifi(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="Return Null";
if (true) return BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null);
 }else {
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="google_drive_setup";
_google_drive_setup();
 };
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="End Sub";
return "";
}
}