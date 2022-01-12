package w1l1.inclassdemo;

public class MyFlahDrive implements FlashDrive {
	private String brand;
	private String capacity;
	
	
	public MyFlahDrive(String brand, String capacity) {
		this.brand = brand;
		this.capacity = capacity;
	}

	@Override
	public void read(String fname) {
		// TODO Auto-generated method stub
		System.out.println("Reading File... " + fname);
	}

	@Override
	public void write(String fname) {
		// TODO Auto-generated method stub
		System.out.println("Writing File... " + fname);
		
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		System.out.println("Deleted... ");
		return true;
	}

	@Override
	public boolean update() {
		System.out.println("Updated... ");
		return true;
	}



}
