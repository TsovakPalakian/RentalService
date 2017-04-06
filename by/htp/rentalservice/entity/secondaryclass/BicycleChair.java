package by.htp.rentalservice.entity.secondaryclass;

import by.htp.rentalservice.entity.Size;
import by.htp.rentalservice.enumcontainer.Category;

public class BicycleChair extends Accessory {
	
	public BicycleChair() {}

	public BicycleChair(String title, Size size, double price, int quantity, Category category) {		
		super(title, size, price, quantity, category);	
	}
}
