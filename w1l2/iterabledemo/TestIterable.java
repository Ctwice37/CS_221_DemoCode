package w1l2.iterabledemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


class EItem {
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
	
}
public class TestIterable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> slist = new ArrayList<>(Arrays.asList("C++","Java","Android",
				"Kotlin","HTML","JavaFX","JavaEE"));
		
		List<EItem>  list = new ArrayList<>();
		list.add(new EItem("Galaxy Se","Samasung",749.99));
		list.add(new EItem("UHD TV-60Inch","Sony",1769.99));
		list.add(new EItem("Tablet","Lenovo",555.99));
		list.add(new EItem("Laptop","Apple",849.99));
		list.add(new EItem("SD Card","Sony",249.99));
		
		// Using Iterator for an ArrayList - Filter the names startswith J
		
		// Regular for loop 
		System.out.println("----Regular for loop---");
		for(int i = 0; i<slist.size();i++) {
			if(slist.get(i).startsWith("J")) {
				System.out.println(slist.get(i));
			}
		}
		
		// Regular for each 
				System.out.println("---- for each---");
				for(String x : slist) {
					if(x.startsWith("J")) {
						System.out.println(x);
					}
				}
		// Iterable and Iterator
				System.out.println("---- Iterator---");
				Iterator<String> it = slist.iterator(); // 1. Get an Iterator
				while(it.hasNext()) { // return a boolean value if you have elments in the list or not
					String x = it.next();
					if(x.startsWith("J"))
						System.out.println(x);
		
				}
		// Java-8 way Lambda - using foreach
				System.out.println("---- Lambda way---");
				slist.forEach(x-> {
					if(x.startsWith("Java"))
						System.out.println(x);
				});
				
			Iterator<EItem> it1 = list.iterator();
			while(it1.hasNext()) {
				EItem ob = it1.next();
				if(ob.getPrice()>500.00) {
					System.out.println(ob);
				}
			}
				
		}
		
	}


