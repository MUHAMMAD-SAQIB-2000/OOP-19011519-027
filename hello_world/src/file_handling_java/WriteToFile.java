package file_handling_java;

import java.io.*;

public class WriteToFile {

	public static void main(String[] args) 
	{
		try 
		{
			FileWriter fl = new FileWriter("arooj.txt");
			int a= 1000;
			fl.write("hello");
			fl.close();
			System.out.println("successfully written in file");
		}
		catch(IOException e)
		{
			System.out.println("an error occured");
			e.printStackTrace();
		}
		

	}

}
