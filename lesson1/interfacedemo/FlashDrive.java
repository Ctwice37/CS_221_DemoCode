package lesson1.interfacedemo;
// Abstract Data Type
public interface FlashDrive {
	// You can declare the fields - public static final
	int capacity = 32;
	// Functionalities - public abstract
	public abstract void read(String fname);
	void write(String fname);
	boolean update();
	boolean delete();

}
