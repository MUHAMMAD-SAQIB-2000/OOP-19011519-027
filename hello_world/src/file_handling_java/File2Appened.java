package file_handling_java;

import java.io.*;

public class File2Appened {

	public static void main(String[] args) throws IOException 
	{
		File file = new File("myfile1.txt");
		FileWriter fr = new FileWriter(file, true);
		fr.write(" data "+ "\r\n");
		System.out.println("working");
		fr.close();

	}

}
