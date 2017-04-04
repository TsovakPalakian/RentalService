package by.htp.rentalservice.entity.basicclass;

import by.htp.rentalservice.entity.Size;
import by.htp.rentalservice.entity.secondaryclass.AdditionalAccessories;
import by.htp.rentalservice.enumcontainer.Category;
import by.htp.rentalservice.enumcontainer.Color;

public abstract class Equipment {
	private String title;
	private double weight;
	private Size equipmentSize;
	private Color color;
	private Category category;
	private double price;
	private boolean withAccess;
	private int quantity;
	private AdditionalAccessories[] additionalAcc;
	
	public Equipment() {}
	
	public Equipment(String title, 
			double weight, 
			double price, 
			Size equipmentSize, 
			Color color, 
			int quantity,
			boolean withAccess, 
			AdditionalAccessories... additionalAcc) {
		
		this.title = title;
		this.weight = weight;
		this.price = price;
		this.equipmentSize = equipmentSize;
		this.color = color;
		this.quantity = quantity;
		this.withAccess = withAccess;
		this.additionalAcc = additionalAcc;
	}
	
	public Equipment(String title, 
			double weight, 
			double price, 
			Size equipmentSize, 
			Color color, 
			Category category, 
			int quantity,
			boolean withAccess, 
			AdditionalAccessories... additionalAcc) {
		
		this.title = title;
		this.weight = weight;
		this.equipmentSize = equipmentSize;
		this.color = color;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.withAccess = withAccess;
		this.additionalAcc = additionalAcc;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Size getEquipmentSize() {
		return equipmentSize;
	}

	public void setEquipmentSize(Size equipmentSize) {
		this.equipmentSize = equipmentSize;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isWithAccess() {
		return withAccess;
	}

	public void setWithAccess(boolean withAccess) {
		this.withAccess = withAccess;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public AdditionalAccessories[] getAdditionalAcc() {
		return additionalAcc;
	}

	public void setAdditionalAcc(AdditionalAccessories... additionalAcc) {
		this.additionalAcc = additionalAcc;
	}
}
