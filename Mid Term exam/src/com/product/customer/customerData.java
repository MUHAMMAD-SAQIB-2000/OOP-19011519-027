package com.product.customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.product.customer.Customer;


public class customerData {
	@SuppressWarnings("resource")
	public static List<Customer> findAll()  {
		List<Customer> customers = new ArrayList<Customer>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Customer.customerFile));
			// reading data from file and storing it in a List to be displayed
			while ((line = bufferreader.readLine()) != null) {
				Customer customer= new Customer();
				String[] customerRow = line.split(",");
				
				customer.setCUSTOMER_ID(Integer.parseInt(customerRow[0]));
				customer.setCUSTOMER_NAME(customerRow[1]);
				customer.setCUSTOMER_BILL(Integer.parseInt(customerRow[2]));
				
				customers.add(customer);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return customers;
	}
	
	@SuppressWarnings("resource")
	public static Customer findOne(int Customer_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Customer.customerFile));
			
			while ((line = bufferreader.readLine()) != null) {
				Customer customer= new Customer();
				String[] customerRow = line.split(",");
				
				if (Integer.parseInt(customerRow[0]) == Customer_ID) {
										
					customer.setCUSTOMER_ID(Integer.parseInt(customerRow[0]));
					customer.setCUSTOMER_NAME(customerRow[1]);
					customer.setCUSTOMER_BILL(Integer.parseInt(customerRow[2]));
					
					return customer;
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static Customer Save(Customer customer) {
		FileWriter filewriter;

		List<Customer> customers = findAll();

		try {
			filewriter = new FileWriter(Customer.customerFile);

			for (int i=0; i<customers.size(); i++) {
				filewriter.append(customers.get(i).toString());
				filewriter.append("\n");
			}
			if (customers.size()>0)
				customer.setCUSTOMER_ID(customers.get(customers.size()-1).getCUSTOMER_ID()+1);
			else
				customer.setCUSTOMER_ID(1);
			filewriter.append(customer.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return customer;
	}
	
	public static Customer deleteOne(int CUSTOMER_ID)  {
		FileWriter filewriter;

		List<Customer> customers = findAll();
		Customer customer = findOne(CUSTOMER_ID);

		try {
			filewriter = new FileWriter(Customer.customerFile);

			for (int i=0; i<customers.size(); i++) {
				if (customers.get(i).getCUSTOMER_ID() != CUSTOMER_ID) {
					filewriter.append(customers.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customer;
	}
	
	@SuppressWarnings("resource")
	public List<Customer> search(String search)  {
		List<Customer> customers = new ArrayList<Customer>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Customer.customerFile));
			
			while ((line = bufferreader.readLine()) != null) {
				Customer customer = new Customer();
				
				String[] customerRow = line.split(",");
				
				if (customerRow[1].contains(search) == true) {
					customer.setCUSTOMER_ID(Integer.parseInt(customerRow[0]));
					customer.setCUSTOMER_NAME(customerRow[1]);
					customer.setCUSTOMER_BILL(Integer.parseInt(customerRow[2]));
					
					customers.add(customer);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return customers;
	}

}
