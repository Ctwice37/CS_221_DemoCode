package w1l1;

 public class ArithmeticOperation implements Calculator{

	
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}
	public int mul(int x, int y){
		return 0;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]){
		ArithmeticOperation obj = new ArithmeticOperation();
		int z = obj.add(10, 10);
		System.out.println(z);
		Calculator ob1 = new ArithmeticOperation();
		
	}
}
