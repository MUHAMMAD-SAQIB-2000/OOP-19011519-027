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

import com.atm.main.funds.FundsData;
import com.atm.main.transactions.CustomerTransactions;
@SuppressWarnings("resource")

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

	public static Customer addCustomer() throws Exception {
		
		Customer customer = new Customer();
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(Customer.CustomerFile, true));
			System.out.println("Enter Name: ");
			String name = scan.nextLine();
			customer.setCustomerName(name.toUpperCase());

			System.out.println("Enter Age: ");
			int temp = scan.nextInt();
			customer.setCustomerAge(temp);

			customer.setCustomerNoOfTransactions(0);

			System.out.println("Enter Amount you want to add for opening account: ");
			long amount = scan.nextInt();
			while(amount<=0) {
				System.out.println("You cannot enter amount ");
			}
			customer.setCustomerBalance(amount);
			customer.setCustomerId(setId());
			writer.append(customer.toStringSave());
			writer.append("\n");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return customer;
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

	public static Customer updateCustomer(Customer customer) throws Exception {
		Scanner scan = new Scanner(System.in);
		List<Customer> customers = displayAllCustomers();
		try {
			new FileWriter(Customer.CustomerFile, false).close();
			//updating customer
			System.out.println("Enter New details:");
			customer.setCustomerId(customer.getCustomerId());
			System.out.println("Enter Name: ");
			String name = scan.nextLine();
			customer.setCustomerName(name.toUpperCase());
			System.out.println("Enter Age: ");
			int age = scan.nextInt();
			customer.setCustomerAge(age);
			customer.setCustomerNoOfTransactions(customer.getCustomerNoOfTransactions());
			customer.setCustomerBalance(customer.getCustomerBalance());

			BufferedWriter writer = new BufferedWriter(new FileWriter(Customer.CustomerFile, true));
			for(Customer data : customers) {
				if(customer.getCustomerId() == data.getCustomerId()) {
					writer.append(customer.toStringSave());
					writer.append("\n");
				} else {
					writer.append(data.toStringSave());
					writer.append("\n");
				}
			}
			updateRecordFromTransactionFile(customer.getCustomerId() , name.toUpperCase());
			updateRecordFromFundsTransferFile(customer.getCustomerId() , name.toUpperCase());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return customer;
	}

	private static void updateRecordFromTransactionFile(int Id , String name) throws Exception {
		List<String> customerRecords = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(CustomerTransactions.transactionFile));
		String line;
		while((line = reader.readLine()) != null) {
			String[] row = line.split(",");
			if(Integer.parseInt(row[0]) == Id) {
				customerRecords.add(row[0]+","+name.toUpperCase()+","+row[2]+","+row[3]+","+row[4]+","+row[5]+","+row[6]);
			}else {
				customerRecords.add(line);
			}
		}
		reader.close();
		new FileWriter(CustomerTransactions.transactionFile, false).close();

		BufferedWriter writer = new BufferedWriter(new FileWriter(CustomerTransactions.transactionFile, true));
		for (String customerRecord : customerRecords) {
			writer.append(customerRecord);
			writer.append("\n");
		}
		writer.close();
	}

	public static void updateRecordFromFundsTransferFile(int Id ,String name) throws Exception {
		List<String> customerRecords = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(FundsData.fundsFile));
		String line;
		while((line = reader.readLine()) != null) {
			String[] row = line.split(",");
			String[] rowId = row[1].split(":");
			String[] rowSenderName = row[0].split(":");
			String[] rowRecieverName = row[2].split(":");
			if(Integer.parseInt(rowId[1]) == Id) {
				customerRecords.add(rowSenderName[0]+":"+name+","+rowId[0]+":"+rowId[1]+","+row[2]+","+row[3]+","+row[4]);
			}else if(rowRecieverName[1].equals(name)){
				customerRecords.add(row[1]+","+row[2]+","+rowRecieverName[0]+":"+name+","+row[3]+","+row[4]);
			}else {
				customerRecords.add(line);
			}
		}	
		reader.close();
		new FileWriter(FundsData.fundsFile, false).close();
		BufferedWriter writer = new BufferedWriter(new FileWriter(FundsData.fundsFile, true));
		for (String customerRecord : customerRecords) {
			writer.append(customerRecord);
			writer.append("\n");
		}
		writer.close();
	}

	public static void deleteCustomer(Customer customer) throws Exception {
		List<Customer> customerRecords = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(Customer.CustomerFile));
		String line;
		while((line = reader.readLine()) != null) {
			String[] row = line.split(",");
			Customer nonDelCustomer = new Customer();
			if(Integer.parseInt(row[0]) != customer.getCustomerId()) {
				nonDelCustomer.setCustomerId(Integer.parseInt(row[0]));
				nonDelCustomer.setCustomerName(row[1]);
				nonDelCustomer.setCustomerAge(Integer.parseInt(row[2]));
				nonDelCustomer.setCustomerBalance(Long.parseLong(row[3]));
				nonDelCustomer.setCustomerNoOfTransactions(Integer.parseInt(row[4]));
				customerRecords.add(nonDelCustomer);
			}
		}	
		reader.close();
		new FileWriter(Customer.CustomerFile, false).close();
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(Customer.CustomerFile, true));
			for(Customer data : customerRecords) {
				writer.append(data.toStringSave());
				writer.append("\n");
			}
			writer.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		deleteRecordFromTransactionFile(customer.getCustomerId());
		deleteRecordFromFundsTransferFile(customer.getCustomerId());
	}
	
	private static void deleteRecordFromTransactionFile(int Id) throws Exception {
		List<String> customerRecords = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(CustomerTransactions.transactionFile));
		String line;
		while((line = reader.readLine()) != null) {
			String[] row = line.split(",");
			if(Integer.parseInt(row[0]) != Id) {
				customerRecords.add(line);
			}
		}
		reader.close();
		new FileWriter(CustomerTransactions.transactionFile, false).close();

		BufferedWriter writer = new BufferedWriter(new FileWriter(CustomerTransactions.transactionFile, true));
		for (String customerRecord : customerRecords) {
			writer.append(customerRecord);
			writer.append("\n");
		}
		writer.close();
	}
	
	private static void deleteRecordFromFundsTransferFile(int Id) throws Exception {
		List<String> customerRecords = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(FundsData.fundsFile));
		String line;
		while((line = reader.readLine()) != null) {
			String[] row = line.split(",");
			String[] rowId = row[1].split(":");
			if(Integer.parseInt(rowId[1]) != Id) {
				customerRecords.add(line);
			}
		}	
		reader.close();
		new FileWriter(FundsData.fundsFile, false).close();
		BufferedWriter writer = new BufferedWriter(new FileWriter(FundsData.fundsFile, true));
		for (String customerRecord : customerRecords) {
			writer.append(customerRecord);
			writer.append("\n");
		}
		writer.close();
	}

	@SuppressWarnings("unused")
	public static int setId() throws Exception{
		BufferedReader reader = new BufferedReader(new FileReader(Customer.CustomerFile));
		String line;
		int counter = 1;
		while((line=reader.readLine())!=null) {
			counter++;
		}
		reader.close();
		return counter;
	}
}
