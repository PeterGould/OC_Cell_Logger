package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cameraexclass_subs_0 {


public static RemoteObject  _camera_focusdone(RemoteObject __ref,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("Camera_FocusDone (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("camera_focusdone")) return __ref.runUserSub(false, "cameraexclass","camera_focusdone", __ref, _success);
Debug.locals.put("Success", _success);
 BA.debugLineNum = 272;BA.debugLine="Private Sub Camera_FocusDone (Success As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 273;BA.debugLine="If Success Then";
Debug.ShouldStop(65536);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 274;BA.debugLine="TakePicture";
Debug.ShouldStop(131072);
__ref.runClassMethod (com.olympiacircuits.cameraexclass.class, "_takepicture");
 }else {
 BA.debugLineNum = 276;BA.debugLine="Log(\"AutoFocus error.\")";
Debug.ShouldStop(524288);
cameraexclass.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("AutoFocus error.")));
 };
 BA.debugLineNum = 278;BA.debugLine="End Sub";
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
public static RemoteObject  _camera_picturetaken(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Camera_PictureTaken (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("camera_picturetaken")) return __ref.runUserSub(false, "cameraexclass","camera_picturetaken", __ref, _data);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 102;BA.debugLine="Private Sub Camera_PictureTaken (Data() As Byte)";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="CallSub2(target, event & \"_PictureTaken\", Data)";
Debug.ShouldStop(64);
cameraexclass.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target")),(Object)(RemoteObject.concat(__ref.getField(true,"_event"),RemoteObject.createImmutable("_PictureTaken"))),(Object)((_data)));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
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
public static RemoteObject  _camera_preview(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("Camera_Preview (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("camera_preview")) return __ref.runUserSub(false, "cameraexclass","camera_preview", __ref, _data);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 93;BA.debugLine="Sub Camera_Preview (Data() As Byte)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="If SubExists(target, event & \"_preview\") Then";
Debug.ShouldStop(536870912);
if (cameraexclass.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target")),(Object)(RemoteObject.concat(__ref.getField(true,"_event"),RemoteObject.createImmutable("_preview")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 95;BA.debugLine="CallSub2(target, event & \"_preview\", Data)";
Debug.ShouldStop(1073741824);
cameraexclass.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target")),(Object)(RemoteObject.concat(__ref.getField(true,"_event"),RemoteObject.createImmutable("_preview"))),(Object)((_data)));
 };
 BA.debugLineNum = 97;BA.debugLine="End Sub";
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
public static RemoteObject  _camera_ready(RemoteObject __ref,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("Camera_Ready (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("camera_ready")) return __ref.runUserSub(false, "cameraexclass","camera_ready", __ref, _success);
Debug.locals.put("Success", _success);
 BA.debugLineNum = 80;BA.debugLine="Private Sub Camera_Ready (Success As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="If Success Then";
Debug.ShouldStop(65536);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 82;BA.debugLine="r.target = cam";
Debug.ShouldStop(131072);
__ref.getField(false,"_r").setField ("Target",(__ref.getField(false,"_cam")));
 BA.debugLineNum = 83;BA.debugLine="nativeCam = r.GetField(\"camera\")";
Debug.ShouldStop(262144);
__ref.setField ("_nativecam",__ref.getField(false,"_r").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("camera"))));
 BA.debugLineNum = 84;BA.debugLine="r.target = nativeCam";
Debug.ShouldStop(524288);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_nativecam"));
 BA.debugLineNum = 85;BA.debugLine="parameters = r.RunMethod(\"getParameters\")";
Debug.ShouldStop(1048576);
__ref.setField ("_parameters",__ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getParameters"))));
 BA.debugLineNum = 86;BA.debugLine="SetDisplayOrientation";
Debug.ShouldStop(2097152);
__ref.runClassMethod (com.olympiacircuits.cameraexclass.class, "_setdisplayorientation");
 }else {
 BA.debugLineNum = 88;BA.debugLine="Log(\"success = false, \" & LastException)";
Debug.ShouldStop(8388608);
cameraexclass.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("success = false, "),cameraexclass.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 };
 BA.debugLineNum = 90;BA.debugLine="CallSub2(target, event & \"_ready\", Success)";
Debug.ShouldStop(33554432);
cameraexclass.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target")),(Object)(RemoteObject.concat(__ref.getField(true,"_event"),RemoteObject.createImmutable("_ready"))),(Object)((_success)));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private nativeCam As Object";
cameraexclass._nativecam = RemoteObject.createNew ("Object");__ref.setField("_nativecam",cameraexclass._nativecam);
 //BA.debugLineNum = 8;BA.debugLine="Private cam As Camera";
cameraexclass._cam = RemoteObject.createNew ("anywheresoftware.b4a.objects.CameraW");__ref.setField("_cam",cameraexclass._cam);
 //BA.debugLineNum = 9;BA.debugLine="Private r As Reflector";
cameraexclass._r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");__ref.setField("_r",cameraexclass._r);
 //BA.debugLineNum = 10;BA.debugLine="Private target As Object";
cameraexclass._target = RemoteObject.createNew ("Object");__ref.setField("_target",cameraexclass._target);
 //BA.debugLineNum = 11;BA.debugLine="Private event As String";
cameraexclass._event = RemoteObject.createImmutable("");__ref.setField("_event",cameraexclass._event);
 //BA.debugLineNum = 12;BA.debugLine="Public Front As Boolean";
cameraexclass._front = RemoteObject.createImmutable(false);__ref.setField("_front",cameraexclass._front);
 //BA.debugLineNum = 13;BA.debugLine="Type CameraInfoAndId (CameraInfo As Object, Id As";
;
 //BA.debugLineNum = 14;BA.debugLine="Type CameraSize (Width As Int, Height As Int)";
;
 //BA.debugLineNum = 15;BA.debugLine="Private parameters As Object";
cameraexclass._parameters = RemoteObject.createNew ("Object");__ref.setField("_parameters",cameraexclass._parameters);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _closenow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CloseNow (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,263);
if (RapidSub.canDelegate("closenow")) return __ref.runUserSub(false, "cameraexclass","closenow", __ref);
 BA.debugLineNum = 263;BA.debugLine="Public Sub CloseNow";
Debug.ShouldStop(64);
 BA.debugLineNum = 264;BA.debugLine="cam.Release";
Debug.ShouldStop(128);
__ref.getField(false,"_cam").runVoidMethod ("Release");
 BA.debugLineNum = 265;BA.debugLine="r.target = cam";
Debug.ShouldStop(256);
__ref.getField(false,"_r").setField ("Target",(__ref.getField(false,"_cam")));
 BA.debugLineNum = 266;BA.debugLine="r.RunMethod2(\"releaseCameras\", True, \"java.lang.b";
Debug.ShouldStop(512);
__ref.getField(false,"_r").runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("releaseCameras")),(Object)(BA.ObjectToString(cameraexclass.__c.getField(true,"True"))),(Object)(RemoteObject.createImmutable("java.lang.boolean")));
 BA.debugLineNum = 267;BA.debugLine="End Sub";
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
public static RemoteObject  _commitparameters(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CommitParameters (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("commitparameters")) return __ref.runUserSub(false, "cameraexclass","commitparameters", __ref);
 BA.debugLineNum = 135;BA.debugLine="Public Sub CommitParameters";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 137;BA.debugLine="r.target = nativeCam";
Debug.ShouldStop(256);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_nativecam"));
 BA.debugLineNum = 138;BA.debugLine="r.RunMethod4(\"setParameters\", Array As Object(pa";
Debug.ShouldStop(512);
__ref.getField(false,"_r").runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setParameters")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.getField(false,"_parameters")})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.hardware.Camera$Parameters")})));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e119) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e119.toString()); BA.debugLineNum = 140;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
cameraexclass.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(cameraexclass.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 };
 BA.debugLineNum = 142;BA.debugLine="End Sub";
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
public static RemoteObject  _findcamera(RemoteObject __ref,RemoteObject _frontcamera) throws Exception{
try {
		Debug.PushSubsStack("FindCamera (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("findcamera")) return __ref.runUserSub(false, "cameraexclass","findcamera", __ref, _frontcamera);
RemoteObject _ci = RemoteObject.declareNull("com.olympiacircuits.cameraexclass._camerainfoandid");
RemoteObject _camerainfo = RemoteObject.declareNull("Object");
RemoteObject _cameravalue = RemoteObject.createImmutable(0);
RemoteObject _numberofcameras = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("frontCamera", _frontcamera);
 BA.debugLineNum = 34;BA.debugLine="Private Sub FindCamera (frontCamera As Boolean) As";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="Dim ci As CameraInfoAndId";
Debug.ShouldStop(4);
_ci = RemoteObject.createNew ("com.olympiacircuits.cameraexclass._camerainfoandid");Debug.locals.put("ci", _ci);
 BA.debugLineNum = 36;BA.debugLine="Dim cameraInfo As Object";
Debug.ShouldStop(8);
_camerainfo = RemoteObject.createNew ("Object");Debug.locals.put("cameraInfo", _camerainfo);
 BA.debugLineNum = 37;BA.debugLine="Dim cameraValue As Int";
Debug.ShouldStop(16);
_cameravalue = RemoteObject.createImmutable(0);Debug.locals.put("cameraValue", _cameravalue);
 BA.debugLineNum = 38;BA.debugLine="If frontCamera Then cameraValue = 1 Else cameraVa";
Debug.ShouldStop(32);
if (_frontcamera.<Boolean>get().booleanValue()) { 
_cameravalue = BA.numberCast(int.class, 1);Debug.locals.put("cameraValue", _cameravalue);}
else {
_cameravalue = BA.numberCast(int.class, 0);Debug.locals.put("cameraValue", _cameravalue);};
 BA.debugLineNum = 39;BA.debugLine="cameraInfo = r.CreateObject(\"android.hardware.Cam";
Debug.ShouldStop(64);
_camerainfo = __ref.getField(false,"_r").runMethod(false,"CreateObject",(Object)(RemoteObject.createImmutable("android.hardware.Camera$CameraInfo")));Debug.locals.put("cameraInfo", _camerainfo);
 BA.debugLineNum = 40;BA.debugLine="Dim numberOfCameras As Int = r.RunStaticMethod(\"a";
Debug.ShouldStop(128);
_numberofcameras = BA.numberCast(int.class, __ref.getField(false,"_r").runMethod(false,"RunStaticMethod",(Object)(BA.ObjectToString("android.hardware.Camera")),(Object)(BA.ObjectToString("getNumberOfCameras")),(Object)((cameraexclass.__c.getField(false,"Null"))),(Object)((cameraexclass.__c.getField(false,"Null")))));Debug.locals.put("numberOfCameras", _numberofcameras);Debug.locals.put("numberOfCameras", _numberofcameras);
 BA.debugLineNum = 41;BA.debugLine="For i = 0 To numberOfCameras - 1";
Debug.ShouldStop(256);
{
final int step33 = 1;
final int limit33 = RemoteObject.solve(new RemoteObject[] {_numberofcameras,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33); _i = ((int)(0 + _i + step33))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 42;BA.debugLine="r.RunStaticMethod(\"android.hardware.Camera\", \"ge";
Debug.ShouldStop(512);
__ref.getField(false,"_r").runVoidMethod ("RunStaticMethod",(Object)(BA.ObjectToString("android.hardware.Camera")),(Object)(BA.ObjectToString("getCameraInfo")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable((_i)),_camerainfo})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("android.hardware.Camera$CameraInfo")})));
 BA.debugLineNum = 44;BA.debugLine="r.target = cameraInfo";
Debug.ShouldStop(2048);
__ref.getField(false,"_r").setField ("Target",_camerainfo);
 BA.debugLineNum = 45;BA.debugLine="If r.GetField(\"facing\") = cameraValue Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_r").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("facing"))),(_cameravalue))) { 
 BA.debugLineNum = 46;BA.debugLine="ci.cameraInfo = r.target";
Debug.ShouldStop(8192);
_ci.setField ("CameraInfo",__ref.getField(false,"_r").getField(false,"Target"));
 BA.debugLineNum = 47;BA.debugLine="ci.Id = i";
Debug.ShouldStop(16384);
_ci.setField ("Id",BA.numberCast(int.class, _i));
 BA.debugLineNum = 48;BA.debugLine="Return ci";
Debug.ShouldStop(32768);
if (true) return _ci;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 51;BA.debugLine="ci.id = -1";
Debug.ShouldStop(262144);
_ci.setField ("Id",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 52;BA.debugLine="Return ci";
Debug.ShouldStop(524288);
if (true) return _ci;
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _focusandtakepicture(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FocusAndTakePicture (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("focusandtakepicture")) return __ref.runUserSub(false, "cameraexclass","focusandtakepicture", __ref);
 BA.debugLineNum = 269;BA.debugLine="Public Sub FocusAndTakePicture";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="cam.AutoFocus";
Debug.ShouldStop(8192);
__ref.getField(false,"_cam").runVoidMethod ("AutoFocus");
 BA.debugLineNum = 271;BA.debugLine="End Sub";
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
public static RemoteObject  _getcoloreffect(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetColorEffect (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("getcoloreffect")) return __ref.runUserSub(false, "cameraexclass","getcoloreffect", __ref);
 BA.debugLineNum = 144;BA.debugLine="Public Sub GetColorEffect As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="Return GetParameter(\"effect\")";
Debug.ShouldStop(65536);
if (true) return __ref.runClassMethod (com.olympiacircuits.cameraexclass.class, "_getparameter",(Object)(RemoteObject.createImmutable("effect")));
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getflashmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetFlashMode (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("getflashmode")) return __ref.runUserSub(false, "cameraexclass","getflashmode", __ref);
 BA.debugLineNum = 179;BA.debugLine="Public Sub GetFlashMode As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="r.target = parameters";
Debug.ShouldStop(524288);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 181;BA.debugLine="Return r.RunMethod(\"getFlashMode\")";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToString(__ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getFlashMode"))));
 BA.debugLineNum = 182;BA.debugLine="End Sub";
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
public static RemoteObject  _getfocusdistances(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetFocusDistances (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,255);
if (RapidSub.canDelegate("getfocusdistances")) return __ref.runUserSub(false, "cameraexclass","getfocusdistances", __ref);
RemoteObject _f = null;
 BA.debugLineNum = 255;BA.debugLine="Public Sub GetFocusDistances As Float()";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 256;BA.debugLine="Dim F(3) As Float";
Debug.ShouldStop(-2147483648);
_f = RemoteObject.createNewArray ("float", new int[] {3}, new Object[]{});Debug.locals.put("F", _f);
 BA.debugLineNum = 257;BA.debugLine="r.target = parameters";
Debug.ShouldStop(1);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 258;BA.debugLine="r.RunMethod4(\"getFocusDistances\", Array As Object";
Debug.ShouldStop(2);
__ref.getField(false,"_r").runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("getFocusDistances")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_f)})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("[F")})));
 BA.debugLineNum = 259;BA.debugLine="Return F";
