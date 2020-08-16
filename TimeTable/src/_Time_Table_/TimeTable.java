package _Time_Table_;

public class TimeTable 
{
	private TimeTable TIMETABLE_ID;
	private TeacherCourse TEACHERCOURSE_ID;
	private TimeSlot TIMESLOT_ID;
	
	TimeTable(TimeTable TIMETABLE_ID , TeacherCourse TEACHERCOURSE_ID , TimeSlot TIMESLOT_ID)
	{
		this.TIMETABLE_ID = TIMETABLE_ID;
		this.TIMESLOT_ID = TIMESLOT_ID;
		this.TEACHERCOURSE_ID = TEACHERCOURSE_ID;
	}

	public TimeTable getTIMETABLE_ID() {
		return TIMETABLE_ID;
	}

	public void setTIMETABLE_ID(TimeTable tIMETABLE_ID) {
		TIMETABLE_ID = tIMETABLE_ID;
	}

	public TeacherCourse getTEACHERCOURSE_ID() {
		return TEACHERCOURSE_ID;
	}

	public void setTEACHERCOURSE_ID(TeacherCourse tEACHERCOURSE_ID) {
		TEACHERCOURSE_ID = tEACHERCOURSE_ID;
	}

	public TimeSlot getTIMESLOT_ID() {
		return TIMESLOT_ID;
	}

	public void setTIMESLOT_ID(TimeSlot tIMESLOT_ID) {
		TIMESLOT_ID = tIMESLOT_ID;
	}
	
	

}
