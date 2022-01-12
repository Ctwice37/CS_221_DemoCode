package w1l1.inclassdemo;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // You cannot create object for an abstract class
		Item i1 = new ElecItem("Mac Book", 999.99,1);
		Item i2 = new ElecItem("Samsung Galaxy S9", 799.99,2);
		Item[] list = {i1,i2};
		double sum = 0.0;
		for(Item x : list) {
			System.out.println(x);
			System.out.println(x.calcPrice());
			sum+=x.getPrice();
		}
	 System.out.println("Total Price :" + sum);
		}

}
