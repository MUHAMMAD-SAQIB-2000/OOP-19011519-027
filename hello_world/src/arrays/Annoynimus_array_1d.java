//Annoynimus_array_1d
package arrays;

public class Annoynimus_array_1d 
{

	static void printArray(double arr[])
	{  
		for(int i=0;i<arr.length;i++)  
		System.out.println(arr[i]);  
	} 
	
	public static void main(String[] args) 
	{
		//Java Program to demonstrate the way of passing an anonymous array  
		//to method.    
		//creating a method which receives an array as a parameter   
		
		printArray(new double[]{10,22,44,33.22,78.9,66});//passing anonymous array to method 
		
	} 

}



