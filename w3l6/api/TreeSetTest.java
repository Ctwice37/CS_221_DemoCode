package w3l6.api;
import java.util.*;
// Demo code for Treeset Implementation of Person Class
public class TreeSetTest {
	//private static TreeSet<Person> s = new TreeSet<Person>();
	public static void main(String a[])
	{
		TreeSet<Person> s = new TreeSet<Person>();
	s.add(new Person("Rani",20));
	s.add(new Person("Raja",30));
	s.add(new Person("Sunil",10));
	s.add(new Person("Babu",50));
	s.add(new Person("Tomy",40));
	//s.add(new Person(10));
	System.out.println(s);
	}
	}
	class Person implements Comparable<Person> 
	{
	String name;
	int age;
	Person(String name,int age){
	this.age= age;
	this.name = name;
	}
	public int compareTo(Person o) {
	int j = o.age;
	if (this.age < j) {
	return -1;
	} else if (this.age == j) {
	return 0;
	} else {
	return 1;
	}
	}
	public String toString() {
	return this.name + " & " + this.age;
	}
}
