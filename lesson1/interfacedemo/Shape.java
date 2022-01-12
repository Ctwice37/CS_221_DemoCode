package lesson1.interfacedemo;

public abstract class Shape {
	private String color;
	public Shape(String color) {
		this.color = color;
	}
	// getter and setter - Implemented Methods
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// Abstract methods - No body
	public abstract double computeArea();

}
