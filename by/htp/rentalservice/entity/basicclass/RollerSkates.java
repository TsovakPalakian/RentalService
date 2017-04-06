package by.htp.rentalservice.entity.basicclass;

import by.htp.rentalservice.entity.Draw;
import by.htp.rentalservice.entity.Size;
import by.htp.rentalservice.entity.secondaryclass.Accessory;
import by.htp.rentalservice.enumcontainer.Category;
import by.htp.rentalservice.enumcontainer.Color;
import by.htp.rentalservice.enumcontainer.RollerFixation;

public class RollerSkates extends Equipment {
	
	private RollerFixation rollerFixation;
	
	public RollerSkates() {}
	
	public RollerSkates(String title, 
			double weight,  
			double price, 
			Size equipmentSize,
			Color color, 
			Category category,
			RollerFixation rollerFixation,
			int quantity,
			boolean withAccess,
			Accessory... optionalAcc) {
		
		super(title, weight, price, equipmentSize, color, category, quantity, withAccess, optionalAcc);
		this.rollerFixation = rollerFixation;
	}

	public RollerFixation getRollerFixation() {
		return rollerFixation;
	}

	public void setRollerFixation(RollerFixation rollerFixation) {
		this.rollerFixation = rollerFixation;
	}
	@Override
	public String toString() {
		Draw d = new Draw();
		return d.drawingATableWithData(getRollerFixation().toString(), "Roller fixation");
	}
}
