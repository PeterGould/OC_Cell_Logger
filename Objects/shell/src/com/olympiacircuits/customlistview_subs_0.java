package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class customlistview_subs_0 {


public static RemoteObject  _add(RemoteObject __ref,RemoteObject _pnl,RemoteObject _itemheight,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Add (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("add")) return __ref.runUserSub(false, "customlistview","add", __ref, _pnl, _itemheight, _value);
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("ItemHeight", _itemheight);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 176;BA.debugLine="Public Sub Add(Pnl As Panel, ItemHeight As Int, Va";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="InsertAt(items.Size, Pnl, ItemHeight, Value)";
Debug.ShouldStop(65536);
__ref.runClassMethod (com.olympiacircuits.customlistview.class, "_insertat",(Object)(__ref.getField(false,"_items").runMethod(true,"getSize")),(Object)(_pnl),(Object)(_itemheight),(Object)(_value));
 BA.debugLineNum = 178;BA.debugLine="End Sub";
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
public static RemoteObject  _addtextitem(RemoteObject __ref,RemoteObject _text,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddTextItem (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("addtextitem")) return __ref.runUserSub(false, "customlistview","addtextitem", __ref, _text, _value);
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 101;BA.debugLine="Public Sub AddTextItem(Text As String, Value As Ob";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
Debug.ShouldStop(32);
__ref.runClassMethod (com.olympiacircuits.customlistview.class, "_insertattextitem",(Object)(__ref.getField(false,"_items").runMethod(true,"getSize")),(Object)(_text),(Object)(_value));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
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
public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "customlistview","asview", __ref);
 BA.debugLineNum = 40;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Return sv";
Debug.ShouldStop(256);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_sv").getObject());
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private sv As ScrollView";
customlistview._sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_sv",customlistview._sv);
 //BA.debugLineNum = 5;BA.debugLine="Private items As List";
customlistview._items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_items",customlistview._items);
 //BA.debugLineNum = 6;BA.debugLine="Private panels As List";
customlistview._panels = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_panels",customlistview._panels);
 //BA.debugLineNum = 7;BA.debugLine="Private dividerHeight As Float";
customlistview._dividerheight = RemoteObject.createImmutable(0f);__ref.setField("_dividerheight",customlistview._dividerheight);
 //BA.debugLineNum = 8;BA.debugLine="Private pressedDrawable As Object";
customlistview._presseddrawable = RemoteObject.createNew ("Object");__ref.setField("_presseddrawable",customlistview._presseddrawable);
 //BA.debugLineNum = 9;BA.debugLine="Private EventName As String";
customlistview._eventname = RemoteObject.createImmutable("");__ref.setField("_eventname",customlistview._eventname);
 //BA.debugLineNum = 10;BA.debugLine="Private CallBack As Object";
customlistview._callback = RemoteObject.createNew ("Object");__ref.setField("_callback",customlistview._callback);
 //BA.debugLineNum = 11;BA.debugLine="Private su As StringUtils";
customlistview._su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_su",customlistview._su);
 //BA.debugLineNum = 12;BA.debugLine="Public DefaultTextSize As Int";
customlistview._defaulttextsize = RemoteObject.createImmutable(0);__ref.setField("_defaulttextsize",customlistview._defaulttextsize);
 //BA.debugLineNum = 13;BA.debugLine="Public DefaultTextColor As Int";
customlistview._defaulttextcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextcolor",customlistview._defaulttextcolor);
 //BA.debugLineNum = 14;BA.debugLine="Public DefaultTextBackgroundColor As Int";
customlistview._defaulttextbackgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextbackgroundcolor",customlistview._defaulttextbackgroundcolor);
 //BA.debugLineNum = 15;BA.debugLine="Private DefaultTextBackground As Object";
customlistview._defaulttextbackground = RemoteObject.createNew ("Object");__ref.setField("_defaulttextbackground",customlistview._defaulttextbackground);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("clear")) return __ref.runUserSub(false, "customlistview","clear", __ref);
int _i = 0;
 BA.debugLineNum = 57;BA.debugLine="Public Sub Clear";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="items.Clear";
Debug.ShouldStop(33554432);
__ref.getField(false,"_items").runVoidMethod ("Clear");
 BA.debugLineNum = 59;BA.debugLine="panels.Clear";
Debug.ShouldStop(67108864);
__ref.getField(false,"_panels").runVoidMethod ("Clear");
 BA.debugLineNum = 60;BA.debugLine="sv.Panel.Height = 0";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 61;BA.debugLine="For i = sv.Panel.NumberOfViews - 1 To 0 Step -1";
Debug.ShouldStop(268435456);
{
final int step51 = (int) (0 + -(double) (0 + 1));
final int limit51 = 0;
for (_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue(); (step51 > 0 && _i <= limit51) || (step51 < 0 && _i >= limit51); _i = ((int)(0 + _i + step51))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 62;BA.debugLine="sv.Panel.RemoveViewAt(i)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runVoidMethod ("RemoveViewAt",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 64;BA.debugLine="End Sub";
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
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("designercreateview")) return __ref.runUserSub(false, "customlistview","designercreateview", __ref, _base, _lbl, _props);
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("props", _props);
 BA.debugLineNum = 44;BA.debugLine="Public Sub DesignerCreateView(base As Panel, lbl A";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="Dim parent As Panel";
Debug.ShouldStop(4096);
_parent = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 46;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(8192);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 47;BA.debugLine="r.Target = base";
Debug.ShouldStop(16384);
_r.setField ("Target",(_base.getObject()));
 BA.debugLineNum = 48;BA.debugLine="parent = r.RunMethod(\"getParent\")";
Debug.ShouldStop(32768);
_parent.setObject(_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getParent"))));
 BA.debugLineNum = 49;BA.debugLine="base.RemoveView 'remove the base panel";
Debug.ShouldStop(65536);
_base.runVoidMethod ("RemoveView");
 BA.debugLineNum = 50;BA.debugLine="parent.AddView(sv, base.Left, base.Top, base.Widt";
Debug.ShouldStop(131072);
_parent.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_sv").getObject())),(Object)(_base.runMethod(true,"getLeft")),(Object)(_base.runMethod(true,"getTop")),(Object)(_base.runMethod(true,"getWidth")),(Object)(_base.runMethod(true,"getHeight")));
 BA.debugLineNum = 51;BA.debugLine="DefaultTextSize = lbl.TextSize";
Debug.ShouldStop(262144);
__ref.setField ("_defaulttextsize",BA.numberCast(int.class, _lbl.runMethod(true,"getTextSize")));
 BA.debugLineNum = 52;BA.debugLine="DefaultTextColor = lbl.TextColor";
Debug.ShouldStop(524288);
__ref.setField ("_defaulttextcolor",_lbl.runMethod(true,"getTextColor"));
 BA.debugLineNum = 53;BA.debugLine="DefaultTextBackground = base.Background";
Debug.ShouldStop(1048576);
__ref.setField ("_defaulttextbackground",(_base.runMethod(false,"getBackground")));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
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
public static RemoteObject  _getitemfromview(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("GetItemFromView (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("getitemfromview")) return __ref.runUserSub(false, "customlistview","getitemfromview", __ref, _v);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _parent = RemoteObject.declareNull("Object");
RemoteObject _current = RemoteObject.declareNull("Object");
Debug.locals.put("v", _v);
 BA.debugLineNum = 204;BA.debugLine="Public Sub GetItemFromView(v As View) As Int";
Debug.ShouldStop(2048);
 BA.debugLineNum = 205;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(4096);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 206;BA.debugLine="Dim parent, current As Object";
Debug.ShouldStop(8192);
_parent = RemoteObject.createNew ("Object");Debug.locals.put("parent", _parent);
_current = RemoteObject.createNew ("Object");Debug.locals.put("current", _current);
 BA.debugLineNum = 207;BA.debugLine="parent = v";
Debug.ShouldStop(16384);
_parent = (_v.getObject());Debug.locals.put("parent", _parent);
 BA.debugLineNum = 208;BA.debugLine="Do While (parent Is Panel) = False Or sv.Panel <>";
Debug.ShouldStop(32768);
while (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_parent, RemoteObject.createImmutable("android.view.ViewGroup")))),customlistview.__c.getField(true,"False")) || RemoteObject.solveBoolean("!",__ref.getField(false,"_sv").runMethod(false,"getPanel"),_parent)) {
 BA.debugLineNum = 209;BA.debugLine="current = parent";
Debug.ShouldStop(65536);
_current = _parent;Debug.locals.put("current", _current);
 BA.debugLineNum = 210;BA.debugLine="r.Target = current";
Debug.ShouldStop(131072);
_r.setField ("Target",_current);
 BA.debugLineNum = 211;BA.debugLine="parent = r.RunMethod(\"getParent\")";
Debug.ShouldStop(262144);
_parent = _r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getParent")));Debug.locals.put("parent", _parent);
 }
;
 BA.debugLineNum = 213;BA.debugLine="v = current";
Debug.ShouldStop(1048576);
_v.setObject(_current);
 BA.debugLineNum = 214;BA.debugLine="Return v.Tag";
Debug.ShouldStop(2097152);
if (true) return BA.numberCast(int.class, _v.runMethod(false,"getTag"));
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("getpanel")) return __ref.runUserSub(false, "customlistview","getpanel", __ref, _index);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Index", _index);
 BA.debugLineNum = 74;BA.debugLine="Public Sub GetPanel(Index As Int) As Panel";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1024);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 76;BA.debugLine="p = panels.Get(Index) 'this is the parent panel";
