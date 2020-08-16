package _Time_Table_;

public class StudentCourse {

		private StudentCourse STUDENTCOURSE_ID;
		private Course COURSE_ID;
		private Student STUDENT_ID;
		private String SECTION;
		
		StudentCourse(StudentCourse STUDENTCOURSE_ID , Course COURSE_ID , Student STUDENT_ID , String SECTION)
		{
			this.STUDENTCOURSE_ID = STUDENTCOURSE_ID;
			this.COURSE_ID = COURSE_ID;
			this.STUDENT_ID = STUDENT_ID;
			this.SECTION = SECTION;
		}

		public StudentCourse getSTUDENTCOURSE_ID() {
			return STUDENTCOURSE_ID;
		}

		public void setSTUDENTCOURSE_ID(StudentCourse sTUDENTCOURSE_ID) {
			STUDENTCOURSE_ID = sTUDENTCOURSE_ID;
		}

		public Course getCOURSE_ID() {
			return COURSE_ID;
		}

		public void setCOURSE_ID(Course cOURSE_ID) {
			COURSE_ID = cOURSE_ID;
		}

		public Student getSTUDENT_ID() {
			return STUDENT_ID;
		}

		public void setSTUDENT_ID(Student sTUDENT_ID) {
			STUDENT_ID = sTUDENT_ID;
		}

		public String getSECTION() {
			return SECTION;
		}

		public void setSECTION(String sECTION) {
			SECTION = sECTION;
		}
		
}
