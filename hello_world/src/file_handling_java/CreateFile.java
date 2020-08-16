package file_handling_java;

import java.io.File;
import java.io.IOException;

public class CreateFile 
{
	public static void main(String[] args) 
	{
		System.out.println("creating a file");
		try 
		{
			File myobj = new File("file.txt");
			if(myobj.createNewFile())
			{
				System.out.println("File Created: " + myobj.getName());
			}
			else
			{
				System.out.println("File Already exists");
			}
		}	
		catch( IOException e)	
		{
			System.out.println("An Error occured!!!");
			e.printStackTrace();
			
		}
			
		
	}

}
