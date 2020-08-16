package file_handling_java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) 
	{
		try
		{
			File fl = new File("file.txt");
			Scanner fr = new Scanner(fl);
			while(fr.hasNextLine())
			{
				String data = fr.nextLine();
				System.out.println(data);
			}
			fr.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("an error occured");
			e.printStackTrace();
		}
		
	}

}
