package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class file_manager_subs_0 {


public static RemoteObject  _archive_current_dir() throws Exception{
try {
		Debug.PushSubsStack("archive_current_dir (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,48);
if (RapidSub.canDelegate("archive_current_dir")) return file_manager.remoteMe.runUserSub(false, "file_manager","archive_current_dir");
RemoteObject _an_archive = RemoteObject.declareNull("flm.b4a.archiver.ArchiverForB4A");
RemoteObject _archive_name = RemoteObject.createImmutable("");
RemoteObject _file_list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _file_array = null;
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 48;BA.debugLine="Sub archive_current_dir";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim an_archive As Archiver";
Debug.ShouldStop(65536);
_an_archive = RemoteObject.createNew ("flm.b4a.archiver.ArchiverForB4A");Debug.locals.put("an_archive", _an_archive);
 BA.debugLineNum = 50;BA.debugLine="Dim archive_name As String";
Debug.ShouldStop(131072);
_archive_name = RemoteObject.createImmutable("");Debug.locals.put("archive_name", _archive_name);
 BA.debugLineNum = 51;BA.debugLine="archive_name = sub_dir & \".zip\"";
Debug.ShouldStop(262144);
_archive_name = RemoteObject.concat(file_manager._sub_dir,RemoteObject.createImmutable(".zip"));Debug.locals.put("archive_name", _archive_name);
 BA.debugLineNum = 52;BA.debugLine="Dim file_list As List";
Debug.ShouldStop(524288);
_file_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("file_list", _file_list);
 BA.debugLineNum = 53;BA.debugLine="Dim file_array() As String";
Debug.ShouldStop(1048576);
_file_array = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("file_array", _file_array);
 BA.debugLineNum = 54;BA.debugLine="Dim i As Int";
Debug.ShouldStop(2097152);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 55;BA.debugLine="file_list = File.ListFiles(current_dir)";
Debug.ShouldStop(4194304);
_file_list = file_manager.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(file_manager._current_dir));Debug.locals.put("file_list", _file_list);
 BA.debugLineNum = 56;BA.debugLine="For i = 0 To file_list.Size - 1";
Debug.ShouldStop(8388608);
{
final int step40 = 1;
final int limit40 = RemoteObject.solve(new RemoteObject[] {_file_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = BA.numberCast(int.class, 0); (step40 > 0 && _i.<Integer>get().intValue() <= limit40) || (step40 < 0 && _i.<Integer>get().intValue() >= limit40); _i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step40))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 57;BA.debugLine="file_array(i) = file_list.Get(i)";
Debug.ShouldStop(16777216);
_file_array.setArrayElement (BA.ObjectToString(_file_list.runMethod(false,"Get",(Object)(_i))),_i);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 59;BA.debugLine="an_archive.AsyncZipFiles(current_dir,file_array,r";
Debug.ShouldStop(67108864);
_an_archive.runVoidMethod ("AsyncZipFiles",file_manager.processBA,(Object)(file_manager._current_dir),(Object)(_file_array),(Object)(RemoteObject.concat(file_manager._root_dir,RemoteObject.createImmutable("/archive"))),(Object)(_archive_name),(Object)(RemoteObject.createImmutable("zip")));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
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
public static RemoteObject  _gdrive_connected(RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("gdrive_Connected (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,76);
if (RapidSub.canDelegate("gdrive_connected")) return file_manager.remoteMe.runUserSub(false, "file_manager","gdrive_connected", _items);
Debug.locals.put("Items", _items);
 BA.debugLineNum = 76;BA.debugLine="Sub gdrive_Connected(Items As Map)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="ToastMessageShow(\"Connected to Google Drive.\", Fa";
Debug.ShouldStop(8192);
file_manager.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToString("Connected to Google Drive.")),(Object)(file_manager.mostCurrent.__c.getField(true,"False")));
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
public static RemoteObject  _get_current_dir() throws Exception{
try {
		Debug.PushSubsStack("get_current_dir (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,43);
if (RapidSub.canDelegate("get_current_dir")) return file_manager.remoteMe.runUserSub(false, "file_manager","get_current_dir");
 BA.debugLineNum = 43;BA.debugLine="Sub get_current_dir As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Return(current_dir)";
Debug.ShouldStop(2048);
if (true) return (file_manager._current_dir);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
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
public static RemoteObject  _google_drive_upload() throws Exception{
try {
		Debug.PushSubsStack("google_drive_upload (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,69);
if (RapidSub.canDelegate("google_drive_upload")) return file_manager.remoteMe.runUserSub(false, "file_manager","google_drive_upload");
 BA.debugLineNum = 69;BA.debugLine="Sub google_drive_upload";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Log(\"launching google drive\")";
Debug.ShouldStop(32);
file_manager.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("launching google drive")));
 BA.debugLineNum = 71;BA.debugLine="cls_drive.Initialize(Me, \"gdrive\", clientId, clie";
Debug.ShouldStop(64);
file_manager._cls_drive.runVoidMethod ("_initialize",file_manager.processBA,(Object)(file_manager.getObject()),(Object)(BA.ObjectToString("gdrive")),(Object)(file_manager._clientid),(Object)(file_manager._clientsecret));
 BA.debugLineNum = 72;BA.debugLine="cls_drive.ConnectToDrive";
Debug.ShouldStop(128);
file_manager._cls_drive.runVoidMethod ("_connecttodrive");
 BA.debugLineNum = 73;BA.debugLine="End Sub";
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim root_dir As String = File.DirDefaultExternal";
file_manager._root_dir = file_manager.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal");
 //BA.debugLineNum = 7;BA.debugLine="Dim sub_dir As String";
file_manager._sub_dir = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Dim current_dir As String";
file_manager._current_dir = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Dim clientId As String = \"415663751514-bt7l21834i";
file_manager._clientid = BA.ObjectToString("415663751514-bt7l21834iccet1uadd2frcl249p7jee.apps.googleusercontent.com");
 //BA.debugLineNum = 10;BA.debugLine="Dim clientSecret As String = \"9kdiSV-VdbSQC3l_ASO";
file_manager._clientsecret = BA.ObjectToString("9kdiSV-VdbSQC3l_ASOiSQZo");
 //BA.debugLineNum = 11;BA.debugLine="Dim cls_drive As libGoogleDrive";
file_manager._cls_drive = RemoteObject.createNew ("anywheresoftware.b4a.samples.gmailcontacts.libgoogledrive");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,14);
if (RapidSub.canDelegate("service_create")) return file_manager.remoteMe.runUserSub(false, "file_manager","service_create");
RemoteObject _now = RemoteObject.createImmutable(0L);
RemoteObject _try_dir = RemoteObject.createImmutable("");
RemoteObject _add_on = RemoteObject.createImmutable(0);
RemoteObject _add_string = RemoteObject.createImmutable("");
 BA.debugLineNum = 14;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Dim now As Long";
Debug.ShouldStop(16384);
_now = RemoteObject.createImmutable(0L);Debug.locals.put("now", _now);
 BA.debugLineNum = 16;BA.debugLine="Dim try_dir As String";
Debug.ShouldStop(32768);
_try_dir = RemoteObject.createImmutable("");Debug.locals.put("try_dir", _try_dir);
 BA.debugLineNum = 17;BA.debugLine="Dim add_on As Int = 1";
Debug.ShouldStop(65536);
_add_on = BA.numberCast(int.class, 1);Debug.locals.put("add_on", _add_on);Debug.locals.put("add_on", _add_on);
 BA.debugLineNum = 18;BA.debugLine="Dim add_string As String = \"\"";
Debug.ShouldStop(131072);
_add_string = BA.ObjectToString("");Debug.locals.put("add_string", _add_string);Debug.locals.put("add_string", _add_string);
 BA.debugLineNum = 19;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\" ' See this pag";
Debug.ShouldStop(262144);
file_manager.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 20;BA.debugLine="now = DateTime.Now";
Debug.ShouldStop(524288);
_now = file_manager.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);
 BA.debugLineNum = 21;BA.debugLine="try_dir = \"data_\" & DateTime.Date(now)";
Debug.ShouldStop(1048576);
_try_dir = RemoteObject.concat(RemoteObject.createImmutable("data_"),file_manager.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_now)));Debug.locals.put("try_dir", _try_dir);
 BA.debugLineNum = 23;BA.debugLine="Do While File.IsDirectory(root_dir,try_dir & add_";
Debug.ShouldStop(4194304);
while (RemoteObject.solveBoolean("=",file_manager.mostCurrent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(file_manager._root_dir),(Object)(RemoteObject.concat(_try_dir,_add_string))),file_manager.mostCurrent.__c.getField(true,"True"))) {
 BA.debugLineNum = 24;BA.debugLine="add_string = \"_\" & add_on";
Debug.ShouldStop(8388608);
_add_string = RemoteObject.concat(RemoteObject.createImmutable("_"),_add_on);Debug.locals.put("add_string", _add_string);
 BA.debugLineNum = 25;BA.debugLine="add_on = add_on + 1";
Debug.ShouldStop(16777216);
_add_on = RemoteObject.solve(new RemoteObject[] {_add_on,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("add_on", _add_on);
 }
;
 BA.debugLineNum = 27;BA.debugLine="sub_dir = try_dir & add_string";
Debug.ShouldStop(67108864);
file_manager._sub_dir = RemoteObject.concat(_try_dir,_add_string);
 BA.debugLineNum = 28;BA.debugLine="File.MakeDir(root_dir,sub_dir)";
Debug.ShouldStop(134217728);
file_manager.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(file_manager._root_dir),(Object)(file_manager._sub_dir));
 BA.debugLineNum = 30;BA.debugLine="If File.IsDirectory(root_dir,\"archive\") = False T";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",file_manager.mostCurrent.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(file_manager._root_dir),(Object)(RemoteObject.createImmutable("archive"))),file_manager.mostCurrent.__c.getField(true,"False"))) { 
file_manager.mostCurrent.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(file_manager._root_dir),(Object)(RemoteObject.createImmutable("archive")));};
 BA.debugLineNum = 31;BA.debugLine="current_dir = root_dir & \"/\" & sub_dir";
Debug.ShouldStop(1073741824);
file_manager._current_dir = RemoteObject.concat(file_manager._root_dir,RemoteObject.createImmutable("/"),file_manager._sub_dir);
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
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,39);
if (RapidSub.canDelegate("service_destroy")) return file_manager.remoteMe.runUserSub(false, "file_manager","service_destroy");
 BA.debugLineNum = 39;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
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
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,35);
if (RapidSub.canDelegate("service_start")) return file_manager.remoteMe.runUserSub(false, "file_manager","service_start", _startingintent);
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 35;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
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
public static RemoteObject  _zip_zipdone(RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("zip_zipDone (file_manager) ","file_manager",3,file_manager.processBA,file_manager.mostCurrent,63);
if (RapidSub.canDelegate("zip_zipdone")) return file_manager.remoteMe.runUserSub(false, "file_manager","zip_zipdone", _success);
Debug.locals.put("success", _success);
 BA.debugLineNum = 63;BA.debugLine="Sub zip_zipDone(success As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
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
}