package friends;

public class P2 {

	public static void main(String[] args) 
	{
		//array1();
		//swap array elements 
		int[] arr = {1,2,3};
		int temp ;
		System.out.println("old array is: ");
		for(int i = 0 ; i<arr.length ;i++)
		{
			System.out.println("array is: " + arr[i]);
		}
		temp = arr[0];
		System.out.println(temp);//new value of temp
		arr[0] = arr[2];// value transfered to first index
		System.out.println(arr[0]);//new value of arr[0]
		arr[2] = temp;
		System.out.println(arr[2]);//new value of arr[2]
		
		//array after swapping varibale
		System.out.println("new array is: ");
		for(int i = 0 ; i<arr.length ;i++)
		{
			System.out.println("array is: " + arr[i]);
		}
		
	}
	public static void array1() {
		int[] arr = {1,45,34,78,32,100};
		int sum = 0;
		int average = 0;
		for(int i = 0 ; i<arr.length ;i++)
		{
			sum = sum + arr[i];
			//1 + 45= 46 // sum=46
		}
		System.out.println("Sum is: " + sum);
		average  = sum / arr.length;
		System.out.println("Average is:  " +average);
	}
	public static void array2() {
		
	}
}
