package w1l2.generics;

public class PairDemo { 
	public static void main(String args[])
	{
		OrderedPair obj = new OrderedPair("Hello","World"); 
		System.out.println("First = " + obj.getFirst());
		System.out.println("Second = " + obj.getSecond());
		obj.changeOrder();
		System.out.println("Change Order = " + obj);
		System.out.println("First = " + obj.getFirst());
		System.out.println("Second = " + obj.getSecond());
		
		OrderedPair obj1 = new OrderedPair(10,"Welcome"); 
		System.out.println("First = " + obj1.getFirst());
		System.out.println("Second = " + obj1.getSecond());
		obj1.changeOrder();
		System.out.println("Change Order = " + obj1);
		System.out.println("First = " + obj1.getFirst());
		System.out.println("Second = " + obj1.getSecond());
	}

}
