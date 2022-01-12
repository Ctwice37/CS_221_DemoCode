package w1l2.sorting;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class Sale implements Comparable 
{
	int sid;
	String item;
	double price;

	public Sale(int sid, String item, double price) {
		this.sid = sid;
		this.item = item;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Object obj) {
		Sale AObj = (Sale) obj;
		if (this.sid > AObj.sid)
			return 1;
		else if (this.sid < AObj.sid)
			return -1;
		else
			return 0;
	}
	
	 public String toString() {
	        return  "Sid=" + sid + ", Item Name=" + item + ", Item Price=" + price ;
	    }
}

public class PriorityQueueSale {
	public static void main(String args[]) {
		Queue<Sale> pq = new PriorityQueue<>();
		pq.add(new Sale(10,"Pen",2.5));
		pq.add(new Sale(5,"FlashDrive",6));
		pq.add(new Sale(8,"Mouse",25));
		pq.add(new Sale(6,"Head Phone",35));
		Iterator it = pq.iterator();
		System.out.println("List of Elements :");
		while(it.hasNext()){
			Sale ob = pq.poll();
			System.out.println(ob);
	}
}
}
