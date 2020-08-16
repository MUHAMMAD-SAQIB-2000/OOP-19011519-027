package assignment;

import java.util.Scanner;

public class Assg2 
{
	public static void main(String[] args)
	{
		
		
	}
	
	public static void Program1() 
	{
		//assignment 1
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		int temp = 0;
		
		System.out.println("Enter values for array");
		for(int i = 0,n=1; i<arr.length ; i++,n++)//i for index and n is for number
		{
			System.out.println("Enter "+n+" value for index: "+i+": " );
			arr[i] = scan.nextInt();
		}
		//array inputted is
		for(int i=0 ; i<arr.length ;i++ )
		{
			System.out.println("Array is "+arr[i] );
		}
		//swapping 
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		System.out.println("array after swapping is: ");
		
		for(int i=0 ; i<arr.length ;i++ )
		{
			System.out.println("Array is "+arr[i] );
		}
		scan.close();
		
	}
	
	public static void Program2()
	{
		//assignment 2 prgram1
		int i = 0;
		while(i<=20) {
			if(i % 2 == 0) {
				System.out.println("number is: "+ i);
			}
			i++;
		}
	}
	
	public static void Program3() 
	{
		//assignment 2 prgram2
		int i = 0;
		while(i<=50) {
			if(i % 2 == 0) 
			{
				if(i % 4 == 0) {
					System.out.println("Number even and also divisible by 4 is: " + i);
				}
			}
			i++;
		}
	}

	public static void Program4() 
	{
		//assignment 2 prgram3
		while(true) {
			System.out.println("infinite loop");
		}
		
	}
	
	public static void Program5() 
	{
		//assignment 2 prgram4
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[10];
		int i = 0;
		while(i<10) 
		{
			System.out.println("enter value for index "+ i);
			arr[i] = scan.nextInt();
			i++;
		}
		scan.close();
		
	}
	
	public static void Program6() 
	{
		//assignment 2 prgram5

		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		int i = 0;
		while(i<arr.length) 
		{
			System.out.println("enter value for index "+ i);
			arr[i] = scan.nextInt();
			i++;
		}
		scan.close();
		
		for(int j =0 ; j< arr.length ;j++) {
			System.out.println("Array is: "+ arr[j]);
		}
	}
}
