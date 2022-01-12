package w1l1.inclassdemo;

public abstract class Item {
	private String name;
	private double price;
	

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract double calcPrice();

	// To print the status of the object - Override toString()
	@Override
	public String toString() {
		return name + " " + price;
	}

	@Override
	// Comparing Object
	public boolean equals(Object ob) {
		if (this == ob)
			return true; // Same Object?
		if (ob == null)
			return false; // Null Object?
		if (this.getClass() == ob.getClass()) // Check the type
		{
			Item item = (Item) ob; // Casting
			// Compare all the fields are equal or not
			boolean res = this.name.equals(item.name) && this.price == item.price;
			return res;
		}
		return false; // No match - return false

	}
}
