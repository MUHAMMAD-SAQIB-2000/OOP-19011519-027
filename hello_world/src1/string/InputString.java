package string;

import java.util.Scanner;

public class InputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner input = new Scanner(System.in)){
			System.out.println("ENTER THREE LINES");
			System.out.println("enter first line");
			String one = input.nextLine();
			System.out.println("enter second line");
			String second = input.nextLine();
			System.out.println("enter third line");
			String third = input.nextLine();
			System.out.println("enter third line");
			int fourth = input.nextInt();
			System.out.println("\n\n\n\n lines entered are");
			System.out.println(one+" " + second+ " "+ third + " "+ fourth);	
		}
		
	}

}
