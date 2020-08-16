package basic1;
import java.util.*;
public class String {

	public static void main(java.lang.String[] args) 
	{
		int temp=0;
		int temp1=0;
		java.lang.String str1="heLLo wORLd";
		java.lang.String str2="heLLo wORLd";
		//System.out.println(str1);
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			temp = (int) ch;
			if(ch>=97&&ch<=122)
			{
				temp = temp - 32;
		        ch = (char) temp;
			}
			System.out.print(ch);
		}
		System.out.println();
		for(int i=0;i<str2.length();i++)
		{
			char ch=str2.charAt(i);
			temp1 = (int) ch;
			if(ch>=65&&ch<=90)
			{
				temp1 = temp1 + 32;
		        ch = (char) temp1;
			}
			System.out.print(ch);
		}
	}

}
