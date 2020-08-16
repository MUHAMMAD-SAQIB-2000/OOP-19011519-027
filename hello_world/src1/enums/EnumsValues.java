package enums;

public class EnumsValues {

enum Season {
	WINTER(5), SPRING(10), SUMMER(15), FALL(20);
	
	private int value;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	private Season(int value)
	{
		this.value=value;
	}
}
	public static void main(String[] args) 
	{
		for(Season s: Season.values())
		{
			System.out.println(s+" "+s.getValue());
			System. out. flush();
		}

	}

}
