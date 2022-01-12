package w1l2.sorting.inclassdemo;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getName().compareTo(o2.getName())!=0)
			return o1.getName().compareTo(o2.getName());
		else
			return Double.compare(o1.getSalary(), o2.getSalary());
	}
}
