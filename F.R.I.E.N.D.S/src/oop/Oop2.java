package oop;

import java.util.Scanner;

class YusraGetSet{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0 && age<=100) {
			this.age = age;
		}
		else {
			System.out.println("your age is inCorrect");
		}
		
	}
	
	
}

public class Oop2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		YusraGetSet obj = new YusraGetSet();
		int age;
		System.out.println("enter age");
		age = scan.nextInt();
		obj.setAge(age);
		obj.setAge(1000);
		System.out.println("age is: "+obj.getAge());
		
	}

}