Debug.ShouldStop(4);
if (true) return _f;
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getparameter(RemoteObject __ref,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetParameter (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("getparameter")) return __ref.runUserSub(false, "cameraexclass","getparameter", __ref, _key);
Debug.locals.put("Key", _key);
 BA.debugLineNum = 130;BA.debugLine="Public Sub GetParameter(Key As String) As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="r.target = parameters";
Debug.ShouldStop(4);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 132;BA.debugLine="Return r.RunMethod2(\"get\", Key, \"java.lang.String";
Debug.ShouldStop(8);
if (true) return BA.ObjectToString(__ref.getField(false,"_r").runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("get")),(Object)(_key),(Object)(RemoteObject.createImmutable("java.lang.String"))));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
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
public static RemoteObject  _getpicturesize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPictureSize (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("getpicturesize")) return __ref.runUserSub(false, "cameraexclass","getpicturesize", __ref);
RemoteObject _cs = RemoteObject.declareNull("com.olympiacircuits.cameraexclass._camerasize");
 BA.debugLineNum = 203;BA.debugLine="Public Sub GetPictureSize As CameraSize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="r.target = parameters";
Debug.ShouldStop(2048);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 205;BA.debugLine="r.target = r.RunMethod(\"getPictureSize\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPictureSize"))));
 BA.debugLineNum = 206;BA.debugLine="Dim cs As CameraSize";