Debug.ShouldStop(2048);
_p.setObject(__ref.getField(false,"_panels").runMethod(false,"Get",(Object)(_index)));
 BA.debugLineNum = 77;BA.debugLine="Return p.GetView(0)";
Debug.ShouldStop(4096);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSize (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("getsize")) return __ref.runUserSub(false, "customlistview","getsize", __ref);
 BA.debugLineNum = 69;BA.debugLine="Public Sub GetSize As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Return items.Size";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_items").runMethod(true,"getSize");
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetValue (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("getvalue")) return __ref.runUserSub(false, "customlistview","getvalue", __ref, _index);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 81;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Return items.Get(Index)";
Debug.ShouldStop(131072);
if (true) return __ref.getField(false,"_items").runMethod(false,"Get",(Object)(_index));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vcallback,RemoteObject _veventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "customlistview","initialize", __ref, _ba, _vcallback, _veventname);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _idpressed = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("vCallback", _vcallback);
Debug.locals.put("vEventName", _veventname);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="sv.Initialize2(0, \"sv\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_sv").runVoidMethod ("Initialize2",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("sv")));
 BA.debugLineNum = 21;BA.debugLine="items.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_items").runVoidMethod ("Initialize");
 BA.debugLineNum = 22;BA.debugLine="panels.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_panels").runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="dividerHeight = 2dip";
