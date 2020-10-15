package com.atm.main;

import java.util.List;
import java.util.Scanner;

import com.atm.main.account.AccountData;
import com.atm.main.customer.Customer;
import com.atm.main.customer.CustomerData;
import com.atm.main.funds.FundsData;
import com.atm.main.transactions.CustomerTransactions;

@SuppressWarnings("resource")
public class MenuATM {
	
	public static void adminMenu() throws Exception {
		Customer customer = new Customer();
		Scanner scan = new Scanner(System.in);
		char choice;
		System.out.println("\nEnter your choice! ");
		System.out.println("<-:[1. To View All Customers List]:->");
		System.out.println("<-:[2. To View a particular Customer.]:->");
		System.out.println("<-:[3. To Add a new Customer.]:->");
		System.out.println("<-:[4. To Update record of a Customer.]:->");
		System.out.println("<-:[5. To Delete record of a Customer.]:->");
		System.out.println("<-:[6. To Exit the System.]:->");
		do {
			System.out.print("Choice:=> ");
			try{
				choice = scan.next().charAt(0);
			}catch (Exception e){
				choice = scan.next().charAt(0);
			}
			switch (choice) {
			case '1':
				System.out.println(choice);
				List<Customer> customers = CustomerData.displayAllCustomers();
				customers.stream().forEach(System.out::println);
				adminMenu();
				break;
			case '2':
				System.out.println(choice);
				customer=null;
				System.out.print("Ente Customer ID to be Found:->");
				int idFound = scan.nextInt();
				customer = CustomerData.findOneCustomer(idFound);
				if(customer == null) {
					System.out.println("No record with given ID" + idFound +" exists!!");
				}else {
					System.out.println("Your Details Are: "+ customer.toString());
				}	
				adminMenu();
				break;
			case '3':
				System.out.println(choice);
				customer=null;
				customer = CustomerData.addCustomer();
				System.out.println("Your Details Are: "+ customer.toString());
				scan.next();
				adminMenu();
				break;
			case '4':
				System.out.println(choice);
				System.out.print("Ente Customer ID to be updated:->");
				int idUpdate = scan.nextInt();
				customer = CustomerData.findOneCustomer(idUpdate);
				if(customer == null) {
					System.out.println("No record with given ID" + idUpdate +" exists!!");
				}else {
					System.out.println("Details Before Update Are: "+ customer.toString());
					customer = CustomerData.updateCustomer(customer);
					System.out.println("Details After Update Are: "+ customer.toString());
				}
				adminMenu();
				break;
			case '5':
				System.out.println(choice);
				System.out.print("Ente Customer ID to be Deleted:->");
				int idDelete = scan.nextInt();
				customer = CustomerData.findOneCustomer(idDelete);
				if(customer==null) {
					System.out.println("Record with this id does not exists!!!");
				}else {
					CustomerData.deleteCustomer(customer);
					System.out.println("Record deleted");
				}
				adminMenu();
				break;
			case '6':
				System.out.println("Thank you! For visiting us!");
				System.exit(0);
				break;
			default:
				System.out.println("InValid Input!!! Enter Again!");
				break;
			}
		}while(!(choice=='1'||choice=='2'||choice=='3'||choice=='4'||choice=='5'||choice=='6'));

	}

	public static void menu(int Id) throws Exception {
		Customer customer = new Customer();
		Scanner scan = new Scanner(System.in);
		char choice;
		System.out.println("\nEnter your choice! ");
		System.out.println("<-:[0. To View your Details.]:->");
		System.out.println("<-:[1. To Inqure your balance.]:->");
		System.out.println("<-:[2. To Deposit Cash in Account.]:->");
		System.out.println("<-:[3. To Widthraw Cash from Account.]:->");
		System.out.println("<-:[4. To View Complete Transaction History.]:->");
		System.out.println("<-:[5. To View Last 10 Transactions.]:->");
		System.out.println("<-:[6. To Transfer Funds another Account.]:->");
		System.out.println("<-:[7. To View Funds Transfer History.]:->");
		System.out.println("<-:[8. To Exit the System.]:->");
		do {
			System.out.print("Choice:=> ");
			choice = scan.next().charAt(0);
			switch (choice) {
			case '0':
				System.out.println(choice);
				customer = CustomerData.findOneCustomer(Id);
				System.out.println("Your Details Are: "+ customer.toString());
				menu(Id);
				break;
			case '1':
				System.out.println(choice);
				AccountData.balanceInquiry(Id);
				break;
			case '2':
				System.out.println(choice);
				AccountData.depositCash(Id);
				break;
			case '3':
				System.out.println(choice);
				AccountData.withdrawCash(Id);
				break;
			case '4':
				System.out.println(choice);
				List<String> statements = CustomerTransactions.displayAllStatements(Id);
				statements.stream().forEach(System.out::println);
				menu(Id);
				break;
			case '5':
				System.out.println(choice);
				List<String> statement = CustomerTransactions.displayLast10Statements(Id);
				statement.stream().forEach(System.out::println);
				menu(Id);
				break;
			case '6':
				System.out.println(choice);
				FundsData.fundsTransfer(Id);
				break;
			case '7':
				System.out.println(choice);
				List<String> fundsHistory = FundsData.fundTransferList(Id);
				if(fundsHistory==null) {
					System.out.println("No funds history with this id Found!!!");
				}else {				
					fundsHistory.stream().forEach(System.out::println);
				}
				menu(Id);
				break;
			case '8':
				System.out.println("Thank you! For visiting us!");
				System.exit(0);
				break;
			default:
				System.out.println("InValid Input!!! Enter Again!");
				break;
			}
		}while(!(choice=='0'||choice=='1'||choice=='2'||choice=='3'||choice=='4'||choice=='5'||choice=='6'||choice=='7'||choice=='8'));
	}
}

