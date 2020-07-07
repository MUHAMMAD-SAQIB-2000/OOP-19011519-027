package com.product.customer;

import java.util.List;
import java.util.Scanner;


public class customerMenu {
	Scanner scan = new Scanner(System.in);
	customerData cdata = new customerData();
	public char op;

	public void customerOptions() {
		System.out.println("\n\n");
		System.out.println("-------------------------------------------");
		System.out.println("       ------Accessed Customer Data------   ");
		System.out.println("===========================================");
		System.out.println("       ------Enter Your Choice------       ");
		System.out.println("===========================================");
		System.out.println("1. For Viewing All The Records .");
		System.out.println("2. For Finding a Record.");
		System.out.println("3. For Searching A Record.");
		System.out.println("4. For Adding a New Record.");
		System.out.println("5. For Deleting a Record.");
		System.out.println("6. For Returning to Main Menu.");
		System.out.println("===========================================");
		do {
			System.out.println("Choice: ");
			scan.hasNext();
			op = scan.next().charAt(0);
			switch(op) {
			case '1':
				System.out.println("---------------------------------");
				List<Customer> customer1= customerData.findAll();
				for (int i=0; i<customer1.size(); i++) {
					System.out.println(customer1.get(i).toString());
				}
				break;
			case '2':
				System.out.println("---------------------------------");
				System.out.println("Enter Item ID number: ");
				int customerID = scan.nextInt();
				Customer customer = customerData.findOne(customerID);
				System.out.println(customer.toString());
				break;
			case '3':
				customerData csearch = new customerData();
				csearch.search("saqib");
				break;
				
			case '4':
				System.out.println("---------------------------------");
				System.out.println();
				Customer customerAddData = new Customer();
				customerAddData.setCUSTOMER_ID(1);
				System.out.println("enter name");
				scan.nextLine();
				String name = scan.nextLine();
				customerAddData.setCUSTOMER_NAME(name);
				System.out.println("enter bill");
				int bill = scan.nextInt();
				customerAddData.setCUSTOMER_BILL(bill);
				customerAddData = customerData.Save(customerAddData);
				System.out.println(customerAddData.toString());
				break;
			case '5':
				customerData.deleteOne(1);
				break;
			default :
				System.out.println("Invalid Input!!!!\nEnter Again!!!");
				break;
			}
			
		}while(!(op=='1'||op=='2'||op=='3'||op=='4'||op=='5'));
	}
}
