package com.atm.main.funds;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.atm.main.MenuATM;
import com.atm.main.account.AccountData;
import com.atm.main.customer.Customer;
import com.atm.main.customer.CustomerData;

public class FundsData {

	private static String fundsFile = "funds.csv";
	static{
		try {
			File file = new File(fundsFile);
			if(!(file.exists())) {
				file.createNewFile();
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void fundsTransfer() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your ID");
		int senderID = scan.nextInt();
		System.out.println("Enter ID of the person you want to transfer fund");
		int recieverID = scan.nextInt();
		Customer sender = CustomerData.findOneCustomer(senderID);
		Customer reciever = CustomerData.findOneCustomer(recieverID);
		
		System.out.println("Enter amount to be transferred");
		long amount = scan.nextLong();
		long newAmount = sender.getCustomerBalance()-amount;
		if(newAmount<0) {
			System.out.println("Sorry you do not have enough money in your account!");
			System.out.println("Amount avalaible is: " + sender.getCustomerBalance());
			System.out.println("Enter amount Again: \nEnter:=> ");
			amount = scan.nextLong();
		}else {
			reciever.setCustomerBalance(reciever.getCustomerBalance()+amount);
			sender.setCustomerBalance(sender.getCustomerBalance()-amount);
			saveFundRecord(sender , reciever ,amount);
			AccountData.saveAfterTransaction(sender);
			AccountData.saveAfterTransaction(reciever);
			MenuATM.menu();
		}
		scan.close();
	}
	
	public static void saveFundRecord(Customer sender , Customer reciever , long amount) throws Exception {
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd-MMM-yyyy HH:mm:ss");
	    String formattedDate = myDateObj.format(myFormatObj);
	    
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fundsFile, true));
			writer.append("Sender Name:"+sender.getCustomerName()+", Sender's ID:"+sender.getCustomerId()+", Reciever Name:"+reciever.getCustomerName()
			+", Amount transferred:" +amount +", DateAndTime:"+ formattedDate );
			writer.append("\n");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static List<String> fundTransferList(int Id) throws Exception {
		List<String> funds = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fundsFile));
			String line;
			while((line=reader.readLine()) != null) {
				String[] row = line.split("ID:");
				String[] data = row[1].split(",");
				if(Integer.parseInt(data[0])==Id) {
					funds.add(line);
				}
			}
			reader.close();
			return funds;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		MenuATM.menu();
		return null;
	}
}
