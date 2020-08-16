package buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Buffering 
{
	public static void main(String[] args) 
	{
		BufferedOutputStream output = null;
		BufferedInputStream input  = null;
		try
		{
			input = new BufferedInputStream(new FileInputStream("fin.RTF"));
			output = new BufferedOutputStream(new FileOutputStream("hi.RTF"));
			for(int i = input.read(); i!=-1 ; i = input.read())
			{
				output.write(i);
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex);
		}
		finally 
		{
			try
			{
				if(input != null)
				{
					input.close();
				}
				if(output != null)
				{
					output.close();
				}
				
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		
	}

}
