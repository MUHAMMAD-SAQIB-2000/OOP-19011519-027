package javaFileHandling;

import java.util.Scanner;

public class test 
{
	public static void main(String[] args) throws Exception
	{
		options();
		
	}
	public static void options() throws Exception
	{
		Scanner scan = new Scanner(System.in);
		char ch;
		do
		{
			System.out.println("Enter:\n1.To Create a New File.\n2.Go to Main Menu\n3.To Exit The System.\nNote: Only The First Chracter Entered will be Selected.");
			ch = scan.next().charAt(0);
			if(ch=='1')
			{
				System.out.println("Option entered: " + ch);
				System.out.println("new file");
			}
			else if(ch=='2')
			{
				System.out.println("Option entered: " + ch);
				System.out.println("main menu");
			}
			else if(ch=='3')
			{
				System.out.println("Option entered: " + ch);
				System.out.println("exit");
				System.exit(0);
			}
			else 
			{
				System.out.println("Option entered: " + ch);
				System.out.println("invalid input");
				Thread.sleep(500);
				System.out.println("\n");
				System.out.println("enter again");
			}
			
		}while(!(ch=='1'||ch=='2'||ch=='3'));
		scan.close();
	}

}
