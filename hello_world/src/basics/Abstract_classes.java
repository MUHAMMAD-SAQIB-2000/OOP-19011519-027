
package basics;
abstract class Animal1
{
	private int legs = 4 ;
	public int getLegs() {
		return legs;
	}
	public void setLegs(int Legs) {
		if(!(Legs==4))
			this.legs = 4;
		else
		{
			this.legs = Legs;
			System.out.println("working!!!");
		}
	}
	abstract void makesound();
}

class Cat1 extends Animal1
{
	public void makesound() {
		System.out.println("Meow...");
		
	}
}

public class Abstract_classes {

	public static void main(String[] args) 
	{
		Cat1 c = new Cat1();
		//c.legs =10;
		//System.out.println(c.legs);
		c.makesound();
		c.setLegs(4);
		System.out.println("legs are " + c.getLegs()); 
		
	}

}
