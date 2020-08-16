package buffered;

import java.io.*;
public class BufferedOutputStreamExample
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fout=new FileOutputStream("fin.RTF");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="Welcome to javaTpoint.";
		byte b[]=s.getBytes();
		bout.write(b);
		System.out.println();
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");

	}
}