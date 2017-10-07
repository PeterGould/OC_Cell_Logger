package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class file_manager_subs_0 {


public static RemoteObject  _archive_current_dir() throws Exception{
try {
		Debug.PushSubsStack("archive_current_dir (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,49);
if (RapidSub.canDelegate("archive_current_dir")) return file_manager.remoteMe.runUserSub(false, "file_manager","archive_current_dir");
RemoteObject _an_archive = RemoteObject.declareNull("flm.b4a.archiver.ArchiverForB4A");
RemoteObject _archive_name = RemoteObject.createImmutable("");
RemoteObject _file_list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _file_array = null;
 BA.debugLineNum = 49;BA.debugLine="Sub archive_current_dir";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Dim an_archive As Archiver";
Debug.ShouldStop(131072);
_an_archive = RemoteObject.createNew ("flm.b4a.archiver.ArchiverForB4A");Debug.locals.put("an_archive", _an_archive);
 BA.debugLineNum = 51;BA.debugLine="Dim archive_name As String";
Debug.ShouldStop(262144);
_archive_name = RemoteObject.createImmutable("");Debug.locals.put("archive_name", _archive_name);
 BA.debugLineNum = 52;BA.debugLine="archive_name = sub_dir & \".zip\"";
Debug.ShouldStop(524288);
_archive_name = RemoteObject.concat(file_manager._sub_dir,RemoteObject.createImmutable(".zip"));Debug.locals.put("archive_name", _archive_name);
 BA.debugLineNum = 53;BA.debugLine="Dim file_list As List";
Debug.ShouldStop(1048576);
_file_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("file_list", _file_list);
 BA.debugLineNum = 54;BA.debugLine="Dim i As Int";
Debug.ShouldStop(2097152);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 55;BA.debugLine="file_list = File.ListFiles(current_dir)";
Debug.ShouldStop(4194304);
_file_list = file_manager.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(file_manager._current_dir));Debug.locals.put("file_list", _file_list);
 BA.debugLineNum = 56;BA.debugLine="If file_list.isInitialized = False Then Return 'n";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_file_list.runMethod(true,"IsInitialized"),file_manager.mostCurrent.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 57;BA.debugLine="Dim file_array(file_list.Size) As String";
Debug.ShouldStop(16777216);
_file_array = RemoteObject.createNewArray ("String", new int[] {_file_list.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("file_array", _file_array);
 BA.debugLineNum = 58;BA.debugLine="For i = 1 To file_list.Size";
Debug.ShouldStop(33554432);
{
final int step39 = 1;
final int limit39 = _file_list.runMethod(true,"getSize").<Integer>get().intValue();
for (_i = BA.numberCast(int.class, 1); (step39 > 0 && _i.<Integer>get().intValue() <= limit39) || (step39 < 0 && _i.<Integer>get().intValue() >= limit39); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step39))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 59;BA.debugLine="file_array(i-1) = file_list.Get(i-1)";
Debug.ShouldStop(67108864);
_file_array.setArrayElement (BA.ObjectToString(_file_list.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1)))),RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 61;BA.debugLine="an_archive.AsyncZipFiles(current_dir,file_array,r";
Debug.ShouldStop(268435456);
_an_archive.runVoidMethod ("AsyncZipFiles",file_manager.processBA,(Object)(file_manager._current_dir),(Object)(_file_array),(Object)(RemoteObject.concat(file_manager._root_dir,RemoteObject.createImmutable("/stage/"))),(Object)(_archive_name),(Object)(RemoteObject.createImmutable("zip")));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _file_in_stage() throws Exception{
try {
		Debug.PushSubsStack("file_in_stage (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,131);
if (RapidSub.canDelegate("file_in_stage")) return file_manager.remoteMe.runUserSub(false, "file_manager","file_in_stage");
RemoteObject _the_files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 131;BA.debugLine="Sub file_in_stage";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="Dim the_files As List";
Debug.ShouldStop(8);
_the_files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("the_files", _the_files);
 BA.debugLineNum = 133;BA.debugLine="stage_file.Clear";
Debug.ShouldStop(16);
file_manager._stage_file.runVoidMethod ("Clear");
 BA.debugLineNum = 134;BA.debugLine="stage_file.Add(root_dir & \"/stage\")";
Debug.ShouldStop(32);
file_manager._stage_file.runVoidMethod ("Add",(Object)((RemoteObject.concat(file_manager._root_dir,RemoteObject.createImmutable("/stage")))));
 BA.debugLineNum = 135;BA.debugLine="the_files = File.ListFiles(root_dir & \"/stage\")";
Debug.ShouldStop(64);
_the_files = file_manager.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(RemoteObject.concat(file_manager._root_dir,RemoteObject.createImmutable("/stage"))));Debug.locals.put("the_files", _the_files);
 BA.debugLineNum = 136;BA.debugLine="If the_files.IsInitialized = False Or the_files.S";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_the_files.runMethod(true,"IsInitialized"),file_manager.mostCurrent.__c.getField(true,"False")) || RemoteObject.solveBoolean("<",_the_files.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 137;BA.debugLine="stage_file.Add(\"\")";
Debug.ShouldStop(256);
file_manager._stage_file.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable(""))));
 }else {
 BA.debugLineNum = 139;BA.debugLine="stage_file.Add(the_files.Get(0))";
Debug.ShouldStop(1024);
file_manager._stage_file.runVoidMethod ("Add",(Object)(_the_files.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));
 };
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _file_timer_tick() throws Exception{
try {
		Debug.PushSubsStack("file_timer_tick (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,192);
if (RapidSub.canDelegate("file_timer_tick")) return file_manager.remoteMe.runUserSub(false, "file_manager","file_timer_tick");
 BA.debugLineNum = 192;BA.debugLine="Sub file_timer_tick";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 194;BA.debugLine="file_timer.Enabled = False";
Debug.ShouldStop(2);
file_manager._file_timer.runMethod(true,"setEnabled",file_manager.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 197;BA.debugLine="If timer_switch = \"wifi_connect\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",file_manager._timer_switch,BA.ObjectToString("wifi_connect"))) { 
 BA.debugLineNum = 199;BA.debugLine="If my_wifi.isWifiConnected = True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",file_manager._my_wifi.runMethod(true,"isWifiConnected"),file_manager.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 200;BA.debugLine="google_drive_setup";
Debug.ShouldStop(128);
_google_drive_setup();
 BA.debugLineNum = 201;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 203;BA.debugLine="toggle_network(True)";
Debug.ShouldStop(1024);
_toggle_network(file_manager.mostCurrent.__c.getField(true,"True"));
 };
 };
 BA.debugLineNum = 208;BA.debugLine="If timer_switch = \"network_connect\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",file_manager._timer_switch,BA.ObjectToString("network_connect"))) { 
 BA.debugLineNum = 210;BA.debugLine="If my_wifi.isOnLine Then";
Debug.ShouldStop(131072);
if (file_manager._my_wifi.runMethod(true,"isOnLine").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 211;BA.debugLine="google_drive_setup";
Debug.ShouldStop(262144);
_google_drive_setup();
 }else {
 BA.debugLineNum = 213;BA.debugLine="CallSubDelayed2(activity_db,\"write_activity\",\"";
Debug.ShouldStop(1048576);
file_manager.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",file_manager.processBA,(Object)((file_manager.mostCurrent._activity_db.getObject())),(Object)(BA.ObjectToString("write_activity")),(Object)((RemoteObject.createImmutable("Unable to establish network connection."))));
 BA.debugLineNum = 214;BA.debugLine="turn_off_network";
Debug.ShouldStop(2097152);
_turn_off_network();
 };
 };
 BA.debugLineNum = 219;BA.debugLine="If timer_switch = \"drive_upload\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",file_manager._timer_switch,BA.ObjectToString("drive_upload"))) { 
 BA.debugLineNum = 220;BA.debugLine="turn_off_network";
Debug.ShouldStop(134217728);
_turn_off_network();
 BA.debugLineNum = 221;BA.debugLine="CallSubDelayed2(activity_db,\"write_activity\",\"Dr";
Debug.ShouldStop(268435456);
file_manager.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",file_manager.processBA,(Object)((file_manager.mostCurrent._activity_db.getObject())),(Object)(BA.ObjectToString("write_activity")),(Object)((RemoteObject.createImmutable("Drive upload timed out."))));
 };
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gdrive_connected(RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("gdrive_Connected (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,96);
if (RapidSub.canDelegate("gdrive_connected")) return file_manager.remoteMe.runUserSub(false, "file_manager","gdrive_connected", _items);
Debug.locals.put("Items", _items);
 BA.debugLineNum = 96;BA.debugLine="Sub gdrive_Connected(Items As Map)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Log(\"connected to google drive\")";
Debug.ShouldStop(1);
file_manager.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("connected to google drive")));
 BA.debugLineNum = 98;BA.debugLine="upload_files";
