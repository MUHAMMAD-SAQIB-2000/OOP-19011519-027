package enums;

import java.io.IOException;

public class EnumsForLoop {

	enum mark
	{
		LOW,
		HIGH,
		MEDIUM
	}
	public static void main(String[] args) throws IOException
	{
		mark m = mark.HIGH;
		/*for( mark m : m.values())
		{
			System.out.println(m);
		}*/
		System.out.println("vales "+ mark.values());
		System.out.println("value of " + mark.valueOf("MEDIUM"));
		System.out.println("Index of LOW is: "+mark.valueOf("LOW").ordinal());
			
	}

}
