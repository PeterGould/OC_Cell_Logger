Type=Service
Version=5.2
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False	
#End Region

Sub Process_Globals
	Dim activity_con As SQL	
	Dim db_dir As String = "activites"
	Dim db_name As String = "activity_database.db"
	Dim db_path As String
End Sub

Sub Service_Create
	db_path = File.DirDefaultExternal & "/" & db_dir
	If(db_name.EndsWith(".db")) = False Then db_name = db_name & ".db"
	Dim new_db As Boolean
'create a data directory if not there
	If File.IsDirectory(File.DirDefaultExternal,db_dir) = False Then
    	File.MakeDir(File.DirDefaultExternal, db_dir)
	End If
	'connect DB, create if not already created
	Log("creating activity_database at " & db_path)
	new_db = File.Exists(db_path, db_name) = False
	activity_con.Initialize(db_path, db_name, True)
	If new_db Then
		activity_con.ExecNonQuery("CREATE TABLE action_log (action TEXT, timestamp TEXT)")
	End If
	write_activity("Activity database started.")
End Sub

Sub Service_Start (StartingIntent As Intent)
	If activity_con.IsInitialized = False Then activity_con.initialize(db_path,db_name,True)
End Sub

Sub Service_Destroy
	activity_con.Close
End Sub

'Write a text string to the action log
Sub write_activity(event_string As String)
	Dim dt As String 
	Dim now As Long
	DateTime.DateFormat = "yyyy-MM-dd HH:mm:ss" ' See this page regarding uppercase letters.
	now = DateTime.Now
	dt = DateTime.Date(now)
	activity_con.ExecNonQuery2("Insert INTO action_log Values(?,?)", Array As Object(event_string,dt))
End Sub