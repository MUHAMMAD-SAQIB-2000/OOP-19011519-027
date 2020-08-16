package interfacepackage;

public interface Animal {
	public void eat();
	public void walk();
	public int age=0;
}
 class Zebra implements Animal{
	 
	 public void eat() {
		    
		    System.out.println("Zebra eats grass");
		  }
	 public void walk() {
		    
		    System.out.println("it walks and runs also");
		  } 
	 Zebra()
	 {
		 System.out.println("constructor is executed");
	 }
}

 