package w1l1.inclassdemo;

public class Faculty extends Person{
 private String qua;
private String des;
	public Faculty(String name, String gender, String qua,String des) {
		super(name,gender);
		this.qua = qua;
		this.des = des;

	}
	@Override
	public String toString() {
		return super.toString() + " " + qua +" " + des ;
	}
	
}
