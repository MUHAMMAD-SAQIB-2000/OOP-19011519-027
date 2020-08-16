package bitwiseOperators;

public class LeftShift {

	public static void main(String[] args) 
	{
		byte a= 35;
		byte b,b1;
		int i;
		i = a<<2;
		b = (byte) (a<<2);
		System.out.println("original value of a " + a);
		System.out.println("i and b are " + i +" " + b);

	}

}
