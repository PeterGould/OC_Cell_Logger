package com.olympiacircuits;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class customlistview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.olympiacircuits.customlistview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            if (BA.isShellModeRuntimeCheck(ba)) {
			    ba.raiseEvent2(null, true, "CREATE", true, "com.olympiacircuits.customlistview",
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
public anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public anywheresoftware.b4a.objects.collections.List _panels = null;
public float _dividerheight = 0f;
public Object _presseddrawable = null;
public String _eventname = "";
public Object _callback = null;
public anywheresoftware.b4a.objects.StringUtils _su = null;
public int _defaulttextsize = 0;
public int _defaulttextcolor = 0;
public int _defaulttextbackgroundcolor = 0;
public Object _defaulttextbackground = null;
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
public String  _initialize(com.olympiacircuits.customlistview __ref,anywheresoftware.b4a.BA _ba,Object _vcallback,String _veventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="customlistview";
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _idpressed = 0;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="sv.Initialize2(0, \"sv\")";
__ref._sv.Initialize2(ba,(int) (0),"sv");
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="items.Initialize";
__ref._items.Initialize();
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="panels.Initialize";
__ref._panels.Initialize();
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="dividerHeight = 2dip";
__ref._dividerheight = (float) (__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="EventName = vEventName";
__ref._eventname = _veventname;
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="CallBack = vCallback";
__ref._callback = _vcallback;
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="sv.Color = 0xFFD9D7DE 'this sets the dividers col";
__ref._sv.setColor((int) (0xffd9d7de));
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Dim idPressed As Int";
_idpressed = 0;
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="idPressed = r.GetStaticField(\"android.R$drawab";
_idpressed = (int)(BA.ObjectToNumber(_r.GetStaticField("android.R$drawable","list_selector_background")));
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext(ba));
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
_r.Target = _r.RunMethod("getResources");
RDebugUtils.currentLine=4653069;
 //BA.debugLineNum = 4653069;BA.debugLine="pressedDrawable = r.RunMethod2(\"getDrawable\", idP";
__ref._presseddrawable = _r.RunMethod2("getDrawable",BA.NumberToString(_idpressed),"java.lang.int");
RDebugUtils.currentLine=4653070;
 //BA.debugLineNum = 4653070;BA.debugLine="DefaultTextColor = Colors.White";
__ref._defaulttextcolor = __c.Colors.White;
RDebugUtils.currentLine=4653071;
 //BA.debugLineNum = 4653071;BA.debugLine="DefaultTextSize = 16";
__ref._defaulttextsize = (int) (16);
RDebugUtils.currentLine=4653072;
 //BA.debugLineNum = 4653072;BA.debugLine="DefaultTextBackgroundColor = Colors.Black";
__ref._defaulttextbackgroundcolor = __c.Colors.Black;
RDebugUtils.currentLine=4653073;
 //BA.debugLineNum = 4653073;BA.debugLine="DefaultTextBackground = Null";
__ref._defaulttextbackground = __c.Null;
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(com.olympiacircuits.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub AsView As View";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Return sv";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._sv.getObject()));
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return null;
}
public String  _add(com.olympiacircuits.customlistview __ref,anywheresoftware.b4a.objects.PanelWrapper _pnl,int _itemheight,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub Add(Pnl As Panel, ItemHeight As Int, Va";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="InsertAt(items.Size, Pnl, ItemHeight, Value)";
__ref._insertat(null,__ref._items.getSize(),_pnl,_itemheight,_value);
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return "";
}
public String  _insertat(com.olympiacircuits.customlistview __ref,int _index,anywheresoftware.b4a.objects.PanelWrapper _pnl,int _itemheight,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
anywheresoftware.b4a.objects.drawable.StateListDrawable _sd = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
int _top = 0;
anywheresoftware.b4a.objects.PanelWrapper _previouspanel = null;
anywheresoftware.b4a.objects.PanelWrapper _p2 = null;
int _i = 0;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub InsertAt(Index As Int, Pnl As Panel, It";
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Dim sd As StateListDrawable";
_sd = new anywheresoftware.b4a.objects.drawable.StateListDrawable();
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="sd.Initialize";
_sd.Initialize();
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="sd.AddState(sd.State_Pressed, pressedDrawable)";
_sd.AddState(_sd.State_Pressed,(android.graphics.drawable.Drawable)(__ref._presseddrawable));
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="sd.AddCatchAllState(Pnl.Background)";
_sd.AddCatchAllState(_pnl.getBackground());
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="p.Initialize(\"panel\")";
_p.Initialize(ba,"panel");
RDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="p.Background = sd";
_p.setBackground((android.graphics.drawable.Drawable)(_sd.getObject()));
RDebugUtils.currentLine=5308427;
 //BA.debugLineNum = 5308427;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=5308428;
 //BA.debugLineNum = 5308428;BA.debugLine="cd.Initialize(Colors.Transparent, 0)";
_cd.Initialize(__c.Colors.Transparent,(int) (0));
RDebugUtils.currentLine=5308429;
 //BA.debugLineNum = 5308429;BA.debugLine="Pnl.Background = cd";
_pnl.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=5308430;
 //BA.debugLineNum = 5308430;BA.debugLine="p.AddView(Pnl, 0, 0, sv.Width, ItemHeight)";
_p.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__ref._sv.getWidth(),_itemheight);
RDebugUtils.currentLine=5308431;
 //BA.debugLineNum = 5308431;BA.debugLine="p.Tag = Index";
_p.setTag((Object)(_index));
RDebugUtils.currentLine=5308433;
 //BA.debugLineNum = 5308433;BA.debugLine="If Index = items.Size Then";
if (_index==__ref._items.getSize()) { 
RDebugUtils.currentLine=5308434;
 //BA.debugLineNum = 5308434;BA.debugLine="items.Add(Value)";
__ref._items.Add(_value);
RDebugUtils.currentLine=5308435;
 //BA.debugLineNum = 5308435;BA.debugLine="panels.Add(p)";
__ref._panels.Add((Object)(_p.getObject()));
RDebugUtils.currentLine=5308436;
 //BA.debugLineNum = 5308436;BA.debugLine="Dim top As Int";
_top = 0;
RDebugUtils.currentLine=5308437;
 //BA.debugLineNum = 5308437;BA.debugLine="If Index = 0 Then top = dividerHeight Else top =";
if (_index==0) { 
_top = (int) (__ref._dividerheight);}
else {
_top = __ref._sv.getPanel().getHeight();};
RDebugUtils.currentLine=5308438;
 //BA.debugLineNum = 5308438;BA.debugLine="sv.Panel.AddView(p, 0, top, sv.Width, ItemHeight";
__ref._sv.getPanel().AddView((android.view.View)(_p.getObject()),(int) (0),_top,__ref._sv.getWidth(),_itemheight);
 }else {
RDebugUtils.currentLine=5308440;
 //BA.debugLineNum = 5308440;BA.debugLine="Dim top As Int";
_top = 0;
RDebugUtils.currentLine=5308441;
 //BA.debugLineNum = 5308441;BA.debugLine="If Index = 0 Then";
if (_index==0) { 
RDebugUtils.currentLine=5308442;
 //BA.debugLineNum = 5308442;BA.debugLine="top = dividerHeight";
_top = (int) (__ref._dividerheight);
 }else {
RDebugUtils.currentLine=5308444;
 //BA.debugLineNum = 5308444;BA.debugLine="Dim previousPanel As Panel";
_previouspanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5308445;
 //BA.debugLineNum = 5308445;BA.debugLine="previousPanel = panels.Get(Index - 1)";
_previouspanel.setObject((android.view.ViewGroup)(__ref._panels.Get((int) (_index-1))));
RDebugUtils.currentLine=5308446;
 //BA.debugLineNum = 5308446;BA.debugLine="top = previousPanel.top + previousPanel.Height";
_top = (int) (_previouspanel.getTop()+_previouspanel.getHeight()+__ref._dividerheight);
 };
RDebugUtils.currentLine=5308449;
 //BA.debugLineNum = 5308449;BA.debugLine="Dim p2 As Panel";
_p2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5308450;
 //BA.debugLineNum = 5308450;BA.debugLine="For i = Index To panels.Size - 1";
{
final int step131 = 1;
final int limit131 = (int) (__ref._panels.getSize()-1);
for (_i = _index; (step131 > 0 && _i <= limit131) || (step131 < 0 && _i >= limit131); _i = ((int)(0 + _i + step131))) {
RDebugUtils.currentLine=5308451;
 //BA.debugLineNum = 5308451;BA.debugLine="p2 = panels.Get(i)";
_p2.setObject((android.view.ViewGroup)(__ref._panels.Get(_i)));
RDebugUtils.currentLine=5308452;
 //BA.debugLineNum = 5308452;BA.debugLine="p2.top = p2.top + ItemHeight + dividerHeight";
_p2.setTop((int) (_p2.getTop()+_itemheight+__ref._dividerheight));
RDebugUtils.currentLine=5308453;
 //BA.debugLineNum = 5308453;BA.debugLine="p2.Tag = i + 1";
_p2.setTag((Object)(_i+1));
 }
};
RDebugUtils.currentLine=5308455;
 //BA.debugLineNum = 5308455;BA.debugLine="items.InsertAt(Index, Value)";
__ref._items.InsertAt(_index,_value);
RDebugUtils.currentLine=5308456;
 //BA.debugLineNum = 5308456;BA.debugLine="panels.InsertAt(Index, p)";
__ref._panels.InsertAt(_index,(Object)(_p.getObject()));
RDebugUtils.currentLine=5308457;
 //BA.debugLineNum = 5308457;BA.debugLine="sv.Panel.AddView(p, 0, top, sv.Width, ItemHeight";
__ref._sv.getPanel().AddView((android.view.View)(_p.getObject()),(int) (0),_top,__ref._sv.getWidth(),_itemheight);
 };
RDebugUtils.currentLine=5308459;
 //BA.debugLineNum = 5308459;BA.debugLine="sv.Panel.Height = sv.Panel.Height + ItemHeight +";
__ref._sv.getPanel().setHeight((int) (__ref._sv.getPanel().getHeight()+_itemheight+__ref._dividerheight));
RDebugUtils.currentLine=5308460;
 //BA.debugLineNum = 5308460;BA.debugLine="If items.Size = 1 Then sv.Panel.Height = sv.Panel";
if (__ref._items.getSize()==1) { 
__ref._sv.getPanel().setHeight((int) (__ref._sv.getPanel().getHeight()+__ref._dividerheight));};
RDebugUtils.currentLine=5308461;
 //BA.debugLineNum = 5308461;BA.debugLine="End Sub";
return "";
}
public String  _addtextitem(com.olympiacircuits.customlistview __ref,String _text,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub AddTextItem(Text As String, Value As Ob";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
__ref._insertattextitem(null,__ref._items.getSize(),_text,_value);
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="End Sub";
return "";
}
public String  _insertattextitem(com.olympiacircuits.customlistview __ref,int _index,String _text,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
int _minheight = 0;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="pnl.Initialize(\"\")";
_pnl.Initialize(ba,"");
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="lbl.Gravity = Bit.OR(Gravity.CENTER_VERTICAL, Gra";
_lbl.setGravity(__c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT));
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.Width - 5dip, 20d";
_pnl.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (2)),(int) (__ref._sv.getWidth()-__c.DipToCurrent((int) (5))),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="lbl.Text = Text";
_lbl.setText((Object)(_text));
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="lbl.TextSize = DefaultTextSize";
_lbl.setTextSize((float) (__ref._defaulttextsize));
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="lbl.TextColor = DefaultTextColor";
_lbl.setTextColor(__ref._defaulttextcolor);
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="If DefaultTextBackground <> Null Then";
if (__ref._defaulttextbackground!= null) { 
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="pnl.Background = DefaultTextBackground";
_pnl.setBackground((android.graphics.drawable.Drawable)(__ref._defaulttextbackground));
 }else {
RDebugUtils.currentLine=5242893;
 //BA.debugLineNum = 5242893;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
_pnl.setColor(__ref._defaulttextbackgroundcolor);
 };
RDebugUtils.currentLine=5242895;
 //BA.debugLineNum = 5242895;BA.debugLine="Dim minHeight As Int";
_minheight = 0;
RDebugUtils.currentLine=5242896;
 //BA.debugLineNum = 5242896;BA.debugLine="minHeight = su.MeasureMultilineTextHeight(lbl, Te";
_minheight = __ref._su.MeasureMultilineTextHeight((android.widget.TextView)(_lbl.getObject()),_text);
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="lbl.Height = Max(50dip, minHeight)";
_lbl.setHeight((int) (__c.Max(__c.DipToCurrent((int) (50)),_minheight)));
RDebugUtils.currentLine=5242898;
 //BA.debugLineNum = 5242898;BA.debugLine="InsertAt(Index, pnl, lbl.Height + 2dip, Value)";
__ref._insertat(null,_index,_pnl,(int) (_lbl.getHeight()+__c.DipToCurrent((int) (2))),_value);
RDebugUtils.currentLine=5242899;
 //BA.debugLineNum = 5242899;BA.debugLine="End Sub";
return "";
}
public String  _clear(com.olympiacircuits.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
int _i = 0;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="items.Clear";
__ref._items.Clear();
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="panels.Clear";
__ref._panels.Clear();
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="sv.Panel.Height = 0";
__ref._sv.getPanel().setHeight((int) (0));
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="For i = sv.Panel.NumberOfViews - 1 To 0 Step -1";
{
final int step51 = (int) (-1);
final int limit51 = (int) (0);
for (_i = (int) (__ref._sv.getPanel().getNumberOfViews()-1); (step51 > 0 && _i <= limit51) || (step51 < 0 && _i >= limit51); _i = ((int)(0 + _i + step51))) {
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="sv.Panel.RemoveViewAt(i)";
__ref._sv.getPanel().RemoveViewAt(_i);
 }
};
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(com.olympiacircuits.customlistview __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
anywheresoftware.b4a.objects.PanelWrapper _parent = null;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub DesignerCreateView(base As Panel, lbl A";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Dim parent As Panel";
_parent = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="r.Target = base";
_r.Target = (Object)(_base.getObject());
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="parent = r.RunMethod(\"getParent\")";
_parent.setObject((android.view.ViewGroup)(_r.RunMethod("getParent")));
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="base.RemoveView 'remove the base panel";
_base.RemoveView();
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="parent.AddView(sv, base.Left, base.Top, base.Widt";
_parent.AddView((android.view.View)(__ref._sv.getObject()),_base.getLeft(),_base.getTop(),_base.getWidth(),_base.getHeight());
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="DefaultTextSize = lbl.TextSize";
__ref._defaulttextsize = (int) (_lbl.getTextSize());
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="DefaultTextColor = lbl.TextColor";
__ref._defaulttextcolor = _lbl.getTextColor();
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="DefaultTextBackground = base.Background";
__ref._defaulttextbackground = (Object)(_base.getBackground());
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="End Sub";
return "";
}
public int  _getitemfromview(com.olympiacircuits.customlistview __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
Object _parent = null;
Object _current = null;
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub GetItemFromView(v As View) As Int";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Dim parent, current As Object";
_parent = new Object();
_current = new Object();
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="parent = v";
_parent = (Object)(_v.getObject());
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="Do While (parent Is Panel) = False Or sv.Panel <>";
while ((_parent instanceof android.view.ViewGroup)==__c.False || (__ref._sv.getPanel()).equals((android.view.ViewGroup)(_parent)) == false) {
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="current = parent";
_current = _parent;
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="r.Target = current";
_r.Target = _current;
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="parent = r.RunMethod(\"getParent\")";
_parent = _r.RunMethod("getParent");
 }
;
RDebugUtils.currentLine=5570569;
 //BA.debugLineNum = 5570569;BA.debugLine="v = current";
_v.setObject((android.view.View)(_current));
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="Return v.Tag";
if (true) return (int)(BA.ObjectToNumber(_v.getTag()));
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(com.olympiacircuits.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub GetPanel(Index As Int) As Panel";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="p = panels.Get(Index) 'this is the parent panel";
_p.setObject((android.view.ViewGroup)(__ref._panels.Get(_index)));
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Return p.GetView(0)";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="End Sub";
return null;
}
public int  _getsize(com.olympiacircuits.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub GetSize As Int";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Return items.Size";
if (true) return __ref._items.getSize();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return 0;
}
public Object  _getvalue(com.olympiacircuits.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Return items.Get(Index)";
if (true) return __ref._items.Get(_index);
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return null;
}
public String  _jumptoitem(com.olympiacircuits.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
int _top = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _i = 0;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub JumpToItem(Index As Int)";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Dim top As Int";
_top = 0;
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="For i = 0 To Min(Index - 1, items.Size - 1)";
{
final int step149 = 1;
final int limit149 = (int) (__c.Min(_index-1,__ref._items.getSize()-1));
for (_i = (int) (0); (step149 > 0 && _i <= limit149) || (step149 < 0 && _i >= limit149); _i = ((int)(0 + _i + step149))) {
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="p = panels.Get(i)";
_p.setObject((android.view.ViewGroup)(__ref._panels.Get(_i)));
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="top = top + p.Height + dividerHeight";
_top = (int) (_top+_p.getHeight()+__ref._dividerheight);
 }
};
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="sv.ScrollPosition = top";
__ref._sv.setScrollPosition(_top);
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="sv.ScrollPosition = top";
__ref._sv.setScrollPosition(_top);
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="End Sub";
return "";
}
public String  _panel_click(com.olympiacircuits.customlistview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Private Sub Panel_Click";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="If SubExists(CallBack, EventName & \"_ItemClick\")";
if (__c.SubExists(ba,__ref._callback,__ref._eventname+"_ItemClick")) { 
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Dim v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="v = Sender";
_v.setObject((android.view.View)(__c.Sender(ba)));
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", v.T";
__c.CallSubNew3(ba,__ref._callback,__ref._eventname+"_ItemClick",_v.getTag(),__ref._items.Get((int)(BA.ObjectToNumber(_v.getTag()))));
 };
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="End Sub";
return "";
}
public String  _removeat(com.olympiacircuits.customlistview __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="customlistview";
anywheresoftware.b4a.objects.PanelWrapper _removepanel = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _i = 0;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub RemoveAt(Index As Int)";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim removePanel, p As Panel";
_removepanel = new anywheresoftware.b4a.objects.PanelWrapper();
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="removePanel = panels.Get(Index)";
_removepanel.setObject((android.view.ViewGroup)(__ref._panels.Get(_index)));
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="For i = Index + 1 To items.Size - 1";
{
final int step69 = 1;
final int limit69 = (int) (__ref._items.getSize()-1);
for (_i = (int) (_index+1); (step69 > 0 && _i <= limit69) || (step69 < 0 && _i >= limit69); _i = ((int)(0 + _i + step69))) {
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="p = panels.Get(i)";
_p.setObject((android.view.ViewGroup)(__ref._panels.Get(_i)));
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="p.Tag = i - 1";
_p.setTag((Object)(_i-1));
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="p.Top = p.Top - removePanel.Height - dividerHeig";
_p.setTop((int) (_p.getTop()-_removepanel.getHeight()-__ref._dividerheight));
 }
};
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="sv.Panel.Height = sv.Panel.Height - removePanel.H";
__ref._sv.getPanel().setHeight((int) (__ref._sv.getPanel().getHeight()-_removepanel.getHeight()-__ref._dividerheight));
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="items.RemoveAt(Index)";
__ref._items.RemoveAt(_index);
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="panels.RemoveAt(Index)";
__ref._panels.RemoveAt(_index);
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="removePanel.RemoveView";
_removepanel.RemoveView();
RDebugUtils.currentLine=5111820;
 //BA.debugLineNum = 5111820;BA.debugLine="End Sub";
return "";
}
}