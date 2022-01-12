package w3l6.api;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer,Integer> Marks = new TreeMap<Integer,Integer>();
			Marks.put(101,90 );
			Marks.put(110,99 );
			Marks.put(106,80 );
			Marks.put(103,90 );
			Marks.put(103,90 );
				     		         
			        System.out.println("Size: " + Marks.size());
			      	      		        
			        for(int key: Marks.keySet())
			            System.out.println(key + " - " + Marks.get(key));
			        System.out.println();
			         
			        System.out.println("Highest key: " + Marks.lastKey());
			        System.out.println("Lowest key: " + Marks.firstKey());
			         
			        System.out.println("\nPrinting all values:");
			        for(Integer val: Marks.values())
			            System.out.println(val);
			        System.out.println();
			         
			        // Clear all values.
			        Marks.clear();
			          // Equals to zero.
			        System.out.println("After clear operation, size: " + Marks.size());
	}

}
