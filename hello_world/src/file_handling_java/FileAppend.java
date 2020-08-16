package file_handling_java;

import java.io.*;

public class FileAppend 
{
	public static void main(String[] args) throws IOException 
	{
		try
		{
			FileWriter f = new FileWriter("file.txt", true);
			f.write("\n \t hi , i am using append mode \n");
			f.close();
			System.out.println("\n \t file append successfully");
		}
		catch(IOException e)
		{
			System.out.println("an error occured");
			e.printStackTrace();
		}
		
		
	}

}
