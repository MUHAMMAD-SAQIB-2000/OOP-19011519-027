package yusra;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) {
		/*int i,j;
		for(i=7;i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		char ch;
		int x;
		Scanner myobj = new Scanner (System.in);
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any character :");
		ch =sc.next().charAt(0);
		 x = myobj.nextInt();

		if(ch>=65 && ch<=90) {
			System.out.println("you enter capital alphabet");
		}
		
					
		else if(ch>=97 && ch<=122) {
			System.out.println("Enter enter small alphabet");
		}
		else if(ch<=9) {
			System.out.println("you enter digit:");
		}
		}
	
	

}
