package friends;

public class Loops {

	public static void main(String[] args) 
	{
		
		int[] arr = {1,2,3,4,5,6,8,9};
		for(int i = 0 ; i<arr.length ;i++)
		{
			System.out.println("array element is: "+arr[i]);
		}
		
		System.out.println("divider\n\n\n");
		
		int[] arr1 = {1,2,3,4,9};
		// for each loop or advanced for loop
		for(int j : arr1)
		{
			System.out.println("array element is: "+arr[j]);
		}
		
	}

}
//loops 
		//iterate till the condition is true
		// if the condition does not becomes fault the loops keep iterating and is called an infinite loops
		// there are 3 types of loop
		//1. while loop
		//2. do-while loop
		//3. for loop
		// there is a fourth loop called nested while loop
		
		//while loop-syntax
		/**
		 *while(condition) if cond==true then loops execute else terminate
		 *	{
		 *		//statements
		 *	} 
		 */
		
		//do-while loop-syntax
		/**
		 * do{
		 * 		//statements
		 * }while(condition); condition is evaluated at end and the loop is executed atleast once
		 */
		
		//for loop-syntax
		/**
		 * for(initialization ; condition ; increment/decrement (post/pre))
			 * {
			 * }
			 * int i =1;
		 * for (;condition;)
		 * {
		 *	//statements
		 *i++;
		 * }
		 */
		//
/*
 * // while loop
		//printing counting upto 10
		int i = 1;
		while(i<=10) {
			System.out.println("Counting: "+ i);
			i++;
		}
		//program to print country name
		int j=1;
		while(j<=5) {
			System.out.println("Pakistan");
			j++;
		}
 * */

// 
/*
 * // do while loop
		int a = 10;
		do {
			System.out.println("value of a is: " +a);
			a++;
		}while(a>=20);//do-while it executes atleast once even of the condition is false for the beginning 

 * */

/*
*
* // for-loop

		for(int i =2000 ; i<=100 ; ++i ) 
		{
			System.out.println("Value of i is: "+ i);
		}
		
		
		for(int s = 10; s<=100 ; )
		{
			
			System.out.println("value of s is: "+ s);
			s++;
			
		}
* */