Debug.ShouldStop(4194304);
__ref.setField ("_dividerheight",BA.numberCast(float.class, customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 24;BA.debugLine="EventName = vEventName";
Debug.ShouldStop(8388608);
__ref.setField ("_eventname",_veventname);
 BA.debugLineNum = 25;BA.debugLine="CallBack = vCallback";
Debug.ShouldStop(16777216);
__ref.setField ("_callback",_vcallback);
 BA.debugLineNum = 26;BA.debugLine="sv.Color = 0xFFD9D7DE 'this sets the dividers col";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sv").runVoidMethod ("setColor",BA.numberCast(int.class, 0xffd9d7de));
 BA.debugLineNum = 27;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(67108864);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 28;BA.debugLine="Dim idPressed As Int";
Debug.ShouldStop(134217728);
_idpressed = RemoteObject.createImmutable(0);Debug.locals.put("idPressed", _idpressed);
 BA.debugLineNum = 29;BA.debugLine="idPressed = r.GetStaticField(\"android.R$drawab";
Debug.ShouldStop(268435456);
_idpressed = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.R$drawable")),(Object)(RemoteObject.createImmutable("list_selector_background"))));Debug.locals.put("idPressed", _idpressed);
 BA.debugLineNum = 30;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(536870912);
_r.setField ("Target",(_r.runMethod(false,"GetContext",__ref.getField(false, "ba"))));
 BA.debugLineNum = 31;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
Debug.ShouldStop(1073741824);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getResources"))));
 BA.debugLineNum = 32;BA.debugLine="pressedDrawable = r.RunMethod2(\"getDrawable\", idP";
Debug.ShouldStop(-2147483648);
__ref.setField ("_presseddrawable",_r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getDrawable")),(Object)(BA.NumberToString(_idpressed)),(Object)(RemoteObject.createImmutable("java.lang.int"))));
 BA.debugLineNum = 33;BA.debugLine="DefaultTextColor = Colors.White";
Debug.ShouldStop(1);
__ref.setField ("_defaulttextcolor",customlistview.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 34;BA.debugLine="DefaultTextSize = 16";
Debug.ShouldStop(2);
__ref.setField ("_defaulttextsize",BA.numberCast(int.class, 16));
 BA.debugLineNum = 35;BA.debugLine="DefaultTextBackgroundColor = Colors.Black";
Debug.ShouldStop(4);
__ref.setField ("_defaulttextbackgroundcolor",customlistview.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 36;BA.debugLine="DefaultTextBackground = Null";
Debug.ShouldStop(8);
__ref.setField ("_defaulttextbackground",customlistview.__c.getField(false,"Null"));
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
public static RemoteObject  _insertat(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemheight,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertAt (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("insertat")) return __ref.runUserSub(false, "customlistview","insertat", __ref, _index, _pnl, _itemheight, _value);
RemoteObject _sd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.StateListDrawable");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _previouspanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _p2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
Debug.locals.put("Index", _index);
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("ItemHeight", _itemheight);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 128;BA.debugLine="Public Sub InsertAt(Index As Int, Pnl As Panel, It";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 130;BA.debugLine="Dim sd As StateListDrawable";
Debug.ShouldStop(2);
_sd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.StateListDrawable");Debug.locals.put("sd", _sd);
 BA.debugLineNum = 131;BA.debugLine="sd.Initialize";
Debug.ShouldStop(4);
_sd.runVoidMethod ("Initialize");
 BA.debugLineNum = 132;BA.debugLine="sd.AddState(sd.State_Pressed, pressedDrawable)";
Debug.ShouldStop(8);
_sd.runVoidMethod ("AddState",(Object)(_sd.getField(true,"State_Pressed")),(Object)((__ref.getField(false,"_presseddrawable"))));
 BA.debugLineNum = 133;BA.debugLine="sd.AddCatchAllState(Pnl.Background)";
Debug.ShouldStop(16);
_sd.runVoidMethod ("AddCatchAllState",(Object)(_pnl.runMethod(false,"getBackground")));
 BA.debugLineNum = 136;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(128);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 137;BA.debugLine="p.Initialize(\"panel\")";
Debug.ShouldStop(256);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("panel")));
 BA.debugLineNum = 138;BA.debugLine="p.Background = sd";
Debug.ShouldStop(512);
_p.runMethod(false,"setBackground",(_sd.getObject()));
 BA.debugLineNum = 139;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(1024);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 140;BA.debugLine="cd.Initialize(Colors.Transparent, 0)";
Debug.ShouldStop(2048);
_cd.runVoidMethod ("Initialize",(Object)(customlistview.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 141;BA.debugLine="Pnl.Background = cd";
Debug.ShouldStop(4096);
_pnl.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 142;BA.debugLine="p.AddView(Pnl, 0, 0, sv.Width, ItemHeight)";
Debug.ShouldStop(8192);
_p.runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_sv").runMethod(true,"getWidth")),(Object)(_itemheight));
 BA.debugLineNum = 143;BA.debugLine="p.Tag = Index";
Debug.ShouldStop(16384);
_p.runMethod(false,"setTag",(_index));
 BA.debugLineNum = 145;BA.debugLine="If Index = items.Size Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, __ref.getField(false,"_items").runMethod(true,"getSize")))) { 
 BA.debugLineNum = 146;BA.debugLine="items.Add(Value)";
Debug.ShouldStop(131072);
__ref.getField(false,"_items").runVoidMethod ("Add",(Object)(_value));
 BA.debugLineNum = 147;BA.debugLine="panels.Add(p)";
Debug.ShouldStop(262144);
__ref.getField(false,"_panels").runVoidMethod ("Add",(Object)((_p.getObject())));
 BA.debugLineNum = 148;BA.debugLine="Dim top As Int";
Debug.ShouldStop(524288);
_top = RemoteObject.createImmutable(0);Debug.locals.put("top", _top);
 BA.debugLineNum = 149;BA.debugLine="If Index = 0 Then top = dividerHeight Else top =";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
_top = BA.numberCast(int.class, __ref.getField(true,"_dividerheight"));Debug.locals.put("top", _top);}
else {
_top = __ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getHeight");Debug.locals.put("top", _top);};
 BA.debugLineNum = 150;BA.debugLine="sv.Panel.AddView(p, 0, top, sv.Width, ItemHeight";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_top),(Object)(__ref.getField(false,"_sv").runMethod(true,"getWidth")),(Object)(_itemheight));
 }else {
 BA.debugLineNum = 152;BA.debugLine="Dim top As Int";
Debug.ShouldStop(8388608);
_top = RemoteObject.createImmutable(0);Debug.locals.put("top", _top);
 BA.debugLineNum = 153;BA.debugLine="If Index = 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 154;BA.debugLine="top = dividerHeight";
Debug.ShouldStop(33554432);
_top = BA.numberCast(int.class, __ref.getField(true,"_dividerheight"));Debug.locals.put("top", _top);
 }else {
 BA.debugLineNum = 156;BA.debugLine="Dim previousPanel As Panel";
Debug.ShouldStop(134217728);
_previouspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("previousPanel", _previouspanel);
 BA.debugLineNum = 157;BA.debugLine="previousPanel = panels.Get(Index - 1)";
Debug.ShouldStop(268435456);
_previouspanel.setObject(__ref.getField(false,"_panels").runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "-",1, 1))));
 BA.debugLineNum = 158;BA.debugLine="top = previousPanel.top + previousPanel.Height";
Debug.ShouldStop(536870912);
_top = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_previouspanel.runMethod(true,"getTop"),_previouspanel.runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight")}, "++",2, 0));Debug.locals.put("top", _top);
 };
 BA.debugLineNum = 161;BA.debugLine="Dim p2 As Panel";
