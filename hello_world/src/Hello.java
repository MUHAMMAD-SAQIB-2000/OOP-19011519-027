
public class Hello {
	
	public static void main(String[] args) 
	{
		System.out.println("hi");
	
		 int value = 1234;
		 int sum=0;
		 int revnum=0;
		 int digit=0;
		 boolean flag = false;
		 sum = sum + value;
		 while(value!=0)
		 {
			  digit = value % 10;
	           revnum = revnum * 10 + digit;
	           value /= 10;
		 }
		 
		 System.out.println("Reversed Number: " + revnum);
		 System.out.println("Sum is  " + (sum + revnum));
		 System.out.println(flag);
	}
}
