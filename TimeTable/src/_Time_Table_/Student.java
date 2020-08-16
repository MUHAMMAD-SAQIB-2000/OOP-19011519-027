package _Time_Table_;

public class Student 
{
	
	private Student STUDENT_ID;
	private Student STUDENT_ROLLNO;
	
	Student( Student STUDENT_ID , Student STUDENT_ROLLNO)
	{
		this.STUDENT_ID = STUDENT_ID;
		this.STUDENT_ROLLNO = STUDENT_ROLLNO;
	}

	public Student getSTUDENT_ID() {
		return STUDENT_ID;
	}

	public void setSTUDENT_ID(Student sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}

	public Student getSTUDENT_ROLLNO() {
		return STUDENT_ROLLNO;
	}

	public void setSTUDENT_ROLLNO(Student sTUDENT_ROLLNO) {
		STUDENT_ROLLNO = sTUDENT_ROLLNO;
	}
	
}
