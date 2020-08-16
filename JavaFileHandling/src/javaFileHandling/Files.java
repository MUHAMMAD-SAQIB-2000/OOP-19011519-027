package javaFileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Files 
{
	static int tries=3;
	private static char op;
	
	public static void main(String[] args)  throws Exception
	{
		mainmenu();
	}
	public static void mainmenu() throws Exception
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("*******Welcome to learn file handling*******");
		System.out.println("Press:\n1.Enter data to file\n2.Read data from a file(By Casting Method)\n3.Read data from files(Scanner class)");
		System.out.println("4.To Delete data\n5.Create new data\n6.Exit.");
		try 
		{
			do {
				op = input.next().charAt(0);
				setOp(op);
				switch(getOp())
				{
				case '1':
					filewriter();
					break;
				case '2':
					filereaderAscii();
					break;
				case '3':
					filereaderScanner();
					break;
				case '4':
					deletedata();
					break;	
				case '5':
					newfile();
					break;
				case '6':
					exit();
					break;	
				default:
					tries--;
					if(tries==0)
					{
						System.out.println("Too Many Incorrect attempts!!!!!!");
						System.exit(0);
					}
					else
					{
						System.out.println("invalid option!!!\nYou have "+tries+" tries remaining\nEnter your option again");
					}
					break;
				}
				
			}while(!(op=='1'||op=='2'||op=='3'||op=='4'||op=='5'||op=='6'));
		
		}
		catch(InputMismatchException ex)
		{
			System.out.println("This is not an option.");
		}
		input.close();
		
	}
	public static void filewriter()
	{
		boolean cond = true;
		String data = "";
		Scanner input = new Scanner(System.in);
		File file = new File("fin.RTF");
		if(file.exists())
		{
			try
			{		
				FileWriter fin = new FileWriter("fin.RTF",true);
				System.out.println("Enter Data:");
				do
				{
					data = input.nextLine();
					fin.write(data);
					if(data.length()!=0)
					{
						data = input.nextLine();
					}
					else
					{
						cond = false;							
					}		
					
				}while(cond);
				System.out.println("data added.");
				fin.close();
			}
			catch(Exception ex)
			{
				System.out.println("Could not write data to file.");
			}
		}
		else
		{
			System.out.println("File do not exist.");
		}	
		input.close();
	}
	public static void filereaderAscii()
	{
		int data=0;
		Scanner input = new Scanner(System.in);
		File file = new File("fin.RTF");
		if(file.exists())
		{
			try
			{		
				FileReader fout = new FileReader("fin.RTF");
				while((data=fout.read())!=-1)
				{
					System.out.print((char)data);
				}
				fout.close();
			}
			catch(Exception ex)
			{
				System.out.println("Could not load data from file.");
			}
		}
		else
		{
			System.out.println("File do not exist.");
		}
		input.close();
	}
	public static void filereaderScanner()
	{
		File file = new File("fin.RTF");
		if(file.exists())
		{
			try
			{
				FileInputStream fout = new FileInputStream("fin.RTF");
				Scanner input =new Scanner(fout);
				while(input.hasNextLine())
				{
					System.out.println(input.nextLine());
				}
				input.close();
			}
			catch(Exception ex)
			{
				System.out.println("Could not load data from file.");
			}
		}
		else
		{
			System.out.println("File do not exist.");
		}
	}
	public static void deletedata() 
	{
		File file = new File("fin.RTF");
		if(file.exists())
		{
			if(file.length()!=0)
			{
				try
				{
					FileWriter del = new FileWriter("fin.RTF");
					System.out.println("***Data Deleted!!!***");
					del.close();
				}
				catch(Exception ex)
				{
					System.out.println("Error occured while deleting data.");
				}				
			}
			else
			{
				System.out.println("There is no data in file.");
			}
		}
		else
		{
			System.out.println("File do not exist.");
		}
		
	}
	public static void newfile()
	{
		try
		{
			String filename;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter file name:");
			filename = input.nextLine();
			/*filename += ".RTF";
			 File file = new File(filename);
			 */
			File file = new File(filename+".RTF");
			System.out.println("file successfully created.");
			if(file.createNewFile())
			{
				System.out.println("File Created successfully\nNamw: " + file.getName());
			}
			else
			{
				System.out.println("File already exists.");
			}
			input.close();
		}
		catch(Exception ex)
		{
			System.out.println("An error occured.");
		}
		
	}
	public static void exit() throws Exception
	{
		Scanner scan = new Scanner(System.in);
		char op ;
		System.out.println("Are you sure you want to Exit?");
		System.out.println("Enter [Y] for Yes / [N] for No ");
		op = scan.next().charAt(0);
		do 
		{
			if(op=='y'||op=='Y')
			{
				System.out.println("System exiting......");
				Thread.sleep(300);
				System.out.println("Logged Out ");
				System.exit(0);
			}
			else if(op=='n'||op=='N')
			{
				mainmenu();
			}
			else
			{
				System.out.println("Invalid input!!!\nEnter again:- ");
			}
		}while(!(op=='n'||op=='N'||op=='y'||op=='Y'));
		scan.close();
	}

	public static void options() throws Exception
	{
		
	}
	

	public static char getOp() {
		return op;
	}
	public static void setOp(char op) {
		Files.op = op;
	}
}
