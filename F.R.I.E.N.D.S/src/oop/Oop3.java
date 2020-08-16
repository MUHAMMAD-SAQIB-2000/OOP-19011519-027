package oop;

class Test3 extends Oop3{
	Test3(){
		System.out.println("test class constructor");
	}
}

public class Oop3 {
	Oop3(){
		System.out.println("constructor is called");
	}
	Oop3(int age){
		System.out.println("age is:" + age);
	}
	Oop3(int a, int b){
		System.out.println(a+b);
	}
	public int sum(int a) {
		return a;
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	static Oop3 obj;
	public static void main(String[] args) 
	{
		Test3 my = new Test3();
		obj = new Oop3(12,23);
		System.out.println(obj.sum(122));
		
	}

}
