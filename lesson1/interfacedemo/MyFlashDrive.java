package lesson1.interfacedemo;

public class MyFlashDrive implements FlashDrive{

	@Override
	public void read(String fname) {
		System.out.println("Reading the file");
		
	}

	@Override
	public void write(String fname) {
		System.out.println("Writing the file successfully");
		
	}

	@Override
	public boolean update() {
		System.out.println("Updated Successfully");
		return true;
	}

	@Override
	public boolean delete() {
		System.out.println("File deleted Successfully");
		return true;
	}

}
