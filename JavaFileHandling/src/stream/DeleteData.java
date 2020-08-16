package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

@SuppressWarnings("unused")
public class DeleteData 
{
	public static void main(String[] args) throws Exception 
	{
		//deleteData();
		Update();
	}
	
	public static void deleteData() throws Exception {
		String file = "split.txt";
		String temp = "temp.txt";
		File fileMain = new File(file);
		File fileTemp = new File(temp);
		BufferedReader obj = new BufferedReader(new FileReader (fileMain));
		BufferedWriter writer = new BufferedWriter(new FileWriter (fileTemp,true));
		Scanner scan = new Scanner(System.in);
		String line;
		int ID = 0;
		
		System.out.println("Enter ID Number to be deleted");
		ID = scan.nextInt();
		
		while ((line = obj.readLine()) != null) {
			String[] splitRow = line.split(",");
			
			if(Integer.parseInt(splitRow[0]) == ID) {
				System.out.println("Data Deleted Successfully");
			}
			else {
				writer.write(line);
				writer.write("\n");			
			}
		}
		obj.close();
		writer.flush();
		writer.close();
		fileMain.delete();
		fileTemp.renameTo(fileMain);
		
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

	public static void Update() throws Exception {
		String file = "split.txt";
		String temp = "temp.txt";
		File fileMain = new File(file);
		File fileTemp = new File(temp);
		BufferedReader obj = new BufferedReader(new FileReader (fileMain));
		BufferedWriter writer = new BufferedWriter(new FileWriter (fileTemp,true));
		Scanner scan = new Scanner(System.in);
		String line;
		int ID = 0;
		
		System.out.println("Enter ID Number to be Updated");
		ID = scan.nextInt();
		
		while ((line = obj.readLine()) != null) {
			String[] splitRow = line.split(",");
			
			if(!(Integer.parseInt(splitRow[0]) == ID)) {
				System.out.println("there is no record with such ID!!!!!");
			}
			if(Integer.parseInt(splitRow[0]) == ID) {
				
				System.out.println("enter name:");
				scan.nextLine();
				String name = scan.nextLine();
				System.out.println("enter age");
				int age = scan.nextInt();
				scan.nextLine();
				System.out.println("enter city");
				String city = scan.nextLine();
				writer.write(ID+","+name.toUpperCase()+","+age+","+city.toUpperCase());
				writer.write("\n");
				System.out.println("Data Updated Successfully");
			}
			else {
				writer.write(line);
				writer.write("\n");			
			}
		}
		obj.close();
		writer.flush();
		writer.close();
		fileMain.delete();
		fileTemp.renameTo(fileMain);
		
		scan.close();
		
	}
}
