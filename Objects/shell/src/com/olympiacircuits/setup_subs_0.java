package com.olympiacircuits;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class setup_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (setup) ","setup",7,setup.mostCurrent.activityBA,setup.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) return setup.remoteMe.runUserSub(false, "setup","activity_create", _firsttime);
RemoteObject _current = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _main_view = RemoteObject.declareNull("com.olympiacircuits.customlistview");
RemoteObject _j = RemoteObject.createImmutable(0);
RemoteObject _bg1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _clrs = null;
RemoteObject _a_panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _pick_period = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
RemoteObject _pick_unit = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
RemoteObject _pick_time1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
RemoteObject _pick_time2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
RemoteObject _control_id = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _a_line = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable(0);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"setup\")";
Debug.ShouldStop(1048576);
setup.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("setup")),setup.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="Dim current As List";
Debug.ShouldStop(4194304);
_current = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("current", _current);
 BA.debugLineNum = 24;BA.debugLine="current.Initialize";
Debug.ShouldStop(8388608);
_current.runVoidMethod ("Initialize");
 BA.debugLineNum = 25;BA.debugLine="current = CallSub2(activity_db,\"get_lines\",\"selec";
Debug.ShouldStop(16777216);
_current.setObject(setup.mostCurrent.__c.runMethodAndSync(false,"CallSubNew2",setup.mostCurrent.activityBA,(Object)((setup.mostCurrent._activity_db.getObject())),(Object)(BA.ObjectToString("get_lines")),(Object)((RemoteObject.createImmutable("select action,period,unit,time1,time2 from scheduler order by action")))));
 BA.debugLineNum = 27;BA.debugLine="Dim main_view As CustomListView";
Debug.ShouldStop(67108864);
_main_view = RemoteObject.createNew ("com.olympiacircuits.customlistview");Debug.locals.put("main_view", _main_view);
 BA.debugLineNum = 28;BA.debugLine="Dim j As Int";
Debug.ShouldStop(134217728);
_j = RemoteObject.createImmutable(0);Debug.locals.put("j", _j);
 BA.debugLineNum = 29;BA.debugLine="Dim bg1 As GradientDrawable";
Debug.ShouldStop(268435456);
_bg1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("bg1", _bg1);
 BA.debugLineNum = 30;BA.debugLine="Dim Clrs(2) As Int";
Debug.ShouldStop(536870912);
_clrs = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 31;BA.debugLine="Clrs(0) = Colors.Black";
Debug.ShouldStop(1073741824);
_clrs.setArrayElement (setup.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 32;BA.debugLine="Clrs(1) = Colors.Gray";
Debug.ShouldStop(-2147483648);
_clrs.setArrayElement (setup.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"),BA.numberCast(int.class, 1));
 BA.debugLineNum = 33;BA.debugLine="main_view.Initialize(Me,\"main_view\")";
Debug.ShouldStop(1);
_main_view.runClassMethod (com.olympiacircuits.customlistview.class, "_initialize",setup.mostCurrent.activityBA,(Object)(setup.getObject()),(Object)(RemoteObject.createImmutable("main_view")));
 BA.debugLineNum = 34;BA.debugLine="Activity.AddView(main_view.AsView,2%x,10%y,90%x,8";
Debug.ShouldStop(2);
setup.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_main_view.runClassMethod (com.olympiacircuits.customlistview.class, "_asview").getObject())),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),setup.mostCurrent.activityBA)));
 BA.debugLineNum = 35;BA.debugLine="bg1.Initialize(\"TOP_BOTTOM\",Clrs)";
Debug.ShouldStop(4);
_bg1.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clrs));
 BA.debugLineNum = 36;BA.debugLine="Log(\"populating \" & current.Size & \" rows\")";
Debug.ShouldStop(8);
setup.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("populating "),_current.runMethod(true,"getSize"),RemoteObject.createImmutable(" rows"))));
 BA.debugLineNum = 37;BA.debugLine="For j = 1 To current.Size";
