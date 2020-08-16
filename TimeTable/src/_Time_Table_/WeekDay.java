package _Time_Table_;

public class WeekDay  {
	
	
	WeekDay WEEKDAY_NAME;
	WeekDay WEEKDAY_ID;
	
	WeekDay(WeekDay WEEKDAY_NAME ,WeekDay WEEKDAY_ID )
	{
		this.WEEKDAY_ID = WEEKDAY_ID;
		this.WEEKDAY_NAME = WEEKDAY_NAME;
		
	}

	public WeekDay getWEEKDAY_NAME() {
		return WEEKDAY_NAME;
	}

	public void setWEEKDAY_NAME(WeekDay wEEKDAY_NAME) {
		WEEKDAY_NAME = wEEKDAY_NAME;
	}

	public WeekDay getWEEKDAY_ID() {
		return WEEKDAY_ID;
	}

	public void setWEEKDAY_ID(WeekDay wEEKDAY_ID) {
		WEEKDAY_ID = wEEKDAY_ID;
	}
	

}
