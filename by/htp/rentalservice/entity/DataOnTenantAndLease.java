package by.htp.rentalservice.entity;

import by.htp.rentalservice.entity.basicclass.Bicycle;
import by.htp.rentalservice.entity.basicclass.Boat;
import by.htp.rentalservice.entity.basicclass.Client;
import by.htp.rentalservice.entity.basicclass.Equipment;
import by.htp.rentalservice.entity.basicclass.RollerSkates;
import by.htp.rentalservice.entity.secondaryclass.BicycleChair;
import by.htp.rentalservice.entity.secondaryclass.BicycleComputer;
import by.htp.rentalservice.entity.secondaryclass.BicycleHelmet;
import by.htp.rentalservice.entity.secondaryclass.BicycleLock;
import by.htp.rentalservice.entity.secondaryclass.ElbowPads;
import by.htp.rentalservice.entity.secondaryclass.InflatableChair;
import by.htp.rentalservice.entity.secondaryclass.KneePads;
import by.htp.rentalservice.entity.secondaryclass.LifeVest;
import by.htp.rentalservice.entity.secondaryclass.AdditionalAccessories;
import by.htp.rentalservice.entity.secondaryclass.Paddles;
import by.htp.rentalservice.entity.secondaryclass.Pump;
import by.htp.rentalservice.entity.secondaryclass.RollerSkatesGlove;
import by.htp.rentalservice.enumcontainer.BicycleClass;
import by.htp.rentalservice.enumcontainer.Category;
import by.htp.rentalservice.enumcontainer.Color;
import by.htp.rentalservice.enumcontainer.RollerFixation;
import by.htp.rentalservice.enumcontainer.TypeOfBoat;

public class DataOnTenantAndLease {
	private Equipment[] equipments;
	private AdditionalAccessories[] additionalAccessories;
	private Client[] clients = new Client[10];
	private Rent[] rents = new Rent[10];
	
	public DataOnTenantAndLease() {
		
		addAdditionalAccessories();
		
		addEquipment();

	}
	
	private void addAdditionalAccessories() {
		
		additionalAccessories = new AdditionalAccessories[14];
		
		additionalAccessories[0] = new BicycleChair("Polisport Koolah FF", 
				new Size(74.8, 45, 39.8), 
				0.30);
		additionalAccessories[1] = new BicycleComputer("Vinca Sport V-3500 black/green", 
				new Size(15, 10, 7), 
				0.2);
		additionalAccessories[2] = new BicycleHelmet("Longus Funn 2.0 Police", 
				new Size(49), 
				0.25);
		additionalAccessories[3] = new BicycleLock("HQBC Pear 120", 
				new Size(1, 120, 1), 
				0.1);
		additionalAccessories[4] = new ElbowPads("Ennui City S ", 
				new Size(18, 17, 9), 
				0.2, 
				Category.UNISEX);
		additionalAccessories[5] = new ElbowPads("Ennui City XS ", 
				new Size(9, 8, 4), 
				0.2, 
				Category.CHILDREN);
		additionalAccessories[6] = new InflatableChair("\"Amely\" С-НС Chrome", 
				new Size(50, 30, 25), 
				0.3);
		additionalAccessories[7] = new KneePads("Ennui Street S", 
				new Size(18, 17, 9), 
				0.2, 
				Category.UNISEX);
		additionalAccessories[8] = new KneePads("Ennui Street XS", 
				new Size(18, 17, 9), 
				0.2, 
				Category.CHILDREN);
		additionalAccessories[9] = new LifeVest("MedNovtex", 
				new Size(35),
				0.4);
		additionalAccessories[10] = new Paddles("Qingdao", 
				new Size(150, 20, 15), 
				1.5);
		additionalAccessories[11] = new Pump("Intex Giant Bellows 68610", 
				new Size(30), 
				0.15);					
		additionalAccessories[12] = new RollerSkatesGlove("Ennui BLVD S ", 
				new Size(18, 17, 9), 
				0.2, 
				Category.UNISEX);
		additionalAccessories[13] = new RollerSkatesGlove("Ennui BLVD XS ", 
				new Size(9, 8, 4), 
				0.2, 
				Category.CHILDREN);
	}
	
	private void addEquipment() {
		equipments = new Equipment[20];	
		
		equipments[0] = new Bicycle("LTD Rocco 60 Hydraulic Disk", 
				7.5,
				3.05,
				new Size(120, 150, 30),
				Color.WHITE,
				Category.FEMALE,
				BicycleClass.TANDEM,
				4,
				true);
		equipments[1] = new RollerSkates("RollerSkate1", 
				2.6,
				2.15,
				new Size(42),
				Color.BLACK,
				Category.MALE,
				RollerFixation.VELCRO,
				6,
				false);
		equipments[2] = new Boat("Boat1",
				20.8,
				25.65,
				new Size(50, 250, 150), 
				Color.GREEN,
				TypeOfBoat.MOTOR_ROWING,
				5,
				false);
	}
	
	public void addClient(Client... clients) {
		int k = 0;
		int len = this.clients.length;
		for (int i = 0; i < len; i++) {
			if (this.clients[i] == null) {
				this.clients[i] = clients[k];
				k++;
				if (k == clients.length) { break; }
			}
			if (this.clients[this.clients.length - 1] != null) {
				Client[] tmp = new Client[this.clients.length + 10];
				for (int j = 0; j < this.clients.length; j++) {
					tmp[j] = this.clients[j];
				}
				this.clients = tmp;
				len = this.clients.length + 10;
			}
		}
	}
	
	public void addRent(Rent... rents) {
		int k = 0;
		int len = this.rents.length;
		for (int i = 0; i < len; i++) {
			if (this.rents[i] == null) {
				this.rents[i] = rents[k];
				k++;
				if (k == rents.length) { break; }
			}
			if (this.rents[this.rents.length - 1] != null) {
				Rent[] tmp = new Rent[this.rents.length + 10];
				for (int j = 0; j < this.rents.length; j++) {
					tmp[j] = this.rents[j];
				}
				this.rents = tmp;
				len = this.rents.length + 10;
			}
		}
	}
	
	public void  printClients() {
		{
			System.out.println("_______________________________________________________________________________________________");
		}
		for (Client c : clients) {
			if (c != null) {
				System.out.println(c);
				System.out.println("_______________________________________________________________________________________________");
			}
		}
	}
	
	public void  printRents() {
		for (Rent c : rents) {
			if (c != null) {
				System.out.println(c);
				System.out.println(c.getEquipments().toString());
				System.out.print("______________________________________________________________________________________________________________________");
				System.out.print("_______________________________________________________________________________________________________________________");
				System.out.print("_______________________________________________________________________________________________________________________");
				System.out.println("_____________________________________________________________________________________________________________________");
			}
		}
	}
	
	public Equipment[] getEquipments() { 
		return equipments;
	}
	
	public void printAdditionalAccessories() {
		{
			System.out.print("______________________________________________________________________");
			System.out.println("____________________________________________________________________");
		}
		for (AdditionalAccessories c : additionalAccessories) {
			if (c != null) {
				System.out.println(c);
				System.out.print("______________________________________________________________________");
				System.out.println("____________________________________________________________________");
			}
		}
	}
	
	public void printEquipment() {
		for (Equipment c : equipments) {
			if (c != null) {
				System.out.println(c);
				System.out.print("___________________________________________________________________________________________________________________________________");
				System.out.println("_________________________________________________________________________________________________________________________________");
			}
		}
	}
	
	public AdditionalAccessories[] getAdditionalAccessories() {
		return additionalAccessories;
	}

	public Client[] getClients() {
		return clients;
	}
}
