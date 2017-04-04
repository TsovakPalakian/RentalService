package by.htp.rentalservice.entity.basicclass;

import by.htp.rentalservice.entity.Size;
import by.htp.rentalservice.entity.secondaryclass.AdditionalAccessories;
import by.htp.rentalservice.enumcontainer.Color;
import by.htp.rentalservice.enumcontainer.TypeOfBoat;

public class Boat extends Equipment {
	
	private TypeOfBoat type;
	
	public Boat() {}
	
	public Boat(String title, 
			double weight, 
			double price, 
			Size equipmentSize, 
			Color color,
			TypeOfBoat type,
			int quantity,
			boolean withAccess,
			AdditionalAccessories... optionalAcc) {
		
		super(title, weight, price, equipmentSize, color, quantity, withAccess, optionalAcc);
		this.type = type;
	}

	public TypeOfBoat getType() {
		return type;
	}

	public void setType(TypeOfBoat type) {
		this.type = type;
	}

	@Override
	public String toString() {
		String s0 = getClass().getName().substring(39);
		for (int i = getClass().getName().substring(39).length(); i < 15; i++) {
			s0 += " "; 
		}
		String s1 = getTitle();
		for (int i = getTitle().length(); i < 30; i++) {
			s1 += " "; 
		}
		String s2 = "" + getWeight();
		for (int i = ("" + getWeight()).length(); i < 8; i++) {
			s2 += " "; 
		}
		String s3 = ""+getPrice();
		for (int i = (""+getPrice()).length(); i < 10; i++) {
			s3 += " "; 
		}
		String s4 = getEquipmentSize().toString();
		for (int i = getEquipmentSize().toString().length(); i < 20; i++) {
			s4 += " "; 
		}
		String s5 = ""+getColor();
		for (int i = (""+getColor()).length(); i < 10; i++) {
			s5 += " "; 
		}
		String s6 = ""+getType();
		for (int i = (""+getType()).length(); i < 39; i++) {
			s6 += " "; 
		}
		String s7 = ""+getQuantity();
		for (int i = (""+getQuantity()).length(); i < 5; i++) {
			s7 += " "; 
		}
		String s8 = "";
		if (isWithAccess()) {
			s8 = "YES";
		} else {
			s8 = "NO ";
		}
		return String.format("|| %s |" + " Title: %s |"	+ " Weight: %s kg |" + " Price: %s BYN |" + " Size: %s |" + " Color: %s |" + " Type of boat: %s |"
				+ " Quantity: %s items |" + " Rent Accessories: %s ||", s0, s1, s2, s3, s4, s5, s6, s7, s8);
	}
}
