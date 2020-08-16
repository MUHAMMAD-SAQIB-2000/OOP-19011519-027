package _Time_Table_;

public class Course
{
	private Course COURSE_ID;
	private String COURSE_TITLE;
	private Course COURSEPRERQUIST_ID;
	private String COURSE_CREDITHOUR;
	private String COURSE_CODE;
	private String COURSE_DESC;
	Course( Course  COURSE_ID,String  COURSE_TITLE,Course  COURSEPRERQUIST_ID,String COURSE_CREDITHOUR,String COURSE_CODE,String COURSE_DESC) 
	{
		
		this.COURSE_ID = COURSE_ID;
		this.COURSE_TITLE = COURSE_TITLE;
		this.COURSEPRERQUIST_ID = COURSEPRERQUIST_ID;
		this.COURSE_CREDITHOUR = COURSE_CREDITHOUR;
		this.COURSE_CODE = COURSE_CODE;
		this.COURSE_DESC = COURSE_DESC;
		
	}
	public Course getCOURSE_ID() {
		return COURSE_ID;
	}
	public void setCOURSE_ID(Course cOURSE_ID) {
		COURSE_ID = cOURSE_ID;
	}
	public String getCOURSE_TITLE() {
		return COURSE_TITLE;
	}
	public void setCOURSE_TITLE(String cOURSE_TITLE) {
		COURSE_TITLE = cOURSE_TITLE;
	}
	public Course getCOURSEPRERQUIST_ID() {
		return COURSEPRERQUIST_ID;
	}
	public void setCOURSEPRERQUIST_ID(Course cOURSEPRERQUIST_ID) {
		COURSEPRERQUIST_ID = cOURSEPRERQUIST_ID;
	}
	public String getCOURSE_CREDITHOUR() {
		return COURSE_CREDITHOUR;
	}
	public void setCOURSE_CREDITHOUR(String cOURSE_CREDITHOUR) {
		COURSE_CREDITHOUR = cOURSE_CREDITHOUR;
	}
	public String getCOURSE_CODE() {
		return COURSE_CODE;
	}
	public void setCOURSE_CODE(String cOURSE_CODE) {
		COURSE_CODE = cOURSE_CODE;
	}
	public String getCOURSE_DESC() {
		return COURSE_DESC;
	}
	public void setCOURSE_DESC(String cOURSE_DESC) {
		COURSE_DESC = cOURSE_DESC;
	}
	
	
	
	
}
