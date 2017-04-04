package by.htp.rentalservice.entity;

public class Size {
	private double height;
	private double length;
	private double width;
	private double oneSize;
	
	public Size() {}
	public Size(double oneSize) {
		this.oneSize = oneSize;
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
	public double getOneSize() {
		return oneSize;
	}
	public void setOneSize(double oneSize) {
		this.oneSize = oneSize;
	}
	@Override
	public String toString() {
		if (height == 0) {
			return String.format("%s cm", oneSize);
		} else {
			return String.format("%s:%s:%s cm", height, length, width);
		}
	}	
}
