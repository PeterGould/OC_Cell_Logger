package com.olympiacircuits;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class setup extends Activity implements B4AActivity{
	public static setup mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFirst) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.olympiacircuits", "com.olympiacircuits.setup");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (setup).");
				p.finish();
			}
		}
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		mostCurrent = this;
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, true))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "com.olympiacircuits", "com.olympiacircuits.setup");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.olympiacircuits.setup", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (setup) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (setup) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEvent(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return setup.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null) //workaround for emulator bug (Issue 2423)
            return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (setup) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (setup) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static class _event_group{
public boolean IsInitialized;
public String event;
public int period;
public String period_type;
public int start_hour;
public int end_hour;
public void Initialize() {
IsInitialized = true;
event = "";
period = 0;
period_type = "";
start_hour = 0;
end_hour = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ButtonWrapper _show = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public anywheresoftware.b4a.samples.gmailcontacts.modrequest _modrequest = null;
public anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring _svcmonitoring = null;
public com.olympiacircuits.main _main = null;
public com.olympiacircuits.bt_interact _bt_interact = null;
public com.olympiacircuits.activity_db _activity_db = null;
public com.olympiacircuits.file_manager _file_manager = null;
public com.olympiacircuits.camera_activity _camera_activity = null;
public com.olympiacircuits.main_controller _main_controller = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="setup";
anywheresoftware.b4a.objects.collections.List _current = null;
com.olympiacircuits.customlistview _main_view = null;
int _j = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _bg1 = null;
int[] _clrs = null;
anywheresoftware.b4a.objects.PanelWrapper _a_panel = null;
anywheresoftware.b4a.objects.SpinnerWrapper _pick_period = null;
anywheresoftware.b4a.objects.SpinnerWrapper _pick_unit = null;
anywheresoftware.b4a.objects.SpinnerWrapper _pick_time1 = null;
anywheresoftware.b4a.objects.SpinnerWrapper _pick_time2 = null;
anywheresoftware.b4a.objects.LabelWrapper _control_id = null;
anywheresoftware.b4a.objects.collections.List _a_line = null;
int _k = 0;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Activity.LoadLayout(\"setup\")";
mostCurrent._activity.LoadLayout("setup",mostCurrent.activityBA);
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="Dim current As List";
_current = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="current.Initialize";
_current.Initialize();
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="current = CallSub2(activity_db,\"get_lines\",\"selec";
_current.setObject((java.util.List)(anywheresoftware.b4a.keywords.Common.CallSubNew2(mostCurrent.activityBA,(Object)(mostCurrent._activity_db.getObject()),"get_lines",(Object)("select action,period,unit,time1,time2 from scheduler order by action"))));
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="Dim main_view As CustomListView";
_main_view = new com.olympiacircuits.customlistview();
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="Dim j As Int";
_j = 0;
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="Dim bg1 As GradientDrawable";
_bg1 = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=3997707;
 //BA.debugLineNum = 3997707;BA.debugLine="Dim Clrs(2) As Int";
_clrs = new int[(int) (2)];
;
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="Clrs(0) = Colors.Black";
_clrs[(int) (0)] = anywheresoftware.b4a.keywords.Common.Colors.Black;
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="Clrs(1) = Colors.Gray";
_clrs[(int) (1)] = anywheresoftware.b4a.keywords.Common.Colors.Gray;
RDebugUtils.currentLine=3997710;
 //BA.debugLineNum = 3997710;BA.debugLine="main_view.Initialize(Me,\"main_view\")";
_main_view._initialize(null,mostCurrent.activityBA,setup.getObject(),"main_view");
RDebugUtils.currentLine=3997711;
 //BA.debugLineNum = 3997711;BA.debugLine="Activity.AddView(main_view.AsView,2%x,10%y,90%x,8";
mostCurrent._activity.AddView((android.view.View)(_main_view._asview(null).getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (80),mostCurrent.activityBA));
RDebugUtils.currentLine=3997712;
 //BA.debugLineNum = 3997712;BA.debugLine="bg1.Initialize(\"TOP_BOTTOM\",Clrs)";
_bg1.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=3997713;
 //BA.debugLineNum = 3997713;BA.debugLine="Log(\"populating \" & current.Size & \" rows\")";
anywheresoftware.b4a.keywords.Common.Log("populating "+BA.NumberToString(_current.getSize())+" rows");
RDebugUtils.currentLine=3997714;
 //BA.debugLineNum = 3997714;BA.debugLine="For j = 1 To current.Size";
{
final int step21 = 1;
final int limit21 = _current.getSize();
for (_j = (int) (1); (step21 > 0 && _j <= limit21) || (step21 < 0 && _j >= limit21); _j = ((int)(0 + _j + step21))) {
RDebugUtils.currentLine=3997715;
 //BA.debugLineNum = 3997715;BA.debugLine="Dim a_panel As Panel";
_a_panel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3997716;
 //BA.debugLineNum = 3997716;BA.debugLine="Dim pick_period As Spinner";
_pick_period = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=3997717;
 //BA.debugLineNum = 3997717;BA.debugLine="Dim pick_unit As Spinner";
_pick_unit = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=3997718;
 //BA.debugLineNum = 3997718;BA.debugLine="Dim pick_time1 As Spinner";
_pick_time1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=3997719;
 //BA.debugLineNum = 3997719;BA.debugLine="Dim pick_time2 As Spinner";
_pick_time2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=3997720;
 //BA.debugLineNum = 3997720;BA.debugLine="Dim control_id As Label";
_control_id = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3997721;
 //BA.debugLineNum = 3997721;BA.debugLine="Dim a_line As List";
_a_line = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3997722;
 //BA.debugLineNum = 3997722;BA.debugLine="Dim k As Int";
_k = 0;
RDebugUtils.currentLine=3997723;
 //BA.debugLineNum = 3997723;BA.debugLine="a_line.Initialize";
_a_line.Initialize();
RDebugUtils.currentLine=3997724;
 //BA.debugLineNum = 3997724;BA.debugLine="a_line.AddAll(current.Get(j-1))";
_a_line.AddAll((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_current.Get((int) (_j-1)))));
RDebugUtils.currentLine=3997725;
 //BA.debugLineNum = 3997725;BA.debugLine="pick_period.Initialize(\"spinners\")";
_pick_period.Initialize(mostCurrent.activityBA,"spinners");
RDebugUtils.currentLine=3997726;
 //BA.debugLineNum = 3997726;BA.debugLine="pick_unit.Initialize(\"spinners\")";
_pick_unit.Initialize(mostCurrent.activityBA,"spinners");
RDebugUtils.currentLine=3997727;
 //BA.debugLineNum = 3997727;BA.debugLine="pick_time1.Initialize(\"spinners\")";
_pick_time1.Initialize(mostCurrent.activityBA,"spinners");
RDebugUtils.currentLine=3997728;
 //BA.debugLineNum = 3997728;BA.debugLine="pick_time2.Initialize(\"spinners\")";
_pick_time2.Initialize(mostCurrent.activityBA,"spinners");
RDebugUtils.currentLine=3997729;
 //BA.debugLineNum = 3997729;BA.debugLine="pick_period.AddAll(Array As String(\"1\",\"2\",\"3\",\"";
_pick_period.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"1","2","3","4","5","10","15","30"}));
RDebugUtils.currentLine=3997730;
 //BA.debugLineNum = 3997730;BA.debugLine="pick_unit.AddAll(Array As String(\"sec\",\"min\",\"hr";
_pick_unit.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"sec","min","hr","day"}));
RDebugUtils.currentLine=3997731;
 //BA.debugLineNum = 3997731;BA.debugLine="pick_time1.AddAll(Array As String(\"0\",\"1\",\"2\",\"3";
