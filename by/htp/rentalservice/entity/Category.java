package by.htp.rentalservice.entity;

public abstract class Category {
	private String categoryTitle;
	
	public Category() {}
	public Category(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
}
