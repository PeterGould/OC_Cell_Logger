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
	StartServiceAt("",DateTime.Now + 30*30*1000,True)
	'make sure the service isn't killed
	'Service.StartForeground
	'launch camera
	StartActivity(camera_activity)
End Sub

Sub Service_Destroy

End Sub
