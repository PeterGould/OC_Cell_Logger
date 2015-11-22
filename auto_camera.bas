Type=Class
Version=5.2
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Dim my_camera As CameraExClass
	Dim pic_path As String
	Dim holder_panel As Panel
	Dim Mode As String = "picture"
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(camera_panel As Panel,save_path As String, set_mode As String)
		'save the path for the pictures
		pic_path = save_path
		holder_panel = camera_panel
		Mode = set_mode
		my_camera.Initialize(holder_panel,False,Me,"camera_event")
		'set some properties
		'my_camera.SetPictureSize(1600,1200)
		'my_camera.CommitParameters		
End Sub


'####Events
Sub camera_event_Ready(success As Boolean)
	
	my_camera.StartPreview
	'only continue if mode is take_picture
	If Mode <> "take_picture" Then Return
	'update some parameters
	my_camera.SetPictureSize(1920,1080)
	my_camera.SetJpegQuality(90)
	my_camera.CommitParameters
	'take picture when ready
	my_camera.TakePicture
End Sub



Sub camera_event_PictureTaken (Data() As Byte)
	Dim out As OutputStream
	Dim now As Long
	now = DateTime.Now
	out = File.OpenOutput(pic_path, now & ".jpg", False)
	out.WriteBytes(Data, 0, Data.Length)
	out.Close
	my_camera.Release
	CallSub(camera_activity,"close_self")
End Sub

'###management subs
Sub camera_close
	my_camera.StopPreview
	my_camera.Release
End Sub

