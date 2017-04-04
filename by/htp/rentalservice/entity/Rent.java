package by.htp.rentalservice.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import by.htp.rentalservice.entity.basicclass.Bicycle;
import by.htp.rentalservice.entity.basicclass.Boat;
import by.htp.rentalservice.entity.basicclass.Client;
import by.htp.rentalservice.entity.basicclass.Equipment;
import by.htp.rentalservice.entity.basicclass.RollerSkates;
import by.htp.rentalservice.enumcontainer.TimeInterval;

public class Rent {
	private Client client;
	private Date startTime;
	private Date endTime;
	private String strStart;
	private String strEnd;
	private TimeInterval timeInterval;
	private Equipment[] equipments;

	public Rent() {
		
	}
	
	public Rent(Client client, String strStart, String strEnd, TimeInterval timeInterval, Equipment... equipments) throws ParseException {
		
		SimpleDateFormat simpleFormat = new SimpleDateFormat("kk.mm dd.MM.yyyy", Locale.getDefault());
		
		this.client = client;
		this.startTime = simpleFormat.parse(strStart);
		this.endTime = simpleFormat.parse(strEnd);
		this.timeInterval = timeInterval;
		this.equipments = equipments;
		for (int i = 0; i < equipments.length; i++) {
			if (equipments[i] instanceof Bicycle) {
				int quan = equipments[i].getQuantity();
				quan--;
				equipments[i].setQuantity(quan);
				if (quan == 0) {
					System.out.println("No more bicycles");
				}
			} else if (equipments[i] instanceof RollerSkates) {
				int quan = equipments[i].getQuantity();
				quan--;
				equipments[i].setQuantity(quan);
				if (quan == 0) {
					System.out.println("No more roller skate");
				}
			} else if (equipments[i] instanceof Boat) {
				int quan = equipments[i].getQuantity();
				quan--;
				equipments[i].setQuantity(quan);
				if (quan == 0) {
					System.out.println("No more boat");
				}
			}
		}
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getStrStart() {
		return strStart;
	}

	public void setStrStart(String strStart) {
		this.strStart = strStart;
	}

	public String getStrEnd() {
		return strEnd;
	}

	public void setStrEnd(String strEnd) {
		this.strEnd = strEnd;
	}

	public Equipment[] getEquipments() {
		return equipments;
	}

	public void setEquipments(Equipment... equipments) {
		this.equipments = equipments;
	}

	public TimeInterval getTimeInterval() {
		return timeInterval;
	}
	
	@Override
	public String toString() {
		String s = "";
		String equip = "";
		for (int i = 0; i < equipments.length; i++) {
			if (equipments[i] instanceof Bicycle) {
				s = equipments[i].toString();
				equip = String.format("%s Beginning time of rental: %tk:%tM %td.%tm.%tY %ta | Completion of rental time: %tk:%tM %td.%tm.%tY %ta %s", 
						client.toString().substring(0, client.toString().length() - 1), startTime, startTime, startTime, startTime, startTime, startTime, 
						endTime, endTime, endTime, endTime, endTime, endTime, s);
			} else if (equipments[i] instanceof RollerSkates) {
				s = equipments[i].toString();
				equip = String.format("%s Beginning time of rental: %tk:%tM %td.%tm.%tY %ta | Completion of rental time: %tk:%tM %td.%tm.%tY %ta %s", 
						client.toString().substring(0, client.toString().length() - 1), startTime, startTime, startTime, startTime, startTime, startTime, 
						endTime, endTime, endTime, endTime, endTime, endTime, s);
			} else if (equipments[i] instanceof Boat) {
				s = equipments[i].toString();
				equip = String.format("%s Beginning time of rental: %tk:%tM %td.%tm.%tY %ta | Completion of rental time: %tk:%tM %td.%tm.%tY %ta %s", 
						client.toString().substring(0, client.toString().length() - 1), startTime, startTime, startTime, startTime, startTime, startTime, 
						endTime, endTime, endTime, endTime, endTime, endTime, s);
			}
		}
		return equip;
	}
}