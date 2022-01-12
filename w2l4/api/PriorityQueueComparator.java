package w2l4.api;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueComparator {
	public static void main(String args[]) {
		Queue<Sale> pq = new PriorityQueue<>(idComparator);
		pq.add(new Sale(10,"Pen",2.5));
		pq.add(new Sale(5,"FlashDrive",6));
		pq.add(new Sale(8,"Mouse",25));
		pq.add(new Sale(6,"Head Phone",35));
		pq.add(new Sale(4,"IPod",55));
		Iterator it = pq.iterator();
		System.out.println("List of Elements :" + pq);
		while(it.hasNext()){
			Sale ob = pq.poll();
			System.out.println(ob);
	}
		
	    
}
	//Comparator anonymous class implementation
	public static Comparator<Sale> idComparator = new Comparator<Sale>(){
        
        @Override
        public int compare(Sale s1, Sale s2) {
        	  	return (int) (s1.sid - s2.sid);
        }
    };
}