Debug.ShouldStop(1);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p2", _p2);
 BA.debugLineNum = 162;BA.debugLine="For i = Index To panels.Size - 1";
Debug.ShouldStop(2);
{
final int step131 = 1;
final int limit131 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_panels").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = _index.<Integer>get().intValue(); (step131 > 0 && _i <= limit131) || (step131 < 0 && _i >= limit131); _i = ((int)(0 + _i + step131))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 163;BA.debugLine="p2 = panels.Get(i)";
Debug.ShouldStop(4);
_p2.setObject(__ref.getField(false,"_panels").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 164;BA.debugLine="p2.top = p2.top + ItemHeight + dividerHeight";
Debug.ShouldStop(8);
_p2.runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_p2.runMethod(true,"getTop"),_itemheight,__ref.getField(true,"_dividerheight")}, "++",2, 0)));
 BA.debugLineNum = 165;BA.debugLine="p2.Tag = i + 1";
Debug.ShouldStop(16);
_p2.runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 167;BA.debugLine="items.InsertAt(Index, Value)";
Debug.ShouldStop(64);
__ref.getField(false,"_items").runVoidMethod ("InsertAt",(Object)(_index),(Object)(_value));
 BA.debugLineNum = 168;BA.debugLine="panels.InsertAt(Index, p)";
