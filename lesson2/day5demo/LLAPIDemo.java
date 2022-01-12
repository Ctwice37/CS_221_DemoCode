package lesson2.day5demo;

import java.util.LinkedList;
import java.util.ListIterator;

public class LLAPIDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.addFirst("Java");
		list.addFirst("Java Swing");
		list.addLast("VC++");
		System.out.println(list.getFirst());
		list.add("Android");
		System.out.println(list);
		System.out.println("Size = " + list.size());
		
		// Iterator
	/*	Iterator<String> it = list.iterator();
		System.out.println("Print startswith J");
		while(it.hasNext()) {
			String x = it.next();
			if(x.startsWith("J")) {
				System.out.println(x);
				
			}
		}*/
		// List Iterator
		
		ListIterator<String> lit = list.listIterator();
		System.out.println(lit.next());
		System.out.println(lit.next());
		lit.add("Kotlin");
		System.out.println(list);
		
		//System.out.println(lit.hasPrevious());
		
		
	}

}
