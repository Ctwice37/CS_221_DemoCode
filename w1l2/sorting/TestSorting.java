package w1l2.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Stock implements Comparable{
	int qty; // Item Qauntity
	String Itemname;
	
	public Stock(int qty, String itemname) {
		this.qty = qty;
		Itemname = itemname;
	}

	@Override
	public String toString() {
		return "Stock [qty=" + qty + ", Itemname=" + Itemname + "]";
	}
    @Override
	public int compareTo(Object o){
		Stock temp = (Stock)o;
		return temp.Itemname.compareTo(this.Itemname);
	}
    
    public static Comparator obj = new Comparator(){

		@Override
		public int compare(Object o1, Object o2) {
			Stock temp1 = (Stock)o1;
			Stock temp2 = (Stock)o2;
			return Integer.compare(temp1.qty,temp2.qty);
		}
    	
    };
}


public class TestSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ArrayList<Integer> nlist = new ArrayList(Arrays.asList(10,14,16,12,16,11));
		System.out.println("Before Sorting : " + nlist);
		Collections.sort(nlist);
		System.out.println("After Sorting : " + nlist);		
		
		ArrayList<Stock> slist = new ArrayList();
		slist.add(new Stock(10,"Milk"));
		slist.add(new Stock(5,"Eggs"));
		slist.add(new Stock(11,"Carrots"));
		slist.add(new Stock(6,"Mango Juice"));
		
		/*System.out.println("Before Sorting : " + slist);
		Collections.sort(slist);
		System.out.println("After Sorting : " + slist);	*/	
		
		
		System.out.println("Before Sorting : " + slist);
		Collections.sort(slist,Stock.obj);
		System.out.println("After Sorting : " + slist);	
		
		
		
		
		

	}

}
