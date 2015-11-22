Type=Service
Version=5.2
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
#End Region

Sub Process_Globals
	Dim root_dir As String = File.DirDefaultExternal
	Dim sub_dir As String
	Dim current_dir As String
	Dim clientId As String = "415663751514-bt7l21834iccet1uadd2frcl249p7jee.apps.googleusercontent.com"				
	Dim clientSecret As String = "9kdiSV-VdbSQC3l_ASOiSQZo"		
	Dim cls_drive As libGoogleDrive
End Sub

Sub Service_Create
	Dim now As Long
	Dim try_dir As String
	Dim add_on As Int = 1
	Dim add_string As String = ""
	DateTime.DateFormat = "yyyy-MM-dd" ' See this page regarding uppercase letters.
	now = DateTime.Now
	try_dir = "data_" & DateTime.Date(now)
	'see if directory already exists
	Do While File.IsDirectory(root_dir,try_dir & add_string) = True
		add_string = "_" & add_on
		add_on = add_on + 1
	Loop
	sub_dir = try_dir & add_string
	File.MakeDir(root_dir,sub_dir)
	'make archive dir if not there
	If File.IsDirectory(root_dir,"archive") = False Then File.MakeDir(root_dir,"archive")
	current_dir = root_dir & "/" & sub_dir
	
End Sub

Sub Service_Start (StartingIntent As Intent)

End Sub

Sub Service_Destroy

End Sub

Sub get_current_dir As String
	Return(current_dir)
End Sub

''put the current directory into a zip file
Sub archive_current_dir
	Dim an_archive As Archiver
	Dim archive_name As String
	archive_name = sub_dir & ".zip"
	Dim file_list As List
	Dim file_array() As String
	Dim i As Int
	file_list = File.ListFiles(current_dir)
	For i = 0 To file_list.Size - 1
		file_array(i) = file_list.Get(i)
	Next
	an_archive.AsyncZipFiles(current_dir,file_array,root_dir & "/archive",archive_name,"zip")
End Sub

'finished zip event
Sub zip_zipDone(success As Boolean)
	'zip completed
End Sub

'###################################################################################
'####Google Drive Upload
Sub google_drive_upload
	Log("launching google drive")
	cls_drive.Initialize(Me, "gdrive", clientId, clientSecret)
	cls_drive.ConnectToDrive
End Sub

'Event raise if connection is established
Sub gdrive_Connected(Items As Map)
	'Enable all buttons if connected
	ToastMessageShow("Connected to Google Drive.", False)
End Sub



