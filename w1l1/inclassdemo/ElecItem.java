package w1l1.inclassdemo;

public class ElecItem extends Item{
    int qty;
    
	public ElecItem(String name, double price,int qty) {
		super(name, price);
		this.qty = qty;
		
	}
	@Override
	public double calcPrice() {
		// TODO Auto-generated method stub
	 return super.getPrice() * qty;
	}

}
