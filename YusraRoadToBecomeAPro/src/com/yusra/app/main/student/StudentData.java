package com.yusra.app.main.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentData {

	static char ch;
	private static List<Student> students = new ArrayList<>();

	public static void addStudent() {
		Student student1 = new Student(1, "arooj".toLowerCase() , "II" , 20);
		Student student2 = new Student(2, "yusra".toLowerCase() , "II" , 18);

		students.add(student1);
		students.add(student2);
		Student student = new Student();

		Scanner scan = new Scanner(System.in);

		student.setId(students.size()+1);
		System.out.println("Enter name: ");
		String temp = scan.nextLine();
		student.setName(temp.toLowerCase());

		System.out.println("Enter semester: "); 
		temp = scan.nextLine();
		student.setSemester(temp);

		System.out.println("Enter age: "); 
		int age = scan.nextInt();
		if(age<18) {
			System.out.println("Age should be greater than or equal to 18");
			System.out.println("Enter again: ");
			age = scan.nextInt();
		}
		student.setAge(age);


		students.add(student);
		System.out.println("Record Added!!! \n");
		settings();
	}

	public static void viewAllStudent() {

		if(students.size()==0) {
			System.out.println("List is empty!!!");
		}else {
			for(Student st: students) {
				System.out.println(st.toString());
			}
		}
		System.out.println("All Records!!! \n");
		settings();
	}
	
	public static Student viewStudentById(int id) {

		if(students.size()==0) {
			System.out.println("List is empty!!!");
			settings();
		}else {
			for(Student st : students) {
				if(st.getId()==id) {
					return st;
				}
			}
		}

		System.out.println("All Records!!! \n");
		//settings();
		return null;
	}

	public static Student viewStudentByName(String name) {

		if(students.size()==0) {
			System.out.println("List is empty!!!");
			settings();
		}else {
			for(Student st : students) {
				if(st.getName().equals(name)) {
					return st;
				}
			}
		}

		System.out.println("All Records!!! \n");
		//settings();
		return null;
	}

	public static void deleteStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which record do you want to delete. Enter number");
		int id = scan.nextInt();
		
		for(int i=0 ; i<students.size() ; i++) {
			if(students.get(i).getId()==id) {
				students.remove(i); 
			}else {
				System.out.println("not found");
			}
		}
		System.out.println("Record Removed \n!!!");
		settings();
	}

	public static void updateStudent() {
		Scanner scan = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Enter ID number");
		int id = scan.nextInt();

		for(int i=0 ; i<students.size() ; i++) {
			if(students.get(i).getId()==id) {
				System.out.println("Enter New Details");
				System.out.println("Enter name: ");
				scan.nextLine();
				String temp = scan.nextLine();
				student.setName(temp);

				System.out.println("Enter semester: ");
				temp = scan.nextLine();
				student.setSemester(temp);

				System.out.println("Enter age: ");
				int age = scan.nextInt();
				student.setAge(age);
				students.set(i, student);
			}else {
				System.out.println("not found");
			}
			
		}
		
		System.out.println("Record Updated!!! \n");

		settings();
	}

	public static void settings() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you want to exit or go to main menu");
		System.out.println("1. for main menu");
		System.out.println("2. for exit");
		do {
			System.out.println("Choice: ");
			ch = scan.next().charAt(0);
			if(ch=='1') {
				OptionMenu.menu();
			}else if(ch=='2'){
				System.out.println("System closed!!!");
				System.exit(0);
			}else {
				System.out.println("Invalid choice");
			}
		}while(!(ch=='1'||ch=='2'));
	}
}
