package com.olympiacircuits;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class auto_camera extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.olympiacircuits.auto_camera");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "com.olympiacircuits.auto_camera",
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
public anywheresoftware.b4a.keywords.Common __c = null;
public com.olympiacircuits.cameraexclass _my_camera = null;
public String _pic_path = "";
public anywheresoftware.b4a.objects.PanelWrapper _holder_panel = null;
public String _mode = "";
public anywheresoftware.b4a.samples.gmailcontacts.httputils2service _httputils2service = null;
public anywheresoftware.b4a.samples.gmailcontacts.modrequest _modrequest = null;
public anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring _svcmonitoring = null;
public com.olympiacircuits.main _main = null;
public com.olympiacircuits.bt_interact _bt_interact = null;
public com.olympiacircuits.activity_db _activity_db = null;
public com.olympiacircuits.file_manager _file_manager = null;
public com.olympiacircuits.camera_activity _camera_activity = null;
public com.olympiacircuits.main_controller _main_controller = null;
public String  _camera_close(com.olympiacircuits.auto_camera __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="auto_camera";
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub camera_close";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="my_camera.StopPreview";
__ref._my_camera._stoppreview(null);
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="my_camera.Release";
__ref._my_camera._release(null);
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="End Sub";
return "";
}
public String  _camera_event_picturetaken(com.olympiacircuits.auto_camera __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="auto_camera";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
long _now = 0L;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub camera_event_PictureTaken (Data() As Byte)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Dim now As Long";
_now = 0L;
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="now = DateTime.Now";
_now = __c.DateTime.getNow();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="out = File.OpenOutput(pic_path, now & \".jpg\", Fal";
_out = __c.File.OpenOutput(__ref._pic_path,BA.NumberToString(_now)+".jpg",__c.False);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="my_camera.Release";
__ref._my_camera._release(null);
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="CallSub(camera_activity,\"close_self\")";
__c.CallSubNew(ba,(Object)(_camera_activity.getObject()),"close_self");
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="End Sub";
return "";
}
public String  _camera_event_ready(com.olympiacircuits.auto_camera __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="auto_camera";
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub camera_event_Ready(success As Boolean)";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="my_camera.StartPreview";
__ref._my_camera._startpreview(null);
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="If Mode <> \"take_picture\" Then Return";
if ((__ref._mode).equals("take_picture") == false) { 
if (true) return "";};
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="my_camera.SetPictureSize(1920,1080)";
__ref._my_camera._setpicturesize(null,(int) (1920),(int) (1080));
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="my_camera.SetJpegQuality(90)";
__ref._my_camera._setjpegquality(null,(int) (90));
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="my_camera.CommitParameters";
__ref._my_camera._commitparameters(null);
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="my_camera.TakePicture";
__ref._my_camera._takepicture(null);
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="End Sub";
return "";
}
public String  _initialize(com.olympiacircuits.auto_camera __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _camera_panel,String _save_path,String _set_mode) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="auto_camera";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub Initialize(camera_panel As Panel,save_p";
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="pic_path = save_path";
__ref._pic_path = _save_path;
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="holder_panel = camera_panel";
__ref._holder_panel = _camera_panel;
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Mode = set_mode";
__ref._mode = _set_mode;
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="my_camera.Initialize(holder_panel,False,Me,\"came";
__ref._my_camera._initialize(null,ba,__ref._holder_panel,__c.False,this,"camera_event");
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="End Sub";
return "";
}
}