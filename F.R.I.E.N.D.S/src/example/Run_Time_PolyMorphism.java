package example;

class Child1 extends Run_Time_PolyMorphism{
	public static void display() {
		System.out.println("Child Class Function");
	}
}

public class Run_Time_PolyMorphism {
	public static void display() {
		System.out.println("Parent Class Function");
	}
	public static void main(String[] args) 
	{
		Run_Time_PolyMorphism obj = new Run_Time_PolyMorphism();
		obj.display();
		Child1 obj1 = new Child1();
		obj1.display();
	}

}
