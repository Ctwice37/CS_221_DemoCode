package w1l2.sorting.inclassdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EItem implements Comparable<EItem>{
	private String name;
	private String brand;
	private Double price;
	public EItem(String name, String brand, Double price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "EItem [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
/*	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		EItem item = (EItem)o;
		return item.name.compareTo(this.name); // Reversed order
	}*/
	@Override
	public int compareTo(EItem o) {
		// TODO Auto-generated method stub
		//return this.name.compareTo(o.name); // Sorting by name
	//	return Double.compare(this.price, o.price); // Sorting by price
		
		if(this.price>o.price) return 1;
		else
		 if(this.price<o.price) return -1;
		 else
			 return 0;
	}
	
	
}


public class SortingDemo {

	public static void main(String[] args) {
		
		List<String> slist = new ArrayList<>(Arrays.asList("C++","Java","Android",
				"Kotlin","HTML"));
		Collections.sort(slist);
		//System.out.println(slist);
		
		// TODO Auto-generated method stub
		
		List<EItem>  list = new ArrayList<>();
		list.add(new EItem("Galaxy Se","Samasung",749.99));
		list.add(new EItem("UHD TV-60Inch","Sony",1769.99));
		list.add(new EItem("Tablet","Lenovo",555.99));
		list.add(new EItem("Laptop","Apple",849.99));
		list.add(new EItem("SD Card","Sony",249.99));
		System.out.println("Before Sorting");
		System.out.println(list);
	
		// Sorting
		Collections.sort(list);
		System.out.println("After Sorting");
		System.out.println(list);
		
		
		
		// Compare brandwise
		Collections.sort(list, new BrandComparator());
		System.out.println(" Brand Comparator : " + list);
		
		// Anonymous Implementation - Price wise
		
		Comparator<EItem> ob = new Comparator<EItem>() {
			@Override
			public int compare(EItem o1, EItem o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
		
		};
		Collections.sort(list,ob);
		System.out.println("Price Sorted List" + list);

		// Direct Implementation
		
		Collections.sort(list, new Comparator<EItem>() {

			@Override
			public int compare(EItem o1, EItem o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
			
		});
		
	
		// Lambda Implementation using name wise
		
		Collections.sort(list, (a,b)->a.getName().compareTo(b.getName()));
		System.out.println("Namewise list : " + list);
		// Lambda Implementation using price wise
		Collections.sort(list, (x,y)->x.getPrice().compareTo(y.getPrice()));
		System.out.println("Pricewise list : " + list);
		
	}

}
