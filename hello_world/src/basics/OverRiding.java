package basics;

class Animal
{
	public void makesound() {
		System.out.println("Grrr.........");
	}
}

class Cat extends Animal
{
	public void makesound() {
		System.out.println("Meow");
	}
}

public class OverRiding {

	public static void main(String[] args) 
	{
		Cat b = new Cat();
		b.makesound();

	}

}
/*
 * Overriding is a feature that allows a subclass or child class to provide a specific implementation 
 * of a method that is already provided by one of its super-classes or parent classes. 
 * When a method in a subclass has the same name, 
 * same parameters or signature and same return type(or sub-type) as a method in its super-class,
 *  then the method in the subclass is said to override the method in the super-class.
 */
