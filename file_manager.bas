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
	Dim clientId As String = "415663751514-bh91mh1n7r80gunhj26r5unchj7nh59s.apps.googleusercontent.com"				
	Dim clientSecret As String = "K1lNN3fT8Pnw_cezd3fie9JB"		
	Dim cls_drive As libGoogleDrive
	Dim my_wifi As MLwifi
	Dim file_timer As Timer
	Dim timer_switch As String = ""
	Dim stage_file As List
End Sub


Sub Service_Create
	update_current_dir
	'make archive dir if not there
	If File.IsDirectory(root_dir,"archive") = False Then File.MakeDir(root_dir,"archive")
	'make stage dir if not there
	If File.IsDirectory(root_dir,"stage") = False Then File.MakeDir(root_dir,"stage")
	'setup timer but disable it
	file_timer.Initialize("file_timer",15*1000)
	file_timer.Enabled = False
	'other initialization
	stage_file.Initialize
End Sub

Sub Service_Start (StartingIntent As Intent)

End Sub

Sub Service_Destroy

End Sub

Sub get_current_dir As String
	'make sure current_dir is not null
	If current_dir = Null Then
		update_current_dir
	End If
	Return(current_dir)
End Sub
'##############################################################################
'Create zip archive and put in stage directory
Sub archive_current_dir
	Dim an_archive As Archiver
	Dim archive_name As String
	archive_name = sub_dir & ".zip"
	Dim file_list As List
	Dim i As Int
	file_list = File.ListFiles(current_dir)
	If file_list.isInitialized = False Then Return 'no files to process
	Dim file_array(file_list.Size) As String
	For i = 1 To file_list.Size
		file_array(i-1) = file_list.Get(i-1)
	Next
	an_archive.AsyncZipFiles(current_dir,file_array,root_dir & "/stage/",archive_name,"zip")
End Sub

'finished zip event

Sub zip_zipDone(success As Boolean,nbOfFiles As Int)
	If success = False Then Return 
	'create a new directory
	update_current_dir
	'see if network connection is available
	If my_wifi.isOnLine = False Then
	'begin upload process by trying to establish a network connection
		toggle_wifi(True)
		Return Null
	Else
	'otherwise just begin upload
		google_drive_setup
	End If
End Sub

'###################################################################################
'####Google Drive Upload

Sub google_drive_setup
	CallSubDelayed2(activity_db,"write_activity","Network connection established. Beginning upload.")
	'time out operation after 3 minutes
	timer_switch = "drive_upload"
	file_timer.Enabled = False
	file_timer.Interval =  3*60*1000 
	file_timer.Enabled = True
	cls_drive.Initialize(Me, "gdrive", clientId, clientSecret)
	cls_drive.ConnectToDrive
End Sub

'Event raise if connection is established
Sub gdrive_Connected(Items As Map)
	Log("connected to google drive")
	upload_files
End Sub


'upload files
Sub upload_files
	file_in_stage 'updates the stage_file list
	If stage_file.Get(1) = "" Then 'no more files to upload
		turn_off_network
		Return
	End If
	Log("Uploading file " & stage_file.Get(1))
	cls_drive.UploadFile(stage_file.Get(1),stage_file.Get(0),stage_file.Get(1),"","")
End Sub

'finished uploading
Sub gdrive_FileUploaded(FileID As String)
	CallSubDelayed2(activity_db,"write_activity",FileID & " successfully uploaded to Google Drive")
	Log(stage_file.Get(1) & " uploaded successfully")
	'move the current file from the stage to the archive
	File.Copy(stage_file.Get(0),stage_file.Get(1),root_dir & "/archive",stage_file.Get(1))
	'delete from stage
	If File.Exists(root_dir & "/archive", stage_file.Get(1)) Then
		File.Delete(stage_file.Get(0),stage_file.Get(1))
		Else 'if this doesn't work then there's a problem.  Probably should just stop
			CallSubDelayed2(activity_db,"write_activity","There was a problem archiving data.")
			Return
	End If
	'try to upload another file
	upload_files
End Sub

'look for a file to upload
Sub file_in_stage
	Dim the_files As List
	stage_file.Clear
	stage_file.Add(root_dir & "/stage")
	the_files = File.ListFiles(root_dir & "/stage")
	If the_files.IsInitialized = False Or the_files.Size < 1 Then 'no files found
		stage_file.Add("")
	Else
		stage_file.Add(the_files.Get(0))
	End If
End Sub
'###############################################################################
'Network connection
Sub toggle_wifi(state As Boolean)
	my_wifi.EnableWifi(state)
	If state = False Then Return 'all done if turning off
	timer_switch = "wifi_connect"
	file_timer.Enabled = False
	file_timer.Interval =  15*1000 'wait 15 seconds to connect
	file_timer.Enabled = True
End Sub

Sub toggle_network(state As Boolean)
   Dim r As Reflector
   r.Target = r.GetContext
   r.Target = r.RunMethod2("getSystemService", "connectivity", "java.lang.String")
   r.RunMethod2("setMobileDataEnabled", state, "java.lang.boolean")
   If state = False Then Return 'all done if turning off
   timer_switch = "network_connect"
   file_timer.Enabled = False
   file_timer.Interval =  15*1000 'wait 15 seconds to connect
   file_timer.Enabled = True
End Sub

Sub turn_off_network
	toggle_wifi(False)
	toggle_network(False)
	Log("network connections turned off")
End Sub

'################################################################################################
'Utility functions
Sub update_current_dir
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
	current_dir = root_dir & "/" & sub_dir
End Sub

'##general purpose timer
Sub file_timer_tick
	'always turn off the timer, maybe restart
	file_timer.Enabled = False
	
	'wifi connection
	If timer_switch = "wifi_connect" Then
		'if connection is successful then move on to Google drive push
		If my_wifi.isWifiConnected = True Then
			google_drive_setup
			Return
		Else 'try network data if no wifi
			toggle_network(True)
		End If
	End If
	
	'network connection
	If timer_switch = "network_connect" Then
		'see if there's network connectivity
		If my_wifi.isOnLine Then
			google_drive_setup
			Else
				CallSubDelayed2(activity_db,"write_activity","Unable to establish network connection.")
				turn_off_network
		End If
	End If
	
	'google drive upload
	If timer_switch = "drive_upload" Then
		turn_off_network
		CallSubDelayed2(activity_db,"write_activity","Drive upload timed out.")
	End If
End Sub