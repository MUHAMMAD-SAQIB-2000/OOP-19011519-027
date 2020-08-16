package friends;

import java.util.Scanner;

public class P1 {
	
	public static void main(String[] args) 
	{
		//array1();
		//array2();
		//array3();
		
		array4();
	}
	public static void array4()
	{
		String[] aRR = {"hassan" , "aRooj" , "zuni" , "uc daRling"};
		char[] arr1= {'a','b','c'};
		double[] arr2 = {2.4 , 5.4 ,8.8};
		
		System.out.println("array of string");
		for(int i = 0 ; i<aRR.length ; i++)
		{
			System.out.println(aRR[i]);
		}
		
		System.out.println("array of character");
		for(int i = 0 ; i<arr1.length ; i++)
		{
			System.out.println(arr1[i]);
		}
		
		System.out.println("array of double");
		for(int i = 0 ; i<arr2.length ; i++)
		{
			System.out.println(arr2[i]);
		}
		
	}
	public static void array3() 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter size of array");//output show for user input
		int size  = scan.nextInt();//user input size of array
		
		int[] arr = new int[size];//new array create and storing size of array
		
		for(int i = 0 ; i<arr.length ; i++)//to iterate array through all its indexes and get input
		{
			System.out.println("enter some value for index  " + i);//user enter value at particular index
			arr[i] = scan.nextInt();//user input being stored at particular next
		}
		
		
		System.out.println("\n\n\n\n\n");
		
		for(int i = 0 ; i<arr.length ; i++)//to iterate array through all its indexes and show output
		{
			System.out.println(arr[i]);
		}
		
	}
	public static void array2()
	{
		int a = 10;
		/*
		 * 0 1
		 * 1 2
		 * 2 3
		 * 3 4
		 * 4 5
		 * */
		int[] arr = new int[5];
		int n= arr.length;
		for(int i = 0 ; i<arr.length ; i++)
		{
			arr[i] = i+23;
			System.out.println(arr[i]);
		}
			
	}
	public static void array1()
	{
		//syntax
				int[] arr = {1, 2, 3, 4, 5, 56};
				
				
				int n= arr.length;
				System.out.println(n);// array length
				
				System.out.println(arr[4]);//5th value will be printed at index 4
				
				for(int i = 0 ; i<arr.length;i++)
				{
					// i=1 arr[i]
					System.out.println("array value  at index "+i+" is "+arr[i] );
					
				}
	}
}
