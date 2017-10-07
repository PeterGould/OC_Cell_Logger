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
	Type schedule_holder(action As String, period As Int, unit As String, time1 As Int, time2 As Int)
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
		activity_con.ExecNonQuery("Create Table scheduler (action TEXT, period TEXT, unit TEXT, time1 TEXT, time2 TEXT)")
		activity_con.ExecNonQuery("create table schedule (action TEXT, next_time integer, next_rt Text)")
		'populate the table initially
		activity_con.ExecNonQuery("Insert into scheduler values ('picture','1','day','12','12')")
		activity_con.ExecNonQuery("Insert into scheduler values ('bluetooth','1','day','12','12')")
		activity_con.ExecNonQuery("Insert into scheduler values ('transmit','1','day','12','12')")
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

'query a lines
Sub get_lines(query As String)  As List
	 Dim Cursor1 As Cursor
	 Dim rows As List
	 Dim i As Int
	 Dim j As Int
	 rows.Initialize
    Cursor1 = activity_con.ExecQuery(query)
	If Cursor1.RowCount < 1 Then Return rows
	For j = 0 To Cursor1.RowCount - 1
		Cursor1.Position = j
		Dim a_col As List
		a_col.Initialize
    	For i = 0 To Cursor1.ColumnCount - 1
			a_col.Add(Cursor1.GetString2(i))
    	Next
		rows.Add(a_col)
	Next
    Cursor1.Close
	Return(rows)
End Sub

'run a query that doesn't return anything
Sub do_query(query As String)
	activity_con.ExecNonQuery(query)
End Sub

Sub update_schedule
	'go through the schedule
	Dim sched1 As List
	Dim next_time As Long
	Dim period As Long
	Dim unit As String
	Dim action As String
	Dim time1 As Long
	Dim time2 As Long
	Dim now As Long
	Dim now_tod As Long
	Dim k As Int
	Dim next_time As Long
	Dim tickle As Long
	sched1.Initialize
	sched1 = get_lines("select action,period,unit,time1,time2 from scheduler")
	'clear current schedule
	do_query("delete from schedule")
	now = DateTime.Now
	now_tod = now - DateTime.GetHour(now)*DateTime.TicksPerHour - DateTime.getMinute(now)*DateTime.TicksPerMinute -DateTime.GetSecond(now)*DateTime.TicksPerSecond
	'go through each action
	For k = 0 To sched1.Size - 1	
		Dim a_line As List
		a_line.Initialize
		a_line = sched1.Get(k)	
		action = a_line.Get(0)
		period = a_line.Get(1)
		unit = a_line.get(2)
		time1 = a_line.Get(3)
		time2 = a_line.Get(4)
		'now the idea is to find the next eligible time
		next_time = now_tod + time1*DateTime.TicksPerHour
		tickle = DateTime.TicksPerHour
		If unit = "min" Then tickle = DateTime.TicksPerMinute
		If unit = "sec" Then tickle = DateTime.TicksPerSecond
		If unit = "day" Then 'need to handle days a little differently
			tickle = DateTime.TicksPerDay
			next_time = next_time + DateTime.GetDayOfYear(now) mod period
		End If

		Do While next_time <= now	'find the next eligible time
			next_time = next_time + tickle*period
			'check to see if you need to go into the next day
			If next_time > now_tod + time2*DateTime.TicksPerHour And unit <> "day" Then
				next_time = now_tod + 24*DateTime.TicksPerHour + time1*DateTime.TicksPerHour 
			End If
		Loop
		'update database
		DateTime.DateFormat = "yyyy-MM-dd HH:mm:ss" ' See this page regarding uppercase letters.
		do_query("insert into schedule values ('" & action & "', " & next_time & " , '" & DateTime.Date(next_time) & "')")
	Next
		'now remove everything except the actions that should occur at the next wake time. Allow 15 seconds of slop
		'do_query("delete from schedule where next_time > (min(next_time) + 30*1000)")
End Sub