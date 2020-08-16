package basics;

public class OverLoading1 {

	public void makesound() {
		System.out.println("Grrr.........");
	}

	public String makesound(String s) {
		System.out.println("Meow");
		return s;
	}
	public static void main(String[] args) 
	{
		String a;
		OverLoading1 op = new OverLoading1();
		op.makesound();
		a= op.makesound("hello g");
		System.out.println(a);

	}

}
