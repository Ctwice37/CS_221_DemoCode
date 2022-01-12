package w1l2.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListUsage {
	public static void main(String args[]){
		// How to use ArrayList Class from Java API
		
		// Creation of namelist in the type of String
		List<String> namelist = new ArrayList<String>();
		// Add elements at last
		namelist.add("Dawit");
		namelist.add("Ian");
		// Check the element is in the list or not
		
		boolean res = namelist.contains("Iani");
		System.out.println(res);
		// Know the size
		System.out.println("List is " + namelist);
		System.out.println("Size of the List :" + namelist.size());
		// Add an element into the Particular index
		namelist.add(1,"Besso");
		System.out.println("List is " + namelist);
		
		// Retrieve the element from the particular index
		String first = namelist.get(0);
		System.out.println("First element : " + first);
		
		// Modify the Existing element
		namelist.set(2, "Ian Salsich");
		
		System.out.println("Modified List is " + namelist);
		
		// Remove method using index
		namelist.remove(0);
		first = namelist.get(0);
		System.out.println("List is " + namelist);
		System.out.println("First element : " + first);
		
		// Remove method using Object
		namelist.remove("Besso");
		System.out.println("List is " + namelist);
		// Add all method
		List<String> alist = Arrays.asList("Hussen", "Lealem","Zar","Frehiwot");
		namelist.addAll(alist);
		System.out.println("List is " + namelist);
		
		// Index of all the contents
	
		System.out.println("Index of Lealem : "  + namelist.indexOf("Lealem"));
		namelist.clear();
		
		System.out.println("List is " + namelist);
		System.out.println("Size of the List :" + namelist.size());
		
		System.out.println("Is Empty : " + namelist.isEmpty());
		
		
		
	}

}
