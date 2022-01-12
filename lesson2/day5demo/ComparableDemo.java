package lesson2.day5demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ids = {12,15,11,22,17,9};
		// Array Sorting
		Arrays.sort(ids);
		System.out.println("Sorted int array : " + Arrays.toString(ids));
		// Collection sorting
		List<Integer> list = new ArrayList(Arrays.asList(12,15,11,22,17,9));
		// Collection is a interface, Collections is an utility class helps to collection framework
	    Collections.sort(list);
	    System.out.println("Sorted arraylist of Integers :" + list);
		
		// To sort student array and Student array list
		Student s1 = new Student(12,"Tom","Bruce");
		Student s2 = new Student(35,"Tim","Cook");
		Student s3 = new Student(22,"Anne","Mathew");
		Student s4 = new Student(26,"Richard","Bell");
		Student s5 = new Student(26,"Bruck","Tom");
		//arrays
		Student[] slist1 = {s1,s2,s3,s4,s5};
		Arrays.sort(slist1);
		System.out.println(Arrays.toString(slist1));
		//Collection
		List<Student> slist2 = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
		Collections.sort(slist2);
		System.out.println(slist2);

	}

}
