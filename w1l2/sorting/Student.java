package w1l2.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable{

	String name;
	int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student obj = (Student)o;
		return this.name.compareTo((obj.name));
	}
	public static void main(String args[]){
		
		ArrayList<Student> obj = new ArrayList<Student>();
		obj.add(new Student("Tom",19));
		obj.add(new Student("Joe",16));
		obj.add(new Student("Jim",17));
		Collections.sort(obj);
		System.out.println(obj);
		Collections.sort(obj, AGE);
		System.out.println(obj);
	}
	
	public static Comparator AGE = new Comparator(){
		public int compare(Object o1, Object o2) {
			
			int a1 = ((Student)o1).age;
			int a2 = ((Student)o2).age;
			return Integer.compare(a1,a2);
		}
	};
	
}
