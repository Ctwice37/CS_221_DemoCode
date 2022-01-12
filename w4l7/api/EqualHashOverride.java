package w4l7.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

class Person{
	String name;
	Person(String name){
		this.name = name;
	}
	public String toString(){
		return name + " ";
	}
/*	@Override
	public boolean equals(Object ob){
		if(this == ob) // comparing equality of same object
			return true;
		if(ob==null) // if you pass null then return false
			return false;
		if(this.getClass() == ob.getClass()){ // Checking both objects are same type
			Person x = (Person)ob;
			if(this.name == x.name ) // Compare the equality of all your attributes
				return true;
		}
		return false;
	}
	@Override
	public int hashCode(){
		return Objects.hash(name);
	}*/
}


public class EqualHashOverride {
	public static void main(String args[]){
		
		Person p1 = new Person("Renuka");
		Person p2 = new Person("Renuka");
		Person p3 = new Person("Mohanraj");
		System.out.println(p1.equals(p2));
		
		ArrayList<Person> list = new ArrayList();
		list.add(p1);
		list.add(p3);
		
		System.out.println(list.contains(p2)); // Need for overriding equals
		
		System.out.println("P1 hashcode : " + p1.hashCode());
		System.out.println("P2 hashcode : " + p2.hashCode());
		System.out.println("P3 hashcode : " + p3.hashCode());
		
		HashSet<Person> set = new HashSet();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		Person p4 = new Person("Mohanraj");
		System.out.println(set); 
		
		
		
	}

}
