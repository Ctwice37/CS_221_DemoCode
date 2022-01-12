package lesson1.interfacedemo;

public class Square extends Shape{
	private double side;
	
	// Constructor
	public Square(String color, double side) {
		super(color);
		this.side = side;
	}
	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return side*side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
}
