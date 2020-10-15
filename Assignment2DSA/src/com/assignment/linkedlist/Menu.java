package com.assignment.linkedlist;

import java.util.Scanner;

public class Menu {
	public static void menu() {
		LinkedListClass list = new LinkedListClass();
		Node node = new Node();

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		char choice;
		while(true) {
			System.out.println("\n");
			System.out.println("\nEnter your choice! ");
			System.out.println("[1. For Students List]");
			System.out.println("[2. For A single student data.]");
			System.out.println("[3. For Adding a new Student.]");
			System.out.println("[4. For Adding Dummy Student Data.]");
			System.out.println("[5. For Exiting the System.]");
			do {
				System.out.print("Choice:=> ");
				choice = scan.next().charAt(0);
				switch (choice) {
				case '1':
					list.getAll();
					break;
				case '2':
					System.out.print("Enter ID: ");
					int id = scan.nextInt();
					Node get = list.get(id);
					if(get == null) {
						System.out.println("No record with this ID exists!!");
					}else {
						System.out.println("GEt output: " + get.toString());
					}
					break;
				case '3':
					System.out.print("Enter name: ");
					scan.nextLine();
					String name = scan.nextLine();
					node.setStudentName(name);
					System.out.print("Enter GPA: ");
					double gpa = scan.nextDouble();
					node.setStudentGPA(gpa);
					node.setStudentId(list.size()+1);
					list.add(node);
					break;
				case '4':
					node = new Node(list.size()+1,"Arooj Saghar" , 3.51);
					list.add(node);
					node = new Node(list.size()+1,"Muhammad Saqib" , 3.8);
					list.add(node);
					node = new Node(list.size()+1,"faiqa Shabbir" , 3.87);
					list.add(node);
					node = new Node(list.size()+1,"Shifa shehzadi" , 3.87);
					list.add(node);
					node = new Node(list.size()+1,"Umair Mughal" , 3.75);
					list.add(node);
					node = new Node(list.size()+1,"Usama Atta" , 3.1);
					list.add(node);
					node = new Node(list.size()+1,"Usama " , 3.4);
					list.add(node);
					node = new Node(list.size()+1,"Ali Asghar" , 3.3);
					list.add(node);
					node = new Node(list.size()+1,"Yusra Ibrahim Dar" , 3.6);
					list.add(node);
					node = new Node(list.size()+1,"Sidra " , 3.87);
					list.add(node);
					System.out.println("\n Dummy students Added");
					list.getAll();
					break;
				case '5':
					System.out.println("Thank you for visiting!!!");
					System.exit(0);
					break;
				default:
					System.out.println("InValid Input!!! Enter Again!");
					break;
				}
			}while(!(choice=='1'||choice=='2'||choice=='3'||choice=='4'));
		}
	}
}
