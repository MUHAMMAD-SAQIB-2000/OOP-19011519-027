package week2_3;

import java.util.Scanner;

public class Program2 
{
	
	public static void main(String[] args) {
		Scanner math = new Scanner(System.in);
		double add=0;
		double multiply=0;
		double sub=0;
		double div=0;
		int val1,val2;
		System.out.println("press 1 for add");
		System.out.println("press 2 for multiply");
		System.out.println("press 3 for div");
		System.out.println("press 4 for sub");
	
		System.out.println("enter your choice");
		int choice=math.nextInt();
		
		switch (choice)
		{
		case 1:
			System.out.println("Enter two numbers for Addition: ");
			val1 = math.nextInt();
			val2 = math.nextInt();
			add = val1 + val2;
			System.out.println(add);
			break;
		
		case 2:
			System.out.println("Enter two numbers for Multiplication: ");
			val1 = math.nextInt();
			val2 = math.nextInt();
			multiply = val1 * val2;
		
			System.out.println(multiply);
			break;
			
		case 3:
			System.out.println("Enter two numbers for Division: ");
			val1 = math.nextInt();
			val2 = math.nextInt();
			div = val1/val2;
			System.out.println(div);
			break;
			
		case 4:
			System.out.println("Enter two numbers for Subtraction: ");
			val1 = math.nextInt();
			val2 = math.nextInt();
			sub = val1-val2;
			System.out.println(sub);
			break;
			
			default:
				System.out.println("invalid");
			
		}
	} 

}
