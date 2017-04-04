package by.htp.rentalservice.entity.secondaryclass;

import by.htp.rentalservice.entity.DataOnTenantAndLease;
import by.htp.rentalservice.entity.Size;
import by.htp.rentalservice.enumcontainer.Category;

public abstract class AdditionalAccessories {
	private String title;
	private Size aSize;
	private double price;
	private Category category;
	
	public AdditionalAccessories() {}
	
	public AdditionalAccessories(String title, Size aSize, double price) {
		this.title = title;
		this.aSize = aSize;
		this.price = price;
	}
	
	public AdditionalAccessories(String title, Size aSize, double price, Category category) {
		this.title = title;
		this.aSize = aSize;
		this.price = price;
		this.category = category;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Size getaSize() {
		return aSize;
	}
	public void setaSize(Size aSize) {
		this.aSize = aSize;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		String s0 = getClass().getName().substring(43);
		for (int i = getClass().getName().substring(43).length(); i < 20; i++) {
			s0 += " "; 
		}
		String s1 = title;
		for (int i = title.length(); i < 30; i++) {
			s1 += " "; 
		}
		String s3 = ""+price;
		for (int i = (""+getPrice()).length(); i < 10; i++) {
			s3 += " "; 
		}
		String s4 = aSize.toString();
		for (int i = aSize.toString().length(); i < 20; i++) {
			s4 += " "; 
		}
		String s6 = ""+category;
		for (int i = (""+category).length(); i < 10; i++) {
			s6 += " "; 
		}
		if (category == null) {
			return String.format("|| %s | Title: %s | Size: %s | Price: %s                        ||", s0, s1, s4, s3);
		} else {
			return String.format("|| %s | Title: %s | Size: %s | Price: %s | Category: %s ||", s0, s1, s4, s3, s6);
		}
		
	}
	
}