Debug.ShouldStop(16);
{
final int step21 = 1;
final int limit21 = _current.runMethod(true,"getSize").<Integer>get().intValue();
for (_j = BA.numberCast(int.class, 1); (step21 > 0 && _j.<Integer>get().intValue() <= limit21) || (step21 < 0 && _j.<Integer>get().intValue() >= limit21); _j = RemoteObject.createImmutable((int)(0 + _j.<Integer>get().intValue() + step21))) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 38;BA.debugLine="Dim a_panel As Panel";
Debug.ShouldStop(32);
_a_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("a_panel", _a_panel);
 BA.debugLineNum = 39;BA.debugLine="Dim pick_period As Spinner";
Debug.ShouldStop(64);
_pick_period = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");Debug.locals.put("pick_period", _pick_period);
 BA.debugLineNum = 40;BA.debugLine="Dim pick_unit As Spinner";
Debug.ShouldStop(128);
_pick_unit = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");Debug.locals.put("pick_unit", _pick_unit);
 BA.debugLineNum = 41;BA.debugLine="Dim pick_time1 As Spinner";
Debug.ShouldStop(256);
_pick_time1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");Debug.locals.put("pick_time1", _pick_time1);
 BA.debugLineNum = 42;BA.debugLine="Dim pick_time2 As Spinner";
Debug.ShouldStop(512);
_pick_time2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");Debug.locals.put("pick_time2", _pick_time2);
 BA.debugLineNum = 43;BA.debugLine="Dim control_id As Label";
Debug.ShouldStop(1024);
_control_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("control_id", _control_id);
 BA.debugLineNum = 44;BA.debugLine="Dim a_line As List";
Debug.ShouldStop(2048);
_a_line = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("a_line", _a_line);
 BA.debugLineNum = 45;BA.debugLine="Dim k As Int";
Debug.ShouldStop(4096);
_k = RemoteObject.createImmutable(0);Debug.locals.put("k", _k);
 BA.debugLineNum = 46;BA.debugLine="a_line.Initialize";
Debug.ShouldStop(8192);
_a_line.runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="a_line.AddAll(current.Get(j-1))";
Debug.ShouldStop(16384);
_a_line.runVoidMethod ("AddAll",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _current.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_j,RemoteObject.createImmutable(1)}, "-",1, 1)))));
 BA.debugLineNum = 48;BA.debugLine="pick_period.Initialize(\"spinners\")";
Debug.ShouldStop(32768);
_pick_period.runVoidMethod ("Initialize",setup.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("spinners")));
 BA.debugLineNum = 49;BA.debugLine="pick_unit.Initialize(\"spinners\")";
Debug.ShouldStop(65536);
_pick_unit.runVoidMethod ("Initialize",setup.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("spinners")));
 BA.debugLineNum = 50;BA.debugLine="pick_time1.Initialize(\"spinners\")";
Debug.ShouldStop(131072);
_pick_time1.runVoidMethod ("Initialize",setup.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("spinners")));
 BA.debugLineNum = 51;BA.debugLine="pick_time2.Initialize(\"spinners\")";
Debug.ShouldStop(262144);
_pick_time2.runVoidMethod ("Initialize",setup.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("spinners")));
 BA.debugLineNum = 52;BA.debugLine="pick_period.AddAll(Array As String(\"1\",\"2\",\"3\",\"";
Debug.ShouldStop(524288);
_pick_period.runVoidMethod ("AddAll",(Object)(setup.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {8},new Object[] {BA.ObjectToString("1"),BA.ObjectToString("2"),BA.ObjectToString("3"),BA.ObjectToString("4"),BA.ObjectToString("5"),BA.ObjectToString("10"),BA.ObjectToString("15"),RemoteObject.createImmutable("30")})))));
 BA.debugLineNum = 53;BA.debugLine="pick_unit.AddAll(Array As String(\"sec\",\"min\",\"hr";
Debug.ShouldStop(1048576);
_pick_unit.runVoidMethod ("AddAll",(Object)(setup.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("sec"),BA.ObjectToString("min"),BA.ObjectToString("hr"),RemoteObject.createImmutable("day")})))));
 BA.debugLineNum = 54;BA.debugLine="pick_time1.AddAll(Array As String(\"0\",\"1\",\"2\",\"3";
