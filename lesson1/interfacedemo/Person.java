package lesson1.interfacedemo;
// Super class / Parent
public class Person {
	private String name;
	private String gender;
	private Contact contact; //  Has-A Relationship / Composition - Reuse - cannot polymorphism
	// Default Constructor/ No parameter Constructor
	public Person() {
		this.name ="UnKnown";
		this.gender="UnKnown";
	}
	// Parameterized Constructor
		public Person(String name, String gender) {
			this.name = name;
			this.gender = gender;
		}
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public double getSalary() {
		return 0.0;	
	}
	// Print the current status of the object
	@Override
	public String toString() {
		return name + " " + gender;
	}

}
