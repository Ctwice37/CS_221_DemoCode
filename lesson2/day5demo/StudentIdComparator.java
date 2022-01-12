package lesson2.day5demo;

import java.util.Comparator;

public class StudentIdComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return Integer.compare(s1.getId(), s2.getId());
	
	}

}
