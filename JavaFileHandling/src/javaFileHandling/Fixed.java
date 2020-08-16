package javaFileHandling;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int rollno;
	String name;
}
/*
 * go to end of the program to see the old output and then match it with the new output
 */
public class Fixed {
	
	public static void main(String[] args) throws Exception{
        
		// Can store any type of objects
		ArrayList<Object> List = new ArrayList<Object>();
		
		//Can store only string objects
		ArrayList<String> List2 = new ArrayList<String>();
		
		Student s1 = new Student();
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
		   		}// i added this  bracket to close the else part as it was missing
		  //iterate in ArrayList
			   System.out.println("====Iterating with for Loop====");
			   for(int i=0;i<List.size();i++) {
				   System.out.println(List.get(i));
			   }
			   
			   System.out.println("====Iterating with Enhanced for Loop====");
			   for(String str : List2) {
				   System.out.println(str);
			   }
			   for(Object str2 : List)//this one will not show output because you have cleared your list @line51
			   {
				   System.out.println(str2);
			   }
		 
			   System.out.println("====Iterating with iterator====");
			   Iterator<String> itr = List2.iterator();
			   System.out.println(itr.next());
			   System.out.println(itr.next());
			   System.out.println(itr.next());
			   System.out.println(itr.next());
			   
			   System.out.println("====Iterating all elements with iterator====");
			   
			   String str = ""; //declare your variable outside it is a good approach and initialize it with an empty string always!!!!
			   /*
			    * this while loop will not iterate because you had 4 variables or elements in your list2
			    * and you've already printed out all 4 elements using the iterator in line 77
			    * it's working is quite simple it only prints an element once and every time it displays output its counter increases index by 1
			    * and does not reset to 0
			    */
			   while(itr.hasNext()) {
				  // System.out.println(itr.next()); // firstly use this statement it is better will reduce the amount of code and will directly print itr
				   str = itr.next();
				   System.out.println(str);
			     
				   //iterator for removing elements
				   // the same goes for this as the elements have already printed it wont detect string containing name arooj and will skip this statement
				   if(str.equals("Arooj")) {
					   itr.remove();
					   System.out.println("List after Iterator:" + List2);
					   /*
					    * as no arooj is detected :)  it will skip the if statement and as your syso statement is in the loop it will also
					    * not display the remaining list
					    * i have added this statement out side the loop and whole loop will execute
					    * because even your loop condition is false not true
					    * all 4 elements already displayed there is no next element so condition becomes false and loop is not executed 
					    */
				   }
			   }// this was the point where your while loop was ending
			   System.out.println("List after Iterator:" + List2);
		//   } this bracket was completing your else block before adding the closing bracket at the top
	}

}

//OLD ---OUTPUT---

/*
 *[Arooj, Moazam, Mubashar, Faira]
[A, 10, 2.2, javaFileHandling.Student1@79b4d0f, Faira]
Student: javaFileHandling.Student1@79b4d0f
name is:Faira
After update List2 is:[Arooj, Moazam, Saghar, Faira]
List after removing element:[A, 10, javaFileHandling.Student1@79b4d0f, Faira]
List  :[]
Arooj is in the List2 
*/

//NEW ---OUTPUT---

/*
 * [Arooj, Moazam, Mubashar, Faira]
[A, 10, 2.2, javaFileHandling.Student@79b4d0f, Faira]
Student: javaFileHandling.Student@79b4d0f
name is:Faira
After update List2 is:[Arooj, Moazam, Saghar, Faira]
List after removing element:[A, 10, javaFileHandling.Student@79b4d0f, Faira]
List  :[]
Arooj is in the List2
====Iterating with for Loop====
====Iterating with Enhanced for Loop====
Arooj
Moazam
Saghar
Faira
====Iterating with iterator====
Arooj
Moazam
Saghar
Faira
====Iterating all elements with iterator====
List after Iterator:[Arooj, Moazam, Saghar, Faira]

*/