Debug.ShouldStop(8192);
_cs = RemoteObject.createNew ("com.olympiacircuits.cameraexclass._camerasize");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 207;BA.debugLine="cs.Width = r.GetField(\"width\")";
Debug.ShouldStop(16384);
_cs.setField ("Width",BA.numberCast(int.class, __ref.getField(false,"_r").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width")))));
 BA.debugLineNum = 208;BA.debugLine="cs.Height = r.GetField(\"height\")";
Debug.ShouldStop(32768);
_cs.setField ("Height",BA.numberCast(int.class, __ref.getField(false,"_r").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height")))));
 BA.debugLineNum = 209;BA.debugLine="Return cs";
Debug.ShouldStop(65536);
if (true) return _cs;
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpreviewsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPreviewSize (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("getpreviewsize")) return __ref.runUserSub(false, "cameraexclass","getpreviewsize", __ref);
RemoteObject _cs = RemoteObject.declareNull("com.olympiacircuits.cameraexclass._camerasize");
 BA.debugLineNum = 194;BA.debugLine="Public Sub GetPreviewSize As CameraSize";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="r.target = parameters";
Debug.ShouldStop(4);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 196;BA.debugLine="r.target = r.RunMethod(\"getPreviewSize\")";
Debug.ShouldStop(8);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPreviewSize"))));
 BA.debugLineNum = 197;BA.debugLine="Dim cs As CameraSize";
Debug.ShouldStop(16);
_cs = RemoteObject.createNew ("com.olympiacircuits.cameraexclass._camerasize");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 198;BA.debugLine="cs.Width = r.GetField(\"width\")";
Debug.ShouldStop(32);
_cs.setField ("Width",BA.numberCast(int.class, __ref.getField(false,"_r").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width")))));
 BA.debugLineNum = 199;BA.debugLine="cs.Height = r.GetField(\"height\")";
Debug.ShouldStop(64);
_cs.setField ("Height",BA.numberCast(int.class, __ref.getField(false,"_r").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height")))));
 BA.debugLineNum = 200;BA.debugLine="Return cs";
Debug.ShouldStop(128);
if (true) return _cs;
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedcoloreffects(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedColorEffects (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,189);
if (RapidSub.canDelegate("getsupportedcoloreffects")) return __ref.runUserSub(false, "cameraexclass","getsupportedcoloreffects", __ref);
 BA.debugLineNum = 189;BA.debugLine="Public Sub GetSupportedColorEffects As List";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="r.target = parameters";
Debug.ShouldStop(536870912);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 191;BA.debugLine="Return r.RunMethod(\"getSupportedColorEffects\")";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedColorEffects"))));
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedflashmodes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedFlashModes (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("getsupportedflashmodes")) return __ref.runUserSub(false, "cameraexclass","getsupportedflashmodes", __ref);
 BA.debugLineNum = 184;BA.debugLine="Public Sub GetSupportedFlashModes As List";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="r.target = parameters";
Debug.ShouldStop(16777216);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 186;BA.debugLine="Return r.RunMethod(\"getSupportedFlashModes\")";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedFlashModes"))));
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedfocusmodes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedFocusModes (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("getsupportedfocusmodes")) return __ref.runUserSub(false, "cameraexclass","getsupportedfocusmodes", __ref);
 BA.debugLineNum = 234;BA.debugLine="Public Sub GetSupportedFocusModes As List";
Debug.ShouldStop(512);
 BA.debugLineNum = 235;BA.debugLine="r.target = parameters";
Debug.ShouldStop(1024);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 236;BA.debugLine="Return r.RunMethod(\"getSupportedFocusModes\")";
Debug.ShouldStop(2048);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), __ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedFocusModes"))));
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsupportedpicturessizes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSupportedPicturesSizes (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("getsupportedpicturessizes")) return __ref.runUserSub(false, "cameraexclass","getsupportedpicturessizes", __ref);
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cs = null;
int _i = 0;
 BA.debugLineNum = 152;BA.debugLine="Public Sub GetSupportedPicturesSizes As CameraSize";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="r.target = parameters";
Debug.ShouldStop(16777216);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 154;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPict";
Debug.ShouldStop(33554432);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_list1.setObject(__ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSupportedPictureSizes"))));Debug.locals.put("list1", _list1);
 BA.debugLineNum = 155;BA.debugLine="Dim cs(list1.Size) As CameraSize";
Debug.ShouldStop(67108864);
_cs = RemoteObject.createNewArray ("com.olympiacircuits.cameraexclass._camerasize", new int[] {_list1.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("cs", _cs);
 BA.debugLineNum = 156;BA.debugLine="For i = 0 To list1.Size - 1";
Debug.ShouldStop(134217728);
{
final int step132 = 1;
final int limit132 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0; (step132 > 0 && _i <= limit132) || (step132 < 0 && _i >= limit132); _i = ((int)(0 + _i + step132))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 157;BA.debugLine="r.target = list1.Get(i)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_r").setField ("Target",_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 158;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
Debug.ShouldStop(536870912);
_cs.getArrayElement(false,BA.numberCast(int.class, _i)).setField ("Width",BA.numberCast(int.class, __ref.getField(false,"_r").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width")))));
 BA.debugLineNum = 159;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
Debug.ShouldStop(1073741824);
_cs.getArrayElement(false,BA.numberCast(int.class, _i)).setField ("Height",BA.numberCast(int.class, __ref.getField(false,"_r").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 161;BA.debugLine="Return cs";
Debug.ShouldStop(1);
if (true) return _cs;
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _panel1,RemoteObject _frontcamera,RemoteObject _targetmodule,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "cameraexclass","initialize", __ref, _ba, _panel1, _frontcamera, _targetmodule, _eventname);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("Panel1", _panel1);
Debug.locals.put("FrontCamera", _frontcamera);
Debug.locals.put("TargetModule", _targetmodule);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize (Panel1 As Panel, FrontCamer";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="target = TargetModule";
Debug.ShouldStop(262144);
__ref.setField ("_target",_targetmodule);
 BA.debugLineNum = 20;BA.debugLine="event = EventName";
Debug.ShouldStop(524288);
__ref.setField ("_event",_eventname);
 BA.debugLineNum = 21;BA.debugLine="Front = FrontCamera";
Debug.ShouldStop(1048576);
__ref.setField ("_front",_frontcamera);
 BA.debugLineNum = 22;BA.debugLine="Dim id As Int";
Debug.ShouldStop(2097152);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 23;BA.debugLine="id = FindCamera(Front).id";
Debug.ShouldStop(4194304);
_id = __ref.runClassMethod (com.olympiacircuits.cameraexclass.class, "_findcamera",(Object)(__ref.getField(true,"_front"))).getField(true,"Id");Debug.locals.put("id", _id);
 BA.debugLineNum = 24;BA.debugLine="If id = -1 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_id,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 25;BA.debugLine="Front = Not(Front) 'try different camera";
Debug.ShouldStop(16777216);
__ref.setField ("_front",cameraexclass.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_front"))));
 BA.debugLineNum = 26;BA.debugLine="id = FindCamera(Front).id";
Debug.ShouldStop(33554432);
_id = __ref.runClassMethod (com.olympiacircuits.cameraexclass.class, "_findcamera",(Object)(__ref.getField(true,"_front"))).getField(true,"Id");Debug.locals.put("id", _id);
 BA.debugLineNum = 27;BA.debugLine="If id = -1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_id,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 28;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 31;BA.debugLine="cam.Initialize2(Panel1, \"camera\", id)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_cam").runVoidMethod ("Initialize2",__ref.getField(false, "ba"),(Object)((_panel1.getObject())),(Object)(BA.ObjectToString("camera")),(Object)(_id));
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
public static RemoteObject  _previewimagetojpeg(RemoteObject __ref,RemoteObject _data,RemoteObject _quality) throws Exception{
try {
		Debug.PushSubsStack("PreviewImageToJpeg (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,214);
if (RapidSub.canDelegate("previewimagetojpeg")) return __ref.runUserSub(false, "cameraexclass","previewimagetojpeg", __ref, _data, _quality);
RemoteObject _size = RemoteObject.declareNull("Object");
RemoteObject _previewformat = RemoteObject.declareNull("Object");
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _yuvimage = RemoteObject.declareNull("Object");
RemoteObject _rect1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("data", _data);
Debug.locals.put("quality", _quality);
 BA.debugLineNum = 214;BA.debugLine="Public Sub PreviewImageToJpeg(data() As Byte, qual";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 215;BA.debugLine="Dim size, previewFormat As Object";
Debug.ShouldStop(4194304);
_size = RemoteObject.createNew ("Object");Debug.locals.put("size", _size);
_previewformat = RemoteObject.createNew ("Object");Debug.locals.put("previewFormat", _previewformat);
 BA.debugLineNum = 216;BA.debugLine="r.target = parameters";
Debug.ShouldStop(8388608);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 217;BA.debugLine="size = r.RunMethod(\"getPreviewSize\")";
Debug.ShouldStop(16777216);
_size = __ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPreviewSize")));Debug.locals.put("size", _size);
 BA.debugLineNum = 218;BA.debugLine="previewFormat = r.RunMethod(\"getPreviewFormat\")";
Debug.ShouldStop(33554432);
_previewformat = __ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPreviewFormat")));Debug.locals.put("previewFormat", _previewformat);
 BA.debugLineNum = 219;BA.debugLine="r.target = size";
Debug.ShouldStop(67108864);
__ref.getField(false,"_r").setField ("Target",_size);
 BA.debugLineNum = 220;BA.debugLine="Dim width = r.GetField(\"width\"), height = r.GetFi";
Debug.ShouldStop(134217728);
_width = BA.numberCast(int.class, __ref.getField(false,"_r").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("width"))));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
_height = BA.numberCast(int.class, __ref.getField(false,"_r").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("height"))));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 221;BA.debugLine="Dim yuvImage As Object = r.CreateObject2(\"android";
Debug.ShouldStop(268435456);
_yuvimage = __ref.getField(false,"_r").runMethod(false,"CreateObject2",(Object)(BA.ObjectToString("android.graphics.YuvImage")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_data),_previewformat,(_width),(_height),cameraexclass.__c.getField(false,"Null")})),(Object)(RemoteObject.createNewArray("String",new int[] {5},new Object[] {BA.ObjectToString("[B"),BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("[I")})));Debug.locals.put("yuvImage", _yuvimage);Debug.locals.put("yuvImage", _yuvimage);
 BA.debugLineNum = 224;BA.debugLine="r.target = yuvImage";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_r").setField ("Target",_yuvimage);
 BA.debugLineNum = 225;BA.debugLine="Dim rect1 As Rect";
Debug.ShouldStop(1);
_rect1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("rect1", _rect1);
 BA.debugLineNum = 226;BA.debugLine="rect1.Initialize(0, 0, r.RunMethod(\"getWidth\"), r";
Debug.ShouldStop(2);
_rect1.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getWidth"))))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getHeight"))))));
 BA.debugLineNum = 227;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(4);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 228;BA.debugLine="out.InitializeToBytesArray(100)";
Debug.ShouldStop(8);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 100)));
 BA.debugLineNum = 229;BA.debugLine="r.RunMethod4(\"compressToJpeg\", Array As Object(re";
Debug.ShouldStop(16);
__ref.getField(false,"_r").runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("compressToJpeg")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_rect1.getObject()),(_quality),(_out.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("android.graphics.Rect"),BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.io.OutputStream")})));
 BA.debugLineNum = 231;BA.debugLine="Return out.ToBytesArray";
Debug.ShouldStop(64);
if (true) return _out.runMethod(false,"ToBytesArray");
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _release(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Release (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("release")) return __ref.runUserSub(false, "cameraexclass","release", __ref);
 BA.debugLineNum = 114;BA.debugLine="Public Sub Release";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="cam.Release";
Debug.ShouldStop(262144);
__ref.getField(false,"_cam").runVoidMethod ("Release");
 BA.debugLineNum = 116;BA.debugLine="End Sub";
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
public static RemoteObject  _savepicturetofile(RemoteObject __ref,RemoteObject _data,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SavePictureToFile (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("savepicturetofile")) return __ref.runUserSub(false, "cameraexclass","savepicturetofile", __ref, _data, _dir, _filename);
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Data", _data);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 119;BA.debugLine="Public Sub SavePictureToFile(Data() As Byte, Dir A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
Debug.ShouldStop(8388608);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = cameraexclass.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_dir),(Object)(_filename),(Object)(cameraexclass.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 121;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
Debug.ShouldStop(16777216);
_out.runVoidMethod ("WriteBytes",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 BA.debugLineNum = 122;BA.debugLine="out.Close";
Debug.ShouldStop(33554432);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcoloreffect(RemoteObject __ref,RemoteObject _effect) throws Exception{
try {
		Debug.PushSubsStack("SetColorEffect (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("setcoloreffect")) return __ref.runUserSub(false, "cameraexclass","setcoloreffect", __ref, _effect);
Debug.locals.put("Effect", _effect);
 BA.debugLineNum = 148;BA.debugLine="Public Sub SetColorEffect(Effect As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 149;BA.debugLine="SetParameter(\"effect\", Effect)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (com.olympiacircuits.cameraexclass.class, "_setparameter",(Object)(BA.ObjectToString("effect")),(Object)(_effect));
 BA.debugLineNum = 150;BA.debugLine="End Sub";
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
public static RemoteObject  _setcontinuousautofocus(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetContinuousAutoFocus (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("setcontinuousautofocus")) return __ref.runUserSub(false, "cameraexclass","setcontinuousautofocus", __ref);
RemoteObject _modes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 239;BA.debugLine="Public Sub SetContinuousAutoFocus";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="Dim modes As List = GetSupportedFocusModes";
Debug.ShouldStop(32768);
_modes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_modes = __ref.runClassMethod (com.olympiacircuits.cameraexclass.class, "_getsupportedfocusmodes");Debug.locals.put("modes", _modes);Debug.locals.put("modes", _modes);
 BA.debugLineNum = 241;BA.debugLine="If modes.IndexOf(\"continuous-picture\") > -1 Th";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_modes.runMethod(true,"IndexOf",(Object)((RemoteObject.createImmutable("continuous-picture")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 242;BA.debugLine="SetFocusMode(\"continuous-picture\")";
Debug.ShouldStop(131072);
__ref.runClassMethod (com.olympiacircuits.cameraexclass.class, "_setfocusmode",(Object)(RemoteObject.createImmutable("continuous-picture")));
 }else 
{ BA.debugLineNum = 243;BA.debugLine="Else If modes.IndexOf(\"continuous-video\") > -1";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_modes.runMethod(true,"IndexOf",(Object)((RemoteObject.createImmutable("continuous-video")))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 244;BA.debugLine="SetFocusMode(\"continuous-video\")";
Debug.ShouldStop(524288);
__ref.runClassMethod (com.olympiacircuits.cameraexclass.class, "_setfocusmode",(Object)(RemoteObject.createImmutable("continuous-video")));
 }else {
 BA.debugLineNum = 246;BA.debugLine="Log(\"Continuous focus mode is not availabl";
Debug.ShouldStop(2097152);
cameraexclass.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Continuous focus mode is not available")));
 }};
 BA.debugLineNum = 248;BA.debugLine="End Sub";
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
public static RemoteObject  _setdisplayorientation(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetDisplayOrientation (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setdisplayorientation")) return __ref.runUserSub(false, "cameraexclass","setdisplayorientation", __ref);
RemoteObject _previewresult = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _degrees = RemoteObject.createImmutable(0);
RemoteObject _ci = RemoteObject.declareNull("com.olympiacircuits.cameraexclass._camerainfoandid");
RemoteObject _orientation = RemoteObject.createImmutable(0);
 BA.debugLineNum = 55;BA.debugLine="Private Sub SetDisplayOrientation";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="r.target = r.GetActivity";
Debug.ShouldStop(8388608);
__ref.getField(false,"_r").setField ("Target",(__ref.getField(false,"_r").runMethod(false,"GetActivity",__ref.getField(false, "ba"))));
 BA.debugLineNum = 57;BA.debugLine="r.target = r.RunMethod(\"getWindowManager\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getWindowManager"))));
 BA.debugLineNum = 58;BA.debugLine="r.target = r.RunMethod(\"getDefaultDisplay\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getDefaultDisplay"))));
 BA.debugLineNum = 59;BA.debugLine="r.target = r.RunMethod(\"getRotation\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_r").runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getRotation"))));
 BA.debugLineNum = 60;BA.debugLine="Dim previewResult, result, degrees As Int = r.tar";
Debug.ShouldStop(134217728);
_previewresult = RemoteObject.createImmutable(0);Debug.locals.put("previewResult", _previewresult);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
_degrees = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_r").getField(false,"Target")),RemoteObject.createImmutable(90)}, "*",0, 0));Debug.locals.put("degrees", _degrees);Debug.locals.put("degrees", _degrees);
 BA.debugLineNum = 61;BA.debugLine="Dim ci As CameraInfoAndId = FindCamera(Front)";
Debug.ShouldStop(268435456);
_ci = __ref.runClassMethod (com.olympiacircuits.cameraexclass.class, "_findcamera",(Object)(__ref.getField(true,"_front")));Debug.locals.put("ci", _ci);Debug.locals.put("ci", _ci);
 BA.debugLineNum = 62;BA.debugLine="r.target = ci.CameraInfo";
Debug.ShouldStop(536870912);
__ref.getField(false,"_r").setField ("Target",_ci.getField(false,"CameraInfo"));
 BA.debugLineNum = 63;BA.debugLine="Dim orientation As Int = r.GetField(\"orientation\"";
Debug.ShouldStop(1073741824);
_orientation = BA.numberCast(int.class, __ref.getField(false,"_r").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("orientation"))));Debug.locals.put("orientation", _orientation);Debug.locals.put("orientation", _orientation);
 BA.debugLineNum = 64;BA.debugLine="If Front Then";
Debug.ShouldStop(-2147483648);
if (__ref.getField(true,"_front").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 65;BA.debugLine="previewResult = (orientation + degrees) Mod 360";
Debug.ShouldStop(1);
_previewresult = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_orientation,_degrees}, "+",1, 1)),RemoteObject.createImmutable(360)}, "%",0, 1);Debug.locals.put("previewResult", _previewresult);
 BA.debugLineNum = 66;BA.debugLine="result = previewResult";
Debug.ShouldStop(2);
_result = _previewresult;Debug.locals.put("result", _result);
 BA.debugLineNum = 67;BA.debugLine="previewResult = (360 - previewResult) Mod 360";
Debug.ShouldStop(4);
_previewresult = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_previewresult}, "-",1, 1)),RemoteObject.createImmutable(360)}, "%",0, 1);Debug.locals.put("previewResult", _previewresult);
 }else {
 BA.debugLineNum = 69;BA.debugLine="previewResult = (orientation - degrees + 360) Mo";
Debug.ShouldStop(16);
_previewresult = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_orientation,_degrees,RemoteObject.createImmutable(360)}, "-+",2, 1)),RemoteObject.createImmutable(360)}, "%",0, 1);Debug.locals.put("previewResult", _previewresult);
 BA.debugLineNum = 70;BA.debugLine="result = previewResult";
