package w1l1;

abstract class staff {
	String firstName;
	String lastName;
	String securityNumber;

	staff(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		securityNumber = ssn;
	}

	public abstract void salary(); // Abstract method
}

class parttime extends staff {
	int h, w;

	parttime(String f, String l, String s, int hours, int wages) {
		super(f, l, s);
		h = hours;
		w = wages;
	}

	@Override
	public void salary() {
		System.out.println("Your Earning Today : $" + (h * w));
	}

}

class permanent extends staff {
	int p;

	permanent(String f, String l, String s, int pay) {
		super(f, l, s);
		p = pay;

	}

	@Override
	public void salary() {
		System.out.println("Your Earning of this month: $" + p);
	}

}

public class AbstractDemo {
	public static void main(String[] args) {
		staff p1 = new parttime("Sanjay", "Khan", "123-456", 6, 25);
		p1.salary();
		staff p2 = new permanent("Kamal", "Rav", "456-789", 3000);
		p2.salary();
		
	}
}
