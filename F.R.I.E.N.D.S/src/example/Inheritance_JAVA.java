package example;


class Child extends Inheritance_JAVA {
	Child(){
		System.out.println("I am a child class");
	}
	String name = "Child class";
}

public class Inheritance_JAVA  
{
	Inheritance_JAVA (){
		System.out.println("Hey Guys, I am a parent class");
	}
	String parent_name = "Parent 1";
	
	public static void main(String[] args) 
	{
		Child obj = new Child();
		System.out.println(" Child_Name: " + obj.name);
		System.out.println("Parent_Name: " + obj.parent_name);
		
	}
	
}