Debug.ShouldStop(32);
_result = _previewresult;Debug.locals.put("result", _result);
 BA.debugLineNum = 71;BA.debugLine="Log(previewResult)";
Debug.ShouldStop(64);
cameraexclass.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_previewresult)));
 };
 BA.debugLineNum = 73;BA.debugLine="r.target = nativeCam";
Debug.ShouldStop(256);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_nativecam"));
 BA.debugLineNum = 74;BA.debugLine="r.RunMethod2(\"setDisplayOrientation\", previewResu";
Debug.ShouldStop(512);
__ref.getField(false,"_r").runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDisplayOrientation")),(Object)(BA.NumberToString(_previewresult)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 75;BA.debugLine="r.target = parameters";
Debug.ShouldStop(1024);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 76;BA.debugLine="r.RunMethod2(\"setRotation\", result, \"java.lang.in";
Debug.ShouldStop(2048);
__ref.getField(false,"_r").runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setRotation")),(Object)(BA.NumberToString(_result)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 77;BA.debugLine="CommitParameters";
Debug.ShouldStop(4096);
__ref.runClassMethod (com.olympiacircuits.cameraexclass.class, "_commitparameters");
 BA.debugLineNum = 78;BA.debugLine="End Sub";
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
public static RemoteObject  _setflashmode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("SetFlashMode (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("setflashmode")) return __ref.runUserSub(false, "cameraexclass","setflashmode", __ref, _mode);
Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 174;BA.debugLine="Public Sub SetFlashMode(Mode As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="r.target = parameters";
Debug.ShouldStop(16384);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 176;BA.debugLine="r.RunMethod2(\"setFlashMode\", Mode, \"java.lang.Str";
Debug.ShouldStop(32768);
__ref.getField(false,"_r").runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setFlashMode")),(Object)(_mode),(Object)(RemoteObject.createImmutable("java.lang.String")));
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfocusmode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("SetFocusMode (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,250);
if (RapidSub.canDelegate("setfocusmode")) return __ref.runUserSub(false, "cameraexclass","setfocusmode", __ref, _mode);
Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 250;BA.debugLine="Public Sub SetFocusMode(Mode As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="r.target = parameters";
Debug.ShouldStop(67108864);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 252;BA.debugLine="r.RunMethod2(\"setFocusMode\", Mode, \"java.lang.";
Debug.ShouldStop(134217728);
__ref.getField(false,"_r").runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setFocusMode")),(Object)(_mode),(Object)(RemoteObject.createImmutable("java.lang.String")));
 BA.debugLineNum = 253;BA.debugLine="End Sub";
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
public static RemoteObject  _setjpegquality(RemoteObject __ref,RemoteObject _quality) throws Exception{
try {
		Debug.PushSubsStack("SetJpegQuality (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("setjpegquality")) return __ref.runUserSub(false, "cameraexclass","setjpegquality", __ref, _quality);
Debug.locals.put("Quality", _quality);
 BA.debugLineNum = 169;BA.debugLine="Public Sub SetJpegQuality(Quality As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="r.target = parameters";
Debug.ShouldStop(512);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 171;BA.debugLine="r.RunMethod2(\"setJpegQuality\", Quality, \"java.lan";
Debug.ShouldStop(1024);
__ref.getField(false,"_r").runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setJpegQuality")),(Object)(BA.NumberToString(_quality)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 172;BA.debugLine="End Sub";
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
public static RemoteObject  _setparameter(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetParameter (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("setparameter")) return __ref.runUserSub(false, "cameraexclass","setparameter", __ref, _key, _value);
Debug.locals.put("Key", _key);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 125;BA.debugLine="Public Sub SetParameter(Key As String, Value As St";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="r.target = parameters";
Debug.ShouldStop(536870912);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 127;BA.debugLine="r.RunMethod3(\"set\", Key, \"java.lang.String\", Valu";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_r").runVoidMethod ("RunMethod3",(Object)(BA.ObjectToString("set")),(Object)(_key),(Object)(BA.ObjectToString("java.lang.String")),(Object)(_value),(Object)(RemoteObject.createImmutable("java.lang.String")));
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
public static RemoteObject  _setpicturesize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetPictureSize (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("setpicturesize")) return __ref.runUserSub(false, "cameraexclass","setpicturesize", __ref, _width, _height);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 164;BA.debugLine="Public Sub SetPictureSize(Width As Int, Height As";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="r.target = parameters";
Debug.ShouldStop(16);
__ref.getField(false,"_r").setField ("Target",__ref.getField(false,"_parameters"));
 BA.debugLineNum = 166;BA.debugLine="r.RunMethod3(\"setPictureSize\", Width, \"java.lang.";
Debug.ShouldStop(32);
__ref.getField(false,"_r").runVoidMethod ("RunMethod3",(Object)(BA.ObjectToString("setPictureSize")),(Object)(BA.NumberToString(_width)),(Object)(BA.ObjectToString("java.lang.int")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 167;BA.debugLine="End Sub";
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
public static RemoteObject  _startpreview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StartPreview (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("startpreview")) return __ref.runUserSub(false, "cameraexclass","startpreview", __ref);
 BA.debugLineNum = 106;BA.debugLine="Public Sub StartPreview";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="cam.StartPreview";
Debug.ShouldStop(1024);
__ref.getField(false,"_cam").runVoidMethod ("StartPreview");
 BA.debugLineNum = 108;BA.debugLine="End Sub";
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
public static RemoteObject  _stoppreview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopPreview (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("stoppreview")) return __ref.runUserSub(false, "cameraexclass","stoppreview", __ref);
 BA.debugLineNum = 110;BA.debugLine="Public Sub StopPreview";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="cam.StopPreview";
Debug.ShouldStop(16384);
__ref.getField(false,"_cam").runVoidMethod ("StopPreview");
 BA.debugLineNum = 112;BA.debugLine="End Sub";
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
public static RemoteObject  _takepicture(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TakePicture (cameraexclass) ","cameraexclass",9,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("takepicture")) return __ref.runUserSub(false, "cameraexclass","takepicture", __ref);
 BA.debugLineNum = 98;BA.debugLine="Public Sub TakePicture";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="cam.TakePicture";
Debug.ShouldStop(4);
__ref.getField(false,"_cam").runVoidMethod ("TakePicture");
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