_pick_time1.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"}));
RDebugUtils.currentLine=3997732;
 //BA.debugLineNum = 3997732;BA.debugLine="pick_time2.AddAll(Array As String(\"0\",\"1\",\"2\",\"3";
_pick_time2.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"}));
RDebugUtils.currentLine=3997733;
 //BA.debugLineNum = 3997733;BA.debugLine="control_id.Initialize(\"x\")";
_control_id.Initialize(mostCurrent.activityBA,"x");
RDebugUtils.currentLine=3997734;
 //BA.debugLineNum = 3997734;BA.debugLine="control_id.Text = a_line.Get(0)";
_control_id.setText(_a_line.Get((int) (0)));
RDebugUtils.currentLine=3997735;
 //BA.debugLineNum = 3997735;BA.debugLine="pick_period.Tag = Array As String(a_line.Get(0),";
_pick_period.setTag((Object)(new String[]{BA.ObjectToString(_a_line.Get((int) (0))),"period"}));
RDebugUtils.currentLine=3997736;
 //BA.debugLineNum = 3997736;BA.debugLine="pick_unit.Tag = Array As String(a_line.Get(0),\"u";
_pick_unit.setTag((Object)(new String[]{BA.ObjectToString(_a_line.Get((int) (0))),"unit"}));
RDebugUtils.currentLine=3997737;
 //BA.debugLineNum = 3997737;BA.debugLine="pick_time1.Tag = Array As String(a_line.Get(0),\"";
