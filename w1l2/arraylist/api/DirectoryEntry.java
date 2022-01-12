package w1l2.arraylist.api;

import java.util.ArrayList;

/**
 * The DirectoryEntry objects will contain name-and-number pairs. The name in
 * immutablble; that is, it cannot be changed.
 * 
 * @author Koffman & Wolfgang
 */
public class DirectoryEntry {

	// Data Fields
	/** The name of the individual represented in the entry. */
	private String name;
	/** The phone number for this individual. */
	private String number;

	// Constructor
	/**
	 * Creates a new DirectoryEntry with the specified name and number
	 * 
	 * @param name
	 *            The name of this individual
	 * @number The phone number for this indvidual
	 */
	public DirectoryEntry(String name, String number) {
		this.name = name;
		this.number = number;
	}

	// Methods
	/**
	 * Retrieves the name.
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Retrieves the number.
	 * 
	 * @return The number.
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Sets the number to the specified value
	 * 
	 * @param number
	 *            The new value for the number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	public static void main(String args[]){
		ArrayList<DirectoryEntry> theDirectory =
	            new ArrayList<DirectoryEntry>();
		// adding elements
		theDirectory.add(new DirectoryEntry("Renuka","641-456-9229"));
		theDirectory.add(new DirectoryEntry("Tommy","641-458-2229"));
		System.out.println(theDirectory);
		
		// Getting the size
		
		System.out.println("Size of theDirectory : " + theDirectory.size());
		
		// Get the element by passing index
		
		System.out.println("Element at the index 1 : " + theDirectory.get(1));
	
		// Modify the value - Set the new value
		
		theDirectory.set(0, new DirectoryEntry("Renuka","641-456-2556"));
		System.out.println("Element at the index 0 : " + theDirectory.get(0));
		
		// Remove the index 1
		theDirectory.remove(1);
		System.out.println(theDirectory);
		System.out.println("Size of theDirectory : " + theDirectory.size());
		
		
	}

	@Override
	public String toString() {
		return "DirectoryEntry [name=" + name + ", number=" + number + "]";
	}
}
