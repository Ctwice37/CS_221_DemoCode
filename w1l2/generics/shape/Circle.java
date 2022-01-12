package w1l2.generics.shape;

public class Circle implements Shape{
	double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double computeArea() {
		return Math.PI*r*r;
	}
	

}
