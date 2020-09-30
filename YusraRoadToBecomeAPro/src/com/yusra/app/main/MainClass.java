package com.yusra.app.main;

import java.io.IOException;

import com.yusra.app.main.course.CourseData;
import com.yusra.app.main.student.OptionMenu;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("hello world");
		
		try {
			CourseData.addToFile();
			CourseData.readFromFile();
			//CourseData.deleteFile();
			CourseData.deleteFromFile(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		OptionMenu.menu();
	}
	
}
