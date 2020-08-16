package interfacepackage;

public interface MultiInheritanceClass {

}

interface first{
	public void Fname();	
}


interface last{	
	public void Lname();
}

class name implements first,last {
	public void Fname() 
	{
		System.out.println("Muhammad");
	}
	public void Lname()
	{
		System.out.println("Saqib");
	}
	
	public String toString()
	{
		System.out.println("the method executed is tostring");
		return "this is to string";
	}
}