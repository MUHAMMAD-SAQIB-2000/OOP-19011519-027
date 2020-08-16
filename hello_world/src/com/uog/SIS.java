package com.uog;

import com.uog.student.Student;
import java.util.*;

public class SIS {

	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		Student st = new Student();
		String name;
		int i;
		
		System.out.println("enter names of students");
		for( i=0;i<3;i++)
		{		
			name=scan.nextLine();
			st.setName(name);			
		}
		
		System.out.println("name is "+ st.getName());
				
	}

}
