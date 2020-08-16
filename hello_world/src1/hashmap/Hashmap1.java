package hashmap;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) 
	{
		HashMap<String , String> cities = new HashMap<String , String>();
		// put values in hashmap
		cities.put("pakistan", "islamabad");
		cities.put("india", "bombay");
		cities.put("america", "washington");
		System.out.println(cities);
		
		//hashmap size
		cities.size();
		
		// get values from hashmap
		cities.get("pakistan");
		System.out.println(cities);
		
		// remove an  item from hashmap
		cities.remove("pakistan");
		System.out.println(cities);
		
		//remove/clear all items
		//cities.clear();
		System.out.println(cities);
		
		
		
	}
}
