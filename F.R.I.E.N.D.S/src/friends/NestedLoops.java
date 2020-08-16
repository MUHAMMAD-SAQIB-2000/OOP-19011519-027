package friends;

public class NestedLoops {

	public static void main(String[] args) 
	{
		// syntax
		/*
		 * outer-loop{
			 * 	inner-loop{
			 * 		statements
			 * 	}
		 * }
		 * */
		int  i = 1;
		while(i<=5) 
		{
			System.out.println("outer loop value: "+ i );	
			for(int j = 0 ; j<i ; j++  ) 
			{
				System.out.println("\t inner loop value: "+j);
			}
			
			i++;
			System.out.println(" ");
		}
	}

}
