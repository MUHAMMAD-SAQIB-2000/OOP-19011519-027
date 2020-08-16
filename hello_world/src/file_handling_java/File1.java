package file_handling_java;

import java.io.File; // Import the file class
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors

public class File1 {

	public static void main(String[] args)  throws IOException {
		
		File obj1= new File("myfile1.txt");
		FileWriter obj2 = new FileWriter("myfile1.txt");
		
		obj1.createNewFile();
		if(obj1.exists())
		{
			System.out.println("file exsists");
			obj2.write("hello this is a new file \n ");
			obj2.write("hello i am writing to this file \n ");
			obj2.write("\n");
			obj2.write("\n");
			obj2.write("hi world");
			obj2.write("\n");
			obj2.write("\n");
			obj2.write("hi again");
			
		}	
		
		else
			System.out.println("file does not exists");
		
		obj2.close();
	}

}
