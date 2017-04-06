package by.htp.rentalservice.entity.basicclass;

import by.htp.rentalservice.entity.Draw;
import by.htp.rentalservice.entity.Size;
import by.htp.rentalservice.entity.secondaryclass.Accessory;
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
			Accessory... additionalAcc) {
		
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
		Draw d = new Draw();
		return d.drawingATableWithData(getBicycleClass().toString(), "Bicycle class");
	}
	/*	public String toString() {

		if (category == null) {
			return String.format("|| %s |  %s |  %s |  %s |  %s |      -      ||", 
					formatTable(getClass().getName().substring(43), 20), 
					formatTable(title, 32), 
					formatTable(aSize.toString(), 35), 
					formatTable(price, 10), 					
					formatTable(quantity, 10));
		} else {
			return String.format("|| %s |  %s |  %s |  %s |  %s |  %s ||", 
					formatTable(getClass().getName().substring(43), 20), 
					formatTable(title, 32), 
					formatTable(aSize.toString(), 35), 
					formatTable(price, 10), 					
					formatTable(quantity, 10),
					formatTable(category, 10));
		}
		
	}*/
	
	/*private String typeEquipment() {
		if () {}
	}*/
}
