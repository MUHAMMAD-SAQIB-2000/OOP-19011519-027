package com.saqib;

import java.util.ArrayList;
import java.util.List;

import com.saqib.package1.BoundedTypeParameters;
import com.saqib.package1.GenericMethods;
import com.saqib.package1.GenericMethods2;
import com.saqib.package1.HashTable;
import com.saqib.package1.Store;
import com.saqib.package1.TypeInference;

@SuppressWarnings("unused")
public class App {
	public static void main(String[] args) 
	{
		List<TypeInference<String>> list = new ArrayList<>();
		App.addStore("saqib", list);
		App.addStore("sadia", list);
		App.addStore("maida", list);
		App.addStore("manan", list);
		App.<String>addStore("kamran", list); // type witness
		for(int i = 0 ; i<list.size() ; i++ ) {
			System.out.println("List element:  " + list.get(i).getItem().toString());
		}
	}
	
	
	public static <T> void addStore(T t, List<TypeInference<T>> list) {
		TypeInference<T> obj = new TypeInference<>();
		obj.setItem(t);
		list.add(obj);
		System.out.println(t.toString() + " has been added to the list");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void basic() {
//		Store<Integer> store = new Store<>();
//		Store<String> obj = new Store<>();
//		obj.setItem("hello dear");
//		System.out.println("The Item is: "+ obj.toString());
//		store.setItem(12);
//		System.out.println("The Item is: "+ store.toString());
		
//		HashTable<String , Integer, String> hashtable = new HashTable<>("saqib"   ,86 ,"i am cs student");
//		HashTable<String , Integer, String> hashtable1 = new HashTable<>("maida"  ,86 ,"i am a fashion designer" );
//		HashTable<String , Integer, String> hashtable2 = new HashTable<>("hassan" ,86 ,"i am prime minister of pakistan");
//		HashTable<String , Integer, String> hashtable3 = new HashTable<>("arooj"  ,86 ," i am symbol of love");
//		HashTable<String , Integer, String> hashtable4 = new HashTable<>("sidra"  ,86 ," i am sadness queen");
//		HashTable<String , Integer, String> hashtable5 = new HashTable<>("umair"  ,86 ," i am saqib's son");		
//		System.out.println(hashtable);
//		System.out.println(hashtable1);
//		System.out.println(hashtable2);
//		System.out.println(hashtable3);
//		System.out.println(hashtable4);
//		System.out.println(hashtable5);
		
//		GenericMethods obj = new GenericMethods();
//		obj.draw("hello world");
//		obj.draw(12);
//		obj.draw(23.4);
//		obj.draw('q');

//		GenericMethods2 obj = new GenericMethods2();
//		Integer[] genericArrayInt = {1,2,3,4,5};
//		Integer[] genericArrayInt1 = {1,2,3,4,5};
//		String[] genericArrayString = {"alice ","megan ","mark ","alexa "};
//		String[] genericArrayString1 = {"wayne","fox","zuckerberg","parker"};
//		obj.showArray(genericArrayInt , genericArrayInt1);
//		System.out.println();
//		obj.showArray(genericArrayString , genericArrayString1);
		
//		BoundedTypeParameters obj = new BoundedTypeParameters();
//		System.out.println("Result of calculation is:  "+obj.calculation('w', 'r'));
//		System.out.println("Result of calculation is:  "+obj.calculation("ali", "saqib"));
//		System.out.println("Result of calculation is:  "+obj.calculation(23 , 67));
//		System.out.println("Result of calculation is:  "+obj.calculation(23.67 , 43.12));

	}
}
