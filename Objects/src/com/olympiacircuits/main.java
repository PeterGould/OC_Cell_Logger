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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.olympiacircuits", "com.olympiacircuits.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "com.olympiacircuits", "com.olympiacircuits.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.olympiacircuits.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        anywheresoftware.b4a.samples.gmailcontacts.httputils2service._process_globals();
anywheresoftware.b4a.samples.gmailcontacts.modrequest._process_globals();
anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring._process_globals();
anywheresoftware.b4a.samples.httputils2.httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (camera_activity.mostCurrent != null);
vis = vis | (setup.mostCurrent != null);
vis = vis | (anywheresoftware.b4a.samples.gmailcontacts.modrequest.mostCurrent != null);
return vis;}

public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = main.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, bt_interact.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, activity_db.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, file_manager.class));
 {
            Activity __a = null;
            if (camera_activity.previousOne != null) {
				__a = camera_activity.previousOne.get();
			}
            else {
                BA ba = camera_activity.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, main_controller.class));
 {
            Activity __a = null;
            if (setup.previousOne != null) {
				__a = setup.previousOne.get();
			}
            else {
                BA ba = setup.mostCurrent.processBA.sharedProcessBA.activityBA.get();
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.phone.Phone _my_phone = null;
public static anywheresoftware.b4a.phone.Phone.PhoneWakeState _my_phone_state = null;
public anywheresoftware.b4a.objects.ButtonWrapper _launch_button = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public anywheresoftware.b4a.samples.gmailcontacts.modrequest _modrequest = null;
public anywheresoftware.b4a.samples.gmailcontacts.svcmonitoring _svcmonitoring = null;
public com.olympiacircuits.bt_interact _bt_interact = null;
public com.olympiacircuits.activity_db _activity_db = null;
public com.olympiacircuits.file_manager _file_manager = null;
public com.olympiacircuits.camera_activity _camera_activity = null;
public com.olympiacircuits.main_controller _main_controller = null;
public com.olympiacircuits.setup _setup = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="If FirstTime Then 'launch the helper activities";
if (_firsttime) { 
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="If IsPaused(activity_db) Then";
if (anywheresoftware.b4a.keywords.Common.IsPaused(mostCurrent.activityBA,(Object)(mostCurrent._activity_db.getObject()))) { 
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="StartService(activity_db)";
anywheresoftware.b4a.keywords.Common.StartService(mostCurrent.activityBA,(Object)(mostCurrent._activity_db.getObject()));
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="CallSubDelayed2(activity_db,\"write_activity\"";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(mostCurrent.activityBA,(Object)(mostCurrent._activity_db.getObject()),"write_activity",(Object)("App started"));
 };
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="If IsPaused(file_manager) Then StartService(file";
if (anywheresoftware.b4a.keywords.Common.IsPaused(mostCurrent.activityBA,(Object)(mostCurrent._file_manager.getObject()))) { 
anywheresoftware.b4a.keywords.Common.StartService(mostCurrent.activityBA,(Object)(mostCurrent._file_manager.getObject()));};
 };
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="Activity.LoadLayout(\"logger_layout\")";
mostCurrent._activity.LoadLayout("logger_layout",mostCurrent.activityBA);
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="StartActivity(setup)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._setup.getObject()));
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="show_launch_state";
_show_launch_state();
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="End Sub";
return "";
}
public static String  _show_launch_state() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub show_launch_state";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="If launch_button.Tag = \"stopped\" Then";
if ((mostCurrent._launch_button.getTag()).equals((Object)("stopped"))) { 
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="launch_button.Color = Colors.Green";
mostCurrent._launch_button.setColor(anywheresoftware.b4a.keywords.Common.Colors.Green);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="launch_button.Text = \"Launch\"";
mostCurrent._launch_button.setText((Object)("Launch"));
 };
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="If launch_button.Tag = \"running\" Then";
if ((mostCurrent._launch_button.getTag()).equals((Object)("running"))) { 
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="launch_button.Color = Colors.Red";
mostCurrent._launch_button.setColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="launch_button.Text = \"Running\"";
mostCurrent._launch_button.setText((Object)("Running"));
 };
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _launch_button_click() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub launch_button_Click";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="If launch_button.Tag <> \"running\" Then";
if ((mostCurrent._launch_button.getTag()).equals((Object)("running")) == false) { 
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="StartService(main_controller)";
anywheresoftware.b4a.keywords.Common.StartService(mostCurrent.activityBA,(Object)(mostCurrent._main_controller.getObject()));
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="my_phone.SetScreenBrightness(0.0)";
_my_phone.SetScreenBrightness(processBA,(float) (0.0));
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="my_phone_state.PartialLock";
_my_phone_state.PartialLock(processBA);
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="launch_button.Tag = \"running\"";
mostCurrent._launch_button.setTag((Object)("running"));
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4325387;
 //BA.debugLineNum = 4325387;BA.debugLine="If launch_button.Tag = \"running\" Then";
if ((mostCurrent._launch_button.getTag()).equals((Object)("running"))) { 
RDebugUtils.currentLine=4325388;
 //BA.debugLineNum = 4325388;BA.debugLine="my_phone_state.ReleasePartialLock";
_my_phone_state.ReleasePartialLock();
RDebugUtils.currentLine=4325389;
 //BA.debugLineNum = 4325389;BA.debugLine="my_phone_state.ReleaseKeepAlive";
_my_phone_state.ReleaseKeepAlive();
RDebugUtils.currentLine=4325390;
 //BA.debugLineNum = 4325390;BA.debugLine="StopService(main_controller)";
anywheresoftware.b4a.keywords.Common.StopService(mostCurrent.activityBA,(Object)(mostCurrent._main_controller.getObject()));
RDebugUtils.currentLine=4325391;
 //BA.debugLineNum = 4325391;BA.debugLine="my_phone.SetScreenBrightness(0.7)";
_my_phone.SetScreenBrightness(processBA,(float) (0.7));
RDebugUtils.currentLine=4325392;
 //BA.debugLineNum = 4325392;BA.debugLine="launch_button.Tag = \"stopped\"";
mostCurrent._launch_button.setTag((Object)("stopped"));
 };
RDebugUtils.currentLine=4325394;
 //BA.debugLineNum = 4325394;BA.debugLine="show_launch_state";
_show_launch_state();
RDebugUtils.currentLine=4325395;
 //BA.debugLineNum = 4325395;BA.debugLine="End Sub";
return "";
}
public static String  _service_check_click() throws Exception{
RDebugUtils.currentModule="main";
anywheresoftware.b4a.objects.ListViewWrapper _running = null;
anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog _a_dialog = null;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub service_check_Click";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim running As ListView";
_running = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Dim a_dialog As CustomDialog";
_a_dialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog();
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="running.Initialize(\"running\")";
_running.Initialize(mostCurrent.activityBA,"running");
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="running.AddSingleLine(\"None\")";
_running.AddSingleLine("None");
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="If IsPaused(main_controller) = False Then running";
if (anywheresoftware.b4a.keywords.Common.IsPaused(mostCurrent.activityBA,(Object)(mostCurrent._main_controller.getObject()))==anywheresoftware.b4a.keywords.Common.False) { 
_running.AddSingleLine("main_controller");};
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="If IsPaused(file_manager) = False Then running.Ad";
if (anywheresoftware.b4a.keywords.Common.IsPaused(mostCurrent.activityBA,(Object)(mostCurrent._file_manager.getObject()))==anywheresoftware.b4a.keywords.Common.False) { 
_running.AddSingleLine("file_manager");};
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="If IsPaused(activity_db) = False Then running.Add";
if (anywheresoftware.b4a.keywords.Common.IsPaused(mostCurrent.activityBA,(Object)(mostCurrent._activity_db.getObject()))==anywheresoftware.b4a.keywords.Common.False) { 
_running.AddSingleLine("activity_db");};
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="If IsPaused(bt_interact) = False Then running.Add";
if (anywheresoftware.b4a.keywords.Common.IsPaused(mostCurrent.activityBA,(Object)(mostCurrent._bt_interact.getObject()))==anywheresoftware.b4a.keywords.Common.False) { 
_running.AddSingleLine("bt_interact");};
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="If running.Size > 1 Then running.RemoveAt(0)";
if (_running.getSize()>1) { 
_running.RemoveAt((int) (0));};
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="a_dialog.AddView(running,5%x,5%y,80%x,80%y)";
_a_dialog.AddView((android.view.View)(_running.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (80),mostCurrent.activityBA));
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="a_dialog.Show(\"Services\",\"\",\"Close\",\"\",Null)";
_a_dialog.Show("Services","","Close","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="End Sub";
return "";
}
public static String  _test_button_click() throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub test_button_click";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="StartService(bt_interact)";
anywheresoftware.b4a.keywords.Common.StartService(mostCurrent.activityBA,(Object)(mostCurrent._bt_interact.getObject()));
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return "";
}
}