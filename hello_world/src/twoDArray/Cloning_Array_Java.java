/*
 *  Since, Java array implements the Cloneable interface, we can create the
	clone of the Java array. If we create the clone of a single-dimensional array,
	it creates the deep copy of the Java array. It means, it will copy the actual
	value. But, if we create the clone of a multidimensional array, it creates the
	shallow copy of the Java array which means it copies the references.

 */

package twoDArray;

public class Cloning_Array_Java 
{
	public static void main(String args[])
	{
		int arr[]={33,3,4,5};
		System.out.println("Printing original array:");
		for(int i:arr)
		System.out.println(i);
		
		System.out.println("Printing clone of the array:");
		int carr[]=arr.clone();
		for(int i:carr)
		System.out.println(i);
		
		if(arr==carr)
			System.out.println(" Both are equal ");
		else 
			System.out.println(" Both are not equal ");

	}
}
