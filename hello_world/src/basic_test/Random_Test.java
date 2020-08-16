package basic_test;

import java.util.Random;
import java.util.Scanner;

public class Random_Test 
{
	static Scanner scan;
	public static void main(String[] args) 
	{
		Random rand = new Random();
		scan = new Scanner(System.in);
		
		int randomValueStorer;
		int inputUser;
		
		System.out.println("working");
		
		randomValueStorer = rand.nextInt(100);
		System.out.println(randomValueStorer);
		
		do 
		{
			System.out.println("Enter a Number between 1-100 ");
			inputUser = scan.nextInt();
			
		}while(!(inputUser>0 && inputUser<=100));
		
		while(true)
		{
			if(inputUser> randomValueStorer)
			{
				System.out.println("Too High!\nTry Again: ");
			}
			else if(inputUser < randomValueStorer)
			{
				System.out.println("Too Low!\nTry Again: ");
			}
			else if(inputUser == randomValueStorer)
			{
				System.out.println("Congratulations!!! You figured out my number! ");
				System.exit(0);
			}
			inputUser = scan.nextInt();
		}
		
		
	}

}
