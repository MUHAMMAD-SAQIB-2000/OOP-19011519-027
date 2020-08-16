package com.saqib.package1;

public class GenericMethods {
	public <T> T draw(T t) {
		System.out.println("The item is: " + t.toString());
		return t ;
	}
}
