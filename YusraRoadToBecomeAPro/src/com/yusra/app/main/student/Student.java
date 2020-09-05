package com.yusra.app.main.student;

public class Student {
	
	private String name;
	private String semester;
	private int age;
	
	public Student(String name, String semester, int age) {
		this.name = name;
		this.semester = semester;
		this.age = age;
	}
	
	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", semester=" + semester + ", age=" + age + "]";
	}
	
	
}
