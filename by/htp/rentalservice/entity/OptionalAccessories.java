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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (sex ? 1231 : 1237);
		result = prime * result + sizeEquip;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		OptionalAccessories other = (OptionalAccessories) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (sex != other.sex)
			return false;
		if (sizeEquip != other.sizeEquip)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
