package w1l1.inclassdemo;

public class TestInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Person p1 = new Person("Tom","Male");
		Person p2 = new Faculty("Renuka","Female","Ph.d","Asso.Prof");
		Person p3 = new Person("Jim","Male");
	//	System.out.println(p1);
		//System.out.println(p2);
		// Polymorphism
		
		Person[] list = {p1,p2,p3};
		for(Person x : list) {
			System.out.println(x.getClass().getSimpleName());
			System.out.println(x.toString());
		}
		
		
	}

}
