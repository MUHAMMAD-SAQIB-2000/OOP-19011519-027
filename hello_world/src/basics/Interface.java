package basics;

interface Animal2
{
	static int a=10;
	public void eat();
	}


interface Animal3
{
	public void makesound();
	public String makesound1(String s);
}

class Cat2 implements Animal2 , Animal3
{
	public void eat()
	{
		System.out.println("omnomnom");
	}
	public void makesound()
	{
		System.out.println("Meow");
	}
	public String makesound1(String s)
	{
		String a= s;
		return a;
	}
}

public class Interface {

	public static void main(String[] args) {
		Cat2 c= new Cat2();
		c.eat();
		c.makesound();
		String a=c.makesound1("hello guys");
		System.out.println(c.a);
		System.out.println(a);
	}

}
/*
 * an interface class in abstract by defualt
 * packages are abstract by default
 * implements is used to access the method and variables instead of extends 
 */ 
