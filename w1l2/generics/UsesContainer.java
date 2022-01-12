package w1l2.generics;

public class UsesContainer {

	public static void main(String[] args) {
		// Integer Type
		Container<Integer> c = new Container<Integer>();
		c.put(25);
		int x = c.get();
		System.out.println(x);
		
		//String Type
		Container<String> c1 = new Container<String>();
		c1.put("Hello World");
		String out1 = c1.get();
		System.out.println(out1);
		

	}

}
