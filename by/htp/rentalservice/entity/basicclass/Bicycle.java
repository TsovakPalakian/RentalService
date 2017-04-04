package by.htp.rentalservice.entity.basicclass;

import by.htp.rentalservice.entity.Size;
import by.htp.rentalservice.entity.secondaryclass.AdditionalAccessories;
import by.htp.rentalservice.enumcontainer.BicycleClass;
import by.htp.rentalservice.enumcontainer.Category;
import by.htp.rentalservice.enumcontainer.Color;

public class Bicycle extends Equipment {
	
	private BicycleClass bicycleClass;
	
	public Bicycle() {}
	
	public Bicycle(String title, 
			double weight, 
			double price, 
			Size equipmentSize, 
			Color color, 
			Category category, 
			BicycleClass bicycleClass,
			int quantity,
			boolean withAccess,
			AdditionalAccessories... additionalAcc) {
		
		super(title, weight, price, equipmentSize, color, category, quantity, withAccess, additionalAcc);
		this.bicycleClass = bicycleClass;
	}

	public BicycleClass getBicycleClass() {
		return bicycleClass;
	}

	public void setBicycleClass(BicycleClass bicycleClass) {
		this.bicycleClass = bicycleClass;
	}

	@Override
	public String toString() {
		 {
			System.out.print("___________________________________________________________________________________________________________________________________");
			System.out.println("_________________________________________________________________________________________________________________________________");
		}
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
		String s6 = ""+getCategory();
		for (int i = (""+getCategory()).length(); i < 10; i++) {
			s6 += " "; 
		}
		String s7 = ""+getBicycleClass();
		for (int i = (""+getBicycleClass()).length(); i < 15; i++) {
			s7 += " "; 
		}
		String s8 = ""+getQuantity();
		for (int i = (""+getQuantity()).length(); i < 5; i++) {
			s8 += " "; 
		}
		String s9 = "";
		if (isWithAccess()) {
			s9 = "YES";
		} else {
			s9 = "NO ";
		}
		return String.format("|| %s |" + " Title: %s |"	+ " Weight: %s kg |" + " Price: %s BYN |" + " Size: %s |" + " Color: %s |" + " Category: %s |"
				+ " Bicycle class: %s |" + " Quantity: %s items |" + " Rent Accessories: %s ||", s0, s1, s2, s3, s4, s5, s6, s7, s8, s9);
	}
}
