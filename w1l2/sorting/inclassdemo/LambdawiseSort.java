package w1l2.sorting.inclassdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdawiseSort {
	public static void main(String args[]) {
		List<EItem>  list = new ArrayList<>();
		list.add(new EItem("Galaxy Se","Samasung",749.99));
		list.add(new EItem("UHD TV-60Inch","Sony",1769.99));
		list.add(new EItem("Tablet","Lenovo",555.99));
		list.add(new EItem("Laptop","Apple",849.99));
		list.add(new EItem("SD Card","Sony",249.99));
		System.out.println("Before Sorting");
		System.out.println(list);
	
		// Namewise Sort
		Collections.sort(list,(a,b)->a.getName().compareTo(b.getName()));
		System.out.println("Namewise Sort : "+list);
	
		// Price wise Sort
				Collections.sort(list,(a,b)->a.getPrice().compareTo(b.getPrice()));
				System.out.println("Pricewise Sort : "+list);
	}

}
