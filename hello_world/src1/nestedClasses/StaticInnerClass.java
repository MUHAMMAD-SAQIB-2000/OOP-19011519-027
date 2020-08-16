package nestedClasses;

class outerstatic
{
	int x=10;
	
	static class innerstatic// extends outerstatic
	{
		private int y;

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
	}
	
}


public class StaticInnerClass 
{
	public static void main(String[] args) 
	{
		outerstatic.innerstatic myinner = new outerstatic.innerstatic();
		myinner.setY(100);
	    System.out.println(myinner.getY());
	   // System.out.println(myInner.x);
		
	}

	
	
}
