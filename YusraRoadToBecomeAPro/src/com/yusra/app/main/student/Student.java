package com.yusra.app.main.student;

public class Student {
	
	private int id;
	private String name;
	private String semester;
	private int age;
	
	public Student(int id , String name, String semester, int age) {
		this.id = id;
		this.name = name;
		this.semester = semester;
		this.age = age;
	}
	
	public Student() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Student [id=" + id + ", name=" + name + ", semester=" + semester + ", age=" + age + "]";
	}

	
	
	
}
