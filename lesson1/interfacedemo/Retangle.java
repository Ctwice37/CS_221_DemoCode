package lesson1.interfacedemo;

import java.util.Objects;

public class Retangle {
	private int s1,s2;
	public Retangle(int s1,int s2) {
		this.s1 = s1;
		this.s2 = s2;
		// Print the status
  }
		
	@Override
	public String toString() {
		return "Side 1  = " + s1 + "\nSide 2 = "+ s2;
	}
	@Override
	public boolean equals(Object ob) {
		if(ob==this) return true;
		if(ob==null) return false;
		if(this.getClass()==ob.getClass()) {
			// Casting - Convert Object to Retangle
			Retangle r = (Retangle) ob;
			return this.s1 == r.s1 && this.s2==r.s2;
	}
		else
			return false;
	}
	// Override
	// If you Override equals need to override hashcode()
	public int hashCode() {
		// Java 8 - way 
		return Objects.hash(s1,s2);
	}
	
	public static void main(String[] args) {
		Retangle r1 = new Retangle(2,3);
		Retangle r2 = new Retangle(2,3);
		System.out.println(r1);
		System.out.println(r1.equals(r2));
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		
	}
}
