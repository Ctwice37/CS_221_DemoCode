package lesson1.interfacedemo;

// Sub class / Child class / Derived class
public class Faculty extends Person{
	private String degree;
	private double salary;
	// Default Constructor
	public Faculty() {
		// Invoke parent class constrctor
		super();
		degree= null;
		salary=0.0;
	}
	public Faculty(String name,String gender, String degree, double salary) {
		super(name,gender);
		this.degree = degree;
		this.salary = salary;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	// Overriding
	@Override
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		String x = super.toString();
		x = x + " " + degree + " " +salary;
		return x;
	}

}
