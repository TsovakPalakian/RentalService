package by.htp.rentalservice.entity.secondaryclass;

import by.htp.rentalservice.entity.Size;
import by.htp.rentalservice.enumcontainer.Category;

public class RollerSkatesGlove extends AdditionalAccessories {

	public RollerSkatesGlove() {}
	
	public RollerSkatesGlove(String title, Size aSize, double price, Category category) {
		super(title, aSize, price, category);
	}
}
