package lesson1.interfacedemo;

public class Child extends Parent{
	// Private - scope is only inside the class
	// default - scope is inside the package
	// protected - Scope is inside the package as well as inside subclass 
	// public - It is visible to all the places
	protected int y;
	public Child(int x,int y) {
		super(x);
		this.y= y;
		System.out.println("Child class");
	}
	
	
}
