package twoDArray;

public class Copying_Array_in_Java 
{
	public static void main(String[] args) 
	{
		//declaring a source array
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		//declaring a destination array
		char[] copyTo = new char[8];
		
		//copying array using System.arraycopy() method
		
		System.arraycopy(copyFrom, 1, copyTo, 0, 6);
		
		//printing the destination array
		
		System.out.println(String.valueOf(copyTo));
		
	}

}
