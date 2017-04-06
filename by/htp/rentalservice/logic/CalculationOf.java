package by.htp.rentalservice.logic;

import by.htp.rentalservice.entity.Rent;

public class CalculationOf {
	
	private static double price = 0;

	private static final double DISCOUNT_FOR_RENT_MORE_THAN_THREE_HOURS = 0.93;
	
	private static final double DISCOUNT_FOR_RENT_LESS_THAN_THREE_DAYS = 0.126;
	
	private static final double DISCOUNT_FOR_RENT_MORE_THAN_THREE_DAYS = 0.0765;
	
	private static final int[] RENTAL_TIME_IN_HOURS = { 1, 2, 3, 5, 6, 72, 720 };
	
	private static double totalRentalAmount(Rent rent) {
		
		double tmpPrice = 0;
		
		for (int i = 0; i < rent.getEquipments().length; i++) {
			
			if (rent.getEquipments()[i].isWithAccess()) {
				
				tmpPrice = rent.getEquipments()[i].getPrice();
				
				for (int j = 0; j < rent.getEquipments()[i].getAccessories().length; j++) {
					
					tmpPrice += rent.getEquipments()[i].getAccessories()[j].getPrice();	
					
				}				
			} else {
				
				tmpPrice = rent.getEquipments()[i].getPrice();
				
			} 
			
			price = price + tmpPrice;
			
		}
		
		return price;
	}
	
	public static double rent(Rent rent) {
		
		long startTime = rent.getStartTime().getTime()/3600000;
		
		long endTime = rent.getEndTime().getTime()/3600000;
		
		int rentalPeriodInHours = (int) (endTime - startTime);
		
		if ( rentalPeriodInHours < RENTAL_TIME_IN_HOURS[0] ) {
			
			System.out.println("Sorry, but you can not rent for less than an hour.");
			
			return 0;
		}
		
		switch ( rent.getTimeInterval() ) {
		
		case HOURS : {
			
			if ( rentalPeriodInHours >= RENTAL_TIME_IN_HOURS[0] 
					&& rentalPeriodInHours <= RENTAL_TIME_IN_HOURS[1] ) {
				
				return totalRentalAmount(rent) * rentalPeriodInHours;
				
			} else if ( rentalPeriodInHours >= RENTAL_TIME_IN_HOURS[2] 
					&& rentalPeriodInHours <= RENTAL_TIME_IN_HOURS[3] ) {
				
				return DISCOUNT_FOR_RENT_MORE_THAN_THREE_HOURS * totalRentalAmount(rent) * rentalPeriodInHours;
				
			} else if ( rentalPeriodInHours > RENTAL_TIME_IN_HOURS[3] ) {
				
				System.out.println("We can offer you the best option. Please, choose a different time interval.");
				
			}
			
		} break;
		
		case DAYS : {
			
			if ( rentalPeriodInHours >= RENTAL_TIME_IN_HOURS[4] 
					&& rentalPeriodInHours <= RENTAL_TIME_IN_HOURS[5] ) {
				
				return DISCOUNT_FOR_RENT_LESS_THAN_THREE_DAYS * totalRentalAmount(rent) * rentalPeriodInHours;
				
			} else if (rentalPeriodInHours > RENTAL_TIME_IN_HOURS[5] 
					&& rentalPeriodInHours <= RENTAL_TIME_IN_HOURS[6] ) {
				
				return DISCOUNT_FOR_RENT_MORE_THAN_THREE_DAYS * totalRentalAmount(rent) * rentalPeriodInHours;
				
			} else if ( rentalPeriodInHours > RENTAL_TIME_IN_HOURS[6] ) {
				
				System.out.println("Sorry, but you can not rent for more than a month.");
				
			} else if ( rentalPeriodInHours <= RENTAL_TIME_IN_HOURS[3] ) {
				
				System.out.println("We can offer you the best option. Please, choose a different time interval.");
			}
			
		} break;
		
		default : System.out.println("Invalid time slot.");
		}
		
		return 0;
	}
}
