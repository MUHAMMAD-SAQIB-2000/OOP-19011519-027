package com.atm.main;

import java.util.List;
import java.util.Scanner;

import com.atm.main.account.AccountData;
import com.atm.main.customer.Customer;
import com.atm.main.customer.CustomerData;
import com.atm.main.transactions.CustomerTransactions;

@SuppressWarnings("unused")
public class AtmApplicationClass {

	public static void main(String[] args) throws Exception {
		System.out.println("welcome to ATM");
		CustomerData customerData = new CustomerData();
		MenuATM.menu();
//		customerData.addCustomer();
//		List<Customer> customers = customerData.displayAllCustomers();
//		customers.stream().forEach(System.out::println);
//		Customer data = customerData.findOneCustomer(4);
//		if(data==null) {
//			System.out.println("Record with requested ID not Found!! ");
//		}else {
//			System.out.println(data);
//		}	

	}

}
