package by.htp.rentalservice.entity.secondaryclass;

import by.htp.rentalservice.entity.Size;
import by.htp.rentalservice.enumcontainer.Category;

public class LifeVest extends Accessory {

	public LifeVest() {}

	public LifeVest(String title, Size aSize, double price, int quantity, Category category) {
		
		super(title, aSize, price, quantity, category);
		
	}
}
