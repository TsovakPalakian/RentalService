package by.htp.rentalservice.entity;

import by.htp.rentalservice.enumcontainer.Category;
import by.htp.rentalservice.enumcontainer.RollerFixation;

public class RollerSkates extends Equipment {
	private RollerFixation rollerFixation;
	public RollerSkates() {}
	public RollerSkates(String title, int weight, int sizeEquip, double price, String color, Category category, RollerFixation rollerFixation) {
		super(title, weight, sizeEquip, price, color, category);
		this.rollerFixation = rollerFixation;
	}
}
