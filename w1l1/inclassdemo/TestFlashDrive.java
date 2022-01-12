package w1l1.inclassdemo;

public class TestFlashDrive {
	public static void main(String args[]) {
		// You cannot create object for an interface, but you can use this as a type
		FlashDrive d1 = new MyFlahDrive("HP","4GB");
		d1.read("Syllabus.doc");
		d1.write("Syllabus.doc");
		d1.update();
		d1.delete();
		System.out.println(d1.storage);
		System.out.println(FlashDrive.storage);
	}

}
