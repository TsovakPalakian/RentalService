package by.htp.rentalservice.entity;

public class Equipment extends Category {
	private Category category;
	private String title;
	private int weight;
	private int sizeEquip;
	private double price;
	private String color;
	
	public Equipment() {}
	public Equipment(String title, int sizeEquip, double price, String color) {
		this.title = title;
		this.sizeEquip = sizeEquip;
		this.price = price;
	}
	public Equipment(String title, int weight, int sizeEquip, double price, String color) {
		this.title = title;
		this.weight = weight;
		this.sizeEquip = sizeEquip;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + sizeEquip;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + weight;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipment other = (Equipment) obj;
		if (category != other.category)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (sizeEquip != other.sizeEquip)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
