package w1l2.arraylist.api;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Sale {
String item;
double price;
public Sale(String item, double price) {
this.item = item;
this.price = price;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
    
}
public class TallySales {
		public static void main(String[] args) {
		ArrayList<Sale> sales = new ArrayList<Sale>();
		sales.add(new Sale("DVD",40));
		sales.add(new Sale("DVD", 15.00));
		sales.add(new Sale("Book", 12.00));
		sales.add(new Sale("DVD", 21.00));
		sales.add(new Sale("CD", 5.25));
		Sale ob = sales.get(1); // Retrieve first index element from the list 
		System.out.println(ob.item + " " + ob.price);
		sales.remove(ob);
		double total = 0;
		for (Sale sale : sales) {
		if (sale.item.equals("DVD")) {
		total += sale.price;
		}
		}
		System.out.println("Total selleing price of DVD : $" + total);
		}
		}
	




