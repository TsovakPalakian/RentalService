package by.htp.rentalservice.logic;

import by.htp.rentalservice.entity.Rent;

public class CalculationOf {
	
	private static double price = 0;
	
	public static double rent(Rent rent) {
		double tmpPrice = 0;
		for (int i = 0; i < rent.getEquipments().length; i++) {
			if (rent.getEquipments()[i].isWithAccess()) {
				tmpPrice = rent.getEquipments()[i].getPrice();
				for (int j = 0; j < rent.getEquipments()[i].getAdditionalAcc().length; j++) {
					tmpPrice += rent.getEquipments()[i].getAdditionalAcc()[j].getPrice();
				}
			} else {
				tmpPrice = rent.getEquipments()[i].getPrice();
			} 
			price = price + tmpPrice;
		}
		long endTime = rent.getEndTime().getTime()/3600000;
		long startTime = rent.getStartTime().getTime()/3600000;
		int leaseTime = (int) (endTime - startTime);
		if (leaseTime < 1) {
			System.out.println("Sorry, but you can not rent for less than an hour.");
			return 0;
		}
		switch (rent.getTimeInterval()) {
		case HOURS : {
			if (leaseTime >= 1 && leaseTime <=2) {
				return price * leaseTime;
			} else if (leaseTime >= 3 && leaseTime <= 5 ) {
				return (1 - 0.07) * price * leaseTime;
			} else if (leaseTime > 5) {
				System.out.println("We can offer you the best option. Please, choose a different time interval.");
			}
		} break;
		case DAYS : {
			if (leaseTime > 24 * 3 && leaseTime < 24 * 30) {
				return (1 - 0.15) * price * (1 - 0.91) * leaseTime;
			} else if (leaseTime >= 6 && leaseTime <= 24 * 3) {
				return (1 - 0.1) * price * (1 - 0.86) * leaseTime;
			} else if (leaseTime > 30 * 24) {
				System.out.println("Sorry, but you can not rent for more than a month.");
			} else if (leaseTime <= 5) {
				System.out.println("We can offer you the best option. Please, choose a different time interval.");
			}
		} break;
		default : System.out.println("Invalid time slot.");
		}
		return 0;
	}
}
