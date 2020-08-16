package week2_3;

import java.util.*;

public class Program3 {
	
	public static int reverse_number(int value)
	{
		int revnum=0;
		int digit=0;
		while(value!=0)
		{
			digit=value%10;
			revnum=revnum*10 + digit;
			value = value/10;
		}
		return revnum;
	}
	
	public static int sum_rev_num(int value,int revnum)
	{
		
		int sum = 0;
		sum = revnum + value;
		return sum;
	}
	
	public static int sum_alternate_digits(int value)
	{
		int c=1;
		int sumEven=0;
		int sumOdd=0;
		while (value != 0) { 
			  
	        // If c is even number then it means 
	        // digit extracted is at even place 
	        if (c % 2 != 0) 
	        	sumEven += value % 10; 
	        else
	        	sumOdd += value % 10;
	              
	        value /= 10; 
	        c++; 
	    } 
		System.out.println("sum odd" + sumOdd); 
	    System.out.println("sum even " + sumEven);
		return sumOdd ;
	}
	
	public static void main(String[] args) 
	{
		Scanner no = new Scanner(System.in);
		int value;		
		System.out.println("enter 4 digit number");
		value = no.nextInt();
		int revnumber = reverse_number(value);
		System.out.println("Reverse number is " + revnumber);
		int sum = sum_rev_num(value, revnumber);
		System.out.println("Sum of Reverse Number and Entered Number is: " + sum);
		int sum_alt_digits = sum_alternate_digits(value); 
		 
	}

}
