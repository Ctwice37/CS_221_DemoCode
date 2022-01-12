package lesson1.interfacedemo;

public class TestShape {
	public static void main(String[] args) {
		// Abstract class - cannot create instance
		Shape ob = new Square("Red",2.5);
		System.out.println(ob.computeArea());
	}

}
