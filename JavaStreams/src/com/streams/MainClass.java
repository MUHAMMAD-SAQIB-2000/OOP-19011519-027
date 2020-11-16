package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	 public static void main(String[] args) {
		List<String> test = new ArrayList<>();
		test.add("ali");
		test.add("mirza");
		test.add("shiekh");
		test.add("habibi");
		test.add("arbi");
		test.add("butt");
		test.add("jutt");
		//test.forEach(x-> System.out.println(x));
		test.stream()
		.filter(x -> x.contains("i"))
		.forEach(x -> System.out.println(x));
		List<Integer> text = Arrays.asList(1,2,3,4,5,23,43,12,21);
		
		text.stream()
		.map(x -> Integer.valueOf(x))
		.filter(x -> x%2 == 0)
		.forEach(x -> System.out.println(x));
		
	}
	
}
