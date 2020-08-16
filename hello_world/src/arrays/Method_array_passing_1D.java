//Method_array_passing_1D 

package arrays;

public class Method_array_passing_1D 
{
	// finding minimum in an array
	static void min(int arr[]){  
		int min=arr[0];  
		for(int i=1;i<arr.length;i++)  
		{
			System.out.println(arr[i]);
			if(min>arr[i])  
				 min=arr[i]; 
		}
		  
		System.out.println(min);
		System.out.println("The End!");  
		}  
	
	// finding maximum in an array
		static void max(int arr[]){  
			int max=arr[0];  
			for(int i=1;i<arr.length;i++)  
			{
				System.out.println(arr[i]);
				if(max<arr[i])  
					 max=arr[i]; 
			}
			  
			System.out.println(max);  
			}  
	public static void main(String[] args) 
	{
		int ar[] = {1,33,45,112,9,100};
		min(ar);
		max(ar);
		
		
	}

}
