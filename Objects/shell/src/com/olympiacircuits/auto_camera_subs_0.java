package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class auto_camera_subs_0 {


public static RemoteObject  _camera_close(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("camera_close (auto_camera) ","auto_camera",4,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("camera_close")) return __ref.runUserSub(false, "auto_camera","camera_close", __ref);
 BA.debugLineNum = 51;BA.debugLine="Sub camera_close";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="my_camera.StopPreview";
Debug.ShouldStop(524288);
__ref.getField(false,"_my_camera").runClassMethod (com.olympiacircuits.cameraexclass.class, "_stoppreview");
 BA.debugLineNum = 53;BA.debugLine="my_camera.Release";
Debug.ShouldStop(1048576);
__ref.getField(false,"_my_camera").runClassMethod (com.olympiacircuits.cameraexclass.class, "_release");
 BA.debugLineNum = 54;BA.debugLine="CallSub(camera_activity,\"close_self\")";
Debug.ShouldStop(2097152);
auto_camera.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((auto_camera._camera_activity.getObject())),(Object)(RemoteObject.createImmutable("close_self")));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
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
public static RemoteObject  _camera_event_picturetaken(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("camera_event_PictureTaken (auto_camera) ","auto_camera",4,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("camera_event_picturetaken")) return __ref.runUserSub(false, "auto_camera","camera_event_picturetaken", __ref, _data);
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _now = RemoteObject.createImmutable(0L);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 40;BA.debugLine="Sub camera_event_PictureTaken (Data() As Byte)";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(256);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 42;BA.debugLine="Dim now As Long";
Debug.ShouldStop(512);
_now = RemoteObject.createImmutable(0L);Debug.locals.put("now", _now);
 BA.debugLineNum = 43;BA.debugLine="now = DateTime.Now";
Debug.ShouldStop(1024);
_now = auto_camera.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("now", _now);
 BA.debugLineNum = 44;BA.debugLine="out = File.OpenOutput(pic_path, now & \".jpg\", Fal";
Debug.ShouldStop(2048);
_out = auto_camera.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(__ref.getField(true,"_pic_path")),(Object)(RemoteObject.concat(_now,RemoteObject.createImmutable(".jpg"))),(Object)(auto_camera.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 45;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
Debug.ShouldStop(4096);
_out.runVoidMethod ("WriteBytes",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 BA.debugLineNum = 46;BA.debugLine="out.Close";
Debug.ShouldStop(8192);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 47;BA.debugLine="camera_close";
Debug.ShouldStop(16384);
__ref.runClassMethod (com.olympiacircuits.auto_camera.class, "_camera_close");
 BA.debugLineNum = 48;BA.debugLine="End Sub";
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
public static RemoteObject  _camera_event_ready(RemoteObject __ref,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("camera_event_Ready (auto_camera) ","auto_camera",4,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("camera_event_ready")) return __ref.runUserSub(false, "auto_camera","camera_event_ready", __ref, _success);
Debug.locals.put("success", _success);
 BA.debugLineNum = 25;BA.debugLine="Sub camera_event_Ready(success As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="my_camera.StartPreview";
Debug.ShouldStop(67108864);
__ref.getField(false,"_my_camera").runClassMethod (com.olympiacircuits.cameraexclass.class, "_startpreview");
 BA.debugLineNum = 29;BA.debugLine="If Mode <> \"take_picture\" Then Return";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_mode"),BA.ObjectToString("take_picture"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 31;BA.debugLine="my_camera.SetPictureSize(1920,1080)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_my_camera").runClassMethod (com.olympiacircuits.cameraexclass.class, "_setpicturesize",(Object)(BA.numberCast(int.class, 1920)),(Object)(BA.numberCast(int.class, 1080)));
 BA.debugLineNum = 32;BA.debugLine="my_camera.SetJpegQuality(90)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_my_camera").runClassMethod (com.olympiacircuits.cameraexclass.class, "_setjpegquality",(Object)(BA.numberCast(int.class, 90)));
 BA.debugLineNum = 33;BA.debugLine="my_camera.CommitParameters";
Debug.ShouldStop(1);
__ref.getField(false,"_my_camera").runClassMethod (com.olympiacircuits.cameraexclass.class, "_commitparameters");
 BA.debugLineNum = 35;BA.debugLine="my_camera.TakePicture";
Debug.ShouldStop(4);
__ref.getField(false,"_my_camera").runClassMethod (com.olympiacircuits.cameraexclass.class, "_takepicture");
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim my_camera As CameraExClass";
auto_camera._my_camera = RemoteObject.createNew ("com.olympiacircuits.cameraexclass");__ref.setField("_my_camera",auto_camera._my_camera);
 //BA.debugLineNum = 4;BA.debugLine="Dim pic_path As String";
auto_camera._pic_path = RemoteObject.createImmutable("");__ref.setField("_pic_path",auto_camera._pic_path);
 //BA.debugLineNum = 5;BA.debugLine="Dim holder_panel As Panel";
auto_camera._holder_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_holder_panel",auto_camera._holder_panel);
 //BA.debugLineNum = 6;BA.debugLine="Dim Mode As String = \"picture\"";
auto_camera._mode = BA.ObjectToString("picture");__ref.setField("_mode",auto_camera._mode);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _camera_panel,RemoteObject _save_path,RemoteObject _set_mode) throws Exception{
try {
		Debug.PushSubsStack("Initialize (auto_camera) ","auto_camera",4,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "auto_camera","initialize", __ref, _ba, _camera_panel, _save_path, _set_mode);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("camera_panel", _camera_panel);
Debug.locals.put("save_path", _save_path);
Debug.locals.put("set_mode", _set_mode);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(camera_panel As Panel,save_p";
Debug.ShouldStop(512);
 BA.debugLineNum = 12;BA.debugLine="pic_path = save_path";
Debug.ShouldStop(2048);
__ref.setField ("_pic_path",_save_path);
 BA.debugLineNum = 13;BA.debugLine="holder_panel = camera_panel";
Debug.ShouldStop(4096);
__ref.setField ("_holder_panel",_camera_panel);
 BA.debugLineNum = 14;BA.debugLine="Mode = set_mode";
Debug.ShouldStop(8192);
__ref.setField ("_mode",_set_mode);
 BA.debugLineNum = 16;BA.debugLine="If holder_panel.IsInitialized = False Then camer";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_holder_panel").runMethod(true,"IsInitialized"),auto_camera.__c.getField(true,"False"))) { 
__ref.runClassMethod (com.olympiacircuits.auto_camera.class, "_camera_close");};
 BA.debugLineNum = 17;BA.debugLine="my_camera.Initialize(holder_panel,False,Me,\"came";
Debug.ShouldStop(65536);
__ref.getField(false,"_my_camera").runClassMethod (com.olympiacircuits.cameraexclass.class, "_initialize",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_holder_panel")),(Object)(auto_camera.__c.getField(true,"False")),(Object)(__ref),(Object)(RemoteObject.createImmutable("camera_event")));
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
}