Debug.ShouldStop(2097152);
_pick_time1.runVoidMethod ("AddAll",(Object)(setup.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {24},new Object[] {BA.ObjectToString("0"),BA.ObjectToString("1"),BA.ObjectToString("2"),BA.ObjectToString("3"),BA.ObjectToString("4"),BA.ObjectToString("5"),BA.ObjectToString("6"),BA.ObjectToString("7"),BA.ObjectToString("8"),BA.ObjectToString("9"),BA.ObjectToString("10"),BA.ObjectToString("11"),BA.ObjectToString("12"),BA.ObjectToString("13"),BA.ObjectToString("14"),BA.ObjectToString("15"),BA.ObjectToString("16"),BA.ObjectToString("17"),BA.ObjectToString("18"),BA.ObjectToString("19"),BA.ObjectToString("20"),BA.ObjectToString("21"),BA.ObjectToString("22"),RemoteObject.createImmutable("23")})))));
 BA.debugLineNum = 55;BA.debugLine="pick_time2.AddAll(Array As String(\"0\",\"1\",\"2\",\"3";
Debug.ShouldStop(4194304);
_pick_time2.runVoidMethod ("AddAll",(Object)(setup.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {24},new Object[] {BA.ObjectToString("0"),BA.ObjectToString("1"),BA.ObjectToString("2"),BA.ObjectToString("3"),BA.ObjectToString("4"),BA.ObjectToString("5"),BA.ObjectToString("6"),BA.ObjectToString("7"),BA.ObjectToString("8"),BA.ObjectToString("9"),BA.ObjectToString("10"),BA.ObjectToString("11"),BA.ObjectToString("12"),BA.ObjectToString("13"),BA.ObjectToString("14"),BA.ObjectToString("15"),BA.ObjectToString("16"),BA.ObjectToString("17"),BA.ObjectToString("18"),BA.ObjectToString("19"),BA.ObjectToString("20"),BA.ObjectToString("21"),BA.ObjectToString("22"),RemoteObject.createImmutable("23")})))));
 BA.debugLineNum = 56;BA.debugLine="control_id.Initialize(\"x\")";
Debug.ShouldStop(8388608);
_control_id.runVoidMethod ("Initialize",setup.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("x")));
 BA.debugLineNum = 57;BA.debugLine="control_id.Text = a_line.Get(0)";
Debug.ShouldStop(16777216);
_control_id.runMethod(true,"setText",_a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 58;BA.debugLine="pick_period.Tag = Array As String(a_line.Get(0),";
Debug.ShouldStop(33554432);
_pick_period.runMethod(false,"setTag",(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString(_a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable("period")})));
 BA.debugLineNum = 59;BA.debugLine="pick_unit.Tag = Array As String(a_line.Get(0),\"u";
Debug.ShouldStop(67108864);
_pick_unit.runMethod(false,"setTag",(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString(_a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable("unit")})));
 BA.debugLineNum = 60;BA.debugLine="pick_time1.Tag = Array As String(a_line.Get(0),\"";
Debug.ShouldStop(134217728);
_pick_time1.runMethod(false,"setTag",(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString(_a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable("time1")})));
 BA.debugLineNum = 61;BA.debugLine="pick_time2.Tag = Array As String(a_line.Get(0),\"";
Debug.ShouldStop(268435456);
_pick_time2.runMethod(false,"setTag",(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString(_a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable("time2")})));
 BA.debugLineNum = 63;BA.debugLine="For k = 0 To pick_time2.Size";
Debug.ShouldStop(1073741824);
{
final int step46 = 1;
final int limit46 = _pick_time2.runMethod(true,"getSize").<Integer>get().intValue();
for (_k = BA.numberCast(int.class, 0); (step46 > 0 && _k.<Integer>get().intValue() <= limit46) || (step46 < 0 && _k.<Integer>get().intValue() >= limit46); _k = RemoteObject.createImmutable((int)(0 + _k.<Integer>get().intValue() + step46))) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 64;BA.debugLine="If k < pick_period.Size Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",_k,BA.numberCast(double.class, _pick_period.runMethod(true,"getSize")))) { 
 BA.debugLineNum = 65;BA.debugLine="If pick_period.GetItem(k) = a_line.Get(1) Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_pick_period.runMethod(true,"GetItem",(Object)(_k)),BA.ObjectToString(_a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))))) { 
_pick_period.runMethod(true,"setSelectedIndex",_k);};
 };
 BA.debugLineNum = 67;BA.debugLine="If k < pick_unit.size Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("<",_k,BA.numberCast(double.class, _pick_unit.runMethod(true,"getSize")))) { 
 BA.debugLineNum = 68;BA.debugLine="If pick_unit.GetItem(k) = a_line.Get(2) Then p";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_pick_unit.runMethod(true,"GetItem",(Object)(_k)),BA.ObjectToString(_a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2)))))) { 
_pick_unit.runMethod(true,"setSelectedIndex",_k);};
 };
 BA.debugLineNum = 70;BA.debugLine="If k < pick_time1.Size Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",_k,BA.numberCast(double.class, _pick_time1.runMethod(true,"getSize")))) { 
 BA.debugLineNum = 71;BA.debugLine="If pick_time1.GetItem(k) = a_line.Get(3) Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_pick_time1.runMethod(true,"GetItem",(Object)(_k)),BA.ObjectToString(_a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 3)))))) { 
_pick_time1.runMethod(true,"setSelectedIndex",_k);};
 };
 BA.debugLineNum = 73;BA.debugLine="If k < pick_time2.Size Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("<",_k,BA.numberCast(double.class, _pick_time2.runMethod(true,"getSize")))) { 
 BA.debugLineNum = 74;BA.debugLine="If pick_time2.GetItem(k) = a_line.Get(4) Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_pick_time2.runMethod(true,"GetItem",(Object)(_k)),BA.ObjectToString(_a_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 4)))))) { 
