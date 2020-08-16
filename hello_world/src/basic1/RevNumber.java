package basic1;

public class RevNumber {

	public static void main(String[] args) {
		 
		 
		 int value = 1234;
		 int revnum=0;
		 int digit=0;
		 
		 while(value!=0)
		 {
			  digit = value % 10;
	            revnum = revnum * 10 + digit;
	            value /= 10;
		 }
		 
		 System.out.println("Reversed Number: " + revnum);

	}

}
