package w1l2.arraylist.api;
import java.util.*;
public class Array {

	// Demo code for ArrayList
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
	      System.out.println("Initial size of al: " + al.size());
	      // add elements to the array list
	      al.add("C");
	      al.add(10);
	      al.add("Data Structure");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      al.add(1, "A2");
	      System.out.println("Size of al after additions: " + al.size());
	   //   int x = (int) al.get(0);
             // display the array list
	      System.out.println("Contents of al: " + al);
	      // Remove elements from the array list
	      al.remove("F");
	      al.remove(2);
	      System.out.println("Size of al after deletions: " + al.size());
	      System.out.println("Contents of al: " + al);
	      al.add("Hello");
	      al.add(17.2);
	      al.add("Hello");
	      al.ensureCapacity(15);
	      al.add(null);
	      System.out.println("Contents of al: " + al + "\nSize = " + al.size());
	      
	      ArrayList<String> friendsnames= new ArrayList<String>();
			friendsnames.add("Ankur");
			friendsnames.add("Ajeet");
			friendsnames.add("Harish");
			friendsnames.add("John");
			friendsnames.add("Terry");
			/*ArrayList to Array Conversion */
			String frnames[]=friendsnames.toArray(new String[friendsnames.size()]);

			/*Displaying Array elements*/
			for(String k: frnames)
			{
				System.out.println(k);
			}
	      
	}
}
