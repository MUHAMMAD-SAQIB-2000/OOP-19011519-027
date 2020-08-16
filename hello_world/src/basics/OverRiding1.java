package basics;

class outer{
	public static int  max(int a, int b) {
		if(a>b)
			return a;
		else 
			return b;
	}
	
}

class inner// extends outer 
{
	public static double  max1(double a, double b) {
		if(a>b)
			return a;
		else 
			return b;
	}
}

public class OverRiding1 {

	public static void main(String[] args) 
	{
		inner in = new inner();
		//in.max(12, 11);
		in.max1(12.3, 23.4);		
		

	}

}
