package _Time_Table_;

public class TeacherCourse 
	{
	
		Course COURSE_ID;
		Teacher TEACHER_ID;
		
		TeacherCourse(Course COURSE_ID,  Teacher TEACHER_ID)
		{
			this.COURSE_ID = COURSE_ID;
			this.TEACHER_ID = TEACHER_ID;
			
		}

		public Course getCOURSE_ID() {
			return COURSE_ID;
		}

		public void setCOURSE_ID(Course cOURSE_ID) {
			COURSE_ID = cOURSE_ID;
		}

		public Teacher getTEACHER_ID() {
			return TEACHER_ID;
		}

		public void setTEACHER_ID(Teacher tEACHER_ID) {
			TEACHER_ID = tEACHER_ID;
		}
		
	

}
