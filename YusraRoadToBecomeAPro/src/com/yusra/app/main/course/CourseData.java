package com.yusra.app.main.course;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseData {

	static File file = new File(Course.getCoursetxtfilename());
	static Course course1 = new Course(1, "OOP" , "CS-103");
	static Course course2 = new Course(2, "PF" , "CS-102");

	static {
		if(!(file.exists())) {
			try {
				System.out.println("File Created: " + file.createNewFile() + file.getName());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


	}

	public static void addToFile() throws IOException {
		FileWriter write = new FileWriter(file , true);
		write.write(course1.toString());
		write.write("\n");
		System.out.println("Added to File: " + course1.toString());
		write.write(course2.toString());
		write.write("\n");
		System.out.println("Added to File: " + course2.toString());
		write.close();
	}

	public static void readFromFile() throws IOException {
		System.out.println("\n\n Reading data from file");
		FileReader reader = new FileReader(file);
		Scanner fileData = new Scanner(reader);
		while(fileData.hasNext()) {
			System.out.println(fileData.nextLine());
		}
		reader.close();
		fileData.close();
	}

	public static void deleteFile() {
		if(file.exists()) {
			file.delete();
			System.out.println("File deleted " + file.getName());
		}else {
			System.out.println("File does not exists");
		}
	}

	public static void deleteFromFile(int id) throws Exception {
		String line;
		String temp = "temp.txt";

		File file = new File(Course.getCoursetxtfilename());
		File tempFile = new File(temp);
		tempFile.createNewFile();

		BufferedReader breader = new BufferedReader(new FileReader(file));
		BufferedWriter bwrite = new BufferedWriter(new FileWriter(tempFile));

		while(!((line = breader.readLine())==null)) {
			String[] row = line.split("id=");
			String[] tempID= row[1].split(",");
			if(!(Integer.parseInt(tempID[0])==id)) {
				bwrite.append(line);
				bwrite.append("\n");
			}
			System.out.println(tempID[0]);
		}

		bwrite.close();
		breader.close();
		file.delete();
		tempFile.renameTo(file);
	}

}
