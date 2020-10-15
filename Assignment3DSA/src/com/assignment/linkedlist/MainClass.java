package com.assignment.linkedlist;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int ch = 0;
		boolean correctInput = true;
		int data = 0;
		int index = 0;
		Scanner scan = new Scanner(System.in);
		LinkedListClass list = new LinkedListClass();
		LinkedListClass list2 = new LinkedListClass();
		System.out.println("Enter your choice: ");
		System.out.println("1. to add data in list");
		System.out.println("2. to add data at the start of list");
		System.out.println("3. to add at specific index in list");
		System.out.println("4. to Get by index");
		System.out.println("5. to Get All (Traverse-Single)");
		System.out.println("6. to Get All (Traverse-Circular)");
		System.out.println("7. to delete At Start");
		System.out.println("8. to delete At End");
		System.out.println("9. to delete At a specific Index");
		System.out.println("10. to merge two linkedList");
		System.out.println("11. Search in linked list");
		System.out.println("12. Update Value By Index");
		System.out.println("13. Update Value By Data");
		System.out.println("14. Perfrom arithmetic On List");
		System.out.println("15. Return to menu!!!");
		do {
			int count = list.getCount();
			while(correctInput) {
				try {
					System.out.print("Choice:->");
					ch = scan.nextInt();
					correctInput = false;
				} catch (Exception e) {
					System.out.println("Invalid Input!!! this is not a number!!!\nRe Enter");
					scan.next();
					correctInput = true;
					continue;
				}
			}
			switch(ch) {
			case 1:
				System.out.print("Enter value:->");
				data = scan.nextInt();
				list.add(data);
				break;
			case 2:
				System.out.print("Enter value:->");
				data = scan.nextInt();
				list.add(data);
				break;
			case 3:
				System.out.print("Enter Index:->");
				index = scan.nextInt();
				while(index >= count) {
					System.out.println("Index # exceeds List Limit!!!\nRe Enter");
					index = scan.nextInt();
				}
				System.out.print("Enter value:->");
				data = scan.nextInt();
				list.add(data);
				break;
			case 4:
				System.out.print("Enter Index:->");
				index = scan.nextInt();
				while(index >= count) {
					System.out.println("Index # exceeds List Limit!!!\nRe Enter");
					index = scan.nextInt();
				}
				data = list.get(index);
				System.out.println("Data at index:"+index+" is:"+data );
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			case 11:
				break;
			case 12:
				break;
			case 13:
				break;
			case 14:
				break;
			default:
				System.out.println("Invalid Choice!!!\nRe Enter:->");
				correctInput = true;
				break;
			}
		}while(!(ch==1||ch==2||ch==3||ch==4||ch==5||ch==6||ch==7||ch==8||ch==9||ch==10||ch==11||ch==12||ch==13||ch==14));
		int count = list.getCount();
		System.out.println(count);
		list.add(1249);
		list.add(12);
		System.out.println("Enter limit");
		int limit = 2;
		if(count==limit) {
			System.out.println("You connot add more data");
		}else {
			list.add(1249);
			list.getAll();
			System.out.println("Data added");
		}
		list.add(1249);
		list.add(12);
		list.getAll();
		list.circularListDisplay();
		list.arithemticAdd();
		list2.add(36);
		list2.add(36);
		list2.add(36);
		list2.getAll();
		//		list.delAtStart();
		//		list.add(14);list.add(16);list.add(18);list.add(20);
		//		list.getAll();
		//		int get = list.get(3);
		//		System.out.println("GEt output: " + get);
		//		list.insertAtIndex(2, 195);
		//		list.getAll();
		//		list.addAtStart(45);
		//		list.add(120);
		//		list.add(120);
		//		list.add(120);
		//		list.getAll();
		//		list.delAtEnd();
		//		list.getAll();
		//		list.delAtIndex(2);
		//		list.getAll();
		//		list.valueUpdateAtIndex(0, 55765);
		//		list.valueUpdateAtIndex(2, 576);
		//		list.getAll();
		//		list.valueUpdateByData(12 , 3636);
		//		list.getAll();
		//		list.searchByData(120);

	}

}
