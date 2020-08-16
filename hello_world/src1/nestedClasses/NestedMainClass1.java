package nestedClasses;

public class NestedMainClass1 {

	public static void main(String[] args) 
	{
		outer1 o1 = new outer1();
		outer1.inner1 i1 = o1.new inner1();
		
		o1.x=100;
		i1.y=o1.x;
		o1.setX(100);
		i1.setY(20);
		System.out.println("x is " + o1.getX());
		System.out.println("y is " + i1.getY());
		o1.outer();
		i1.inner();
	}

}
