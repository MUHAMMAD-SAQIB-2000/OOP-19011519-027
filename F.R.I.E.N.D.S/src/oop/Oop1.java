package oop;

class Test{
	int age = 0;
	String name = "Hassan";
	public void oopMethod() {
		System.out.println("i am doing java :)");
	}
	int salary = 60000;
	
	public String city;
	
}

public class Oop1 {

	public static void main(String[] args) 
	{
		Test obj = new Test();
		System.out.println("age is: "+ obj.age);
		System.out.println("NAme is: "+ obj.name);
		obj.oopMethod();
		System.out.println("salary is:"+ obj.salary);
		
	}

}
