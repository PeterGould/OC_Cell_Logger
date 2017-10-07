Type=Service
Version=5.2
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Service_Create

End Sub

Sub Service_Start (StartingIntent As Intent)
	'launch the next service
	StartServiceAt("",DateTime.Now + 30*60*1000,True)
	'start in foreground with notification
	Dim main_notice As Notification
    main_notice.Initialize
    main_notice.Icon = "icon"
    main_notice.SetInfo("OC Logger","Logger Running",Main)
    main_notice.Sound=False
    main_notice.Vibrate=False
    main_notice.Light=False
    main_notice.OnGoingEvent = True
	'make sure the service isn't killed
	 Service.StartForeground(1,main_notice)
	 'make sure other services are still running
	 If IsPaused(activity_db) Then StartService(activity_db)
	 If IsPaused(file_manager) Then StartService(file_manager)
	'launch camera
	StartActivity(camera_activity)

End Sub

Sub Service_Destroy

End Sub
