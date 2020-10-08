package com.atm.main.customer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerData {
	static Scanner scan = new Scanner(System.in);
	static {
		File file = new File(Customer.CustomerFile);
		if(!(file.exists())) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void addCustomer() throws Exception {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(Customer.CustomerFile, true));
			Customer customer = new Customer();
			
			{
				customer.setCustomerId(setId());
				
				System.out.println("Enter Name: ");
				String name = scan.nextLine();
				customer.setCustomerName(name.toUpperCase());
				
				System.out.println("Enter Age: ");
				int temp = scan.nextInt();
				customer.setCustomerAge(temp);
				
				System.out.println("Enter No of Transactions: ");
				temp = scan.nextInt();
				customer.setCustomerNoOfTransactions(temp+1);
				
				System.out.println("Enter balance: ");
				long temp1 = scan.nextInt();
				customer.setCustomerBalance(temp1*89);
			}
			writer.append(customer.toStringSave());
			System.out.println(customer.toString());
			writer.append("\n");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
	public static List<Customer> displayAllCustomers() throws IOException {
		List<Customer> customers = new ArrayList<>();
		String line;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(Customer.CustomerFile));
			
			while((line=reader.readLine())!=null) {
				Customer customer = new Customer();	
				String[] row = line.split(",");
				customer.setCustomerId(Integer.parseInt(row[0]));
				customer.setCustomerName(row[1]);
				customer.setCustomerAge(Integer.parseInt(row[2]));
				customer.setCustomerBalance(Long.parseLong(row[3]));
				customer.setCustomerNoOfTransactions(Integer.parseInt(row[4]));
				customers.add(customer);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return customers;
	}
	
	@SuppressWarnings("resource")
	public static Customer findOneCustomer(int Id) throws Exception {
		String line;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(Customer.CustomerFile));
			Customer customer = new Customer();
			while((line=reader.readLine())!=null) {
				String[] row = line.split(",");
				if(Integer.parseInt(row[0])==Id) {
					customer.setCustomerId(Integer.parseInt(row[0]));
					customer.setCustomerName(row[1]);
					customer.setCustomerAge(Integer.parseInt(row[2]));
					customer.setCustomerBalance(Long.parseLong(row[3]));
					customer.setCustomerNoOfTransactions(Integer.parseInt(row[4]));
					return customer;
				}
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

	public int setId() throws Exception{
		List<Customer> data = displayAllCustomers();
		return data.size()+1;
	}
}
