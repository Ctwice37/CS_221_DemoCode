package w1l2.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

public class GenericMethod {
	public static void main(String[] args) {
		args = new String[] { "CA", "US", "MX", "HN", "GT" };
		print(args);
		Integer[] x = new Integer[] { 10, 20, 30, 40, 50 };
		Float[] y = new Float[] { 10.4f, 12.5f, 13.6f, 14.7f };
		Double[] z = new Double[] { 10.4d, 12.5d, 13.6d, 14.7d};
		
		print(x);
		ArrayList<String> stringArray = new ArrayList<String>(Arrays.asList(
				"Hello", "Welcome", "Java", "Object", "Array", "String",
				"Inheritance"));
		display(stringArray);
		Vector<Integer> V = new Vector<Integer>(Arrays.asList(10, 20, 30, 40,
				50));
		display(V);
		sum(x);
		sum(y);
		sum(z);
	}

	// Generic Method
	static <E> void print(E[] a) {
		for (E ae : a) {
			System.out.printf("%s ", ae);
		}
		System.out.println();
	}

	// Wild cards
	static void display(Collection<?> c) {
		for (Object o : c) {
			System.out.printf("%s ", o);
		}
		System.out.println();
	}

	public static <U extends Number> void sum(U[] u) {
		double sum = 0.0;
		String cn = null;
		for (U ob : u) {
			 cn = u.getClass().getSimpleName();

			if (cn.equals("Integer[]")) {
				Integer x = new Integer((int) ob);
				sum = sum + x;
			}
			if (cn.equalsIgnoreCase("Float[]")) {
				Float x = new Float((float) ob);
				sum = sum + ob.floatValue();
			}

			if (cn.equalsIgnoreCase("Double[]")) {
				Double x = new Double((double) ob);
				sum = sum + ob.doubleValue();
			}
		}
		System.out.println("Sum = " + sum);
		
	}
}
