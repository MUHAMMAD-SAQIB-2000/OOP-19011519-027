package nestedClasses;

public class outer1 
{
	int x=10;
	public void outer(){
		System.out.println("outer class is executed");
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	
		public class inner1
		{
			int y=10;
			public int getY() {
				return y;
			}
			public void setY(int y) {
				this.y = y;
			}
			public void inner(){
				System.out.println("inner class is executed");
			}
			
		}
		
	
	
}
