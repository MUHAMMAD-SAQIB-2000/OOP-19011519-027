package arooj;
import java.util.Scanner;

public class Main_aRooj {
	
	private class jooj {
		public  int a;
		
	}
	public void jooj() {
		jooj jo = new jooj();
	}

	public static void main(String[] args) 
	{
		HELL arj = new HELL();
		//jooj jo = new jooj();
		//jo.a;
	
		Scanner scan = new Scanner(System.in);
		
		int max_val;
		arj.arooj();
		max_val = arj.max(12 , 34);
		System.out.println("max value is: " + max_val);
		
		arj.setAge(3);
		arj.age=101;
		/*
		if(arj.getAge()>20)
		{
			arj.setAge(152);
			System.out.println("age of arooj is" + arj.getAge());
		}
		else 
		{
			System.out.println("hi");
		}
		System.out.println("input value");
		int a = scan.nextInt();
		arj.setAge(a);
		*/
		System.out.println("age is " + arj.getAge());
		
		
	}

}
