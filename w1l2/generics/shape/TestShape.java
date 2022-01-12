package w1l2.generics.shape;

import java.util.ArrayList;

public class TestShape {
 public static void main(String args[]){
	 ArrayList<Shape> s = new ArrayList();
	 s.add(new Square(10));
	 s.add(new Rectangle(10.5,12.6));
	 s.add(new Circle(4.5));
	 s.add(new Square(6.5));
	 for(Shape x : s){
		 System.out.println("Area of " + x.getClass().getSimpleName() + " : " + x.computeArea());
	 }
 }
}
