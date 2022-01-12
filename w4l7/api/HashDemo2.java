package w4l7.api;
import java.util.*;
public class HashDemo2 {

	
	public static void main(String[] args) {
		// Demo code for Predefined HashTable class
		
		 Hashtable<String, String> hm = new Hashtable<String, String>();
	        //add key-value pair to Hashtable
	        hm.put("first", "FIRST INSERTED");
	        hm.put("second", "SECOND INSERTED");
	        hm.put("third","THIRD INSERTED");
	        // hm.put(null,null); Throw run time error - NullPointer Exception
	        Iterator it = (Iterator) hm.keys();
	        System.out.println("My Hashtable content:");
	        System.out.println(hm); // Display the contents by key wise reverse order
	        //Checking Keys
	        if(hm.containsKey("first")){
	            System.out.println("The Hashtable contains key first");
	        } else {
	            System.out.println("The Hashtable does not contains key first");
	        }
	        // Checking Value 
	        if(hm.containsValue("SECOND INSERTED")){
	            System.out.println("The Hashtable contains value SECOND INSERTED");
	        } else {
	            System.out.println("The Hashtable does not contains value SECOND INSERTED");
	        }
	        //Clearing Items
	        
	        System.out.println("Clearing Hashtable:");
	        hm.clear();
	        System.out.println("Content After clear:");
	        System.out.println(hm);}
	
}
