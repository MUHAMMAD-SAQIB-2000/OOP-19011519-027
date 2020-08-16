
public class Mainmain {
			static String st1= "12345";
			private static int i ;
			static String st2 = "5";
			private static int j ;

	public static int getI() {
				return i;
			}

			public static void setI(int i) {
				Mainmain.i = i;
			}

			public static int getJ() {
				return j;
			}

			public static void setJ(int j) {
				Mainmain.j = j;
			}
			Mainmain main;
	public static void main(String[] args) 
	{
		
		try{
			Mainmain.setI(Integer.parseInt(st1));
			Mainmain.setJ(Integer.parseInt(st2));
			System.out.println(Mainmain.getI()/Mainmain.getJ());
		}
		catch(NumberFormatException e)
		{
			System.out.println("number format is not correct");
		}
	}
}