_pick_time2.runMethod(true,"setSelectedIndex",_k);};
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 77;BA.debugLine="control_id.TextSize = 18";
Debug.ShouldStop(4096);
_control_id.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 78;BA.debugLine="control_id.TextColor = Colors.White";
Debug.ShouldStop(8192);
_control_id.runMethod(true,"setTextColor",setup.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 80;BA.debugLine="a_panel.Initialize(\"x\")";
Debug.ShouldStop(32768);
_a_panel.runVoidMethod ("Initialize",setup.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("x")));
 BA.debugLineNum = 81;BA.debugLine="a_panel.Background = bg1";
Debug.ShouldStop(65536);
_a_panel.runMethod(false,"setBackground",(_bg1.getObject()));
 BA.debugLineNum = 82;BA.debugLine="a_panel.AddView(control_id,1%x,1%y,20%x,15%y)";
Debug.ShouldStop(131072);
_a_panel.runVoidMethod ("AddView",(Object)((_control_id.getObject())),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),setup.mostCurrent.activityBA)));
 BA.debugLineNum = 83;BA.debugLine="a_panel.AddView(pick_period,21%x,1%y,15%x,15%y)";
Debug.ShouldStop(262144);
_a_panel.runVoidMethod ("AddView",(Object)((_pick_period.getObject())),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 21)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),setup.mostCurrent.activityBA)));
 BA.debugLineNum = 84;BA.debugLine="a_panel.AddView(pick_unit,37%x,1%y,15%x,15%y)";
Debug.ShouldStop(524288);
_a_panel.runVoidMethod ("AddView",(Object)((_pick_unit.getObject())),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 37)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),setup.mostCurrent.activityBA)));
 BA.debugLineNum = 85;BA.debugLine="a_panel.AddView(pick_time1,53%x,1%y,15%x,15%y)";
Debug.ShouldStop(1048576);
_a_panel.runVoidMethod ("AddView",(Object)((_pick_time1.getObject())),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 53)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),setup.mostCurrent.activityBA)));
 BA.debugLineNum = 86;BA.debugLine="a_panel.AddView(pick_time2,69%x,1%y,15%x,15%y)";
Debug.ShouldStop(2097152);
_a_panel.runVoidMethod ("AddView",(Object)((_pick_time2.getObject())),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 69)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),setup.mostCurrent.activityBA)));
 BA.debugLineNum = 87;BA.debugLine="main_view.Add(a_panel,20%y,\"panels\")";
Debug.ShouldStop(4194304);
_main_view.runClassMethod (com.olympiacircuits.customlistview.class, "_add",(Object)(_a_panel),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),setup.mostCurrent.activityBA)),(Object)((RemoteObject.createImmutable("panels"))));
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 90;BA.debugLine="show.Initialize(\"show\")";
Debug.ShouldStop(33554432);
setup.mostCurrent._show.runVoidMethod ("Initialize",setup.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("show")));
 BA.debugLineNum = 91;BA.debugLine="show.Color = Colors.White";