Debug.ShouldStop(128);
__ref.getField(false,"_panels").runVoidMethod ("InsertAt",(Object)(_index),(Object)((_p.getObject())));
 BA.debugLineNum = 169;BA.debugLine="sv.Panel.AddView(p, 0, top, sv.Width, ItemHeight";
Debug.ShouldStop(256);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_top),(Object)(__ref.getField(false,"_sv").runMethod(true,"getWidth")),(Object)(_itemheight));
 };
 BA.debugLineNum = 171;BA.debugLine="sv.Panel.Height = sv.Panel.Height + ItemHeight +";
Debug.ShouldStop(1024);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getHeight"),_itemheight,__ref.getField(true,"_dividerheight")}, "++",2, 0)));
 BA.debugLineNum = 172;BA.debugLine="If items.Size = 1 Then sv.Panel.Height = sv.Panel";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_items").runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight")}, "+",1, 0)));};
 BA.debugLineNum = 173;BA.debugLine="End Sub";
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
public static RemoteObject  _insertattextitem(RemoteObject __ref,RemoteObject _index,RemoteObject _text,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertAtTextItem (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("insertattextitem")) return __ref.runUserSub(false, "customlistview","insertattextitem", __ref, _index, _text, _value);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _minheight = RemoteObject.createImmutable(0);
Debug.locals.put("Index", _index);
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 106;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(1024);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 108;BA.debugLine="pnl.Initialize(\"\")";
Debug.ShouldStop(2048);
_pnl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 109;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(4096);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 110;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(8192);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 111;BA.debugLine="lbl.Gravity = Bit.OR(Gravity.CENTER_VERTICAL, Gra";
Debug.ShouldStop(16384);
_lbl.runMethod(true,"setGravity",customlistview.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(customlistview.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(customlistview.__c.getField(false,"Gravity").getField(true,"LEFT"))));
 BA.debugLineNum = 112;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.Width - 5dip, 20d";
Debug.ShouldStop(32768);
_pnl.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(true,"getWidth"),customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1)),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 113;BA.debugLine="lbl.Text = Text";
Debug.ShouldStop(65536);
_lbl.runMethod(true,"setText",(_text));
 BA.debugLineNum = 114;BA.debugLine="lbl.TextSize = DefaultTextSize";
