package javaFileHandling;

import java.util.ArrayList;
import java.util.Iterator;
class Student1{
	int rollno;
	String name;
}
public class TemP1 {
	
	public static void main(String[] args) {
        
		// Can store any type of objects
		ArrayList List = new ArrayList();
		
		//Can store only string objects
		ArrayList<String> List2 = new ArrayList<String>();
		
		Student1 s1 = new Student1();
		s1.rollno = 037;
		s1.name = "AroojSaghar";
		//Add data in the list
		List2.add("Arooj");    //0_index
		List2.add("Moazam");    //1_index
		List2.add("Mubashar");   //2_index
		List2.add("Faira");       //3_index
		
		
	                          	     //  Error  List2.add(s1);
                             	     //  Error  List2.add(10);
		System.out.println(List2);
		List.add("A");
		List.add(10);
		List.add(2.2);
		List.add(s1);
		List.add("Faira");
		
		System.out.println(List);
		//Get data from the list               
		   Object o = List.get(3);                      // for any type
		   System.out.println("Student: "+ o);
		   String name = List2.get(3);                 // type specific(String)
		   System.out.println("name is:"+name);
		   //Update elements in list
		   List2.set(2,"Saghar");
		   System.out.println("After update List2 is:" + List2);
		   //Remove elements from List
		   List.remove(2);	   
		   System.out.println("List after removing element:" + List);
		   //clear All
		   List.clear();
		   System.out.println("List  :" +List);
		   //Searching
		   if(List2.contains("Arooj")) {
			   System.out.println("Arooj is in the List2");
		   }
		   else {
			   System.out.println("Arooj is not in the List2");
		  //iterate in ArrayList
			   System.out.println("====Iterating with for Loop====");
			   for(int i=0;i<List.size();i++) {
				   System.out.println(List.get(i));
			   }
			   
			   System.out.println("====Iterating with Enhanced for Loop====");
			   for(String str : List2) {
				   System.out.println(str);
			   }
			   for(Object str2 : List) {
				   System.out.println(str2);
			   }
		 
			   System.out.println("====Iterating with iterator====");
			   Iterator<String> itr = List2.iterator();
			   System.out.println(itr.next());
			   System.out.println(itr.next());
			   System.out.println(itr.next());
			   
			   System.out.println("====Iterating all elements with iterator====");
			   while(itr.hasNext()) {
				   String str = itr.next();
				   System.out.println(str);
				   //iterator for removing elements
				   if(str.equals("Arooj")) {
					   itr.remove();
					   System.out.println("List after Iterator:" + List2);
				   }
			   }
			   
		   }
	}

}