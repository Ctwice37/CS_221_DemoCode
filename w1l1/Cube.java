package w1l1;

public class Cube extends Square{
int side2;
Cube(int side, int side2){
	super(side);
	this.side2 = side2;

}
int area(){
	int x =super.area();
	return x*side2;
}
public static void main(String args[]){
	
	Square obj1 = new Square(10);
	Cube obj2 = new Cube(10,5);
	System.out.println("Area of a Square : " + obj1.area());
	System.out.println("Area of a Cube : " + obj2.area());
}
}
