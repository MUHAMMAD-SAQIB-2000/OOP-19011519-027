package com.product;

import java.util.Scanner;

import com.product.customer.customerMenu;
import com.product.item.itemMenu;

public class OptionClass {
	Scanner scan = new Scanner(System.in);
	itemMenu imenu = new itemMenu();
	customerMenu cmenu = new customerMenu();
	public char op;
	
	public void menu() {
		
			System.out.println("===========================================");
			System.out.println("           Enter Your Choice               ");
			System.out.println("===========================================");
			System.out.println("1. For Accessing Customers Data.");
			System.out.println("2. For Accessing Items Data.");
			System.out.println("3. For Exiting the system.");
			System.out.println("===========================================");
			do {
				System.out.println("Choice: ");
				op = scan.next().charAt(0);
				switch(op) {
				case '1':
					cmenu.customerOptions();
					break;
				case '2':
					imenu.itemOptions();
					break;
				case '3':
					System.out.println("System Exited!!!!");
					System.exit(0);
				default:
					System.out.println("Invalid Input!!!!\nEnter Again!!!");
					break;
				}
				
			}while(!(op=='1'||op=='2'||op=='3'));
		}
	}

