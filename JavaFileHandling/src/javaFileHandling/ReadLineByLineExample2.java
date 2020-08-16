package javaFileHandling;

import java.io.*;
import java.util.Scanner;

public class ReadLineByLineExample2
{
	public static void main(String args[])
	{
		try
		{
			//the file to be opened for reading
			FileInputStream fout=new FileInputStream("fin.RTF");
			Scanner sc=new Scanner(fout); //file to be scanned
			//returns true if there is another line to read
			while(sc.nextLine() != null)
			{
				System.out.println(sc.hasNextLine());
				System.out.println(sc.nextLine()); //returns the line that was skipped
			}
			sc.close(); //closes the scanner
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}