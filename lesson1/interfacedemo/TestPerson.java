package lesson1.interfacedemo;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Tom","Male");
		// Faculty IS-A Person(Inheritance)
		Person p2 = new Faculty("Jim","Male","Ph.D",4500.00);
		Faculty p3 = new Faculty();
		p3.setName("Mohanraj");
		p3.setGender("Male");
		p3.setSalary(5000.00);
		Person[] persons = {p1,p2,p3};
		// Polymorphism
		for(Person p: persons) {
			System.out.println(p);
			//System.out.println(p.getName());
			//System.out.println(p.getSalary());
		}

	}

}
