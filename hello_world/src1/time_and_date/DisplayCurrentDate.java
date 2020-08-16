package time_and_date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayCurrentDate {
	
	public static void main(String[] args) 
	{
		LocalDate myobj = LocalDate.now();
		System.out.println(myobj);
		LocalTime myobj1 = LocalTime.now();
		System.out.println(myobj1);
		
		LocalDateTime myobj2 = LocalDateTime.now();
		System.out.println(myobj2);
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myobj2.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
		
	}

}
