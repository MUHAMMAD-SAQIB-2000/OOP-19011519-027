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
			System.out.println("[1. For Workers List]");
			System.out.println("[2. For finding Worker data.]");
			System.out.println("[3. For Adding a new Worker.]");
			System.out.println("[4. For Exiting the System.]");
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
					Node worker = list.get(id);
					if(worker == null) {
						System.out.println("No Worker with this ID exists!!");
					}else {
						System.out.println("GEt output: " + worker.toString());
					}
					break;
				case '3':
					System.out.print("Enter Worker name: ");
					scan.nextLine();
					String name = scan.nextLine();
					node.setWorkerName(name);
					node.setWorkerId(list.size()+1);
					list.add(node);
					break;
				case '4':
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
