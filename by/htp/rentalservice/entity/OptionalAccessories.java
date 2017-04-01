package by.htp.rentalservice.entity;

public class OptionalAccessories extends Equipment {
	private String title;
	private int sizeEquip;
	private double price;
	private String color;
	private boolean sex;
	
	public OptionalAccessories() {}
	
	public OptionalAccessories(String title, int sizeEquip, double price, String color, boolean sex) {
		this.title = title;
		this.sizeEquip = sizeEquip;
		this.price = price;
		this.color = color;
		this.sex = sex;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSizeEquip() {
		return sizeEquip;
	}

	public void setSizeEquip(int sizeEquip) {
		this.sizeEquip = sizeEquip;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}
}
