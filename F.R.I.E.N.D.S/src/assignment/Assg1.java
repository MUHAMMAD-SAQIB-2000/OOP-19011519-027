package assignment;

import java.util.Scanner;

public class Assg1 
{
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];//declaring array
		int temp=0; //temporary variable to store value for swapping
		//taking array values input from user
		for(int i=0,n=1 ; i<arr.length ; i++,n++)
		{
			System.out.println("Enter "+n+"st value: ");//dsiplaying number of value to be inputted
			arr[i] = scan.nextInt();//inputing value
		}
		
		System.out.println("Array before swapping");//statement to distinguish between both arrays
		for(int i=0,n=1 ; i<arr.length ; i++,n++)
		{
			System.out.println("Value "+n+"is: "+arr[i]);//displaying array at their position-number not index-number
		}
		//swapping variables
		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		//swapping completed
		
		//now printing array elements after swapping
		System.out.println("Array after swapping");//statement to distinguish between both arrays
		for(int i=0,n=1 ; i<arr.length ; i++,n++)
		{
			System.out.println("Value "+n+"is: "+arr[i]);//displaying array at their position-number not index-number
		}
		scan.close();
	}

}
