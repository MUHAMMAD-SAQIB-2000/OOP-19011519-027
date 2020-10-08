package com.atm.main;

import java.util.List;
import java.util.Scanner;

import com.atm.main.account.AccountData;
import com.atm.main.funds.FundsData;
import com.atm.main.transactions.CustomerTransactions;

@SuppressWarnings("resource")
public class MenuATM {
		
	public static void menu() throws Exception {
		
		Scanner scan = new Scanner(System.in);
		char choice;
		boolean run = true;
		
		while(!(run==false)) {
			System.out.println("Enter your choice! ");
			System.out.println("[1. For Inquring your balance.]");
			System.out.println("[2. For Depositing Cash in Account.]");
			System.out.println("[3. For Widthrawing Cash from Account.]");
			System.out.println("[4. For Complete Transactions History.]");
			System.out.println("[5. For Last 10 Transactions.]");
			System.out.println("[6. For Funds Transfer To another Account.]");
			System.out.println("[7. For Funds Transfer History.]");
			System.out.println("[8. For Exiting the System.]");
			do {
				System.out.print("Choice:=> ");
				choice = scan.next().charAt(0);
				switch (choice) {
					case '1':
						System.out.println(choice);
						AccountData.balanceInquiry();
						break;
					case '2':
						System.out.println(choice);
						AccountData.depositCash();
						break;
					case '3':
						System.out.println(choice);
						AccountData.withdrawCash();
						break;
					case '4':
						System.out.println(choice);
						List<String> statements = CustomerTransactions.displayAllStatements();
						statements.stream().forEach(System.out::println);
						break;
					case '5':
						System.out.println(choice);
						List<String> statement = CustomerTransactions.displayLast10Statements();
						statement.stream().forEach(System.out::println);
						break;
					case '6':
						System.out.println(choice);
						FundsData.fundsTransfer();
						break;
					case '7':
						System.out.println(choice);
						List<String> fundsHistory = FundsData.fundTransferList(1); 
						fundsHistory.stream().forEach(System.out::println);
						break;
					case '8':
						System.out.println("Thank you! For visiting us!");
						System.exit(0);
						break;
					default:
						System.out.println("InValid Input!!! Enter Again!");
						break;
				}
			}while(!(choice=='1'||choice=='2'||choice=='3'||choice=='4'||choice=='5'||choice=='6'||choice=='7'||choice=='8'));
		}
		
				
	}

}

