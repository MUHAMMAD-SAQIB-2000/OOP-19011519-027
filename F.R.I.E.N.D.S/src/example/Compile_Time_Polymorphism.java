package example;

class Addition{
	public static int sum(int number1, int number2) {
		return number1+number2;
	}
	public static int sum(int number1, int number2, int number3) {
		return number1+number2+number3;		
	}
}

public class Compile_Time_Polymorphism 
{

	public static void main(String[] args) 
	{
		Addition obj = new Addition();
		System.out.println("Output: "+obj.sum(30, 60));
		System.out.println("Output: "+obj.sum(30, 60, 90));
	}

}
