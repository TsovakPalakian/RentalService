package by.htp.rentalservice.launcher;

import java.text.ParseException;

import by.htp.rentalservice.entity.DataOnTenantAndLease;
import by.htp.rentalservice.entity.Rent;
import by.htp.rentalservice.entity.basicclass.Bicycle;
import by.htp.rentalservice.entity.basicclass.Client;
import by.htp.rentalservice.enumcontainer.TimeInterval;
import by.htp.rentalservice.logic.CalculationOf;

public class Main {
	public static void main(String ...strings ) throws ParseException {
		DataOnTenantAndLease lease = new DataOnTenantAndLease();
		lease.addClient(new Client("Piter", "Nikiforov", "KH", 123), new Client("Alex", "Nikiforov", "GT", 124),
				new Client("Max", "Nikiforov", "SF", 153), new Client("Nick", "Nikiforov", "LK", 223));
		//System.out.println();
		//lease.printClients();
		//lease.printAccessories();
		lease.printEquipments();
		//.getEquipments()[0].setWithAccess(true);
		//lease.getEquipments()[0].setAdditionalAcc(lease.getAdditionalAccessories()[0], lease.getAdditionalAccessories()[1]);
		/*Rent r1 = new Rent(lease.getClients()[0], 
				"10.22 02.03.2017", 
				"13.22 02.03.2017", 
				TimeInterval.HOURS, 
				lease.getEquipments()[0]);
		
		Rent r2 = new Rent(lease.getClients()[0], 
				"10.22 02.03.2017", 
				"13.22 02.03.2017", 
				TimeInterval.HOURS, 
				lease.getEquipments()[0]);*/
		
		Rent r3 = new Rent(lease.getClients()[0], 
				"10.22 02.04.2017", 
				"9.21 02.05.2017", 
				TimeInterval.DAYS, 
				lease.getEquipments()[1], 
				lease.getEquipments()[0],
				lease.getEquipments()[1]);
		System.out.println(String.format("The rent is %1.4s rubles.", CalculationOf.rent(r3)));
		lease.addRent(/*r1, r2,*/ r3);
		//lease.printRents();
		//lease.printEquipment();
	}
}














