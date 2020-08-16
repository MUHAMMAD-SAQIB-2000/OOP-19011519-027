package com.yourFriendsChoice;

import java.util.Scanner;

import com.yourFriendsChoice.CreateGame.CreateGameInterface;
import com.yourFriendsChoice.FreindsGame.FriendsGameInterface;
import com.yourFriendsChoice.MyGame.MyGameInterface;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char ch = '0';
		System.out.println("<<<<<<<<<<<<<<<<<<=>>>>>>>>>>>>>>>>>>");
		System.out.println("  **Welcome to Friend's Dare!!!!!**  ");
		System.out.println("=>Do You want to Create Your Own Game?\n\t\t or\n=> Do You want to play your Friend's Game");
		System.out.println("-------------------------------------");
		System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
		System.out.println("Enter Your Choice!!!!!");
		System.out.println("Enter 1. to Create Your Game.");
		System.out.println("Enter 2. to Play Friend's Game.");
		System.out.println("Enter 3. to See Your Game Scores.");
		System.out.println("Enter 4. to Exit the Game.");
		System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");
		System.out.println("-------------------------------------");
		System.out.println("Choice: ");
		do {
			ch = scan.next().charAt(0);
			switch(ch) {
				case '1':
					CreateGameInterface.CreateGameMenu();
					break;
				case '2':
					FriendsGameInterface.FriendsGameMenu();
					break;
				case '3':
					MyGameInterface.MyGameMenu();
					break;
				case '4':
					System.out.println("Thanks For Playing :)");
					System.out.println("Good Bye!!!");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice!!  :( :( ");
					System.out.println("Enter Again!!!");
					break;			
			}
			
		}while(!(ch=='1'||ch=='2'||ch=='3'||ch=='4'));
		
		scan.close();
	}
	
}
