package w4l7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class InclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> list = new ArrayList<>();
		list.add(new Item("Ipad",566.78,2));
		list.add(new Item("Lenovo",533.78,5));
		list.add(new Item("Wireless Mouse",56.77,2));
		list.add(new Item("Camera",156.78,2));
		
		Item i1 = new Item("Ipad",566.78,2);
		Item i2 = new Item("Ipad",566.78,2);
		System.out.println(i1.equals(i2));
		
		// Print the hashcode of i1 and i2
		
		System.out.println("i1 hashcode : "+i1.hashCode());
		System.out.println("i2 hashcode : "+i2.hashCode());

		boolean res = list.contains(i1); // search an item - always check the equality using equals() method
		System.out.println("Boolean Res : " + res);
		
		// Why do we need to override hashcode
		
		HashSet<Item> set = new HashSet<>();
		set.add(i1);
		set.add(i2);
		System.out.println(set);
		
	}

}
