package com.yusra.app.main.course;

public class Course {
	
	private static final String courseTxtFileName = "course.txt";
	
	private int id;
	private String courseName;
	private String courseCode;
	private Course coursePreReq;
	
	public Course() {
	}
	
	public Course(int id, String courseName, String courseCode) {
		this.id = id;
		this.courseName = courseName;
		this.courseCode = courseCode;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public Course getCoursePreReq() {
		return coursePreReq;
	}
	public void setCoursePreReq(Course coursePreReq) {
		this.coursePreReq = coursePreReq;
	}
	
	public static String getCoursetxtfilename() {
		return courseTxtFileName;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", courseCode=" + courseCode + ", coursePreReq="
				+ coursePreReq + "]";
	}
	
	
	
}
