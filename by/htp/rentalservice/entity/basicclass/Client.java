package by.htp.rentalservice.entity.basicclass;

import by.htp.rentalservice.entity.Formatter;

public class Client implements Formatter {
	
	private String name;
	private String surname;
	private String passportSeries;
	private int passportID;
	
	public Client() {}
	
	public Client(String name, String surname, String passportSeries, int passportID) {
		this.name = name;
		this.surname = surname;
		this.passportSeries = passportSeries;
		this.passportID = passportID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getPassportSeries() {
		return passportSeries;
	}

	public void setPassportSeries(String passportSeries) {
		this.passportSeries = passportSeries;
	}

	public int getPassportID() {
		return passportID;
	}

	public void setPassportID(int passportID) {
		this.passportID = passportID;
	}

	@Override
	public String toString() {
		return String.format("|| %s |  %s %s ||", formatTable(name + " " + surname, 25), 
				 formatTable("" + passportSeries, 4), formatTable("" + passportID, 26));
	}
}
