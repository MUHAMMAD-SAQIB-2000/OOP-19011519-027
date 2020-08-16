package hello_world;

public class Main2 
{
	public class Name
	{
		
		private String fname;
		private String mname;
		private String lname;
		
		public  Name (String f, String m , String l ) 
		{
			fname = f;
			mname = m;
			lname = l;		
		}
		
		public  Name (String f, String l ) 
		{
			fname = f;
			mname = "";
			lname = l;		
		}
		
		public  Name (String l ) 
		{
			fname = "";
			mname = "";
			lname = l;		
		}
		
		public  Name () 
		{
			fname = "";
			mname = "";
			lname = "";		
		}
		
		public String toString()
		{
			return fname +" "+ mname + " "+ lname;
		}
		
	}
	
}
	
