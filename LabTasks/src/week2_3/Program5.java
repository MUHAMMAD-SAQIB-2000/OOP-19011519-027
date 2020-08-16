package week2_3;

import java.util.Scanner;

public class Program5 {
	public static int addition(int val1,int val2)
	{
		int add = val1 + val2;
		return add;		
	}
	
	public static int subtraction(int val1,int val2)
	{
		int sub = val1-val2;
		return sub;
	}
	public static int multiplication(int val1,int val2)
	{
		int mul = val1*val2;
		return mul;
	}
	public static int division(int val1,int val2) 
	{
		int div = val1/val2;
		return div;
	}
	public static void main(String[] args) 
	{
		int choice;
		int value1,value2;
		Scanner input = new Scanner(System.in);
		System.out.println("1. for addition");
		System.out.println("2. for subtraction");
		System.out.println("3. for multiplication");
		System.out.println("4. for division");
		System.out.println("Enter your choice");
		choice = input.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("enter 1st variable");
				value1= input.nextInt();
				System.out.println("enter 2nd variable");
				value2 = input.nextInt();
				
				int add = addition(value1,value2);
				System.out.println("addition of 2 variables is" + add);
				break;
				
			case 2:
				System.out.println("enter 1st variable");
				value1= input.nextInt();
				System.out.println("enter 2nd variable");
				value2 = input.nextInt();
				
				int sub = subtraction(value1,value2);
				System.out.println("Subtraction of 2 variables is " + sub);
				break;
				
			case 3:
				System.out.println("enter 1st variable");
				value1= input.nextInt();
				System.out.println("enter 2nd variable");
				value2 = input.nextInt();
				
				int mul = multiplication(value1,value2);
				System.out.println("Multiplication of 2 variables is " + mul);
				break;
				
			case 4:
				System.out.println("enter 1st variable");
				value1= input.nextInt();
				System.out.println("enter 2nd variable");
				value2 = input.nextInt();
				
				int div = division(value1,value2);
				System.out.println("Division of 2 variables is " + div);
				break;
				
			default:
				System.out.println("invalid input");
				break;
		}
		
	}

}
