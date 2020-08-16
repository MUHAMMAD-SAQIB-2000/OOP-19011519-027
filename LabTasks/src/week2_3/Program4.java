package week2_3;

import java.util.Scanner;

public class Program4 
{
	public static void main(String[] args) 
	{
		int value=0;
		int choice=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1. To Convert Decimal to Binary");
		System.out.println("Enter 2. To Convert Decimal to Octal");
		System.out.println("Enter 3. To Convert Decimal to Hexadecimal");
		System.out.println("Enter your choice:");
		choice = input.nextInt();
		System.out.println("Enter an Integer");
		value = input.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				System.out.println(Integer.toBinaryString(value));
				break;			
			}
			case 2:
			{
				System.out.println(Integer.toOctalString(value));
				break;
			}
			case 3:
			{
				System.out.println(Integer.toHexString(value));
				break;				
			}
			default:
			{
				System.out.println("Invalid Input");
				break;
			}
		}
	}

}
