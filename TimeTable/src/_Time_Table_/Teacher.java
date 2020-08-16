package _Time_Table_;

public class Teacher 
{
	
	private Teacher TEACHER_ID;
	private Teacher TEACHER_TITLE ;
	private Teacher TEACHER_NAME;
	
	Teacher(Teacher TEACHER_ID , Teacher TEACHER_TITLE , Teacher TEACHER_NAME)
	{
		this.TEACHER_ID = TEACHER_ID;
		this.TEACHER_NAME = TEACHER_NAME;
		this.TEACHER_TITLE = TEACHER_ID;
		
	}

	public Teacher getTEACHER_ID() {
		return TEACHER_ID;
	}

	public void setTEACHER_ID(Teacher tEACHER_ID) {
		TEACHER_ID = tEACHER_ID;
	}

	public Teacher getTEACHER_TITLE() {
		return TEACHER_TITLE;
	}

	public void setTEACHER_TITLE(Teacher tEACHER_TITLE) {
		TEACHER_TITLE = tEACHER_TITLE;
	}

	public Teacher getTEACHER_NAME() {
		return TEACHER_NAME;
	}

	public void setTEACHER_NAME(Teacher tEACHER_NAME) {
		TEACHER_NAME = tEACHER_NAME;
	}
	
}
