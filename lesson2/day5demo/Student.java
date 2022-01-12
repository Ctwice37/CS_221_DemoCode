package lesson2.day5demo;

public class Student implements Comparable<Student>{
	private int id;
	private String fname;
	private String lname;
	public Student(int id, String fname,String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname =lname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString()
	{
		return id + " " + fname + " " + lname;
	}
	@Override
	public int compareTo(Student o) {
	/*	if(this.id>o.id) return 1;
		else
			if(this.id<o.id) return -1;
		return 0; // If it is equal*/
		// Natural order
		//return Integer.compare(this.id, o.id);
		// Reversed order
		return Integer.compare( o.id, this.id);
	}
	
}
