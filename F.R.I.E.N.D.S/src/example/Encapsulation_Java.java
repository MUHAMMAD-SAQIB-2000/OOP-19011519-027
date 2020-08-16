package example;

public class Encapsulation_Java 
{
	private int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static void main(String[] args) {
		Encapsulation_Java obj = new Encapsulation_Java();
		obj.setX(34);
		System.out.println(obj.getX());
	}

}
