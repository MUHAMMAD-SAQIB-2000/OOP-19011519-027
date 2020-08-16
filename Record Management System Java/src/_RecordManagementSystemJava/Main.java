package _RecordManagementSystemJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Main 
{	
	static Person person;
	static Vehicle vehicle ;
	static Company comp;
	static Distributor dist;
	private static char op;
	
		
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		person = new Person();
		vehicle = new Vehicle();
		comp = new Company();
		dist = new Distributor();
			System.out.println("*-*-*-*-*-*:RECORD MANAGEMENT SYSTEM:*-*-*-*-*-*");
			System.out.println("Enter Your Choice:");
			System.out.println("1.RECORD OF PURCHASED VEHICLES.");
			System.out.println("2.RECORD OF SOLD VEHICLES.");
			System.out.println("3.DISPLAY ALL AVALIBLE VEHICLES");
			System.out.println("4.USERNAME AND PASSWORD SETTINGS");
			System.out.println("5.EXIT THE SYSTEM");
			System.out.println("Choice: ");
			do
			{
				setOp(scan.next().charAt(0));
				switch(getOp())
				{
					case '1':
						System.out.println("case 1");
						RecordOfPurchasedVehicle();
						break;
					case '2':
						System.out.println("case 2");
						RecordOfSoldVehicle();
						break;
					case '3':
						System.out.println("case 3");
						DisplayAllAvalibleVehicle();
						break;
					case '4':
						System.out.println("case 4");
						Settings();
						break;
					case '5':
						System.out.println("case 5");
						Exit();
						break;
					default:
						System.out.println("Please Input The Correct Choice. You Have Entered Invalid Choice!!!!");
						System.out.println("Choice Again: ");
						break;
				}	
				}while(!(op=='1'||op=='2'||op=='3'||op=='4'||op=='5'));	
			scan.close();
	}
	
	//main function
	
	
	//main methods called from main function
	public static void RecordOfPurchasedVehicle() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("*-*-*-*-*-*:PURCHASED VEHICLE RECORD:*-*-*-*-*-*");
		System.out.println("Enter Your Choice: ");
		System.out.println("1.VEHICLE PURCHASED FROM CUSTOMER");
		System.out.println("2.VEHICLE PURCHASED FORM COMPANY");
		System.out.println("Choice: ");
		do
		{
			setOp(scan.next().charAt(0));
			switch(getOp())
			{
				case '1':
					System.out.println("case 1.1");
					VehiclePurchasedCustomer();
					break;
				case '2':
					System.out.println("case 1.2");
					VehiclePurchasedCompany();
					break;	
				default:
					System.out.println("Invalid Option!!!!\nEnter Again: ");
					break;
			}
		}while(!(op=='1'||op=='2'));
		scan.close();
	}
	public static void RecordOfSoldVehicle() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("*-*-*-*-*-*:SOLD VEHICLE RECORD:*-*-*-*-*-*");
		System.out.println("Enter Your Choice: ");
		System.out.println("1. Vehicle Sold To A Distributor.");
		System.out.println("2. Vehicle Sold To A Person.");
		System.out.println("Choice: ");
		do
		{
			setOp(scan.next().charAt(0));
			switch(getOp())
			{
				case '1':
					System.out.println("case 1.1");
					VehicleSoldCustomer();
					break;
				case '2':
					System.out.println("case 1.2");
					VehicleSoldDistributor();
					break;	
				default:
					System.out.println("Invalid Option!!!!\nEnter Again: ");
					break;
			}
		}while(!(op=='1'||op=='2'));
		scan.close();
	}
	public static void DisplayAllAvalibleVehicle() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("*-*-*-*-*-*:AVALIBLE VEHICLE:*-*-*-*-*-*");
		System.out.println("Enter Your Choice: ");
		System.out.println("1.VIEW ALL VEHICLES RECORD: ");
		System.out.println("2.ADD A NEW VEHICLE'S RECORD: ");
		System.out.println("3.EDIT A VEHICLE'S RECORD: ");
		System.out.println("4.DELETE A VEHICLE'S RECORD: ");
		System.out.println("Choice: ");
		do
		{
			setOp(scan.next().charAt(0));
			switch(getOp())
			{
				case '1':
					System.out.println("*-*-*-*-*-*:VIEW RECORD:*-*-*-*-*-*");
					System.out.println("case 1.1");
					try
					{
						System.out.println("case 1.1");
						File file = new File("AllAvalibleVehicle.txt");
						if(!(file.exists()))
							{
								file.createNewFile();
							}
						FileInputStream fout = new FileInputStream(file);
						Scanner output = new Scanner(fout);
						while(output.hasNextLine())
						{
							System.out.println(output.nextLine());
						}
						output.close();
						fout.close();
					}
					
					catch(Exception ex )
					{
						System.out.println(ex);
					}
					
					break;
				case '2':
					Scanner inputStr  = new Scanner(System.in);
					System.out.println("case 1.2");
					System.out.println("*-*-*-*-*-*:ADD VEHICLE RECORD:*-*-*-*-*-*");
					System.out.println("Enter Vehicle Company Name: ");
						comp.setCompName(inputStr.nextLine());
					System.out.println("Enter Vehicle Comapany Brand Name: ");
						comp.setCompBrand(inputStr.nextLine());
					System.out.println("Enter Vehicle Year of Release: ");
						vehicle.setvReleaseYear(inputStr.nextLine());
					System.out.println("Enter Vehicle Miles Driven: ");
						vehicle.setVmiles(inputStr.nextLine());
					System.out.println("Enter Vehicle Price: ");
						vehicle.setVprice(inputStr.nextLine());
						
					break;
				case '3':
					System.out.println("case 1.3");
					break;
				case '4':
					System.out.println("case 1.4");
					break;	
				default:
					System.out.println("Invalid Option!!!!\nEnter Again: ");
					break;
			}
		}while(!(op=='1'||op=='2'));
		scan.close();
		
	}
	public static void Settings() 
	{
		
	}
	public static void Exit() throws IOException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("*-*-*-*-*-*:EXIT SYSTEM:*-*-*-*-*-*");
		System.out.println("Are You Sure You want to Exit?" + " PRESS ('Y' FOR YES) AND ('N' FOR NO) ");
		System.out.println("Choice: ");
		do
		{
			setOp(scan.next().charAt(0));
			if(op=='y'||op=='Y')
			{
				System.out.println("System Exited!!!");
				System.exit(0);
			}
			else if(op=='n'||op=='N')
			{
				//mainmenu();
			}
			else
			{
				System.out.println("InValid Choice!!!\nEnter Again: ");
			}
		}while(op=='y'||op=='Y'||op=='N'||op=='n');
		scan.close();
	}	
	
	
	
	// sub methods called form main methods
	public static void VehiclePurchasedCustomer()
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("*-*-*-*-*-*:PURCHASED VEHICLE FROM CUSTOMER:*-*-*-*-*-*");
		System.out.println("Enter Your Choice: ");
		System.out.println("1.VIEW ALL RECORDS");
		System.out.println("2.ADD A NEW RECORD");
		System.out.println("3.EDIT A RECORD");
		System.out.println("4.DELETE A RECORD");
		System.out.println("Choice: ");
		do
		{
		setOp(scan.next().charAt(0));
		switch(getOp())
		{
		case '1':
			//boolean cond = true;
			view("VehiclePurchasedCustomer.txt");
			break;
			
		case '2':
			try {
				Scanner inputStr  = new Scanner(System.in);
				File file  =  new File("VehiclePurchasedCustomer.txt");
				FileWriter dataEnter = new FileWriter(file);
				//FileOutputStream dataEnter = new FileOutputStream(file);
				System.out.println("\n\n");
				System.out.println("case 1.2");
				System.out.println("*-*-*-*-*-*:RECORD INSERTION:*-*-*-*-*-*");
				System.out.println();
				
				System.out.println("*-*-*-*-*-*:PERSON DETAILS:*-*-*-*-*-*");
				
				System.out.println("Enter Your Customer's Name: ");
					person.setName(inputStr.nextLine());
				System.out.println("Enter Your Customer's Father Name: ");
					person.setFatherName(inputStr.nextLine());
				System.out.println("Enter Your Customer's Address: ");
					person.setAddress(inputStr.nextLine());
				System.out.println("Enter Your Customer's Contact Number: ");
					person.setPhoneNo(inputStr.nextLine());
					
				System.out.println("*-*-*-*-*-*:VEHICLE DETAILS:*-*-*-*-*-*");
				
				System.out.println("Enter Your Customer's Vehicle Type: ");
					vehicle.setVtype(inputStr.nextLine());
				System.out.println("Enter Your Customer's Vehicle Company Name: ");
					comp.setCompName(inputStr.nextLine());
				System.out.println("Enter Your Customer's Vehicle Model Name: ");
					comp.setCompBrand(inputStr.nextLine());
				System.out.println("Enter Your Customer's Vehicle Number: ");
					vehicle.setVnumber(inputStr.nextLine());
				System.out.println("Enter The Price In Which The Vehicle Is Purchased: ");
					vehicle.setVprice(inputStr.nextLine());
				dataEnter.write(person.getName()+" , "+person.getFatherName()+" , "+person.getAddress()+" , "+person.getPhoneNo()+" , "+vehicle.getVtype()+
						" , "+comp.getCompName()+" , "+comp.getCompBrand()+" , "+vehicle.getVnumber()+" , "+vehicle.getVprice());	
				dataEnter.close();	
				inputStr.close();	
			}
			catch(Exception ex)	{
				System.out.println("Error Occured");
			}
			
			break;
		case '3':
			System.out.println("case 1.3");
			
			break;	
		case '4':
			System.out.println("case 1.4");
		try
		{
			Scanner idIP = new Scanner(System.in);
			System.out.println("Enter Id Number of the record to be deleted: ");
			person.setID(idIP.nextLine());
			idIP.close();
			deleteRecord("VehiclePurchasedCustomer.txt",person.getID(),1,",");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			break;	
		default:
				System.out.println("Invalid Option!!!!\nEnter Again: ");
				break;
		}
		}while(!(op=='1'||op=='2'||op=='3'||op=='4'));
		scan.close();
	}
	public static void VehiclePurchasedCompany()
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("*-*-*-*-*-*:PURCHASED VEHICLE FROM COMPANY:*-*-*-*-*-*");
		System.out.println("Enter Your Choice: ");
		System.out.println("1.VIEW ALL RECORDS");
		System.out.println("2.ADD A NEW RECORD");
		System.out.println("3.EDIT A RECORD");
		System.out.println("4.DELETE A RECORD");
		System.out.println("Choice: ");
		do
		{
			setOp(scan.next().charAt(0));
			switch(getOp())
			{
				case '1':
					view("VehiclePurchasedCompany.txt");
					break;
					
				case '2':
					try {
					Scanner inputStr  = new Scanner(System.in);
					File file  =  new File("VehiclePurchasedCompany.txt");
					FileWriter dataEnter = new FileWriter(file);
					System.out.println("\n\n");
					System.out.println("case 1.2");
					System.out.println("*-*-*-*-*-*:RECORD INSERTION:*-*-*-*-*-*");
					System.out.println();
					
					System.out.println("*-*-*-*-*-*:DISTRIBUTOR DETAILS:*-*-*-*-*-*");
					
					System.out.println("Enter Your Distributor Name: ");
						dist.setDisName(inputStr.nextLine());
					System.out.println("Enter Your Distributor Company Name: ");
						dist.setDisCompName(inputStr.nextLine());
					System.out.println("Enter Your Distributor Liscence Nummber: ");
						dist.setDisLiscenceNo(inputStr.nextLine());
					System.out.println("Enter Your Distributor Contact Number: ");
						dist.setDisContactNo(inputStr.nextLine());
											
					System.out.println("*-*-*-*-*-*:VEHICLE DETAILS:*-*-*-*-*-*");
					
					System.out.println("Enter Vehicle's Company Name: ");
						comp.setCompName(inputStr.nextLine());			
					System.out.println("Enter Vehicle's Brand Name: ");
						comp.setCompBrand(inputStr.nextLine());
					System.out.println("Enter Your Vehicle's Price: ");
						vehicle.setVprice(inputStr.nextLine());
						
					dataEnter.write(dist.getDisName()+" , "+dist.getDisCompName()+" , "+dist.getDisLiscenceNo()+" , "+dist.getDisContactNo()+
								" , "+comp.getCompName()+" , "+comp.getCompBrand()+" , "+vehicle.getVprice());	
					dataEnter.close();	
					inputStr.close();
					}
					catch(Exception ex)
					{
						System.out.println("Error occured "+ex);
					}
					break;
				case '3':
					System.out.println("case 1.3");
					
					break;	
				case '4':
					System.out.println("case 1.4");
				try 
				{
					Scanner idIP = new Scanner(System.in);
					System.out.println("Enter Id Number of the record to be deleted: ");
					person.setID(idIP.nextLine());
					idIP.close();
					deleteRecord("VehiclePurchasedCompany.txt",person.getID(),1,",");
				}
				catch (FileNotFoundException e) {
					e.printStackTrace();
				}
					break;	
				default:
					System.out.println("Invalid Option!!!!\nEnter Again: ");
					break;
			}
		}while(!(op=='1'||op=='2'||op=='3'||op=='4'));
		scan.close();
	}

	private static void VehicleSoldDistributor() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("*-*-*-*-*-*:SOLD VEHICLE TO DISTRIBUTOR:*-*-*-*-*-*");
		System.out.println("Enter Your Choice: ");
		System.out.println("1.VIEW ALL RECORDS");
		System.out.println("2.ADD A NEW RECORD");
		System.out.println("3.EDIT A RECORD");
		System.out.println("4.DELETE A RECORD");
		System.out.println("Choice: ");
		do
		{
			setOp(scan.next().charAt(0));
			switch(getOp())
			{
				case '1':
					view("VehicleSoldDistributor.txt");
					break;
					
				case '2':
					try {
						Scanner inputStr  = new Scanner(System.in);
						File file  =  new File("VehicleSoldDistributor.txt");
						FileWriter dataEnter = new FileWriter(file);
						System.out.println("\n\n");
						System.out.println("case 1.2");
						System.out.println("*-*-*-*-*-*:RECORD INSERTION:*-*-*-*-*-*");
						System.out.println();
						
						System.out.println("*-*-*-*-*-*:PERSON DETAILS:*-*-*-*-*-*");
						
						System.out.println("Enter Your Dsitributor's Name: ");
							dist.setDisName(inputStr.nextLine());
						System.out.println("Enter Your Distributor's Company Name: ");
							dist.setDisCompName(inputStr.nextLine());
						System.out.println("Enter Your Distributor's Liscence No.: ");
							dist.setDisLiscenceNo(inputStr.nextLine());
						System.out.println("Enter Your Dsitributor's Contact Number: ");
							dist.setDisContactNo(inputStr.nextLine());
							
						System.out.println("*-*-*-*-*-*:VEHICLE DETAILS:*-*-*-*-*-*");
						
						System.out.println("Enter Your Vehicle Type: ");
							vehicle.setVtype(inputStr.nextLine());
						System.out.println("Enter Your Vehicle Company Name: ");
							comp.setCompName(inputStr.nextLine());
						System.out.println("Enter Your Vehicle Model Name: ");
							comp.setCompBrand(inputStr.nextLine());
						System.out.println("Enter Your Vehicle Number: ");
							vehicle.setVnumber(inputStr.nextLine());
						System.out.println("Enter Your Vehicle's Selling Price: ");
							vehicle.setVprice(inputStr.nextLine());
						dataEnter.write(dist.getDisName()+" , "+dist.getDisCompName()+" , "+dist.getDisLiscenceNo()+" , "+dist.getDisContactNo()+vehicle.getVtype()+
									" , "+comp.getCompName()+" , "+comp.getCompBrand()+" , "+vehicle.getVnumber()+" , "+vehicle.getVprice());	
						dataEnter.close();
						inputStr.close();
						break;
					}
					catch(Exception ex) {
						System.out.println("Error occured "+ex);
					}
					
				case '3':
					System.out.println("case 1.3");
					
					break;	
				case '4':
					System.out.println("case 1.4");
				try 
				{
					Scanner idIP = new Scanner(System.in);
					System.out.println("Enter Id Number of the record to be deleted: ");
					person.setID(idIP.nextLine());
					idIP.close();
					deleteRecord("VehicleSoldDistributor.txt",person.getID(),1,",");
				}
				catch (FileNotFoundException e) {
					e.printStackTrace();
				}
					break;	
				default:
					System.out.println("Invalid Option!!!!\nEnter Again: ");
					break;
			}
		}while(!(op=='1'||op=='2'||op=='3'||op=='4'));
		scan.close();
	}
	public static void VehicleSoldCustomer()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("*-*-*-*-*-*:SOLD VEHICLE TO CUSTOMER:*-*-*-*-*-*");
		System.out.println("Enter Your Choice: ");
		System.out.println("1.VIEW ALL RECORDS");
		System.out.println("2.ADD A NEW RECORD");
		System.out.println("3.EDIT A RECORD");
		System.out.println("4.DELETE A RECORD");
		System.out.println("Choice: ");
		do
		{
			setOp(scan.next().charAt(0));
			switch(getOp())
			{
				case '1':
					view("VehicleSoldCustomer.txt");		
					break;
					
				case '2':
					try {
						Scanner inputStr  = new Scanner(System.in);
						File file  =  new File("VehicleSoldCustomer.txt");
						FileWriter dataEnter = new FileWriter(file);
						System.out.println("\n\n");
						System.out.println("case 1.2");
						System.out.println("*-*-*-*-*-*:RECORD INSERTION:*-*-*-*-*-*");
						System.out.println();
						
						System.out.println("*-*-*-*-*-*:PERSON DETAILS:*-*-*-*-*-*");
						
						System.out.println("Enter Your Customer's Name: ");
							person.setName(inputStr.nextLine());
						System.out.println("Enter Your Customer's Father Name: ");
							person.setFatherName(inputStr.nextLine());
						System.out.println("Enter Your Customer's CNIC: ");
							person.setCNIC(inputStr.nextLine());
						System.out.println("Enter Your Customer's Address: ");
							person.setAddress(inputStr.nextLine());
						System.out.println("Enter Your Customer's Contact Number: ");
							person.setPhoneNo(inputStr.nextLine());
							
						System.out.println("*-*-*-*-*-*:VEHICLE DETAILS:*-*-*-*-*-*");
						
						System.out.println("Enter The Vehicle Type: ");
							vehicle.setVtype(inputStr.nextLine());
						System.out.println("Enter The Vehicle's Company Name: ");
							comp.setCompName(inputStr.nextLine());
						System.out.println("Enter The Vehicle's Model Name: ");
							comp.setCompBrand(inputStr.nextLine());
						System.out.println("Enter The Vehicle's Number: ");
							vehicle.setVnumber(inputStr.nextLine());
						System.out.println("Enter The Price In Which The Vehicle Is Sold: ");
							vehicle.setVprice(inputStr.nextLine());
						dataEnter.write(person.getName()+" , "+person.getFatherName()+" , "+person.getCNIC()+" , "+person.getAddress()+" , "+person.getPhoneNo()
						+" , "+vehicle.getVtype()+" , "+comp.getCompName()+" , "+comp.getCompBrand()+" , "+vehicle.getVnumber()+" , "+vehicle.getVprice());	
						dataEnter.close();	
						inputStr.close();
					}
					catch(Exception ex)
					{
						System.out.println("Error occured "+ ex);
					}
					break;
				case '3':
					System.out.println("case 1.3");
					
					break;	
				case '4':
					System.out.println("case 1.4");
				try 
				{
					Scanner idIP = new Scanner(System.in);
					System.out.println("Enter Id Number of the record to be deleted: ");
					person.setID(idIP.nextLine());
					idIP.close();
					deleteRecord("VehicleSoldCustomer.txt",person.getID(),1,",");
				}
				catch (FileNotFoundException e) {
					e.printStackTrace();
				}
					break;	
				default:
					System.out.println("Invalid Option!!!!\nEnter Again: ");
					break;
			}
		}while(!(op=='1'||op=='2'||op=='3'||op=='4'));
		scan.close();
	}
	
	
	//methods used in all sub methods
	public static void view(String Fname)
	{
		try
		{
			System.out.println("case 1.1");
			File file = new File(Fname);
			FileInputStream fout = new FileInputStream(file);
			Scanner output = new Scanner(fout);
			if(!(file.exists()))
				{
					file.createNewFile();
				}
			
			while(output.hasNextLine())
			{
				System.out.println(output.nextLine());
			}
			output.close();
			fout.close();
		}
		
		catch(Exception ex )
		{
			System.out.println(ex);
		}
		
	}
	public static void deleteRecord(String Fname, String removeTerm , int positionOfTerm, String delimeter) throws FileNotFoundException
	{
		int position = positionOfTerm - 1;
		String tempFile = "temp.txt";
		File oldFile = new File(Fname);
		File newFile = new File(tempFile);
		
		String currentLine;
		String data[];
		try {
			FileWriter fw = new FileWriter(tempFile,true);
			BufferedWriter bw  = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			FileReader fr = new FileReader(Fname);
			BufferedReader br = new BufferedReader(fr);
			
			while((currentLine = br.readLine())!=null)
			{
				data = currentLine.split(delimeter);
				if(!(data[position].equalsIgnoreCase(removeTerm)))
				{
					pw.println(currentLine);
				}
				if((data[position].equalsIgnoreCase(removeTerm)))
				{
					System.out.println("Record deleted!!!");
				}
			}
			
			pw.flush();
			pw.close();
			fr.close();
			br.close();
			bw.close();
			fw.close();
			
			oldFile.delete();
			File dump = new File(Fname);
			newFile.renameTo(dump);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	public static void editRecord(String Fname, String oldID, String name )
	{
		
	}
	//get set of variables
	public static char getOp() {
		return op;
	}
	
	public static void setOp(char op) {
		Main.op = op;
	}
}
