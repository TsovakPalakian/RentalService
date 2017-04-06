package by.htp.rentalservice.entity;

public class Size {
	
	private double height;
	private double length;
	private double width;
	private int[] sizeOfTotal;
	
	public Size() {}
	
	public Size(int... sizeOfTotal) {
		this.sizeOfTotal = sizeOfTotal;
	}
	
	public Size(double height, double length, double width) {
		this.height = height;
		this.length = length;
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public int[] getSizeOfTotal() {
		return sizeOfTotal;
	}

	public void setSizeOfTotal(int... sizeOfTotal) {
		this.sizeOfTotal = sizeOfTotal;
	}

	@Override
	public String toString() {
		
		String stringOfAllSizes = "";
		
		if (height == 0 || length == 0 || width == 0) {
			
			for (int i = 0; i < sizeOfTotal.length; i++) {
				stringOfAllSizes += String.format("%s, ", sizeOfTotal[i]);
			}
			
			return stringOfAllSizes;
			
		} else {
			return String.format("%s:%s:%s cm", height, length, width);
		}
	}	
}
