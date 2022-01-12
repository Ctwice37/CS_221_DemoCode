package lesson1.interfacedemo;

public class TestFlashDrive {

	public static void main(String[] args) {
		MyFlashDrive ob = new MyFlashDrive();
		// You cannot create an instance for an interface
		FlashDrive fd = new MyFlashDrive();
		ob.write("lesson1.doc");
		ob.read("lesson1.doc");
		ob.update();
		ob.delete();

	}

}
