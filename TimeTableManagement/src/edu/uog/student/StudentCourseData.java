package edu.uog.student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.uog.course.courseData;

public class StudentCourseData {
	@SuppressWarnings("resource")
	public static List<StudentCourse> findAll()  {
		List<StudentCourse> StudentCourses = new ArrayList<StudentCourse>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(StudentCourse.csvFile));
			// reading data from file and storing it in a List to be displayed
			while ((line = bufferreader.readLine()) != null) {
				StudentCourse studentCourse = new StudentCourse();
				
				String[] studentCourseRow = line.split(",");
				studentCourse.setSTUDENTCOURSE_ID(Integer.parseInt(studentCourseRow[0]));
				studentCourse.setCOURSE_ID(courseData.findOne(Integer.parseInt(studentCourseRow[1])));
				studentCourse.setSTUDENT_ID(studentData.findOne(Integer.parseInt(studentCourseRow[2])));
				studentCourse.setSECTION(studentCourseRow[3]);
				
				
				StudentCourses.add(studentCourse);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return StudentCourses;
	}

	@SuppressWarnings("resource")
	public static StudentCourse findOne(int StudentCourse_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(StudentCourse.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				StudentCourse studentCourse = new StudentCourse();
				String[] studentCourseRow = line.split(",");
				
				if (Integer.parseInt(studentCourseRow[0]) == StudentCourse_ID) {
					
					studentCourse.setSTUDENTCOURSE_ID(Integer.parseInt(studentCourseRow[0]));
					studentCourse.setCOURSE_ID(courseData.findOne(Integer.parseInt(studentCourseRow[1])));
					studentCourse.setSTUDENT_ID(studentData.findOne(Integer.parseInt(studentCourseRow[2])));
					studentCourse.setSECTION(studentCourseRow[3]);
										
					return studentCourse;
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@SuppressWarnings("resource")
	public static List<StudentCourse> search(String search)  {
		List<StudentCourse> StudentCourses = new ArrayList<StudentCourse>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(StudentCourse.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				StudentCourse studentCourse = new StudentCourse();
				
				String[] studentCourseRow = line.split(",");
				
				if (studentCourseRow[1].contains(search) == true) {
					
					studentCourse.setSTUDENTCOURSE_ID(Integer.parseInt(studentCourseRow[0]));
					studentCourse.setCOURSE_ID(courseData.findOne(Integer.parseInt(studentCourseRow[1])));
					studentCourse.setSTUDENT_ID(studentData.findOne(Integer.parseInt(studentCourseRow[2])));
					studentCourse.setSECTION(studentCourseRow[3]);
					
					StudentCourses.add(studentCourse);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return StudentCourses;
	}

	@SuppressWarnings("static-access")
	public StudentCourse Save(StudentCourse StudentCourse) {
		FileWriter filewriter;

		List<StudentCourse> StudentCourses = findAll();

		try {
			filewriter = new FileWriter(StudentCourse.csvFile);

			for (int i=0; i<StudentCourses.size(); i++) {
				filewriter.append(StudentCourses.get(i).toString());
				filewriter.append("\n");
			}
			if (StudentCourses.size()>0)
				StudentCourse.setSTUDENTCOURSE_ID(StudentCourses.get(StudentCourses.size()-1).getSTUDENTCOURSE_ID()+1);
			else
				StudentCourse.setSTUDENTCOURSE_ID(1);
			filewriter.append(StudentCourse.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return StudentCourse;
	}
}
