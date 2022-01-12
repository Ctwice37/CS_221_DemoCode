package w1l2.sorting.inclassdemo;

import java.util.ArrayList;
import java.util.Objects;

// What is consist with equals

class Employee {
	String name;
	double salary;
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return name + "," + salary;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob==null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee e = (Employee)ob;
		if(this.name.equals(e.name)&& this.salary==e.salary) return true;
		else
			return false;
	}
	// If you override equals your job is to override hashCode()
	@Override
	public int hashCode() {
		return Objects.hash(name,salary);
	}
	
}
public class ConsistEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Tom",4555.55);
		Employee e2 = new Employee("Tom",4555.55);
		Employee e3 = new Employee("Jim",5000.00);
		
	
		 ArrayList<Employee> elist= new ArrayList();
		 elist.add(new Employee("John",2300));
		 elist.add(new Employee("Anne",3000));
		 elist.add(new Employee("Bob",2200));
		 elist.add(new Employee("Zar",1000));
		 elist.add(new Employee("Lilly",1700));
		    
		 System.out.println(e1.equals(e2));
		 NameComparator ob = new NameComparator();
		 System.out.println(ob.compare(e1, e2));
		 
		    
		    
		
	}

}
