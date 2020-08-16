package basicFileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("unused")
public class PracticeOne 
{
	static String textFile = "practice.txt";
	static String file = "practice55.txt";
	public static void main(String[] args) throws Exception 
	{
		Scanner scan = new Scanner(System.in);
		BufferedReader freader = new BufferedReader(new FileReader(file));
		
		String line ;
		System.out.println("enter id number to be deleted!!!");
		int idNumber = scan.nextInt();
		while((line = freader.readLine()) != null ) {
			String[] lineRow = line.split(",");
			
			if(Integer.parseInt(lineRow[0]) == idNumber) {
				System.out.println("id number exists");
			}
			else {
				System.out.println("id number not avalible");
			}
		}
		freader.close();
		scan.close();
		//fileExistCheck();
	}
	public static int setID() throws Exception {
		BufferedReader freader = new BufferedReader(new FileReader("practice55.txt"));
		
		String line ;
		int newID = 0;
		
		while((line = freader.readLine()) != null ) {
			
			String[] lineRow = line.split(",");
			newID = Integer.parseInt(lineRow[0]); 
			
		}
		freader.close();
		return newID+1;
	}
	
	public static void fileExistCheck() throws Exception 
	{
		//Today we will be doing file handling
		
		File file = new File(textFile);
		if(file.exists()) {
			System.out.println("file exists");
		}
		else {
			file.createNewFile();
			System.out.println("file created");
		}
	}
	
	public static void fileWrite() throws Exception {
		Scanner scan = new Scanner(System.in);
		BufferedWriter  fwrite = new BufferedWriter( new FileWriter(textFile,true));
		System.out.println("enter some data");
		String data = scan.nextLine();
		fwrite.write(data);
		fwrite.write("\n");
		fwrite.close();
		scan.close();
	}
	
	public static void fileRead(String file) throws Exception {
		BufferedReader freader = new BufferedReader(new FileReader(file));
		
		String line ;
		
		while((line = freader.readLine()) != null ) {
			System.out.println(line);
		}
		freader.close();
	}
	
	public static void moveData() throws Exception {
		System.out.println("transfering data from one file to another");
		BufferedReader freader = new BufferedReader(new FileReader(textFile));
		BufferedWriter  fwrite = new BufferedWriter( new FileWriter("practice1.txt",true));
		String line;
		while((line = freader.readLine()) != null) {
			fwrite.write(line);
			fwrite.write("\n");
		}
		fwrite.close();
		freader.close();
		
		System.out.println("new data");
		BufferedReader freader1 = new BufferedReader(new FileReader("practice1.txt"));
		
		String line1 ;
		
		while((line1 = freader1.readLine()) != null ) {
			System.out.println(line1);
		}
		
		freader1.close();
	}

	public static void readFileDataUser() throws Exception {
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		String city;
		System.out.println("Enter Name");
		name = scan.nextLine();
		System.out.println("Enter age");
		age = scan.nextInt();
		System.out.println("Enter city");
		scan.nextLine();
		city = scan.nextLine();
		
		BufferedWriter  fwrite = new BufferedWriter( new FileWriter("practice1.txt",true));
		fwrite.write(name+","+age+","+city);
		fwrite.write("\n");
		fwrite.close();
		scan.close();
		
		fileRead("practice1.txt");

	}
	
	public static void addByID()  throws Exception {
		Scanner scan = new Scanner(System.in);
		int ID = setID();
		String name;
		int age;
		String city;
		System.out.println("Enter Name");
		name = scan.nextLine();
		System.out.println("Enter age");
		age = scan.nextInt();
		System.out.println("Enter city");
		scan.nextLine();
		city = scan.nextLine();
		
		BufferedWriter  fwrite = new BufferedWriter( new FileWriter("practice55.txt",true));
		fwrite.write(ID+","+name+","+age+","+city);
		fwrite.write("\n");
		fwrite.close();
		scan.close();
		
		fileRead("practice55.txt");
		
		//fileExistCheck();
	}
	
}
