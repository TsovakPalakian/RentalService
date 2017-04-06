package by.htp.rentalservice.entity.basicclass;

import by.htp.rentalservice.entity.Inventory;
import by.htp.rentalservice.entity.Size;
import by.htp.rentalservice.entity.secondaryclass.Accessory;
import by.htp.rentalservice.enumcontainer.Category;
import by.htp.rentalservice.enumcontainer.Color;

public abstract class Equipment extends Inventory {
	
	private double weight;	
	private Color color;
	private boolean withAccess;
	private Accessory[] accessories;
	
	public Equipment() {}
	
	public Equipment(String title, 
			double weight, 
			double price, 
			Size size, 
			Color color, 
			int quantity,
			boolean withAccess, 
			Accessory... accessories) {
		
		super(title, size, price, quantity);
		this.weight = weight;
		this.color = color;
		this.withAccess = withAccess;
		this.accessories = accessories;
	}
	
	public Equipment(String title, 
			double weight, 
			double price, 
			Size size, 
			Color color, 
			Category category, 
			int quantity,
			boolean withAccess, 
			Accessory... accessories) {
		
		super(title, size, price, quantity, category);
		this.weight = weight;
		this.color = color;
		this.withAccess = withAccess;
		this.accessories = accessories;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public boolean isWithAccess() {
		return withAccess;
	}
	public void setWithAccess(boolean withAccess) {
		this.withAccess = withAccess;
	}
	public Accessory[] getAccessories() {
		return accessories;
	}
	public void setAccessories(Accessory[] accessories) {
		this.accessories = accessories;
	}
}
