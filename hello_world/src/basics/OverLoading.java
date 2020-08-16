package basics;

public class OverLoading 
{
	public static int  max(int a, int b) {
		if(a>b)
			return a;
		else 
			return b;
	}
	public static double  max(double a, double b) {
		if(a>b)
			return a;
		else 
			return b;
	}
	public static void main(String[] args) {
		System.out.println("max value is "+ max(1,2));
		System.out.println("max value is "+ max(10.23,20.1));
	}

}
/*
 * over loading works for methods having same name but different parameters 
 * they can be both void or they might return something
 * methods have same name but they have different parameters 
 */
