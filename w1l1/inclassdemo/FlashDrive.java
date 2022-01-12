package w1l1.inclassdemo;

// ADT for the FlashDrive operation
public interface FlashDrive {
	// by default the fields are public static final
	 public static final String storage = "32GB";
	// All methods in an interface are public abstract
	public abstract	void read(String fname);
	void write(String fname);
	boolean delete();
	boolean update();
	
}