Debug.ShouldStop(67108864);
setup.mostCurrent._show.runVoidMethod ("setColor",setup.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 92;BA.debugLine="show.TextColor = Colors.Black";
Debug.ShouldStop(134217728);
setup.mostCurrent._show.runMethod(true,"setTextColor",setup.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 93;BA.debugLine="a_panel.AddView(show,5%x,2%y,20%x,18%y)";
Debug.ShouldStop(268435456);
_a_panel.runVoidMethod ("AddView",(Object)((setup.mostCurrent._show.getObject())),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 18)),setup.mostCurrent.activityBA)));
 BA.debugLineNum = 94;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (setup) ","setup",7,setup.mostCurrent.activityBA,setup.mostCurrent,100);
if (RapidSub.canDelegate("activity_pause")) return setup.remoteMe.runUserSub(false, "setup","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 100;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 102;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (setup) ","setup",7,setup.mostCurrent.activityBA,setup.mostCurrent,96);
if (RapidSub.canDelegate("activity_resume")) return setup.remoteMe.runUserSub(false, "setup","activity_resume");
 BA.debugLineNum = 96;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim show As Button";
setup.mostCurrent._show = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Type event_group (event As String, period As Int,";
;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _show_click() throws Exception{
try {
		Debug.PushSubsStack("show_Click (setup) ","setup",7,setup.mostCurrent.activityBA,setup.mostCurrent,115);
if (RapidSub.canDelegate("show_click")) return setup.remoteMe.runUserSub(false, "setup","show_click");
RemoteObject _next_sch = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog");
RemoteObject _lv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
RemoteObject _pn1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _k = RemoteObject.createImmutable(0);
RemoteObject _line = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _a_str = RemoteObject.createImmutable("");
 BA.debugLineNum = 115;BA.debugLine="Sub show_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="CallSub(activity_db,\"update_schedule\")";
Debug.ShouldStop(524288);
setup.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",setup.mostCurrent.activityBA,(Object)((setup.mostCurrent._activity_db.getObject())),(Object)(RemoteObject.createImmutable("update_schedule")));
 BA.debugLineNum = 117;BA.debugLine="Dim next_sch As List";
Debug.ShouldStop(1048576);
_next_sch = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("next_sch", _next_sch);
 BA.debugLineNum = 118;BA.debugLine="next_sch.Initialize";
Debug.ShouldStop(2097152);
_next_sch.runVoidMethod ("Initialize");
 BA.debugLineNum = 119;BA.debugLine="next_sch =CallSub2(activity_db, \"get_lines\",\"sele";
Debug.ShouldStop(4194304);
_next_sch.setObject(setup.mostCurrent.__c.runMethodAndSync(false,"CallSubNew2",setup.mostCurrent.activityBA,(Object)((setup.mostCurrent._activity_db.getObject())),(Object)(BA.ObjectToString("get_lines")),(Object)((RemoteObject.createImmutable("select action,next_rt from schedule order by action")))));
 BA.debugLineNum = 121;BA.debugLine="Dim cd As CustomDialog";
Debug.ShouldStop(16777216);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 122;BA.debugLine="Dim lv As ListView";
Debug.ShouldStop(33554432);
_lv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");Debug.locals.put("lv", _lv);
 BA.debugLineNum = 123;BA.debugLine="Dim pn1 As Panel";
Debug.ShouldStop(67108864);
_pn1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pn1", _pn1);
 BA.debugLineNum = 124;BA.debugLine="Dim ret As Int";
Debug.ShouldStop(134217728);
_ret = RemoteObject.createImmutable(0);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 125;BA.debugLine="pn1.Initialize(\"x\")";
Debug.ShouldStop(268435456);
_pn1.runVoidMethod ("Initialize",setup.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("x")));
 BA.debugLineNum = 126;BA.debugLine="lv.Initialize(\"x\")";
Debug.ShouldStop(536870912);
_lv.runVoidMethod ("Initialize",setup.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("x")));
 BA.debugLineNum = 127;BA.debugLine="Dim k As Int";
Debug.ShouldStop(1073741824);
_k = RemoteObject.createImmutable(0);Debug.locals.put("k", _k);
 BA.debugLineNum = 128;BA.debugLine="For k = 0 To next_sch.size-1";
Debug.ShouldStop(-2147483648);
{
final int step101 = 1;
final int limit101 = RemoteObject.solve(new RemoteObject[] {_next_sch.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_k = BA.numberCast(int.class, 0); (step101 > 0 && _k.<Integer>get().intValue() <= limit101) || (step101 < 0 && _k.<Integer>get().intValue() >= limit101); _k = RemoteObject.createImmutable((int)(0 + _k.<Integer>get().intValue() + step101))) {
Debug.locals.put("k", _k);
 BA.debugLineNum = 129;BA.debugLine="Dim line As List";
Debug.ShouldStop(1);
_line = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("line", _line);
 BA.debugLineNum = 130;BA.debugLine="line = next_sch.Get(k)";
Debug.ShouldStop(2);
_line.setObject(_next_sch.runMethod(false,"Get",(Object)(_k)));
 BA.debugLineNum = 131;BA.debugLine="Dim a_str As String";
Debug.ShouldStop(4);
_a_str = RemoteObject.createImmutable("");Debug.locals.put("a_str", _a_str);
 BA.debugLineNum = 132;BA.debugLine="a_str = line.Get(0) & \" \" & line.Get(1)";
Debug.ShouldStop(8);
_a_str = RemoteObject.concat(_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(" "),_line.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("a_str", _a_str);
 BA.debugLineNum = 133;BA.debugLine="lv.AddSingleLine(a_str)";
Debug.ShouldStop(16);
_lv.runVoidMethod ("AddSingleLine",(Object)(_a_str));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 135;BA.debugLine="pn1.AddView(lv,1%x,1%y,90%x,60%y)";
Debug.ShouldStop(64);
_pn1.runVoidMethod ("AddView",(Object)((_lv.getObject())),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 60)),setup.mostCurrent.activityBA)));
 BA.debugLineNum = 136;BA.debugLine="cd.AddView(pn1,1%x,1%y,90%x,60%y)";
Debug.ShouldStop(128);
_cd.runVoidMethod ("AddView",(Object)((_pn1.getObject())),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),setup.mostCurrent.activityBA)),(Object)(setup.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 60)),setup.mostCurrent.activityBA)));
 BA.debugLineNum = 137;BA.debugLine="ret = cd.Show(\"Schedule\",\"OK\",\"\",\"\",Null)";
