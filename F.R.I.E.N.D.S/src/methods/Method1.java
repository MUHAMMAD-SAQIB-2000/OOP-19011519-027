package methods;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) 
	{
		//firstMethod();
//		int temp = intMethod();
//		System.out.println(temp+20);
//		String temp1 = stringMethod();
//		double temp2 = doubleMethod();
//		System.out.println("method string is: "+temp1);
//		System.out.println("method double is: "+temp2);
		
		/*
		 * Scanner scan = new Scanner(System.in); String name; int age; double salary;
		 * System.out.println("enter name"); name = scan.nextLine();
		 * System.out.println("enter age"); age = scan.nextInt();
		 * System.out.println("enter salary"); salary = scan.nextDouble();
		 * parameterMethod("Hassan", 22 , 100000.00); parameterMethod(name, age ,
		 * salary);
		 */
		parameterMethod1();
		
		
		
		
		
	}
	
	//syntax-parameter-example
	public static void parameterMethod (String Name, int age, double salary)
	{
		System.out.println("Name is: " + Name);
		System.out.println("Age is: " + age);
		System.out.println("Salary is: " + salary);
	}
	public static void parameterMethod1 ()
	{
		System.out.println("inside method ");
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		double salary;
		System.out.println("enter name"); name = scan.nextLine();
		System.out.println("enter age"); age = scan.nextInt();
		System.out.println("enter salary"); salary = scan.nextDouble();
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
		System.out.println("Salary is: " + salary);
	}
	//syntax-void-example
	public static void firstMethod()
	{
		System.out.println("this is my 1st void method");
	}
	
	//syntax-int-example
	
	@SuppressWarnings("unused")
	public static int intMethod() {
		System.out.println("run int method");
		return 20;
	}
	
	//syntax-String-example
	public static String stringMethod() {
		return "hassan is learning programming";
		
	}
	
	//syntax-String-example
	public static double doubleMethod() {
		return 22.1;
		
	}
}
