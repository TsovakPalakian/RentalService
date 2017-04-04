package by.htp.rentalservice.entity.basicclass;

public class Client {
	private String name;
	private String passSeries;
	private int passID;
	
	public Client() {}
	public Client(String name, String passSeries, int passID) {
		this.name = name;
		this.passSeries = passSeries;
		this.passID = passID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassSeries() {
		return passSeries;
	}
	public void setPassSeries(String passSeries) {
		this.passSeries = passSeries;
	}
	public int getPassID() {
		return passID;
	}
	public void setPassID(int passID) {
		this.passID = passID;
	}
	@Override
	public String toString() {
		String s0 = ""+name;
		for (int i = (""+name).length(); i < 25; i++) {
			s0 += " "; 
		}
		String s1 = ""+passSeries;
		for (int i = (""+passSeries).length(); i < 4; i++) {
			s1 += " "; 
		}
		String s2 = ""+passID;
		for (int i = (""+passID).length(); i < 10; i++) {
			s2 += " "; 
		}
		return String.format("|| Customer name: %s | Series and ID of the passport: %s %s ||", s0, s1, s2);
	}
	
}