_pick_time1.setTag((Object)(new String[]{BA.ObjectToString(_a_line.Get((int) (0))),"time1"}));
RDebugUtils.currentLine=3997738;
 //BA.debugLineNum = 3997738;BA.debugLine="pick_time2.Tag = Array As String(a_line.Get(0),\"";
_pick_time2.setTag((Object)(new String[]{BA.ObjectToString(_a_line.Get((int) (0))),"time2"}));
RDebugUtils.currentLine=3997740;
 //BA.debugLineNum = 3997740;BA.debugLine="For k = 0 To pick_time2.Size";
{
final int step46 = 1;
final int limit46 = _pick_time2.getSize();
for (_k = (int) (0); (step46 > 0 && _k <= limit46) || (step46 < 0 && _k >= limit46); _k = ((int)(0 + _k + step46))) {
RDebugUtils.currentLine=3997741;
 //BA.debugLineNum = 3997741;BA.debugLine="If k < pick_period.Size Then";
if (_k<_pick_period.getSize()) { 
RDebugUtils.currentLine=3997742;
 //BA.debugLineNum = 3997742;BA.debugLine="If pick_period.GetItem(k) = a_line.Get(1) Then";
if ((_pick_period.GetItem(_k)).equals(BA.ObjectToString(_a_line.Get((int) (1))))) { 
_pick_period.setSelectedIndex(_k);};
 };
RDebugUtils.currentLine=3997744;
 //BA.debugLineNum = 3997744;BA.debugLine="If k < pick_unit.size Then";
if (_k<_pick_unit.getSize()) { 
RDebugUtils.currentLine=3997745;
 //BA.debugLineNum = 3997745;BA.debugLine="If pick_unit.GetItem(k) = a_line.Get(2) Then p";
if ((_pick_unit.GetItem(_k)).equals(BA.ObjectToString(_a_line.Get((int) (2))))) { 
_pick_unit.setSelectedIndex(_k);};
 };
RDebugUtils.currentLine=3997747;
 //BA.debugLineNum = 3997747;BA.debugLine="If k < pick_time1.Size Then";
if (_k<_pick_time1.getSize()) { 
RDebugUtils.currentLine=3997748;
 //BA.debugLineNum = 3997748;BA.debugLine="If pick_time1.GetItem(k) = a_line.Get(3) Then";
if ((_pick_time1.GetItem(_k)).equals(BA.ObjectToString(_a_line.Get((int) (3))))) { 
_pick_time1.setSelectedIndex(_k);};
 };
RDebugUtils.currentLine=3997750;
 //BA.debugLineNum = 3997750;BA.debugLine="If k < pick_time2.Size Then";
if (_k<_pick_time2.getSize()) { 
RDebugUtils.currentLine=3997751;
 //BA.debugLineNum = 3997751;BA.debugLine="If pick_time2.GetItem(k) = a_line.Get(4) Then";
if ((_pick_time2.GetItem(_k)).equals(BA.ObjectToString(_a_line.Get((int) (4))))) { 
_pick_time2.setSelectedIndex(_k);};
 };
 }
};
RDebugUtils.currentLine=3997754;
 //BA.debugLineNum = 3997754;BA.debugLine="control_id.TextSize = 18";
