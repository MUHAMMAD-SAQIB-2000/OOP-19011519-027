package arooj;

public class HELL 
{
	
	int age;
	public int getAge() {
		return age;
	}
	public void setAge(int Age) {
		if(Age>5)
			this.age = Age;
		else
			this.age = 10;
	}
	public void arooj()
	{
		System.out.println("method is running!!!!!");
		
	}
	public static int max(int a, int b)
	{
		if(a>b)
		{
			return a;
		}
		else 
		{
			return b;
		}
	}

}
