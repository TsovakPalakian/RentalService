package by.htp.rentalservice.entity.basicclass;

import by.htp.rentalservice.entity.Draw;
import by.htp.rentalservice.entity.Size;
import by.htp.rentalservice.entity.secondaryclass.Accessory;
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
			Accessory... optionalAcc) {
		
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
		Draw d = new Draw();
		return d.drawingATableWithData(getType().toString(), "Type of boat");
	}
}
