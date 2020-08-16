package basics;

public class Math_Functions_java 
{

	public static void main(String[] args) 
	{
		System.out.println("Math functions");
		System.out.println("math.abs"+Math.abs(-23));	// output=23
		System.out.println("math.ceil"+Math.ceil(34.5));	// output=35.0
		System.out.println("math.floor"+ Math.floor(34.6));	// output=34.0
		System.out.println("math.max" + Math.max(23,24));	// output=24
		System.out.println("math.min" + Math.min(12, 10));	// output=10
		System.out.println("math . pow" + Math.pow(2, 3));	// output=8.0
		System.out.println("math.rint " + Math.rint(12.4));	// output=12.0
		System.out.println("math.rint " + Math.rint(12.8));	// output=13.0
		System.out.println("math. round with < 0.5\t"+ Math.round(23.4));	// output=23
		System.out.println("math. round with > 0.5\t"+ Math.round(23.8));	// output=24
		
	}

}
