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
public String  _camera_close(com.olympiacircuits.auto_camera __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="auto_camera";
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub camera_close";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="my_camera.StopPreview";
__ref._my_camera._stoppreview(null);
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="my_camera.Release";
__ref._my_camera._release(null);
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="CallSub(camera_activity,\"close_self\")";
__c.CallSubNew(ba,(Object)(_camera_activity.getObject()),"close_self");
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="End Sub";
return "";
}
public String  _camera_event_picturetaken(com.olympiacircuits.auto_camera __ref,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="auto_camera";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
long _now = 0L;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub camera_event_PictureTaken (Data() As Byte)";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Dim now As Long";
_now = 0L;
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="now = DateTime.Now";
_now = __c.DateTime.getNow();
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="out = File.OpenOutput(pic_path, now & \".jpg\", Fal";
_out = __c.File.OpenOutput(__ref._pic_path,BA.NumberToString(_now)+".jpg",__c.False);
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="camera_close";
__ref._camera_close(null);
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="End Sub";
return "";
}
public String  _camera_event_ready(com.olympiacircuits.auto_camera __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="auto_camera";
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub camera_event_Ready(success As Boolean)";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="my_camera.StartPreview";
__ref._my_camera._startpreview(null);
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="If Mode <> \"take_picture\" Then Return";
if ((__ref._mode).equals("take_picture") == false) { 
if (true) return "";};
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="my_camera.SetPictureSize(1920,1080)";
__ref._my_camera._setpicturesize(null,(int) (1920),(int) (1080));
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="my_camera.SetJpegQuality(90)";
__ref._my_camera._setjpegquality(null,(int) (90));
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="my_camera.CommitParameters";
__ref._my_camera._commitparameters(null);
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="my_camera.TakePicture";
__ref._my_camera._takepicture(null);
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="End Sub";
return "";
}
public String  _initialize(com.olympiacircuits.auto_camera __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _camera_panel,String _save_path,String _set_mode) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="auto_camera";
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub Initialize(camera_panel As Panel,save_p";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="pic_path = save_path";
__ref._pic_path = _save_path;
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="holder_panel = camera_panel";
__ref._holder_panel = _camera_panel;
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="Mode = set_mode";
__ref._mode = _set_mode;
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="If holder_panel.IsInitialized = False Then camer";
if (__ref._holder_panel.IsInitialized()==__c.False) { 
__ref._camera_close(null);};
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="my_camera.Initialize(holder_panel,False,Me,\"came";
__ref._my_camera._initialize(null,ba,__ref._holder_panel,__c.False,this,"camera_event");
RDebugUtils.currentLine=2949131;
 //BA.debugLineNum = 2949131;BA.debugLine="End Sub";
return "";
}
}