Debug.ShouldStop(131072);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, __ref.getField(true,"_defaulttextsize")));
 BA.debugLineNum = 115;BA.debugLine="lbl.TextColor = DefaultTextColor";
Debug.ShouldStop(262144);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_defaulttextcolor"));
 BA.debugLineNum = 116;BA.debugLine="If DefaultTextBackground <> Null Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_defaulttextbackground"))) { 
 BA.debugLineNum = 117;BA.debugLine="pnl.Background = DefaultTextBackground";
Debug.ShouldStop(1048576);
_pnl.runMethod(false,"setBackground",(__ref.getField(false,"_defaulttextbackground")));
 }else {
 BA.debugLineNum = 119;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
Debug.ShouldStop(4194304);
_pnl.runVoidMethod ("setColor",__ref.getField(true,"_defaulttextbackgroundcolor"));
 };
 BA.debugLineNum = 121;BA.debugLine="Dim minHeight As Int";
Debug.ShouldStop(16777216);
_minheight = RemoteObject.createImmutable(0);Debug.locals.put("minHeight", _minheight);
 BA.debugLineNum = 122;BA.debugLine="minHeight = su.MeasureMultilineTextHeight(lbl, Te";
Debug.ShouldStop(33554432);
_minheight = __ref.getField(false,"_su").runMethod(true,"MeasureMultilineTextHeight",(Object)((_lbl.getObject())),(Object)(_text));Debug.locals.put("minHeight", _minheight);
 BA.debugLineNum = 123;BA.debugLine="lbl.Height = Max(50dip, minHeight)";
