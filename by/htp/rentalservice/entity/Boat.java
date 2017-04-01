package by.htp.rentalservice.entity;

import by.htp.rentalservice.enumcontainer.Category;
import by.htp.rentalservice.enumcontainer.PassengerCapacity;

public class Boat extends Equipment {
	private PassengerCapacity passengerCapacity;
	
	public Boat() {}
	
	public Boat(String title, int weight, int sizeEquip, double price, String color, Category category, PassengerCapacity passengerCapacity) {
		super(title, weight, sizeEquip, price, color, category);
		this.passengerCapacity = passengerCapacity;
	}
}
