package by.htp.rentalservice.entity.secondaryclass;

import by.htp.rentalservice.entity.Size;
import by.htp.rentalservice.enumcontainer.Category;

public class BicycleHelmet extends Accessory {

	public BicycleHelmet() {}

	public BicycleHelmet(String title, Size aSize, double price, int quantity, Category category) {
		
		super(title, aSize, price, quantity, category);
		
	}
}
