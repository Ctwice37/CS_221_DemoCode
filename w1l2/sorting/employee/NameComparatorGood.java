package w1l2.sorting.employee;

import java.util.*;

public class NameComparatorGood implements Comparator<Employee>{
     // consistent with equals
	@Override
	public int compare(Employee e1, Employee e2) {
		String name1 = e1.getName();
		String name2 = e2.getName();
		Date hireDate1 = e1.getHireDay();
		Date hireDate2 = e2.getHireDay();
		if(name1.compareTo(name2) != 0) {
			return name1.compareTo(name2);
		}
		//in this case, name1.equals(name2) is true
		return hireDate1.compareTo(hireDate2);
	}	

	
	public static void main(String[] args) {
		Employee e1 = new Employee("Joe", 2001, 9, 4);
		Employee e2 = new Employee("Joe", 2006, 19, 4);
		Employee e3 = new Employee("Amila", 2010, 9, 14);
		NameComparatorGood comp = new NameComparatorGood();
		System.out.println(e1.equals(e2));
		System.out.println(comp.compare(e1,e2));
			
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Collections.sort(list, comp);
		System.out.println(list);
	}
}