Debug.ShouldStop(67108864);
_lbl.runMethod(true,"setHeight",BA.numberCast(int.class, customlistview.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _minheight)))));
 BA.debugLineNum = 124;BA.debugLine="InsertAt(Index, pnl, lbl.Height + 2dip, Value)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (com.olympiacircuits.customlistview.class, "_insertat",(Object)(_index),(Object)(_pnl),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl.runMethod(true,"getHeight"),customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(_value));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
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
public static RemoteObject  _jumptoitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("JumpToItem (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("jumptoitem")) return __ref.runUserSub(false, "customlistview","jumptoitem", __ref, _index);
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
Debug.locals.put("Index", _index);
 BA.debugLineNum = 181;BA.debugLine="Public Sub JumpToItem(Index As Int)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="Dim top As Int";
Debug.ShouldStop(2097152);
_top = RemoteObject.createImmutable(0);Debug.locals.put("top", _top);
 BA.debugLineNum = 183;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(4194304);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 184;BA.debugLine="For i = 0 To Min(Index - 1, items.Size - 1)";
Debug.ShouldStop(8388608);
{
final int step149 = 1;
final int limit149 = (int) (0 + customlistview.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))).<Double>get().doubleValue());
for (_i = 0; (step149 > 0 && _i <= limit149) || (step149 < 0 && _i >= limit149); _i = ((int)(0 + _i + step149))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 185;BA.debugLine="p = panels.Get(i)";
Debug.ShouldStop(16777216);
_p.setObject(__ref.getField(false,"_panels").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 186;BA.debugLine="top = top + p.Height + dividerHeight";
Debug.ShouldStop(33554432);
_top = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_top,_p.runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight")}, "++",2, 0));Debug.locals.put("top", _top);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 188;BA.debugLine="sv.ScrollPosition = top";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sv").runMethod(true,"setScrollPosition",_top);
 BA.debugLineNum = 190;BA.debugLine="DoEvents";
Debug.ShouldStop(536870912);
customlistview.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 191;BA.debugLine="sv.ScrollPosition = top";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sv").runMethod(true,"setScrollPosition",_top);
 BA.debugLineNum = 192;BA.debugLine="DoEvents";
Debug.ShouldStop(-2147483648);
customlistview.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 193;BA.debugLine="End Sub";
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
public static RemoteObject  _panel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel_Click (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("panel_click")) return __ref.runUserSub(false, "customlistview","panel_click", __ref);
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
 BA.debugLineNum = 195;BA.debugLine="Private Sub Panel_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 196;BA.debugLine="If SubExists(CallBack, EventName & \"_ItemClick\")";
Debug.ShouldStop(8);
if (customlistview.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback")),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname"),RemoteObject.createImmutable("_ItemClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 197;BA.debugLine="Dim v As View";
Debug.ShouldStop(16);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 198;BA.debugLine="v = Sender";
Debug.ShouldStop(32);
_v.setObject(customlistview.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 199;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", v.T";
Debug.ShouldStop(64);
customlistview.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback")),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname"),RemoteObject.createImmutable("_ItemClick"))),(Object)(_v.runMethod(false,"getTag")),(Object)(__ref.getField(false,"_items").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _v.runMethod(false,"getTag"))))));
 };
 BA.debugLineNum = 201;BA.debugLine="End Sub";
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
public static RemoteObject  _removeat(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("RemoveAt (customlistview) ","customlistview",8,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("removeat")) return __ref.runUserSub(false, "customlistview","removeat", __ref, _index);
RemoteObject _removepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
Debug.locals.put("Index", _index);
 BA.debugLineNum = 86;BA.debugLine="Public Sub RemoveAt(Index As Int)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Dim removePanel, p As Panel";
Debug.ShouldStop(4194304);
_removepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("removePanel", _removepanel);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 88;BA.debugLine="removePanel = panels.Get(Index)";
Debug.ShouldStop(8388608);
_removepanel.setObject(__ref.getField(false,"_panels").runMethod(false,"Get",(Object)(_index)));
 BA.debugLineNum = 89;BA.debugLine="For i = Index + 1 To items.Size - 1";
Debug.ShouldStop(16777216);
{
final int step69 = 1;
final int limit69 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue(); (step69 > 0 && _i <= limit69) || (step69 < 0 && _i >= limit69); _i = ((int)(0 + _i + step69))) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 90;BA.debugLine="p = panels.Get(i)";
Debug.ShouldStop(33554432);
_p.setObject(__ref.getField(false,"_panels").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 91;BA.debugLine="p.Tag = i - 1";
Debug.ShouldStop(67108864);
_p.runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 92;BA.debugLine="p.Top = p.Top - removePanel.Height - dividerHeig";
Debug.ShouldStop(134217728);
_p.runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getTop"),_removepanel.runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight")}, "--",2, 0)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 94;BA.debugLine="sv.Panel.Height = sv.Panel.Height - removePanel.H";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getHeight"),_removepanel.runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight")}, "--",2, 0)));
 BA.debugLineNum = 95;BA.debugLine="items.RemoveAt(Index)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_items").runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 96;BA.debugLine="panels.RemoveAt(Index)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_panels").runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 97;BA.debugLine="removePanel.RemoveView";
Debug.ShouldStop(1);
_removepanel.runVoidMethod ("RemoveView");
 BA.debugLineNum = 98;BA.debugLine="End Sub";
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
}