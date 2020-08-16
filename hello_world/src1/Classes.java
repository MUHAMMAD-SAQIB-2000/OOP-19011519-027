class A{
	private int[] age = {10,12,23,42};
	
	public int[] getAge() {
		return age;
	}
	public void setAge(int[] age) {
		this.age = age;
	}
	
	
	private int rno;
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

}

public class Classes {

	public static void main(String[] args) {
		A obj = new A() ;
		obj.setRno(23);
	//	
		
		System.out.println(obj.getAge());
	}

}
