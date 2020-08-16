package hello_world;

public class Main3 
{

	public static void main(String[] args) 
	{
		double[] arr =  {1,2,3,45.54,67.12,21,0.3};
		double total = 0;
		double avg = 0;
		for (int i = 0;i<arr.length;i++)
		{
			total = total + arr[i];
		}
		
		avg = total / arr.length;
		System.out.println("Average is " + avg);
		System.out.format("Average is %.3f " , avg);
		
	}

}
