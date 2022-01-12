package w1l2.generics.shape;

public class Square implements Shape{
	double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double computeArea() {
		return side*side;
	}
}
