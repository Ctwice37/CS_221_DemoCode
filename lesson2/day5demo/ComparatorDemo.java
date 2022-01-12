//package lesson2.day5demo;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class ComparatorDemo {
//
//
//	public static void main(String[] args) {
//		// Need to sort students by first name
//
//		Student s1 = new Student(12,"Tom","Bruce");
//		Student s2 = new Student(35,"Tim","Cook");
//		Student s3 = new Student(22,"Anne","Mathew");
//		Student s4 = new Student(26,"Richard","Bell");
//		Student s5 = new Student(26,"Bruck","Tom");
//
//		List<Student> slist = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
//
//		/* Comparator implementation different ways
//		 * 1. Outside of class
//		 * 2. Inside the class using inner class
//		 * 3. Anonymous way - Without creating a class do it directly
//		 * 4. Lambda way
//		 */
//		// 1. Use Outside Comparator
//	/*	StudentIdComparator com = new StudentIdComparator();
//		Collections.sort(slist,com);*/
//		Collections.sort(slist,new StudentIdComparator());
//		System.out.println("Sorted studnet list using id : " + slist );
//
//		// Sort the list using First name
//		// 3. Anonymous way
//		Comparator<Student> fncom = new Comparator() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o1.getFname().compareTo(o2.getFname());
//			}
//
//		};
//		Collections.sort(slist,fncom);
//		System.out.println("Sorted list using first name : " + slist);
//
//		// 4. Lambda way - Functional Interface -> Interface has only one unimplemented method
//		// Sort by last name
//		Collections.sort(slist,(o1,o2)-> o1.getLname().compareTo(o2.getLname()));
//		System.out.println("Sorted list using last name : " + slist);
//
//	}
//
//
//}
