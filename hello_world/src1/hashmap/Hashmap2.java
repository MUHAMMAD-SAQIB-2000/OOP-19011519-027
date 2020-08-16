package hashmap;

import java.util.HashMap;

public class Hashmap2 {
	public static void main(String[] args) 
	{
		HashMap<String, String> cities = new HashMap<String, String>();
		// put values in hashmap
				cities.put("pakistan", "islamabad");
				cities.put("india", "bombay");
				cities.put("america", "washington");
				System.out.println(cities);
		
		//print keys
				for (String i : cities.keySet()) {
					System.out.println(i);
					}
		//print values
				for (String i : cities.values()) {
					System.out.println(i);
					}
		// Print keys and values
				for (String i : cities.keySet()) {
				System.out.println("key: " + i + " value: " + cities.get(i));
				}
		
	}

}
