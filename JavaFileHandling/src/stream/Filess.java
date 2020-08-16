package stream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filess {
	public static void fileExist() throws IOException {
		System.out.println("\n\n------------------------------------------\n------------------------------------------");
		System.out.println("we will check if file exists or not?");
		File file = new File("main.txt");
	
		if(file.exists()) {
			System.out.println("file exists!!");
		}
		else {
			System.out.println("file dose not exists!!!");
			file.createNewFile();
			System.out.println("file created succesfully");
		}
	}
	
	public static void writeData() throws IOException {
		System.out.println("\n\n------------------------------------------\n------------------------------------------");
		System.out.println("now we will write data to file!!!");
		
		File file = new File("main.txt");
		FileWriter fwriter = new FileWriter(file,true);
		BufferedWriter bwriter = new BufferedWriter(fwriter);
		bwriter.write("my name is saqib and i am doing file handling!!!!!!");
		bwriter.write("\n");
		bwriter.close();
		if(file.length()!=0) {
			System.out.println("data written to file successfully!!!");
		}
		else {
			System.out.println("data not written to file");
		}
		
	}
	
	public static void readDataScanner() throws IOException {
		System.out.println("\n\n------------------------------------------\n------------------------------------------");
		System.out.println("now we will read that from file using Scanner!!!!!");
		
		File file = new File("main.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		Scanner line = new Scanner(reader);
		while(line.hasNextLine()) {
			System.out.println(line.nextLine());
		}
		reader.close();
		line.close();
	}
	
	public static void readDataNoScanner() throws IOException {
		System.out.println("\n\n------------------------------------------\n------------------------------------------");
		System.out.println("now we will read that from file without using Scanner!!!!!");
		String line1;
		File file = new File("main.txt");
		BufferedReader reader1 = new BufferedReader(new FileReader(file));
		while ((line1 = reader1.readLine()) != null) {
			System.out.println(line1);
		}
		reader1.close();
	}
	
	public static void appendData() throws IOException {
		System.out.println("\n\n------------------------------------------\n------------------------------------------");
		System.out.println("now we will write that to file using append command!!!!!");
		
		File file = new File("main.txt");
		FileWriter fwriter1 = new FileWriter(file,true);
		fwriter1.append("writing data again to file:)");
		fwriter1.write("\n");
		fwriter1.close();
		
	}
}