_control_id.setTextSize((float) (18));
RDebugUtils.currentLine=3997755;
 //BA.debugLineNum = 3997755;BA.debugLine="control_id.TextColor = Colors.White";
_control_id.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=3997757;
 //BA.debugLineNum = 3997757;BA.debugLine="a_panel.Initialize(\"x\")";
_a_panel.Initialize(mostCurrent.activityBA,"x");
RDebugUtils.currentLine=3997758;
 //BA.debugLineNum = 3997758;BA.debugLine="a_panel.Background = bg1";
_a_panel.setBackground((android.graphics.drawable.Drawable)(_bg1.getObject()));
RDebugUtils.currentLine=3997759;
 //BA.debugLineNum = 3997759;BA.debugLine="a_panel.AddView(control_id,1%x,1%y,20%x,15%y)";
_a_panel.AddView((android.view.View)(_control_id.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=3997760;
 //BA.debugLineNum = 3997760;BA.debugLine="a_panel.AddView(pick_period,21%x,1%y,15%x,15%y)";
_a_panel.AddView((android.view.View)(_pick_period.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (21),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=3997761;
 //BA.debugLineNum = 3997761;BA.debugLine="a_panel.AddView(pick_unit,37%x,1%y,15%x,15%y)";
_a_panel.AddView((android.view.View)(_pick_unit.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (37),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=3997762;
 //BA.debugLineNum = 3997762;BA.debugLine="a_panel.AddView(pick_time1,53%x,1%y,15%x,15%y)";
_a_panel.AddView((android.view.View)(_pick_time1.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (53),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=3997763;
 //BA.debugLineNum = 3997763;BA.debugLine="a_panel.AddView(pick_time2,69%x,1%y,15%x,15%y)";
_a_panel.AddView((android.view.View)(_pick_time2.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (69),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=3997764;
 //BA.debugLineNum = 3997764;BA.debugLine="main_view.Add(a_panel,20%y,\"panels\")";
_main_view._add(null,_a_panel,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (20),mostCurrent.activityBA),(Object)("panels"));
 }
};
RDebugUtils.currentLine=3997767;
 //BA.debugLineNum = 3997767;BA.debugLine="show.Initialize(\"show\")";
mostCurrent._show.Initialize(mostCurrent.activityBA,"show");
RDebugUtils.currentLine=3997768;
 //BA.debugLineNum = 3997768;BA.debugLine="show.Color = Colors.White";
mostCurrent._show.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=3997769;
 //BA.debugLineNum = 3997769;BA.debugLine="show.TextColor = Colors.Black";
mostCurrent._show.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=3997770;
 //BA.debugLineNum = 3997770;BA.debugLine="a_panel.AddView(show,5%x,2%y,20%x,18%y)";
_a_panel.AddView((android.view.View)(mostCurrent._show.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (18),mostCurrent.activityBA));
RDebugUtils.currentLine=3997771;
 //BA.debugLineNum = 3997771;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="setup";
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="setup";
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return "";
}
public static String  _show_click() throws Exception{
RDebugUtils.currentModule="setup";
anywheresoftware.b4a.objects.collections.List _next_sch = null;
anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog _cd = null;
anywheresoftware.b4a.objects.ListViewWrapper _lv = null;
anywheresoftware.b4a.objects.PanelWrapper _pn1 = null;
int _ret = 0;
int _k = 0;
anywheresoftware.b4a.objects.collections.List _line = null;
String _a_str = "";
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Sub show_Click";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="CallSub(activity_db,\"update_schedule\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(mostCurrent.activityBA,(Object)(mostCurrent._activity_db.getObject()),"update_schedule");
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Dim next_sch As List";
_next_sch = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="next_sch.Initialize";
_next_sch.Initialize();
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="next_sch =CallSub2(activity_db, \"get_lines\",\"sele";
_next_sch.setObject((java.util.List)(anywheresoftware.b4a.keywords.Common.CallSubNew2(mostCurrent.activityBA,(Object)(mostCurrent._activity_db.getObject()),"get_lines",(Object)("select action,next_rt from schedule order by action"))));
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="Dim cd As CustomDialog";
_cd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog();
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="Dim lv As ListView";
_lv = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=13172744;
 //BA.debugLineNum = 13172744;BA.debugLine="Dim pn1 As Panel";
_pn1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13172745;
 //BA.debugLineNum = 13172745;BA.debugLine="Dim ret As Int";
_ret = 0;
RDebugUtils.currentLine=13172746;
 //BA.debugLineNum = 13172746;BA.debugLine="pn1.Initialize(\"x\")";
_pn1.Initialize(mostCurrent.activityBA,"x");
RDebugUtils.currentLine=13172747;
 //BA.debugLineNum = 13172747;BA.debugLine="lv.Initialize(\"x\")";
_lv.Initialize(mostCurrent.activityBA,"x");
RDebugUtils.currentLine=13172748;
 //BA.debugLineNum = 13172748;BA.debugLine="Dim k As Int";
_k = 0;
RDebugUtils.currentLine=13172749;
 //BA.debugLineNum = 13172749;BA.debugLine="For k = 0 To next_sch.size-1";
{
final int step101 = 1;
final int limit101 = (int) (_next_sch.getSize()-1);
for (_k = (int) (0); (step101 > 0 && _k <= limit101) || (step101 < 0 && _k >= limit101); _k = ((int)(0 + _k + step101))) {
RDebugUtils.currentLine=13172750;
 //BA.debugLineNum = 13172750;BA.debugLine="Dim line As List";
_line = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13172751;
 //BA.debugLineNum = 13172751;BA.debugLine="line = next_sch.Get(k)";
_line.setObject((java.util.List)(_next_sch.Get(_k)));
RDebugUtils.currentLine=13172752;
 //BA.debugLineNum = 13172752;BA.debugLine="Dim a_str As String";
_a_str = "";
RDebugUtils.currentLine=13172753;
 //BA.debugLineNum = 13172753;BA.debugLine="a_str = line.Get(0) & \" \" & line.Get(1)";
_a_str = BA.ObjectToString(_line.Get((int) (0)))+" "+BA.ObjectToString(_line.Get((int) (1)));
RDebugUtils.currentLine=13172754;
 //BA.debugLineNum = 13172754;BA.debugLine="lv.AddSingleLine(a_str)";
_lv.AddSingleLine(_a_str);
 }
};
RDebugUtils.currentLine=13172756;
 //BA.debugLineNum = 13172756;BA.debugLine="pn1.AddView(lv,1%x,1%y,90%x,60%y)";
_pn1.AddView((android.view.View)(_lv.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (60),mostCurrent.activityBA));
RDebugUtils.currentLine=13172757;
 //BA.debugLineNum = 13172757;BA.debugLine="cd.AddView(pn1,1%x,1%y,90%x,60%y)";
_cd.AddView((android.view.View)(_pn1.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (60),mostCurrent.activityBA));
RDebugUtils.currentLine=13172758;
 //BA.debugLineNum = 13172758;BA.debugLine="ret = cd.Show(\"Schedule\",\"OK\",\"\",\"\",Null)";
_ret = _cd.Show("Schedule","OK","","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=13172759;
 //BA.debugLineNum = 13172759;BA.debugLine="End Sub";
return "";
}
public static String  _spinners_itemclick(int _position,String _value) throws Exception{
RDebugUtils.currentModule="setup";
anywheresoftware.b4a.objects.SpinnerWrapper _spin = null;
String[] _tag_info = null;
String _q1 = "";
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub spinners_itemClick(position As Int, value As S";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Dim spin As Spinner";
_spin = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Dim tag_info() As String";
_tag_info = new String[(int) (0)];
java.util.Arrays.fill(_tag_info,"");
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="Dim q1 As String";
_q1 = "";
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="spin = Sender";
_spin.setObject((anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="tag_info = spin.Tag";
_tag_info = (String[])(_spin.getTag());
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="q1 = \"update scheduler set \" & tag_info(1) & \" =";
_q1 = "update scheduler set "+_tag_info[(int) (1)]+" = '"+_value+"' where action = '"+_tag_info[(int) (0)]+"'";
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="CallSubDelayed2(activity_db,\"do_query\",q1)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(mostCurrent.activityBA,(Object)(mostCurrent._activity_db.getObject()),"do_query",(Object)(_q1));
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="End Sub";
return "";
}
}