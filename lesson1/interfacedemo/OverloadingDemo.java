package lesson1.interfacedemo;

public class OverloadingDemo {

	// Overloading
	public int add(int x,int y) {
		return x+y;
	}
	public double  add(float x,int y, float z) {
		return x+y+z;
	}
	public double add(double  x,int y) {
		return x+y;
	}
	
	public String add(String s1,String s2) {
		return s1 + " " + s2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingDemo ob = new OverloadingDemo();
		int res = ob.add(5, 10);
		System.out.println(res);
	}

}
