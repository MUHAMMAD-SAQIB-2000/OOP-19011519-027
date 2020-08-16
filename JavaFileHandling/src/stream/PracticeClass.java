package stream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PracticeClass 
{
	public static void main(String[] args) throws Exception  
	{
		File file = new File("split.txt");
		if(!(file.exists())){
			file.createNewFile();
		}
//		fileWriterSplit();
//		fileReaderSplit();
//		fileOutputSplit();
//		fileOutputNames();
//		fileFindByID();
		fileFindByName();
		
	}
	private static void fileFindByName() throws Exception {
		Scanner scan = new Scanner(System.in);
		BufferedReader breader = new BufferedReader(new FileReader(new File("split.txt")));
		String line;
		System.out.println("enter Name whose record is to be found: ");
		String Name = scan.nextLine();
		while((line = breader.readLine() )!= null) {
			String[] splitRow = line.split(",");
		
			if(splitRow[1].toLowerCase().contains(Name.toLowerCase()) == true) {
				System.out.println(line);
			}
		
		}
		breader.close();
		scan.close();
	}
	public static void fileFindByID() throws Exception{
		Scanner scan = new Scanner(System.in);
		BufferedReader breader = new BufferedReader(new FileReader(new File("split.txt")));
		String line;
		System.out.println("enter ID number to be found: ");
		int idNumber = scan.nextInt();
		
		while((line = breader.readLine() )!= null) {
			String[] splitRow = line.split(",");
		
			if(Integer.parseInt(splitRow[0]) == idNumber) {
					System.out.println(line);
			}
		
		}
		breader.close();
		scan.close();
	}
	
	public static int setFileID() throws Exception {	
		BufferedReader bread = new BufferedReader(new FileReader(new File("split.txt")));
		String line;
		int newID = 0;
		while ((line = bread.readLine()) != null) {
			String[] rowID = line.split(",");
			newID = Integer.parseInt(rowID[0]);
			
		}
		bread.close();
		return newID+1;
	}
	
	public static void fileWriterSplit() throws Exception {
		Scanner scan = new Scanner(System.in);
		File file = new File("split.txt");
		FileWriter fwrite = new FileWriter(file,true);
		int ID = setFileID();
		System.out.println("enter name:");
		String name = scan.nextLine();
		System.out.println("enter age");
		int age = scan.nextInt();
		System.out.println("enter city");
		scan.nextLine();
		String city = scan.nextLine();
		fwrite.write(ID+","+name.toUpperCase()+","+age+","+city.toUpperCase());
		fwrite.write("\n");
		fwrite.close();
		scan.close();
		fileReaderSplit();
		
	}
	public static void fileReaderSplit() throws IOException {
		FileReader fread = new FileReader(new File("split.txt"));
		Scanner input = new Scanner(fread);
		while(input.hasNextLine())
		{
			System.out.println(input.nextLine());
		}
		input.close();
		fread.close();
	
	}
	public static void fileOutputSplit() throws IOException {
		BufferedReader breader = new BufferedReader(new FileReader(new File("split.txt")));
		String line;
		System.out.println("why now wroking?");
		while((line = breader.readLine() )!= null) {
			String[] splitRow = line.split(",");
		
//			System.out.println(splitRow[0]);
//			System.out.println(splitRow[1]);
//			System.out.println(splitRow[2]);
			if(splitRow[2].toLowerCase().contains("lahore") == true) {
				System.out.println();
				System.out.println(splitRow[0]);
				System.out.println(splitRow[1]);
				System.out.println(splitRow[2]);
			}
		
		}
		breader.close();
	}
	
	public static void fileOutputNames() throws IOException {
		BufferedReader breader = new BufferedReader(new FileReader(new File("split.txt")));
		String line;
		int i = 1;
		System.out.println("why now wroking?");
		while((line = breader.readLine() )!= null) {
			String[] splitRow = line.split(",");
			System.out.println(i+" Name: " + splitRow[0]);
			i++;
		}
		breader.close();	
	}
	
		
	

}
