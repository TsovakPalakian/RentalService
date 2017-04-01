package by.htp.rentalservice.entity;

import by.htp.rentalservice.enumcontainer.BicycleClass;
import by.htp.rentalservice.enumcontainer.Category;

public class Bicycle extends Equipment {
	private BicycleClass bicycleClass;
	
	public Bicycle() {}
	
	public Bicycle(String title, int weight, int sizeEquip, double price, String color, Category category, BicycleClass bicycleClass) {
		super(title, weight, sizeEquip, price, color, category);
		this.bicycleClass = bicycleClass;
	}
}
