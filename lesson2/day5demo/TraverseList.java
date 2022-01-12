package lesson2.day5demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TraverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>(Arrays.asList(
				"Tom","Bruk","Anne","Samuel","Billa","Viki"));
		// Print the list using index base
		System.out.println("Using index ");
		for(int index = 0; index<names.size();index++) {
			System.out.println(names.get(index));
		}
		
		System.out.println("Print using for each");
		
		for(String x:names) {
			System.out.println(x);
		}
		
		System.out.println("Print the list using Lambda");
		names.forEach(x->System.out.println(x));
		// Iterator 
		System.out.println("Print the list using Iterator");
		Iterator<String> it  = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(names);
		
	}

}