Debug.ShouldStop(256);
_ret = _cd.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Schedule")),(Object)(BA.ObjectToString("OK")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),setup.mostCurrent.activityBA,(Object)((setup.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinners_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinners_itemClick (setup) ","setup",7,setup.mostCurrent.activityBA,setup.mostCurrent,105);
if (RapidSub.canDelegate("spinners_itemclick")) return setup.remoteMe.runUserSub(false, "setup","spinners_itemclick", _position, _value);
RemoteObject _spin = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
RemoteObject _tag_info = null;
RemoteObject _q1 = RemoteObject.createImmutable("");
Debug.locals.put("position", _position);
Debug.locals.put("value", _value);
 BA.debugLineNum = 105;BA.debugLine="Sub spinners_itemClick(position As Int, value As S";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="Dim spin As Spinner";
Debug.ShouldStop(512);
_spin = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");Debug.locals.put("spin", _spin);
 BA.debugLineNum = 107;BA.debugLine="Dim tag_info() As String";
Debug.ShouldStop(1024);
_tag_info = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("tag_info", _tag_info);
 BA.debugLineNum = 108;BA.debugLine="Dim q1 As String";
Debug.ShouldStop(2048);
_q1 = RemoteObject.createImmutable("");Debug.locals.put("q1", _q1);
 BA.debugLineNum = 109;BA.debugLine="spin = Sender";
Debug.ShouldStop(4096);
_spin.setObject(setup.mostCurrent.__c.runMethod(false,"Sender",setup.mostCurrent.activityBA));
 BA.debugLineNum = 110;BA.debugLine="tag_info = spin.Tag";
Debug.ShouldStop(8192);
_tag_info = (_spin.runMethod(false,"getTag"));Debug.locals.put("tag_info", _tag_info);
 BA.debugLineNum = 111;BA.debugLine="q1 = \"update scheduler set \" & tag_info(1) & \" =";
Debug.ShouldStop(16384);
_q1 = RemoteObject.concat(RemoteObject.createImmutable("update scheduler set "),_tag_info.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable(" = '"),_value,RemoteObject.createImmutable("' where action = '"),_tag_info.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable("'"));Debug.locals.put("q1", _q1);
 BA.debugLineNum = 112;BA.debugLine="CallSubDelayed2(activity_db,\"do_query\",q1)";
Debug.ShouldStop(32768);
setup.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",setup.mostCurrent.activityBA,(Object)((setup.mostCurrent._activity_db.getObject())),(Object)(BA.ObjectToString("do_query")),(Object)((_q1)));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
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
}