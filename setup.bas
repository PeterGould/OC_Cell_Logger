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
	Type event_group (event As String, period As Int, period_type As String, start_hour As Int, end_hour As Int)
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim show As Button

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("setup")
	'query the database to get current settings
	Dim current As List
	current.Initialize
	current = CallSub2(activity_db,"get_lines","select action,period,unit,time1,time2 from scheduler order by action")
	'create custom list view
	Dim main_view As CustomListView
	Dim j As Int
	Dim bg1 As GradientDrawable
	Dim Clrs(2) As Int
	Clrs(0) = Colors.Black
	Clrs(1) = Colors.Gray
	main_view.Initialize(Me,"main_view")
	Activity.AddView(main_view.AsView,2%x,10%y,90%x,80%y)
	bg1.Initialize("TOP_BOTTOM",Clrs)
	Log("populating " & current.Size & " rows")
	For j = 1 To current.Size
		Dim a_panel As Panel
		Dim pick_period As Spinner
		Dim pick_unit As Spinner
		Dim pick_time1 As Spinner
		Dim pick_time2 As Spinner
		Dim control_id As Label
		Dim a_line As List 
		Dim k As Int
		a_line.Initialize
		a_line.AddAll(current.Get(j-1))
		pick_period.Initialize("spinners")
		pick_unit.Initialize("spinners")
		pick_time1.Initialize("spinners")
		pick_time2.Initialize("spinners")
		pick_period.AddAll(Array As String("1","2","3","4","5","10","15","30"))
		pick_unit.AddAll(Array As String("sec","min","hr","day"))
		pick_time1.AddAll(Array As String("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"))
		pick_time2.AddAll(Array As String("0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"))
		control_id.Initialize("x")
		control_id.Text = a_line.Get(0)
		pick_period.Tag = Array As String(a_line.Get(0),"period")
		pick_unit.Tag = Array As String(a_line.Get(0),"unit")
		pick_time1.Tag = Array As String(a_line.Get(0),"time1")
		pick_time2.Tag = Array As String(a_line.Get(0),"time2")
		'set spinners to current values
		For k = 0 To pick_time2.Size
			If k < pick_period.Size Then
				If pick_period.GetItem(k) = a_line.Get(1) Then pick_period.SelectedIndex = k
			End If
			If k < pick_unit.size Then
				If pick_unit.GetItem(k) = a_line.Get(2) Then pick_unit.SelectedIndex = k
			End If
			If k < pick_time1.Size Then
				If pick_time1.GetItem(k) = a_line.Get(3) Then pick_time1.SelectedIndex = k
			End If
			If k < pick_time2.Size Then
				If pick_time2.GetItem(k) = a_line.Get(4) Then pick_time2.SelectedIndex = k
			End If
		Next
		control_id.TextSize = 18
		control_id.TextColor = Colors.White
		'add to the panel
		a_panel.Initialize("x")
		a_panel.Background = bg1
		a_panel.AddView(control_id,1%x,1%y,20%x,15%y)
		a_panel.AddView(pick_period,21%x,1%y,15%x,15%y)
		a_panel.AddView(pick_unit,37%x,1%y,15%x,15%y)
		a_panel.AddView(pick_time1,53%x,1%y,15%x,15%y)
		a_panel.AddView(pick_time2,69%x,1%y,15%x,15%y)
		main_view.Add(a_panel,20%y,"panels")
	Next
	'add button to show schedule
	show.Initialize("show")
	show.Color = Colors.White
	show.TextColor = Colors.Black
	a_panel.AddView(show,5%x,2%y,20%x,18%y)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

'update from spinners
Sub spinners_itemClick(position As Int, value As String)
	Dim spin As Spinner
	Dim tag_info() As String
	Dim q1 As String
	spin = Sender
	tag_info = spin.Tag
	q1 = "update scheduler set " & tag_info(1) & " = '" & value & "' where action = '" & tag_info(0) & "'"
	CallSubDelayed2(activity_db,"do_query",q1)
End Sub

Sub show_Click
	CallSub(activity_db,"update_schedule")
	Dim next_sch As List
	next_sch.Initialize
	next_sch =CallSub2(activity_db, "get_lines","select action,next_rt from schedule order by action")
'Show the next schedules times
	Dim cd As CustomDialog
	Dim lv As ListView
	Dim pn1 As Panel
	Dim ret As Int
	pn1.Initialize("x")
	lv.Initialize("x")
	Dim k As Int
	For k = 0 To next_sch.size-1
		Dim line As List
		line = next_sch.Get(k)
		Dim a_str As String
		a_str = line.Get(0) & " " & line.Get(1)
		lv.AddSingleLine(a_str)		
	Next
	pn1.AddView(lv,1%x,1%y,90%x,60%y)
	cd.AddView(pn1,1%x,1%y,90%x,60%y)
	ret = cd.Show("Schedule","OK","","",Null)
End Sub
