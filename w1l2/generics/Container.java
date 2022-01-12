package w1l2.generics;

public class Container<V> {
	private V value;
	
	public void put(V value) {
		this.value = value;
	}
	
	public V get() {
		return value;
	}
}
