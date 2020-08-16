package basics;

class Animal5
{
	public void makesound() {
		System.out.println("Grrr.........");
	}
}

class Cat4 extends Animal5
{
	public void makesound() {
		System.out.println("Meow");
	}
}

class Dog extends Animal5
{
	public void makesound() {
		System.out.println("Woof");
	}
}


public class Polymorphism {

	public static void main(String[] args) 
	{
		Animal5 a = new Animal5();
		//Animal5 b = new Dog();
		Dog b = new Dog();
		Animal5 c = new Cat4();
		a.makesound();
		b.makesound();
		c.makesound();
	}

}
