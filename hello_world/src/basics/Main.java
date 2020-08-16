package basics;

public class Main {

	public static void main(String[] args) 
	{
		Human student = new Human();
		student.setAge(15);
		student.setName("ali ahmed");
		
		System.out.println("Your name is: " + student.getName());
		System.out.println("Your age is : " + student.getAge());
		student.schoolname();
		int num = 100;
		System.out.println("num *2  is ");
		System.out.println(num*2);

		
	}

}
