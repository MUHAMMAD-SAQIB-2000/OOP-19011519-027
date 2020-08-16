package normalFileHandling;

import java.util.Scanner;

public class MainFile {
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		char ch ;
		System.out.println("1. for enter record");
		System.out.println("2. for view all");
		System.out.println("3. for del record");
		System.out.println("4. for exit");
		do {
			System.out.println("Enter your choice: ");
			ch = scan.next().charAt(0);
			switch(ch) {
			case '1':
				PersonData.addRecord();
				break;
			case '2':
				PersonData.viewAll();
				break;
			case '3':
				PersonData.delRecord();
				break;
			case '4':
				System.out.println("program terminated!!!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice!!");
				System.out.println("Enter again!");
				break;
				
			}
			
		}while(!(ch=='1'||ch=='2'||ch=='3'||ch=='4'));
		scan.close();
	}
	
}
