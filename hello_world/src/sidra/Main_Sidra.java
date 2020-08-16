// input program java
package sidra;

import java.util.*;

public class Main_Sidra {

	public static void main(String[] args) 
	{
		int a;
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		Scanner sid = new Scanner(System.in);
		Scanner zunibandar = new Scanner(System.in);
		
		System.out.println("enter an integer");
		a=scan.nextInt();
		System.out.println("value entered is: " + a);
		
		System.out.println("enter string");
		String str = scan1.nextLine();
		System.out.println("line entered is" + str);
		
		System.out.println("enter float value ");
		double  dl = scan2.nextDouble();
		System.out.println("double  entered is" + dl);
		
		System.out.println("enter chracter ");
		char c = scan3.next().charAt(0);
		char s = sid.next().charAt(3);
		char e = zunibandar.next().charAt(2);
		System.out.println("double  entered is  " + s +" " + c + " " + e);
		 
	}

}
