package yusra;

import java.util.Scanner;

public class Main1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int salary;
		char exit = 0;
		System.out.println("if salary is 50000 or more. no bonus will be given");
		System.out.println("if salary is 30000 or more but less than 50000, then 15% of salary will be added as bonus");
		System.out.println("if salary is 15000 or more but less than 30000, then 25% of salary will be added as bonus");
		System.out.println("if salary is less than 15000, then 35% of salary will be added as bonus ");
		do {
			salary = scan.nextInt();
			if(salary>=50000) {
				System.out.println("There is no bonus for you");
			}
			else if(salary>=50000) {
				System.out.println("There is no bonus for you");
			}
			else if(salary>=50000) {
				System.out.println("There is no bonus for you");
			}
			else if(salary>=50000) {
				System.out.println("There is no bonus for you");
			}
			else
			{
				System.out.println("salary can not be less than one");
			}
			
		}while(true);
		
		
	}
		
	

}
