package by.htp.rentalservice.entity;

public class Client {
	private String name;
	private int passportNumber;
	
	public Client() {}
	public Client(String name, int passportNumber) {
		this.name = name;
		this.passportNumber = passportNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}
}
