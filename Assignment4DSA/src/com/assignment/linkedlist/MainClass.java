package com.assignment.linkedlist;

import java.util.Scanner;

public class MainClass {

	static Scanner scan = new Scanner(System.in);
	static LinkedListClass list = new LinkedListClass();
	
	public static void main(String[] args) {
		list.add(45);
		list.add(450);
		list.add(4500);
		list.add(45000);
		list.add(450);
		list.delAtStart();
		list.delAtStart();
		list.print();
		//list.getAll();
		//list.backTraverse();
		
		//int size = getSize();
		//menu(size);
	}

	public static void menu(int size) {
		boolean correctInput = true;
		int ch ,data, index;
		ch = data = index = 0;
		do {
			int count = list.getCount();
			System.out.println("\n\nEnter your choice: ");
			System.out.println("1. to add data in list");
			System.out.println("2. to add data at the start of list");
			System.out.println("3. to add at specific index in list");
			System.out.println("4. to Get by index");
			System.out.println("5. to Get All (Traverse)");
			System.out.println("6. to delete At Start");
			System.out.println("7. to delete At End");
			System.out.println("8. to delete At a specific Index");
			System.out.println("9. To Get List size");
			System.out.println("10. To Change List size");
			System.out.println("11. Exit!!!");
			while(correctInput) {
				try {
					System.out.print("Choice:->");
					ch = scan.nextInt();
					correctInput = false;
				} catch (Exception e) {
					System.out.println("Invalid Input!!! Not an Integer Value!!!\nRe Enter");
					scan.next();
					correctInput = true;
					continue;
				}
			}if(ch==4){
				correctInput = true;
				while(correctInput) {
					try {
						System.out.print("Enter index:->");
						index = scan.nextInt();
						if(index >= size) {
							System.out.println("Index Exceeds List size");
							continue;
						} else if (index >= count) {
							System.out.println("No value at entered Index exist");
							System.out.println("Enter again");
							continue;
						}
						correctInput = false;
					} catch (Exception e) {
						System.out.println("Invalid Input!!! Not an Integer Value!!!\nRe Enter");
						scan.next();
						correctInput = true;
						continue;
					}
				}
			}else if(ch==3||ch==8) {
				correctInput = true;
				while(correctInput) {
					try {
						System.out.print("Enter index:->");
						index = scan.nextInt();
						if(index >= size) {
							System.out.println("Index Exceeds List size");
							continue;
						} else if (index >= count) {
							System.out.println("No value at entered Index exist");
							System.out.println("Enter again");
							continue;
						}
						correctInput = false;
					} catch (Exception e) {
						System.out.println("Invalid Input!!! Not an Integer Value!!!\nRe Enter");
						scan.next();
						correctInput = true;
						continue;
					}
				}
				correctInput = true;
				while(correctInput) {
					try {
						System.out.print("Enter Data:->");
						data = scan.nextInt();
						correctInput = false;
					} catch (Exception e) {
						System.out.println("Invalid Input!!! Not an Integer Value!!!\nRe Enter");
						scan.next();
						correctInput = true;
						continue;
					}
				}
			}else if(ch==1||ch==2||ch==6||ch==7) {
				correctInput = true;
				while(correctInput) {
					try {
						System.out.print("Enter Data:->");
						data = scan.nextInt();
						correctInput = false;
					} catch (Exception e) {
						System.out.println("Invalid Input!!! Not an Integer Value!!!\nRe Enter");
						scan.next();
						correctInput = true;
						continue;
					}
				}
			}
			switch(ch) {
			case 1:
				if(count > size || count == size) {
					System.out.println("List Limit achieved!!!\n->Cannot add more value");
				}else {
					list.add(data);
				}
				menu(size);
				break;
			case 2:
				if(count > size || count == size) {
					System.out.println("List Limit achieved!!!\n->Cannot add more value");
				}else {
					list.addAtStart(data);
				}
				menu(size);
				break;
			case 3:
				if(count > size || count == size) {
					System.out.println("List Limit achieved!!!\n->Cannot add more value");
				}else {
					list.addAtIndex(index, data);
				}
				menu(size);
				break;
			case 4:
				data = list.get(index);
				System.out.println("Data at index:"+index+" is:"+data );
				menu(size);
				break;
			case 5:
				list.getAll();
				menu(size);
				break;
			case 6:
				list.delAtStart();
				menu(size);
				break;
			case 7:
				list.delAtEnd();
				menu(size);
				break;
			case 8:
				list.delAtIndex(index);
				menu(size);
				break;
			case 9:
				System.out.println("List Size is size="+size);
				menu(size);
				break;
			case 10:
				System.out.println("Enter new List size");
				size = getSize();
				menu(size);
				break;	
			case 11:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice!!!\nRe Enter:->");
				correctInput = true;
				break;
			}
		}while(!(ch==1||ch==2||ch==3||ch==4||ch==5||ch==6||ch==7||ch==8||ch==9));
	}
	
	public static int getSize() {
		boolean correctInput = true;
		int size = 0;
		while(correctInput) {
			try {
				System.out.print("Enter Size:->");
				size = scan.nextInt();
				if(size == 0) {
					System.out.println("Size cannot be zero!!");
					System.out.println("Enter again");
					continue;
				}
				correctInput = false;
			} catch (Exception e) {
				System.out.println("Invalid Input!!! Not an Integer Value!!!\nRe Enter");
				scan.next();
				correctInput = true;
				continue;
			}
		}
		return size;
	}
}
