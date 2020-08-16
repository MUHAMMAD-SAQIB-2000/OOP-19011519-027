package week1;

import java.io.IOException;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		scan.close();
		scan1.close();
		System.out.println("enter a ");
		int a = scan.nextInt();
		System.out.println("enter b ");
		int b = scan1.nextInt();
		int result;
		result=a*b;
		System.out.println("result is " + result);

	}

}
