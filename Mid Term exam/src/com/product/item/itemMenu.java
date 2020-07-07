package com.product.item;


import java.util.List;
import java.util.Scanner;

import com.product.customer.Customer;
import com.product.customer.customerData;
import com.product.item.Item;
import com.product.item.itemData;


public class itemMenu {
	Scanner scan = new Scanner(System.in);
	itemData itemdata = new itemData();
	public char op;

	public void itemOptions() {
		System.out.println("\n\n\n\n\n");
		System.out.println("-------------------------------------------");
		System.out.println("       ------Accessed Item Data------   ");
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
				itemData.findAll();
				List<Item> item= itemData.findAll();
				for (int i=0; i<item.size(); i++) {
					System.out.println(item.get(i).toString());
				}
				break;
			case '2':
				System.out.println("---------------------------------");
				System.out.println("Enter Item ID number: ");
				int itemID = scan.nextInt();
				Item item1 = itemData.findOne(itemID);
				System.out.println(item1.toString());
				break;
			case '4':
				System.out.println("---------------------------------");
				System.out.println();
				Item itemAddData = new Item();
				itemAddData.setITEM_ID(1);
				itemAddData.setITEM_NAME("shampoo");
				itemAddData.setITEM_PRICE(250);
				itemAddData = itemData.Save(itemAddData);
				System.out.println(itemAddData.toString());
				break;
			case '5':
				itemData.deleteOne(1);
			default:
				System.out.println("Invalid Input!!!!\nEnter Again!!!");
				break;
			}
			
		}while(!(op=='1'||op=='2'||op=='3'||op=='4'||op=='5'));
	}
}
