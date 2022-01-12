package w1l2.generics.shape;

public class Rectangle implements Shape{
	double l,b;

	public Rectangle(double l, double b) {
		this.l = l;
		this.b = b;
	}

	@Override
	public double computeArea() {
		return l*b;
	}
	

}