Debug.ShouldStop(2);
_upload_files();
 BA.debugLineNum = 99;BA.debugLine="End Sub";
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
public static RemoteObject  _gdrive_fileuploaded(RemoteObject _fileid) throws Exception{
try {
		Debug.PushSubsStack("gdrive_FileUploaded (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,114);
if (RapidSub.canDelegate("gdrive_fileuploaded")) return file_manager.remoteMe.runUserSub(false, "file_manager","gdrive_fileuploaded", _fileid);
Debug.locals.put("FileID", _fileid);
 BA.debugLineNum = 114;BA.debugLine="Sub gdrive_FileUploaded(FileID As String)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="CallSubDelayed2(activity_db,\"write_activity\",File";
Debug.ShouldStop(262144);
file_manager.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",file_manager.processBA,(Object)((file_manager.mostCurrent._activity_db.getObject())),(Object)(BA.ObjectToString("write_activity")),(Object)((RemoteObject.concat(_fileid,RemoteObject.createImmutable(" successfully uploaded to Google Drive")))));
 BA.debugLineNum = 116;BA.debugLine="Log(stage_file.Get(1) & \" uploaded successfully\")";
Debug.ShouldStop(524288);
file_manager.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(file_manager._stage_file.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(" uploaded successfully"))));
 BA.debugLineNum = 118;BA.debugLine="File.Copy(stage_file.Get(0),stage_file.Get(1),roo";
Debug.ShouldStop(2097152);
file_manager.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(BA.ObjectToString(file_manager._stage_file.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.ObjectToString(file_manager._stage_file.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))),(Object)(RemoteObject.concat(file_manager._root_dir,RemoteObject.createImmutable("/archive"))),(Object)(BA.ObjectToString(file_manager._stage_file.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 120;BA.debugLine="If File.Exists(root_dir & \"/archive\", stage_file.";
Debug.ShouldStop(8388608);
if (file_manager.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(RemoteObject.concat(file_manager._root_dir,RemoteObject.createImmutable("/archive"))),(Object)(BA.ObjectToString(file_manager._stage_file.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 121;BA.debugLine="File.Delete(stage_file.Get(0),stage_file.Get(1))";
Debug.ShouldStop(16777216);
file_manager.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(BA.ObjectToString(file_manager._stage_file.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.ObjectToString(file_manager._stage_file.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));
 }else {
 BA.debugLineNum = 123;BA.debugLine="CallSubDelayed2(activity_db,\"write_activity\",\"T";
Debug.ShouldStop(67108864);
file_manager.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",file_manager.processBA,(Object)((file_manager.mostCurrent._activity_db.getObject())),(Object)(BA.ObjectToString("write_activity")),(Object)((RemoteObject.createImmutable("There was a problem archiving data."))));
 BA.debugLineNum = 124;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 127;BA.debugLine="upload_files";
Debug.ShouldStop(1073741824);
_upload_files();
 BA.debugLineNum = 128;BA.debugLine="End Sub";
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
public static RemoteObject  _get_current_dir() throws Exception{
try {
		Debug.PushSubsStack("get_current_dir (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,40);
if (RapidSub.canDelegate("get_current_dir")) return file_manager.remoteMe.runUserSub(false, "file_manager","get_current_dir");
 BA.debugLineNum = 40;BA.debugLine="Sub get_current_dir As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="If current_dir = Null Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("n",file_manager._current_dir)) { 
 BA.debugLineNum = 43;BA.debugLine="update_current_dir";
Debug.ShouldStop(1024);
_update_current_dir();
 };
 BA.debugLineNum = 45;BA.debugLine="Return(current_dir)";
Debug.ShouldStop(4096);
if (true) return (file_manager._current_dir);
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
public static RemoteObject  _google_drive_setup() throws Exception{
try {
		Debug.PushSubsStack("google_drive_setup (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,84);
if (RapidSub.canDelegate("google_drive_setup")) return file_manager.remoteMe.runUserSub(false, "file_manager","google_drive_setup");
 BA.debugLineNum = 84;BA.debugLine="Sub google_drive_setup";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="CallSubDelayed2(activity_db,\"write_activity\",\"Net";
Debug.ShouldStop(1048576);
file_manager.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",file_manager.processBA,(Object)((file_manager.mostCurrent._activity_db.getObject())),(Object)(BA.ObjectToString("write_activity")),(Object)((RemoteObject.createImmutable("Network connection established. Beginning upload."))));
 BA.debugLineNum = 87;BA.debugLine="timer_switch = \"drive_upload\"";
Debug.ShouldStop(4194304);
file_manager._timer_switch = BA.ObjectToString("drive_upload");
 BA.debugLineNum = 88;BA.debugLine="file_timer.Enabled = False";
Debug.ShouldStop(8388608);
file_manager._file_timer.runMethod(true,"setEnabled",file_manager.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 89;BA.debugLine="file_timer.Interval =  3*60*1000";
Debug.ShouldStop(16777216);
file_manager._file_timer.runMethod(true,"setInterval",BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(3),RemoteObject.createImmutable(60),RemoteObject.createImmutable(1000)}, "**",0, 1)));
 BA.debugLineNum = 90;BA.debugLine="file_timer.Enabled = True";
Debug.ShouldStop(33554432);
file_manager._file_timer.runMethod(true,"setEnabled",file_manager.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 91;BA.debugLine="cls_drive.Initialize(Me, \"gdrive\", clientId, clie";
Debug.ShouldStop(67108864);
file_manager._cls_drive.runVoidMethod ("_initialize",file_manager.processBA,(Object)(file_manager.getObject()),(Object)(BA.ObjectToString("gdrive")),(Object)(file_manager._clientid),(Object)(file_manager._clientsecret));
 BA.debugLineNum = 92;BA.debugLine="cls_drive.ConnectToDrive";
Debug.ShouldStop(134217728);
file_manager._cls_drive.runVoidMethod ("_connecttodrive");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim root_dir As String = File.DirDefaultExternal";
file_manager._root_dir = file_manager.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal");
 //BA.debugLineNum = 7;BA.debugLine="Dim sub_dir As String";
file_manager._sub_dir = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Dim current_dir As String";
file_manager._current_dir = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Dim clientId As String = \"415663751514-bh91mh1n7r";
file_manager._clientid = BA.ObjectToString("415663751514-bh91mh1n7r80gunhj26r5unchj7nh59s.apps.googleusercontent.com");
 //BA.debugLineNum = 10;BA.debugLine="Dim clientSecret As String = \"K1lNN3fT8Pnw_cezd3f";
file_manager._clientsecret = BA.ObjectToString("K1lNN3fT8Pnw_cezd3fie9JB");
 //BA.debugLineNum = 11;BA.debugLine="Dim cls_drive As libGoogleDrive";
file_manager._cls_drive = RemoteObject.createNew ("anywheresoftware.b4a.samples.gmailcontacts.libgoogledrive");
 //BA.debugLineNum = 12;BA.debugLine="Dim my_wifi As MLwifi";
file_manager._my_wifi = RemoteObject.createNew ("wifi.MLwifi");
 //BA.debugLineNum = 13;BA.debugLine="Dim file_timer As Timer";
file_manager._file_timer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 14;BA.debugLine="Dim timer_switch As String = \"\"";
file_manager._timer_switch = BA.ObjectToString("");
 //BA.debugLineNum = 15;BA.debugLine="Dim stage_file As List";
file_manager._stage_file = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,19);
if (RapidSub.canDelegate("service_create")) return file_manager.remoteMe.runUserSub(false, "file_manager","service_create");
 BA.debugLineNum = 19;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="update_current_dir";
Debug.ShouldStop(524288);
_update_current_dir();
 BA.debugLineNum = 22;BA.debugLine="If File.IsDirectory(root_dir,\"archive\") = False T";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",file_manager.mostCurrent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(file_manager._root_dir),(Object)(RemoteObject.createImmutable("archive"))),file_manager.mostCurrent.__c.getField(true,"False"))) { 
file_manager.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(file_manager._root_dir),(Object)(RemoteObject.createImmutable("archive")));};
 BA.debugLineNum = 24;BA.debugLine="If File.IsDirectory(root_dir,\"stage\") = False The";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",file_manager.mostCurrent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(file_manager._root_dir),(Object)(RemoteObject.createImmutable("stage"))),file_manager.mostCurrent.__c.getField(true,"False"))) { 
file_manager.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(file_manager._root_dir),(Object)(RemoteObject.createImmutable("stage")));};
 BA.debugLineNum = 26;BA.debugLine="file_timer.Initialize(\"file_timer\",15*1000)";
Debug.ShouldStop(33554432);
file_manager._file_timer.runVoidMethod ("Initialize",file_manager.processBA,(Object)(BA.ObjectToString("file_timer")),(Object)(BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(15),RemoteObject.createImmutable(1000)}, "*",0, 1))));
 BA.debugLineNum = 27;BA.debugLine="file_timer.Enabled = False";
Debug.ShouldStop(67108864);
file_manager._file_timer.runMethod(true,"setEnabled",file_manager.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 29;BA.debugLine="stage_file.Initialize";
Debug.ShouldStop(268435456);
file_manager._stage_file.runVoidMethod ("Initialize");
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Service_Destroy (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,36);
if (RapidSub.canDelegate("service_destroy")) return file_manager.remoteMe.runUserSub(false, "file_manager","service_destroy");
 BA.debugLineNum = 36;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Service_Start (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,32);
if (RapidSub.canDelegate("service_start")) return file_manager.remoteMe.runUserSub(false, "file_manager","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 32;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _toggle_network(RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("toggle_network (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,153);
if (RapidSub.canDelegate("toggle_network")) return file_manager.remoteMe.runUserSub(false, "file_manager","toggle_network", _state);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("state", _state);
 BA.debugLineNum = 153;BA.debugLine="Sub toggle_network(state As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(33554432);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 155;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(67108864);
_r.setField ("Target",(_r.runMethod(false,"GetContext",file_manager.processBA)));
 BA.debugLineNum = 156;BA.debugLine="r.Target = r.RunMethod2(\"getSystemService\", \"co";
Debug.ShouldStop(134217728);
_r.setField ("Target",_r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getSystemService")),(Object)(BA.ObjectToString("connectivity")),(Object)(RemoteObject.createImmutable("java.lang.String"))));
 BA.debugLineNum = 157;BA.debugLine="r.RunMethod2(\"setMobileDataEnabled\", state, \"ja";
Debug.ShouldStop(268435456);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setMobileDataEnabled")),(Object)(BA.ObjectToString(_state)),(Object)(RemoteObject.createImmutable("java.lang.boolean")));
 BA.debugLineNum = 158;BA.debugLine="If state = False Then Return 'all done if turni";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_state,file_manager.mostCurrent.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 159;BA.debugLine="timer_switch = \"network_connect\"";
Debug.ShouldStop(1073741824);
file_manager._timer_switch = BA.ObjectToString("network_connect");
 BA.debugLineNum = 160;BA.debugLine="file_timer.Enabled = False";
Debug.ShouldStop(-2147483648);
file_manager._file_timer.runMethod(true,"setEnabled",file_manager.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 161;BA.debugLine="file_timer.Interval =  15*1000 'wait 15 seconds";
Debug.ShouldStop(1);
file_manager._file_timer.runMethod(true,"setInterval",BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(15),RemoteObject.createImmutable(1000)}, "*",0, 1)));
 BA.debugLineNum = 162;BA.debugLine="file_timer.Enabled = True";
Debug.ShouldStop(2);
file_manager._file_timer.runMethod(true,"setEnabled",file_manager.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 163;BA.debugLine="End Sub";
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
public static RemoteObject  _toggle_wifi(RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("toggle_wifi (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,144);
if (RapidSub.canDelegate("toggle_wifi")) return file_manager.remoteMe.runUserSub(false, "file_manager","toggle_wifi", _state);
Debug.locals.put("state", _state);
 BA.debugLineNum = 144;BA.debugLine="Sub toggle_wifi(state As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="my_wifi.EnableWifi(state)";
Debug.ShouldStop(65536);
file_manager._my_wifi.runVoidMethod ("EnableWifi",(Object)(_state));
 BA.debugLineNum = 146;BA.debugLine="If state = False Then Return 'all done if turning";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_state,file_manager.mostCurrent.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 147;BA.debugLine="timer_switch = \"wifi_connect\"";
Debug.ShouldStop(262144);
file_manager._timer_switch = BA.ObjectToString("wifi_connect");
 BA.debugLineNum = 148;BA.debugLine="file_timer.Enabled = False";
Debug.ShouldStop(524288);
file_manager._file_timer.runMethod(true,"setEnabled",file_manager.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 149;BA.debugLine="file_timer.Interval =  15*1000 'wait 15 seconds t";
Debug.ShouldStop(1048576);
file_manager._file_timer.runMethod(true,"setInterval",BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(15),RemoteObject.createImmutable(1000)}, "*",0, 1)));
 BA.debugLineNum = 150;BA.debugLine="file_timer.Enabled = True";
Debug.ShouldStop(2097152);
file_manager._file_timer.runMethod(true,"setEnabled",file_manager.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 151;BA.debugLine="End Sub";
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
public static RemoteObject  _turn_off_network() throws Exception{
try {
		Debug.PushSubsStack("turn_off_network (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,165);
if (RapidSub.canDelegate("turn_off_network")) return file_manager.remoteMe.runUserSub(false, "file_manager","turn_off_network");
 BA.debugLineNum = 165;BA.debugLine="Sub turn_off_network";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="toggle_wifi(False)";
Debug.ShouldStop(32);
_toggle_wifi(file_manager.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 167;BA.debugLine="toggle_network(False)";
Debug.ShouldStop(64);
_toggle_network(file_manager.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 168;BA.debugLine="Log(\"network connections turned off\")";
Debug.ShouldStop(128);
file_manager.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("network connections turned off")));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update_current_dir() throws Exception{
try {
		Debug.PushSubsStack("update_current_dir (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,173);
if (RapidSub.canDelegate("update_current_dir")) return file_manager.remoteMe.runUserSub(false, "file_manager","update_current_dir");
RemoteObject _now = RemoteObject.createImmutable(0L);
RemoteObject _try_dir = RemoteObject.createImmutable("");
RemoteObject _add_on = RemoteObject.createImmutable(0);
RemoteObject _add_string = RemoteObject.createImmutable("");
 BA.debugLineNum = 173;BA.debugLine="Sub update_current_dir";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="Dim now As Long";
Debug.ShouldStop(8192);
_now = RemoteObject.createImmutable(0L);Debug.locals.put("now", _now);
 BA.debugLineNum = 175;BA.debugLine="Dim try_dir As String";
Debug.ShouldStop(16384);
_try_dir = RemoteObject.createImmutable("");Debug.locals.put("try_dir", _try_dir);
 BA.debugLineNum = 176;BA.debugLine="Dim add_on As Int = 1";
Debug.ShouldStop(32768);
_add_on = BA.numberCast(int.class, 1);Debug.locals.put("add_on", _add_on);Debug.locals.put("add_on", _add_on);
 BA.debugLineNum = 177;BA.debugLine="Dim add_string As String = \"\"";
Debug.ShouldStop(65536);
_add_string = BA.ObjectToString("");Debug.locals.put("add_string", _add_string);Debug.locals.put("add_string", _add_string);
 BA.debugLineNum = 178;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\" ' See this pag";
Debug.ShouldStop(131072);
file_manager.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 179;BA.debugLine="now = DateTime.Now";
Debug.ShouldStop(262144);
_now = file_manager.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);
 BA.debugLineNum = 180;BA.debugLine="try_dir = \"data_\" & DateTime.Date(now)";
Debug.ShouldStop(524288);
_try_dir = RemoteObject.concat(RemoteObject.createImmutable("data_"),file_manager.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now)));Debug.locals.put("try_dir", _try_dir);
 BA.debugLineNum = 182;BA.debugLine="Do While File.IsDirectory(root_dir,try_dir & add_";
Debug.ShouldStop(2097152);
while (RemoteObject.solveBoolean("=",file_manager.mostCurrent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(file_manager._root_dir),(Object)(RemoteObject.concat(_try_dir,_add_string))),file_manager.mostCurrent.__c.getField(true,"True"))) {
 BA.debugLineNum = 183;BA.debugLine="add_string = \"_\" & add_on";
Debug.ShouldStop(4194304);
_add_string = RemoteObject.concat(RemoteObject.createImmutable("_"),_add_on);Debug.locals.put("add_string", _add_string);
 BA.debugLineNum = 184;BA.debugLine="add_on = add_on + 1";
Debug.ShouldStop(8388608);
_add_on = RemoteObject.solve(new RemoteObject[] {_add_on,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("add_on", _add_on);
 }
;
 BA.debugLineNum = 186;BA.debugLine="sub_dir = try_dir & add_string";
Debug.ShouldStop(33554432);
file_manager._sub_dir = RemoteObject.concat(_try_dir,_add_string);
 BA.debugLineNum = 187;BA.debugLine="File.MakeDir(root_dir,sub_dir)";
Debug.ShouldStop(67108864);
file_manager.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(file_manager._root_dir),(Object)(file_manager._sub_dir));
 BA.debugLineNum = 188;BA.debugLine="current_dir = root_dir & \"/\" & sub_dir";
Debug.ShouldStop(134217728);
file_manager._current_dir = RemoteObject.concat(file_manager._root_dir,RemoteObject.createImmutable("/"),file_manager._sub_dir);
 BA.debugLineNum = 189;BA.debugLine="End Sub";
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
public static RemoteObject  _upload_files() throws Exception{
try {
		Debug.PushSubsStack("upload_files (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,103);
if (RapidSub.canDelegate("upload_files")) return file_manager.remoteMe.runUserSub(false, "file_manager","upload_files");
 BA.debugLineNum = 103;BA.debugLine="Sub upload_files";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="file_in_stage 'updates the stage_file list";
Debug.ShouldStop(128);
_file_in_stage();
 BA.debugLineNum = 105;BA.debugLine="If stage_file.Get(1) = \"\" Then 'no more files to";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",file_manager._stage_file.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 106;BA.debugLine="turn_off_network";
Debug.ShouldStop(512);
_turn_off_network();
 BA.debugLineNum = 107;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 109;BA.debugLine="Log(\"Uploading file \" & stage_file.Get(1))";
Debug.ShouldStop(4096);
file_manager.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Uploading file "),file_manager._stage_file.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 110;BA.debugLine="cls_drive.UploadFile(stage_file.Get(1),stage_file";
Debug.ShouldStop(8192);
file_manager._cls_drive.runVoidMethod ("_uploadfile",(Object)(BA.ObjectToString(file_manager._stage_file.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.ObjectToString(file_manager._stage_file.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.ObjectToString(file_manager._stage_file.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zip_zipdone(RemoteObject _success,RemoteObject _nboffiles) throws Exception{
try {
		Debug.PushSubsStack("zip_zipDone (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,66);
if (RapidSub.canDelegate("zip_zipdone")) return file_manager.remoteMe.runUserSub(false, "file_manager","zip_zipdone", _success, _nboffiles);
Debug.locals.put("success", _success);
Debug.locals.put("nbOfFiles", _nboffiles);
 BA.debugLineNum = 66;BA.debugLine="Sub zip_zipDone(success As Boolean,nbOfFiles As In";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="If success = False Then Return";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_success,file_manager.mostCurrent.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 69;BA.debugLine="update_current_dir";
Debug.ShouldStop(16);
_update_current_dir();
 BA.debugLineNum = 71;BA.debugLine="If my_wifi.isOnLine = False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",file_manager._my_wifi.runMethod(true,"isOnLine"),file_manager.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 73;BA.debugLine="toggle_wifi(True)";
Debug.ShouldStop(256);
_toggle_wifi(file_manager.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 74;BA.debugLine="Return Null";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString(file_manager.mostCurrent.__c.getField(false,"Null"));
 }else {
 BA.debugLineNum = 77;BA.debugLine="google_drive_setup";
Debug.ShouldStop(4096);
_google_drive_setup();
 };
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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