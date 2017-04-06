package by.htp.rentalservice.entity.secondaryclass;

import by.htp.rentalservice.entity.Inventory;
import by.htp.rentalservice.entity.Size;
import by.htp.rentalservice.enumcontainer.Category;

public abstract class Accessory extends Inventory {
	
	public Accessory() {}
	
	public Accessory(String title, Size size, double price, int quantity) {
		super(title, size, price, quantity);
	}

	public Accessory(String title, Size size, double price, int quantity, Category category) {
		super(title, size, price, quantity, category);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
