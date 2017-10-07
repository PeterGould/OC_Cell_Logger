package com.olympiacircuits;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cameraexclass extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.olympiacircuits.cameraexclass");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "com.olympiacircuits.cameraexclass",
                    ba);
                return;
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _camerainfoandid{
public boolean IsInitialized;
public Object CameraInfo;
public int Id;
public void Initialize() {
IsInitialized = true;
CameraInfo = new Object();
Id = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _camerasize{
public boolean IsInitialized;
public int Width;
public int Height;
public void Initialize() {
IsInitialized = true;
Width = 0;
Height = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public Object _nativecam = null;
public anywheresoftware.b4a.objects.CameraW _cam = null;
public anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
public Object _target = null;
public String _event = "";
public boolean _front = false;
public Object _parameters = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public anywheresoftware.b4a.samples.gmailcontacts.modrequest _modrequest = null;
public anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring _svcmonitoring = null;
public com.olympiacircuits.main _main = null;
public com.olympiacircuits.bt_interact _bt_interact = null;
public com.olympiacircuits.activity_db _activity_db = null;
public com.olympiacircuits.file_manager _file_manager = null;
public com.olympiacircuits.camera_activity _camera_activity = null;
public com.olympiacircuits.main_controller _main_controller = null;
public com.olympiacircuits.setup _setup = null;
public String  _stoppreview(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub StopPreview";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="cam.StopPreview";
__ref._cam.StopPreview();
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return "";
}
public String  _release(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="cam.Release";
__ref._cam.Release();
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return "";
}
public String  _startpreview(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Public Sub StartPreview";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="cam.StartPreview";
__ref._cam.StartPreview();
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return "";
}
public String  _setpicturesize(com.olympiacircuits.cameraexclass __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub SetPictureSize(Width As Int, Height As";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="r.RunMethod3(\"setPictureSize\", Width, \"java.lang.";
__ref._r.RunMethod3("setPictureSize",BA.NumberToString(_width),"java.lang.int",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="End Sub";
return "";
}
public String  _setjpegquality(com.olympiacircuits.cameraexclass __ref,int _quality) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub SetJpegQuality(Quality As Int)";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="r.RunMethod2(\"setJpegQuality\", Quality, \"java.lan";
__ref._r.RunMethod2("setJpegQuality",BA.NumberToString(_quality),"java.lang.int");
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="End Sub";
return "";
}
public String  _commitparameters(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub CommitParameters";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Try";
try {RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="r.target = nativeCam";
__ref._r.Target = __ref._nativecam;
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="r.RunMethod4(\"setParameters\", Array As Object(pa";
__ref._r.RunMethod4("setParameters",new Object[]{__ref._parameters},new String[]{"android.hardware.Camera$Parameters"});
 } 
       catch (Exception e119) {
			ba.setLastException(e119);RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="End Sub";
return "";
}
public String  _takepicture(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Public Sub TakePicture";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="cam.TakePicture";
__ref._cam.TakePicture();
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="End Sub";
return "";
}
public String  _initialize(com.olympiacircuits.cameraexclass __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _panel1,boolean _frontcamera,Object _targetmodule,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cameraexclass";
int _id = 0;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub Initialize (Panel1 As Panel, FrontCamer";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="target = TargetModule";
__ref._target = _targetmodule;
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="event = EventName";
__ref._event = _eventname;
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="Front = FrontCamera";
__ref._front = _frontcamera;
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="id = FindCamera(Front).id";
_id = __ref._findcamera(null,__ref._front).Id;
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="Front = Not(Front) 'try different camera";
__ref._front = __c.Not(__ref._front);
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="id = FindCamera(Front).id";
_id = __ref._findcamera(null,__ref._front).Id;
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=5701645;
 //BA.debugLineNum = 5701645;BA.debugLine="cam.Initialize2(Panel1, \"camera\", id)";
__ref._cam.Initialize2(ba,(android.view.ViewGroup)(_panel1.getObject()),"camera",_id);
RDebugUtils.currentLine=5701646;
 //BA.debugLineNum = 5701646;BA.debugLine="End Sub";
return "";
}
public String  _camera_focusdone(com.olympiacircuits.cameraexclass __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub Camera_FocusDone (Success As Boolean)";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="TakePicture";
__ref._takepicture(null);
 }else {
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="Log(\"AutoFocus error.\")";
__c.Log("AutoFocus error.");
 };
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="End Sub";
return "";
}
public String  _camera_picturetaken(com.olympiacircuits.cameraexclass __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub Camera_PictureTaken (Data() As Byte)";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="CallSub2(target, event & \"_PictureTaken\", Data)";
__c.CallSubNew2(ba,__ref._target,__ref._event+"_PictureTaken",(Object)(_data));
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return "";
}
public String  _camera_preview(com.olympiacircuits.cameraexclass __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub Camera_Preview (Data() As Byte)";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="If SubExists(target, event & \"_preview\") Then";
if (__c.SubExists(ba,__ref._target,__ref._event+"_preview")) { 
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="CallSub2(target, event & \"_preview\", Data)";
__c.CallSubNew2(ba,__ref._target,__ref._event+"_preview",(Object)(_data));
 };
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="End Sub";
return "";
}
public String  _camera_ready(com.olympiacircuits.cameraexclass __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub Camera_Ready (Success As Boolean)";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="r.target = cam";
__ref._r.Target = (Object)(__ref._cam);
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="nativeCam = r.GetField(\"camera\")";
__ref._nativecam = __ref._r.GetField("camera");
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="r.target = nativeCam";
__ref._r.Target = __ref._nativecam;
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="parameters = r.RunMethod(\"getParameters\")";
__ref._parameters = __ref._r.RunMethod("getParameters");
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="SetDisplayOrientation";
__ref._setdisplayorientation(null);
 }else {
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="Log(\"success = false, \" & LastException)";
__c.Log("success = false, "+BA.ObjectToString(__c.LastException(ba)));
 };
RDebugUtils.currentLine=5898250;
 //BA.debugLineNum = 5898250;BA.debugLine="CallSub2(target, event & \"_ready\", Success)";
__c.CallSubNew2(ba,__ref._target,__ref._event+"_ready",(Object)(_success));
RDebugUtils.currentLine=5898251;
 //BA.debugLineNum = 5898251;BA.debugLine="End Sub";
return "";
}
public String  _setdisplayorientation(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
int _previewresult = 0;
int _result = 0;
int _degrees = 0;
com.olympiacircuits.cameraexclass._camerainfoandid _ci = null;
int _orientation = 0;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub SetDisplayOrientation";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="r.target = r.GetActivity";
__ref._r.Target = (Object)(__ref._r.GetActivity(ba));
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="r.target = r.RunMethod(\"getWindowManager\")";
__ref._r.Target = __ref._r.RunMethod("getWindowManager");
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="r.target = r.RunMethod(\"getDefaultDisplay\")";
__ref._r.Target = __ref._r.RunMethod("getDefaultDisplay");
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="r.target = r.RunMethod(\"getRotation\")";
__ref._r.Target = __ref._r.RunMethod("getRotation");
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="Dim previewResult, result, degrees As Int = r.tar";
_previewresult = 0;
_result = 0;
_degrees = (int) ((double)(BA.ObjectToNumber(__ref._r.Target))*90);
RDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="Dim ci As CameraInfoAndId = FindCamera(Front)";
_ci = __ref._findcamera(null,__ref._front);
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="r.target = ci.CameraInfo";
__ref._r.Target = _ci.CameraInfo;
RDebugUtils.currentLine=5832712;
 //BA.debugLineNum = 5832712;BA.debugLine="Dim orientation As Int = r.GetField(\"orientation\"";
_orientation = (int)(BA.ObjectToNumber(__ref._r.GetField("orientation")));
RDebugUtils.currentLine=5832713;
 //BA.debugLineNum = 5832713;BA.debugLine="If Front Then";
if (__ref._front) { 
RDebugUtils.currentLine=5832714;
 //BA.debugLineNum = 5832714;BA.debugLine="previewResult = (orientation + degrees) Mod 360";
_previewresult = (int) ((_orientation+_degrees)%360);
RDebugUtils.currentLine=5832715;
 //BA.debugLineNum = 5832715;BA.debugLine="result = previewResult";
_result = _previewresult;
RDebugUtils.currentLine=5832716;
 //BA.debugLineNum = 5832716;BA.debugLine="previewResult = (360 - previewResult) Mod 360";
_previewresult = (int) ((360-_previewresult)%360);
 }else {
RDebugUtils.currentLine=5832718;
 //BA.debugLineNum = 5832718;BA.debugLine="previewResult = (orientation - degrees + 360) Mo";
_previewresult = (int) ((_orientation-_degrees+360)%360);
RDebugUtils.currentLine=5832719;
 //BA.debugLineNum = 5832719;BA.debugLine="result = previewResult";
_result = _previewresult;
RDebugUtils.currentLine=5832720;
 //BA.debugLineNum = 5832720;BA.debugLine="Log(previewResult)";
__c.Log(BA.NumberToString(_previewresult));
 };
RDebugUtils.currentLine=5832722;
 //BA.debugLineNum = 5832722;BA.debugLine="r.target = nativeCam";
__ref._r.Target = __ref._nativecam;
RDebugUtils.currentLine=5832723;
 //BA.debugLineNum = 5832723;BA.debugLine="r.RunMethod2(\"setDisplayOrientation\", previewResu";
__ref._r.RunMethod2("setDisplayOrientation",BA.NumberToString(_previewresult),"java.lang.int");
RDebugUtils.currentLine=5832724;
 //BA.debugLineNum = 5832724;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=5832725;
 //BA.debugLineNum = 5832725;BA.debugLine="r.RunMethod2(\"setRotation\", result, \"java.lang.in";
__ref._r.RunMethod2("setRotation",BA.NumberToString(_result),"java.lang.int");
RDebugUtils.currentLine=5832726;
 //BA.debugLineNum = 5832726;BA.debugLine="CommitParameters";
__ref._commitparameters(null);
RDebugUtils.currentLine=5832727;
 //BA.debugLineNum = 5832727;BA.debugLine="End Sub";
return "";
}
public String  _closenow(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub CloseNow";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="cam.Release";
__ref._cam.Release();
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="r.target = cam";
__ref._r.Target = (Object)(__ref._cam);
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="r.RunMethod2(\"releaseCameras\", True, \"java.lang.b";
__ref._r.RunMethod2("releaseCameras",BA.ObjectToString(__c.True),"java.lang.boolean");
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="End Sub";
return "";
}
public com.olympiacircuits.cameraexclass._camerainfoandid  _findcamera(com.olympiacircuits.cameraexclass __ref,boolean _frontcamera) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
com.olympiacircuits.cameraexclass._camerainfoandid _ci = null;
Object _camerainfo = null;
int _cameravalue = 0;
int _numberofcameras = 0;
int _i = 0;
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub FindCamera (frontCamera As Boolean) As";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Dim ci As CameraInfoAndId";
_ci = new com.olympiacircuits.cameraexclass._camerainfoandid();
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Dim cameraInfo As Object";
_camerainfo = new Object();
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="Dim cameraValue As Int";
_cameravalue = 0;
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="If frontCamera Then cameraValue = 1 Else cameraVa";
if (_frontcamera) { 
_cameravalue = (int) (1);}
else {
_cameravalue = (int) (0);};
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="cameraInfo = r.CreateObject(\"android.hardware.Cam";
_camerainfo = __ref._r.CreateObject("android.hardware.Camera$CameraInfo");
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="Dim numberOfCameras As Int = r.RunStaticMethod(\"a";
_numberofcameras = (int)(BA.ObjectToNumber(__ref._r.RunStaticMethod("android.hardware.Camera","getNumberOfCameras",(Object[])(__c.Null),(String[])(__c.Null))));
RDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="For i = 0 To numberOfCameras - 1";
{
final int step33 = 1;
final int limit33 = (int) (_numberofcameras-1);
for (_i = (int) (0); (step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33); _i = ((int)(0 + _i + step33))) {
RDebugUtils.currentLine=5767176;
 //BA.debugLineNum = 5767176;BA.debugLine="r.RunStaticMethod(\"android.hardware.Camera\", \"ge";
__ref._r.RunStaticMethod("android.hardware.Camera","getCameraInfo",new Object[]{(Object)(_i),_camerainfo},new String[]{"java.lang.int","android.hardware.Camera$CameraInfo"});
RDebugUtils.currentLine=5767178;
 //BA.debugLineNum = 5767178;BA.debugLine="r.target = cameraInfo";
__ref._r.Target = _camerainfo;
RDebugUtils.currentLine=5767179;
 //BA.debugLineNum = 5767179;BA.debugLine="If r.GetField(\"facing\") = cameraValue Then";
if ((__ref._r.GetField("facing")).equals((Object)(_cameravalue))) { 
RDebugUtils.currentLine=5767180;
 //BA.debugLineNum = 5767180;BA.debugLine="ci.cameraInfo = r.target";
_ci.CameraInfo = __ref._r.Target;
RDebugUtils.currentLine=5767181;
 //BA.debugLineNum = 5767181;BA.debugLine="ci.Id = i";
_ci.Id = _i;
RDebugUtils.currentLine=5767182;
 //BA.debugLineNum = 5767182;BA.debugLine="Return ci";
if (true) return _ci;
 };
 }
};
RDebugUtils.currentLine=5767185;
 //BA.debugLineNum = 5767185;BA.debugLine="ci.id = -1";
_ci.Id = (int) (-1);
RDebugUtils.currentLine=5767186;
 //BA.debugLineNum = 5767186;BA.debugLine="Return ci";
if (true) return _ci;
RDebugUtils.currentLine=5767187;
 //BA.debugLineNum = 5767187;BA.debugLine="End Sub";
return null;
}
public String  _focusandtakepicture(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub FocusAndTakePicture";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="cam.AutoFocus";
__ref._cam.AutoFocus();
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return "";
}
public String  _getcoloreffect(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Public Sub GetColorEffect As String";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Return GetParameter(\"effect\")";
if (true) return __ref._getparameter(null,"effect");
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return "";
}
public String  _getparameter(com.olympiacircuits.cameraexclass __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Public Sub GetParameter(Key As String) As String";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Return r.RunMethod2(\"get\", Key, \"java.lang.String";
if (true) return BA.ObjectToString(__ref._r.RunMethod2("get",_key,"java.lang.String"));
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="End Sub";
return "";
}
public String  _getflashmode(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub GetFlashMode As String";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Return r.RunMethod(\"getFlashMode\")";
if (true) return BA.ObjectToString(__ref._r.RunMethod("getFlashMode"));
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="End Sub";
return "";
}
public float[]  _getfocusdistances(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
float[] _f = null;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub GetFocusDistances As Float()";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Dim F(3) As Float";
_f = new float[(int) (3)];
;
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="r.RunMethod4(\"getFocusDistances\", Array As Object";
__ref._r.RunMethod4("getFocusDistances",new Object[]{(Object)(_f)},new String[]{"[F"});
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="Return F";
if (true) return _f;
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="End Sub";
return null;
}
public com.olympiacircuits.cameraexclass._camerasize  _getpicturesize(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
com.olympiacircuits.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub GetPictureSize As CameraSize";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="r.target = r.RunMethod(\"getPictureSize\")";
__ref._r.Target = __ref._r.RunMethod("getPictureSize");
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="Dim cs As CameraSize";
_cs = new com.olympiacircuits.cameraexclass._camerasize();
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width = (int)(BA.ObjectToNumber(__ref._r.GetField("width")));
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height = (int)(BA.ObjectToNumber(__ref._r.GetField("height")));
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="End Sub";
return null;
}
public com.olympiacircuits.cameraexclass._camerasize  _getpreviewsize(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
com.olympiacircuits.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub GetPreviewSize As CameraSize";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="r.target = r.RunMethod(\"getPreviewSize\")";
__ref._r.Target = __ref._r.RunMethod("getPreviewSize");
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Dim cs As CameraSize";
_cs = new com.olympiacircuits.cameraexclass._camerasize();
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width = (int)(BA.ObjectToNumber(__ref._r.GetField("width")));
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height = (int)(BA.ObjectToNumber(__ref._r.GetField("height")));
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedcoloreffects(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub GetSupportedColorEffects As List";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Return r.RunMethod(\"getSupportedColorEffects\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r.RunMethod("getSupportedColorEffects")));
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedflashmodes(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub GetSupportedFlashModes As List";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Return r.RunMethod(\"getSupportedFlashModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r.RunMethod("getSupportedFlashModes")));
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedfocusmodes(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub GetSupportedFocusModes As List";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Return r.RunMethod(\"getSupportedFocusModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._r.RunMethod("getSupportedFocusModes")));
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="End Sub";
return null;
}
public com.olympiacircuits.cameraexclass._camerasize[]  _getsupportedpicturessizes(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
anywheresoftware.b4a.objects.collections.List _list1 = null;
com.olympiacircuits.cameraexclass._camerasize[] _cs = null;
int _i = 0;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub GetSupportedPicturesSizes As CameraSize";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPict";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1.setObject((java.util.List)(__ref._r.RunMethod("getSupportedPictureSizes")));
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Dim cs(list1.Size) As CameraSize";
_cs = new com.olympiacircuits.cameraexclass._camerasize[_list1.getSize()];
{
int d0 = _cs.length;
for (int i0 = 0;i0 < d0;i0++) {
_cs[i0] = new com.olympiacircuits.cameraexclass._camerasize();
}
}
;
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="For i = 0 To list1.Size - 1";
{
final int step132 = 1;
final int limit132 = (int) (_list1.getSize()-1);
for (_i = (int) (0); (step132 > 0 && _i <= limit132) || (step132 < 0 && _i >= limit132); _i = ((int)(0 + _i + step132))) {
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="r.target = list1.Get(i)";
__ref._r.Target = _list1.Get(_i);
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
_cs[_i].Width = (int)(BA.ObjectToNumber(__ref._r.GetField("width")));
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
_cs[_i].Height = (int)(BA.ObjectToNumber(__ref._r.GetField("height")));
 }
};
RDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="Return cs";
if (true) return _cs;
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="End Sub";
return null;
}
public byte[]  _previewimagetojpeg(com.olympiacircuits.cameraexclass __ref,byte[] _data,int _quality) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
Object _size = null;
Object _previewformat = null;
int _width = 0;
int _height = 0;
Object _yuvimage = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _rect1 = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub PreviewImageToJpeg(data() As Byte, qual";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Dim size, previewFormat As Object";
_size = new Object();
_previewformat = new Object();
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="size = r.RunMethod(\"getPreviewSize\")";
_size = __ref._r.RunMethod("getPreviewSize");
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="previewFormat = r.RunMethod(\"getPreviewFormat\")";
_previewformat = __ref._r.RunMethod("getPreviewFormat");
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="r.target = size";
__ref._r.Target = _size;
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="Dim width = r.GetField(\"width\"), height = r.GetFi";
_width = (int)(BA.ObjectToNumber(__ref._r.GetField("width")));
_height = (int)(BA.ObjectToNumber(__ref._r.GetField("height")));
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="Dim yuvImage As Object = r.CreateObject2(\"android";
_yuvimage = __ref._r.CreateObject2("android.graphics.YuvImage",new Object[]{(Object)(_data),_previewformat,(Object)(_width),(Object)(_height),__c.Null},new String[]{"[B","java.lang.int","java.lang.int","java.lang.int","[I"});
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="r.target = yuvImage";
__ref._r.Target = _yuvimage;
RDebugUtils.currentLine=7340043;
 //BA.debugLineNum = 7340043;BA.debugLine="Dim rect1 As Rect";
_rect1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=7340044;
 //BA.debugLineNum = 7340044;BA.debugLine="rect1.Initialize(0, 0, r.RunMethod(\"getWidth\"), r";
_rect1.Initialize((int) (0),(int) (0),(int)(BA.ObjectToNumber(__ref._r.RunMethod("getWidth"))),(int)(BA.ObjectToNumber(__ref._r.RunMethod("getHeight"))));
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=7340046;
 //BA.debugLineNum = 7340046;BA.debugLine="out.InitializeToBytesArray(100)";
_out.InitializeToBytesArray((int) (100));
RDebugUtils.currentLine=7340047;
 //BA.debugLineNum = 7340047;BA.debugLine="r.RunMethod4(\"compressToJpeg\", Array As Object(re";
__ref._r.RunMethod4("compressToJpeg",new Object[]{(Object)(_rect1.getObject()),(Object)(_quality),(Object)(_out.getObject())},new String[]{"android.graphics.Rect","java.lang.int","java.io.OutputStream"});
RDebugUtils.currentLine=7340049;
 //BA.debugLineNum = 7340049;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=7340050;
 //BA.debugLineNum = 7340050;BA.debugLine="End Sub";
return null;
}
public String  _savepicturetofile(com.olympiacircuits.cameraexclass __ref,byte[] _data,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub SavePictureToFile(Data() As Byte, Dir A";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_dir,_filename,__c.False);
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="End Sub";
return "";
}
public String  _setcoloreffect(com.olympiacircuits.cameraexclass __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub SetColorEffect(Effect As String)";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="SetParameter(\"effect\", Effect)";
__ref._setparameter(null,"effect",_effect);
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="End Sub";
return "";
}
public String  _setparameter(com.olympiacircuits.cameraexclass __ref,String _key,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Public Sub SetParameter(Key As String, Value As St";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="r.RunMethod3(\"set\", Key, \"java.lang.String\", Valu";
__ref._r.RunMethod3("set",_key,"java.lang.String",_value,"java.lang.String");
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="End Sub";
return "";
}
public String  _setcontinuousautofocus(com.olympiacircuits.cameraexclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
anywheresoftware.b4a.objects.collections.List _modes = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub SetContinuousAutoFocus";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Dim modes As List = GetSupportedFocusModes";
_modes = new anywheresoftware.b4a.objects.collections.List();
_modes = __ref._getsupportedfocusmodes(null);
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="If modes.IndexOf(\"continuous-picture\") > -1 Th";
if (_modes.IndexOf((Object)("continuous-picture"))>-1) { 
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="SetFocusMode(\"continuous-picture\")";
__ref._setfocusmode(null,"continuous-picture");
 }else 
{RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="Else If modes.IndexOf(\"continuous-video\") > -1";
if (_modes.IndexOf((Object)("continuous-video"))>-1) { 
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="SetFocusMode(\"continuous-video\")";
__ref._setfocusmode(null,"continuous-video");
 }else {
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Log(\"Continuous focus mode is not availabl";
__c.Log("Continuous focus mode is not available");
 }};
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="End Sub";
return "";
}
public String  _setfocusmode(com.olympiacircuits.cameraexclass __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Public Sub SetFocusMode(Mode As String)";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="r.RunMethod2(\"setFocusMode\", Mode, \"java.lang.";
__ref._r.RunMethod2("setFocusMode",_mode,"java.lang.String");
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="End Sub";
return "";
}
public String  _setflashmode(com.olympiacircuits.cameraexclass __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="cameraexclass";
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub SetFlashMode(Mode As String)";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="r.target = parameters";
__ref._r.Target = __ref._parameters;
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="r.RunMethod2(\"setFlashMode\", Mode, \"java.lang.Str";
__ref._r.RunMethod2("setFlashMode",_mode,"java.lang.String");
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="End Sub";
return "";
}
}