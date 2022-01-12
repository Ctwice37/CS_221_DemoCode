package lesson6.bstapi;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* Set interface does not allow duplicates. TreeSet Implements Set Interface.
 * */
public class BSTAPIDemo {

	public static void main(String[] args) {
/*	TreeSet<String> pset = new TreeSet<>();
	boolean res = pset.add("Java");
	System.out.println("add set status of Java : " + res);
	
	pset.add("HTML");
	pset.add("C++");
	
	res = pset.add("Java");
	// Set Doesn't allow duplicates
	System.out.println("add set status of Java again: " + res);
	System.out.println(pset);
	pset.remove("HTML");
	
	pset.add("Andriod");
	pset.add("Kotlin");
	System.out.println(pset);
	System.out.println(pset.contains("HTML"));
	System.out.println(pset.isEmpty());
	System.out.println("Minimum : " + pset.first());
	System.out.println("Minimum : " + pset.last());
	
	// TreeSet of Programs
	
	TreeSet<Program> sets = new TreeSet<>();
	sets.add(new Program(123,"MSCS"));
	sets.add(new Program(100,"MSDS"));
	sets.add(new Program(134,"BSCS"));
	sets.add(new Program(111,"MSD"));
	// Does not allow duplicates
	sets.add(new Program(134,"BSCS"));
	System.out.println("Programs List :  " + sets);
	System.out.println(sets.first());*/
	
	// TreeMap 
	TreeMap<Integer,String> map = new TreeMap<>();
	// Insert / Add
	map.put(123, "MSCS"); // Every map item is called Entry
	map.put(115, "BSCS");
	map.put(177, "MSD");
	map.put(155, "MSPHY");
	map.put(123, "MSCHEM");
	System.out.println(map);
	map.replace(115, "BSCHEM");
	System.out.println(map);
	System.out.println(map.firstKey());
	System.out.println(map.lastKey());
	System.out.println("Value for the key 177 :" + map.get(177)); // Return a value
	System.out.println("Set contains a Key 100 :" + map.containsKey(100));
	Map.Entry<Integer,String> fe = map.firstEntry();
	Map.Entry<Integer,String> le = map.lastEntry();
	System.out.println("First Entry :" + fe);
	System.out.println("Last Entry :" + le);
	
	
	}

}
