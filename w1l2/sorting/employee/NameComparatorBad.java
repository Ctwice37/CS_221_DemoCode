package w1l2.sorting.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameComparatorBad implements Comparator<Employee>{

	//Is this implementation consistent with equals? 
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Joe", 2001, 10, 2);
		Employee e2 = new Employee("Joe", 2003, 10, 2);
		Employee e3 = new Employee("Amila", 2010, 9, 14);
		NameComparatorBad comparator = new NameComparatorBad();
		System.out.println(comparator.compare(e1, e2));
		System.out.println(e1.equals(e2));
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		Collections.sort(list, comparator);
		System.out.println(list);
	}

}
