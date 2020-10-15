package com.atm.main.account;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

import com.atm.main.MenuATM;
import com.atm.main.customer.Customer;
import com.atm.main.customer.CustomerData;
import com.atm.main.transactions.CustomerTransactions;

public class AccountData {

	static CustomerData customerData = new CustomerData();
	static Scanner scan;
	public static void balanceInquiry(int Id) throws Exception{
		Customer customer = CustomerData.findOneCustomer(Id);
		System.out.println("Customer "+ customer.getCustomerName()+ "'s balance is:[" + customer.getCustomerBalance()+"]\n\n");
		MenuATM.menu(Id);
	}

	public static void depositCash(int Id) throws Exception {
		scan = new Scanner(System.in);
		Customer customer = CustomerData.findOneCustomer(Id);
		System.out.print("Enter the Amount you want to deposit:-> ");
		long deposit = scan.nextLong();
		long newAmount = customer.getCustomerBalance() + deposit;
		customer.setCustomerBalance(newAmount);
		customer.setCustomerNoOfTransactions(customer.getCustomerNoOfTransactions()+1);
		System.out.println("Your detials after Transaction is:->\n"+ customer.toString());
		saveAfterTransaction(customer);
		CustomerTransactions.addStatements(customer, customer.getCustomerBalance()-deposit , newAmount , "Deposit" , deposit);
		MenuATM.menu(Id);
	}

	public static void withdrawCash(int Id) throws Exception {
		scan = new Scanner(System.in);
		Customer customer = CustomerData.findOneCustomer(Id);
		System.out.print("Enter the Amount you want to Widthraw:-> ");
		long withdraw = scan.nextLong();
		while(withdraw<500 || withdraw>25000) {
			System.out.println("Entered Amount does not fulfill widthrawal Requirement!");
			System.out.println("You can enter Amount from [500]-[25000]");
			System.out.print("Enter Again: ");
			withdraw = scan.nextLong();
		}
		long newAmount = customer.getCustomerBalance() - withdraw;
		while(newAmount<0) {
			System.out.println("\nYou do not have this much Amount in your account!!!");
			System.out.println("Sorry we cannot process this transaction");
			System.out.println("Your avalaible balance is:->["+ customer.getCustomerBalance()+"]");
			System.out.print("Enter Again:");
			withdraw = scan.nextLong();
			newAmount = customer.getCustomerBalance() - withdraw;
		}
		customer.setCustomerBalance(newAmount);
		customer.setCustomerNoOfTransactions(customer.getCustomerNoOfTransactions()+1);
		System.out.println("Your detials after Transaction is:->\n"+ customer.toString());
		saveAfterTransaction(customer);		
		CustomerTransactions.addStatements(customer,customer.getCustomerBalance()+withdraw , newAmount , "Withdraw" , withdraw);
		MenuATM.menu(Id);
	}

	public static void saveAfterTransaction(Customer customer) throws Exception{

		List<Customer> customers = CustomerData.displayAllCustomers();
		try {
			FileWriter write = new FileWriter(Customer.CustomerFile);
			write.write("");
			write.close();

			BufferedWriter writer = new BufferedWriter(new FileWriter(Customer.CustomerFile, true));
			for(Customer customerData : customers) {
				if(customerData.getCustomerId() == customer.getCustomerId()) {
					writer.append(customer.toStringSave());
					writer.append("\n");
				}
				else {
					writer.append(customerData.toStringSave());
					writer.append("\n");
				}
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
