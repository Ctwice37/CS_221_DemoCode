package w3l6.api;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapCollectionProcess {

	public static void main(String[] args) {
		
		  // TreeMap
				TreeMap<String,Course> table = new TreeMap<>();
				table.put("CS390", new Course("CS390","FPP"));
				table.put("CS401", new Course("CS401","MPP"));
				table.put("CS472", new Course("CS472","Algorithms"));
				table.put("CS475", new Course("CS475","Android"));
				table.put("CS572", new Course("CS572","Advanced Algorithms"));
				
			    // Method-1 to process TreeMap collection
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
			        
			     		        
			      // Method-3 - EntrySet. import java.util.Map.Entry;
			         System.out.println("Method-3 - Entry Set");
			         Set<Entry<String,Course>> eset = table.entrySet();
			         for(Entry<String,Course> e:eset) {
			        	 Course c = e.getValue();
			        	 if(c.getCname().startsWith("A"))
				            	System.out.println(c);
			         }
			      // Method-4 - Java 8 for each
			         System.out.println("Method-5 - Java 8 ");
			         // Lambda (arguments)-> { body}
			         table.forEach((key,value)->{
			        	 Course c = value;
			        	 if(c.getCname().startsWith("A"))
				            	System.out.println(c);
			         });


	}

}
