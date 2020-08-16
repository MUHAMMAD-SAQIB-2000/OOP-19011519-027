package hello_world;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) 
	{
		int sum = 0;
		int avg = 0;
		int num = 0;
		try (Scanner scan = new Scanner(System.in))
		{
			System.out.print("Enter no. of elements you want in array:");
			num = scan.nextInt();
			int arr[] = new int[num];
			for (int i = 0 ; i<num ; i++)
			{
				arr[i] = scan.nextInt();
			}
			for (int i = 0 ; i<arr.length ; i++)
			{
				System.out.println("Array is: " + arr[i]);
			}
			for (int i = 0 ; i<arr.length ; i++)
			{
				sum = sum + arr[i];
			}
			avg = sum / arr.length;
		}
		System.out.println("Number is: " + num);
		System.out.println("The Sum is : " + sum);
		System.out.println("The Average is : " + avg);

	}

}
