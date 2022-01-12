package lesson2.day5demo;

import java.util.Iterator;

public class Myiterator implements Iterable{

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator();
	}

	// Inner class to implement Iterator
	class MyIterator  implements Iterator{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
}
