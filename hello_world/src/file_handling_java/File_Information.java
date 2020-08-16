package file_handling_java;

import java.io.File;

public class File_Information 
{

	public static void main(String[] args) 
	{
		File f = new File("file.txt");
		if(f.exists())
		{
			System.out.println("File Name" + f.getName() );
			System.out.println("Absolute Path " + f.getAbsolutePath() );
			System.out.println("Writeable" + f.canWrite());
			System.out.println("Readable" + f.canRead() );
			System.out.println("File size in bytes" + f.length() );
			
		}
		else
		{
			System.out.println(" The File does not exist. ");
		}

	}

}
