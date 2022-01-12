package w1l2.iterabledemo;

import java.util.Iterator;

// Teplate to create your own Iterable 
public class IterableTemplate implements Iterable<String> { // 1. Implement Iterable

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	// 2. Implement Iterator using inner class
	
	class MyIterator implements Iterator<String>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public static void main(String args[]) {
		
		IterableTemplate ob = new IterableTemplate();
		Iterator it = ob.iterator();
	}

}
