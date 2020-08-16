
package enums;
enum marks
{
	BEST,
	AVG,
	LOW
}

public class MainEnums {




	public static void main(String[] args) 
	{
		marks m1= marks.AVG;
		System.out.println(m1);
		//Level m1 = Level.MEDIUM;

	    switch(m1) {
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case BEST:
	         System.out.println("High level");
	        break;
	      case AVG:
	        System.out.println("Low level");
	        break;
	    }

	}

}
