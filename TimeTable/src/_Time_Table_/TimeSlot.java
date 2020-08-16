package _Time_Table_;

public class TimeSlot {
	private TimeSlot TIMESLOT_ID;
	private WeekDay	WEEKDAY_ID;
	private int  TIMESLOT_START;
	private int TIMESLOT_END;
	
	TimeSlot(TimeSlot TIMESLOT_ID ,WeekDay	WEEKDAY_ID , int TIMESLOT_START ,int TIMESLOT_END)
	{
		this.TIMESLOT_ID = TIMESLOT_ID;
		this.WEEKDAY_ID = WEEKDAY_ID;
		this.TIMESLOT_START = TIMESLOT_START;
		this.TIMESLOT_END = TIMESLOT_END;
	}

	public TimeSlot getTIMESLOT_ID() {
		return TIMESLOT_ID;
	}

	public void setTIMESLOT_ID(TimeSlot tIMESLOT_ID) {
		TIMESLOT_ID = tIMESLOT_ID;
	}

	public WeekDay getWEEKDAY_ID() {
		return WEEKDAY_ID;
	}

	public void setWEEKDAY_ID(WeekDay wEEKDAY_ID) {
		WEEKDAY_ID = wEEKDAY_ID;
	}

	public int getTIMESLOT_START() {
		return TIMESLOT_START;
	}

	public void setTIMESLOT_START(int tIMESLOT_START) {
		TIMESLOT_START = tIMESLOT_START;
	}

	public int getTIMESLOT_END() {
		return TIMESLOT_END;
	}

	public void setTIMESLOT_END(int tIMESLOT_END) {
		TIMESLOT_END = tIMESLOT_END;
	}
	
	
	

}
