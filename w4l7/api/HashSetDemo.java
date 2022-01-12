package w4l7.api;

import java.util.HashSet;
import java.util.Set;
// Demo code for Hashset class
public class HashSetDemo {

		public static void main(String[] args) {
		
			HashSet<String> set = new HashSet();
			set.add("Java");
			set.add("Swing");
			set.add("Java Spring");
			System.out.println(set);
			System.out.println("Removed Java from the set " + set.remove("Java"));
			System.out.println("Set contains Swing : " +set.contains("Swing"));
			System.out.println("Size of the set : "+set.size());
			
			
			HashSet obj = new HashSet();
			obj.add("Java");
			if(obj.add("Java"))	
				System.out.println(true);
			else 
				System.out.println(false);
	}

}
