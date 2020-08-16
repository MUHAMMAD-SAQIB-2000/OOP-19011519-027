package example;

public class ImplementingAbstraction {
	private int x,y;
	public void set(int a, int b) {
		x = a;
		y = b;
	}
	public void display()
	{
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		}
	
	public static void main(String[] args) {
		ImplementingAbstraction obj = new ImplementingAbstraction();
		obj.set(34, 56);
		obj.display();

	}

}
