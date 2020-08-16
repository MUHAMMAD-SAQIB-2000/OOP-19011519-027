package javawrapperclass;

public class JavaWrapperClass {
	
	public void wrapper1() 
	{
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(myChar);
	}
	
	public void wrapper2()
	{
		Integer myInt = 5;
		Double myDouble = 5.99;
		Character myChar = 'A';
		System.out.println(myInt.intValue());
		System.out.println(myDouble.doubleValue());
		System.out.println(myChar.charValue());
	}

	public void wrapper3()
	{
		Integer myInt = 100;
		String myString = myInt.toString();
		System.out.println(myString.length());
		System.out.println(myString);
	}
	public static void main(String[] args) 
	{
		JavaWrapperClass obj = new JavaWrapperClass();
		obj.wrapper1();
		obj.wrapper2();
		obj.wrapper3();
	
	}

}
