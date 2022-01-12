package w4l7.api;
import w3l6.api.Course;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashCollectionProcess {

	public static void main(String[] args) {
		// HashSet does not allow duplicates
				/* Hashtable and HashMap accept key, value pair
				 * HashMap allow null for keys and values, hashtable not
				 * HashMap is not thread safe, but hashtable is thread safe
				 * Hashtable has Enemeration to iterate but HashMap can use Iterator
				 * */
				 
				HashSet<String> hset = new HashSet<>();
				hset.add("Java");
				//System.out.println(hset);
				boolean res = hset.add("Java");
				//System.out.println(res);
				//System.out.println(hset);
				hset.add("HTML");
				hset.add("Android");
				hset.add("Python");
				System.out.println(hset);
		 // HashMap
				
				HashMap<String,String> map = new HashMap<>();
				map.put("CS390", "FPP");
				map.put("CS401", "MPP");
				map.put("CS472", "Algorithms");
				map.put(null, "WAP");
				map.put("CS472", null);
				System.out.println(map);
			   // HashTable
				Hashtable<String, Course> table = new Hashtable<>();
				table.put("CS390", new Course("CS390","FPP"));
				table.put("CS401", new Course("CS401","MPP"));
				table.put("CS472", new Course("CS472","Algorithms"));
				table.put("CS475", new Course("CS475","Android"));
				table.put("CS572", new Course("CS572","Advanced Algorithms"));
				
			    // Method-1 to process Hashtable collection
				System.out.println("Method-1 - KeySet");
				Set<String> keys = table.keySet();
			        for(String key:keys){
			            Course c = table.get(key);
			            if(c.getCname().startsWith("A"))
			            	System.out.println(c);
			            	           
			        }
			     // Method-2- Process Hashtable using Iterartor
			        System.out.println("Method-2 - Iterator");
			        Iterator<String> it = table.keySet().iterator();
			        while(it.hasNext()) {
			        	Course c = table.get(it.next());
			        	 if(c.getCname().startsWith("A"))
				            	System.out.println(c);
			        }
			        
			      // Method-3 - Process Hashtable using Enumeration, it does work for HashMap
			        System.out.println("Method-3 - Enumeration - Only Hashtable");
			         Enumeration<String> list = table.keys();
			         while(list.hasMoreElements()) {
			        	 Course c = table.get(list.nextElement());
			        	 if(c.getCname().startsWith("A"))
				            	System.out.println(c);
			         }
			        
			      // Method-4 - EntrySet. import java.util.Map.Entry;
			         System.out.println("Method-4 - Entry Set");
			         Set<Entry<String,Course>> eset = table.entrySet();
			         for(Entry<String,Course> e:eset) {
			        	 Course c = e.getValue();
			        	 if(c.getCname().startsWith("A"))
				            	System.out.println(c);
			         }
			      // Method-5 - Java 8 for each
			         System.out.println("Method-5 - Java 8 ");
			         // Lambda (arguments)-> { body}
			         table.forEach((key,value)->{
			        	 Course c = value;
			        	 if(c.getCname().startsWith("A"))
				            	System.out.println(c);
			         });


	}

}
