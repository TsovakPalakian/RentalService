package by.htp.rentalservice.enumcontainer;

public enum TimeInterval {
	
	HOURS, DAYS;
	
	private int numOfHours;
	
	TimeInterval() {}
	
	TimeInterval(int numOfHours) {
		this.numOfHours = numOfHours;
	}
	
	public int getNumOfHours() {
		return numOfHours;
	}
	
	public void setNumOfHours(int numOfHours) {
		this.numOfHours = numOfHours;
	}
	
	@Override
	public String toString() {
		return String.format("%s : %d", name(), numOfHours);
	}	
}
