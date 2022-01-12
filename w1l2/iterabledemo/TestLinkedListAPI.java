package w1l2.iterabledemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestLinkedListAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		
		list.addFirst(5);
		
		list.remove(1);
		System.out.println(list.size());
		System.out.println(list);

		Iterator<Integer> it1 = list.iterator();
		System.out.println(it1.next());
		System.out.println(it1.next());
		System.out.println(it1.hasNext());
	
		ListIterator<Integer> it2 = list.listIterator();
		it2.add(30);
		System.out.println(list);
		it2.next();
		it2.add(35);
		System.out.println(list);
		while(it2.hasPrevious()) {
			int x = it2.previous();
			System.out.println(x);
		}
		
	}

}
