package twoDArray;

public class Main {

	public static void main(String[] args) 
	{
		System.out.println("Working!!!");
		int [][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,1,2,3}
		};
		System.out.println("Lenght of row 1 is : " + arr[0].length);
		System.out.println("Lenght of row 2 is : " + arr[1].length);
		System.out.println("Lenght of row 3 is : " + arr[2].length);
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
			
		}
		

	}

}
