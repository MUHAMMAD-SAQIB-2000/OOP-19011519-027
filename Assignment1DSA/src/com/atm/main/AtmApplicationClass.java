package com.atm.main;

import java.util.Scanner;

import com.atm.main.customer.Customer;
import com.atm.main.customer.CustomerData;

public class AtmApplicationClass {

	public static void main(String[] args) {
		try {
			securityCheck();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void securityCheck()  throws Exception {
		Scanner scan = new Scanner(System.in);
		int admin = 12345;
		int pass = 0 ;
		boolean correctID = true;
		System.out.println("<-:[Enter Admin ID if Admin or Customer ID for Customer]:->");
		System.out.println("Enter ID: ");
		while(correctID) {
			try {
				pass = scan.nextInt();
				correctID = false;
			} catch(Exception e) {
				System.out.println("<-:[InValid character!!! Enter a Number]:->");
				scan.next();
				correctID = true;
		        continue;
			}
		}
		if(pass==admin) {
			System.out.println("Welcome Admin: ");
			MenuATM.adminMenu();
		}else {
			correctID = true;
			Customer customer = CustomerData.findOneCustomer(pass);
			while(customer == null) {
				System.out.println("\nNo Admin or User with this record exists!!!");
				System.out.println("Enter ID again:");
				while(correctID) {
					try {
						pass = scan.nextInt();
						break;
					} catch(Exception e) {
						System.out.println("InValid character ");
						scan.next();
				        continue;
					}
				}
				customer = CustomerData.findOneCustomer(pass);
			}
			System.out.println("Welcome "+ customer.getCustomerName());
			MenuATM.menu(customer.getCustomerId());
		}
		scan.close();
	}
}
