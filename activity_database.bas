Type=Class
Version=5.2
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	Dim activity_db As SQL	
	Dim db_dir As String = "activites"
	Dim db_name As String = "activity_database.db"
	Dim db_path As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(set_dir As String, set_name As String)
	db_dir = set_dir
	db_name = set_name
	db_dir = db_dir.ToLowerCase
	db_name = db_name.ToLowerCase
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
	activity_db.Initialize(db_path, db_name, True)
	If new_db Then
		activity_db.ExecNonQuery("CREATE TABLE action_log (action TEXT, timestamp TEXT)")
	End If
	write_activity("Activity database started.")
	End If
End Sub

'Write a text string to the action log
Sub write_activity(event_string As String)
	Dim dt As String 
	Dim now As Long
	DateTime.DateFormat = "yyyy-MM-dd HH:mm:ss" ' See this page regarding uppercase letters.
	now = DateTime.Now
	dt = DateTime.Date(now) & " "
	Log("Starting app. Timestamp = " & dt)
	activity_db.ExecNonQuery2("Insert INTO action_log Values(?,?)", Array As Object(event_string,dt))
End Sub