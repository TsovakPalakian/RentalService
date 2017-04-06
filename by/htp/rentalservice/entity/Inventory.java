package by.htp.rentalservice.entity;

import by.htp.rentalservice.enumcontainer.Category;

public abstract class Inventory {
	
	private String title;
	private Size size;
	private double price;
	private int quantity;
	private Category category;
	
	public Inventory() {}
	
	public Inventory(String title, Size size, double price, int quantity) {
		this.title = title;
		this.size = size;
		this.price = price;		
		this.quantity = quantity;
	}
	
	public Inventory(String title, Size size, double price, int quantity, Category category) {
		this.title = title;
		this.size = size;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
