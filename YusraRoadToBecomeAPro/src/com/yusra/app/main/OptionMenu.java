package com.yusra.app.main;

import java.util.Scanner;

import com.yusra.app.main.student.StudentData;

public class OptionMenu {

	public static void menu() {
		System.out.println("In menu function");
		Scanner scan = new Scanner(System.in);
		char choice ;
		System.out.println("\n\n------------------Welcome To Menu------------------");
		System.out.println("Enter your choice!");
		System.out.println("1. to add student record");
		System.out.println("2. to view student record");
		System.out.println("3. To delete a record");
		System.out.println("4. To update a record");
		System.out.println("5. To Exit");
		do {
			System.out.println("Choice: ");
			choice = scan.next().charAt(0);
			System.out.println("Choice: " + choice);
			switch(choice) {
			case '1':
				StudentData.addStudent();
				break;
			case '2':
				StudentData.viewAllStudent();
				break;
			case '3':
				StudentData.deleteStudent();
				break;
			case '4':
				StudentData.updateStudent();
				break;
			case '5':
				System.out.println("System closed!!!");
				System.exit(0);
				break;	
			default :
				System.out.println("Invalid Choice!!!");
				System.out.println("Enter Again:");
				break;
			}
		}while(!(choice=='1'||choice=='2'||choice=='3'||choice=='4'||choice=='5'));


	}
}

