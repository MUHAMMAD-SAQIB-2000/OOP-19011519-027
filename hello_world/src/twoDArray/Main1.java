package twoDArray;

public class Main1 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=11;
		int c;
		
		System.out.println("Number is :" + a);
		System.out.println("sum of a+b is " + (a+b));
		double x = 12.345678;
		System.out.println("Float value is" + x);
		System.out.format("value upto 3 places is %.3f ", x);
		System.out.println(" ");
		String s = "hello sidra";
		System.out.println( s);
		char ch = 'o';
		System.out.println("char is " + ch);
		
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else 
		{
			System.out.println("b is gretaer");
		}
		switch(a)
		{
		case 10:
			System.out.println("helo");
			break;
		default:
			System.out.println("default");
			break;
		}
 	}

}
