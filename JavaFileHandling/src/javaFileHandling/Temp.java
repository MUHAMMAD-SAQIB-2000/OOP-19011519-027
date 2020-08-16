package javaFileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Temp 
{
	public static void main(String[] args) 
	{
		
		//filewriter();
	}
/*
	public static void filewriter()
	{tries=3;
	Scanner scan = new Scanner(System.in);
	do
	{
		System.out.println("Enter:\n1.To Create a New File.\n2.Go to Main Menu");
		System.out.println("3.To Exit The System.\nNote: Only The First Chracter Entered will be Selected.");
		op = scan.next().charAt(0);
		if(op=='1')
		{
			System.out.println("Option entered: " + op + "\n");
			
		}
		else if(op=='2')
		{
			System.out.println("Option entered: " + op + "\n");
			mainmenu();
		}
		else if(op=='3')
		{
			System.out.println("Option entered: " + op + "\n");
			System.out.println("exit");
			System.exit(0);
		}
		else 
		{
			tries--;
			System.out.println("Option entered: " + op);
			System.out.println("invalid option!!!\nYou have "+tries+" tries remaining\nEnter your option again");
			Thread.sleep(500);
			System.out.println("\n");
		}
		if(tries==0)
		{
			System.out.println("Incorrect Option\nThe Program Sent you to Main menu");
			mainmenu();
		}
		
	}while(!(op=='1'||op=='2'||op=='3'));
	scan.close();
	}*/
}
