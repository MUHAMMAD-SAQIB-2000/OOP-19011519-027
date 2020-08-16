package basic_test;

import java.util.Scanner;

public class Program1 
{
	static Scanner scan;
	public static void main(String[] args) 
	{
		scan = new Scanner(System.in);
		int pin = 1234;
		int cond = 3;
		int input ;
		
		do
		{
			input = scan.nextInt();
			if(input==pin)
			{
				System.out.println("Pin is correct");
			}
			else 
			{
				System.out.println("Incorrect Input" + "\n" + "Tries left "+cond + "Enter again: " );
			}
			cond--;
		}while(cond>0);
		scan.close();
		
	}

}
