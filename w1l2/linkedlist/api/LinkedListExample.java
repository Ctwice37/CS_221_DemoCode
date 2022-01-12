package w1l2.linkedlist.api;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListExample {

	public static void main(String[] args) {
		System.out.println("Linked List Example!");
		LinkedList <Integer>list = new LinkedList<Integer>();
		int num1 = 11, num2 = 22, num3 = 33, num4 = 44;
		int size;
		Iterator iterator;
		//Adding data in the list
		list.add(num1);
		list.add(num2);
		list.add(num3);
		list.add(num4);
		size = list.size();
		System.out.print( "Linked list data: ");  
		//Create a iterator
		iterator = list.iterator();     
		while (iterator.hasNext()){
			System.out.print(iterator.next()+" ");  
		}
		System.out.println();
		//Check list empty or not
		if (list.isEmpty()){
			System.out.println("Linked list is empty");
		}
		else{
			System.out.println( "Linked list size: " + size);
		}
		System.out.println("Adding data at 1st location: 55");
		//Adding first
		list.addFirst(55);
		//Retrieve first data
		System.out.println("First data: " + list.getFirst());
		//Retrieve lst data
		System.out.println("Last data: " + list.getLast());
		//Retrieve specific data
		System.out.println("Data at 4th position: " + list.get(3));
		//Remove first
		int first = list.removeFirst();
		System.out.println("Data removed from 1st location: " + first);
		System.out.print("Now the list contain: ");
		ListIterator ll = list.listIterator();
		System.out.println("List of Elements : " + list);
		System.out.println("Element 1: " + ll.next());
		System.out.println("Element 2: " + ll.next());
		System.out.println("Has Previous : " + ll.hasPrevious());
		System.out.println("Has Next : " + ll.hasNext());
		ll.add(100);
		ll.next();
		ll.remove();
		System.out.println("List of Elements : " + list);
		
		//Remove all
		list.clear();
		if (list.isEmpty()){
			System.out.println("Linked list is empty");
		}
		else{
			System.out.println( "Linked list size: " + size);
		}
	
		
	}
}
