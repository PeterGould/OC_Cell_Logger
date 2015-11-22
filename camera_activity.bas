Type=Activity
Version=5.2
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	Dim a_camera As auto_camera
	Dim pic_panel As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	pic_panel.Initialize("pic_panel")
	Activity.AddView(pic_panel,1%x,1%y,90%x,90%y)
	a_camera.Initialize(pic_panel,CallSub(file_manager,"get_current_dir"),"take_picture")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub close_self
	Activity.Finish
End Sub
