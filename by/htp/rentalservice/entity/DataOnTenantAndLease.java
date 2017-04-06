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
import by.htp.rentalservice.entity.secondaryclass.Accessory;
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
	private Accessory[] accessories;
	private Client[] clients = new Client[10];
	private Rent[] rents = new Rent[10];
	
	public DataOnTenantAndLease() {
		
		addAccessory();
		
		addEquipment();

	}
	
	private void addAccessory() {
		
		accessories = new Accessory[20];
		
		accessories[0] = new BicycleChair("Polisport Koolah FF", 
				new Size(74.8, 45, 39.8), 
				0.30,
				11, 
				Category.CHILDREN);
		
		accessories[1] = new BicycleComputer("Vinca Sport V-3500 black/green", 
				new Size(15, 10, 7), 
				0.2, 
				24);
		
		accessories[2] = new BicycleHelmet("Longus Funn 2.0M Police", 
				new Size(17, 18, 19, 20, 21, 22, 23), 
				0.25,
				15,
				Category.MALE);
		
		accessories[3] = new BicycleHelmet("Longus Funn 2.0F Police", 
				new Size(15, 16, 17, 18, 19, 20, 21), 
				0.25,
				15,
				Category.FEMALE);
		
		accessories[4] = new BicycleHelmet("Longus Funn 1.0 Police", 
				new Size(7, 8, 9, 10, 11, 12, 13, 14), 
				0.20,
				10,
				Category.CHILDREN);
		
		accessories[5] = new BicycleLock("HQBC Pear 120", 
				new Size(1, 120, 1), 
				0.1,
				36);
		
		accessories[6] = new ElbowPads("Ennui City XS ", 
				new Size(15, 16, 17, 18, 19, 20, 21), 
				0.2, 
				30,
				Category.UNISEX);
		
		accessories[7] = new ElbowPads("Ennui City S ", 
				new Size(7, 8, 9, 10, 11, 12, 13, 14), 
				0.2, 
				10,
				Category.CHILDREN);
		
		accessories[8] = new InflatableChair("\"Amely\" С-НС Chrome", 
				new Size(50, 30, 25), 
				0.3,
				19);
		
		accessories[9] = new KneePads("Ennui Street XS", 
				new Size(15, 16, 17, 18, 19, 20, 21), 
				0.2,
				30,
				Category.UNISEX);
		
		accessories[10] = new KneePads("Ennui Street S", 
				new Size(7, 8, 9, 10, 11, 12, 13, 14), 
				0.2,
				10,
				Category.CHILDREN);
		
		accessories[11] = new LifeVest("MedNovtex", 
				new Size(35, 36, 37, 38, 39, 40, 41, 42),
				0.4,
				17, 
				Category.UNISEX);
		
		accessories[12] = new LifeVest("MedNovtex", 
				new Size(27, 28, 29, 30, 31, 32, 33, 34),
				0.4,
				11, 
				Category.CHILDREN);
		
		accessories[13] = new Paddles("Qingdao", 
				new Size(150, 20, 15), 
				1.5,
				17);
		
		accessories[14] = new Pump("Intex Giant Bellows 68610", 
				new Size(300, 50, 50), 
				0.15, 
				39);
		
		accessories[15] = new RollerSkatesGlove("Ennui BLVD XS ", 
				new Size(12, 13, 14, 15, 16, 17), 
				0.2,
				15,
				Category.MALE);
		
		accessories[16] = new RollerSkatesGlove("Ennui BLVD XS ", 
				new Size(10, 11, 12, 13, 14, 15), 
				0.2,
				15,
				Category.FEMALE);
		
		accessories[17] = new RollerSkatesGlove("Ennui BLVD S ", 
				new Size(2, 3, 4, 5, 6, 7), 
				0.2, 
				10,
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
			System.out.println("__________________________________________________________________");
			System.out.println("|| Customer name:            | Series and ID of the passport:   ||");
			System.out.println("__________________________________________________________________");
		}
		for (Client c : clients) {
			if (c != null) {
				System.out.println(c);
				System.out.println("__________________________________________________________________");
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

	
	public void printAccessories() {
		{
			System.out.print("________________________________________________________________________");
			System.out.println("_______________________________________________________________________");
			System.out.print("|| Accessory name:      | Title:                            | ");
			System.out.println("Size:                                | Price: BYN  | Units:      | Category:   ||");
			System.out.print("________________________________________________________________________");
			System.out.println("_______________________________________________________________________");
		}
		for (Accessory c : accessories) {
			if (c != null) {
				System.out.println(c);
				System.out.print("________________________________________________________________________");
				System.out.println("_______________________________________________________________________");
			}
		}
	}
	
	public void printEquipments() {
		System.out.println("|| Inventory name:  |" 
				+ " Title:                          |"	
				+ " Weight: kg  |"
				+ " Price: BYN  |" 
				+ " Size:                                |" 
				+ " Color:      |" 
				+ " Category:   |"
				+ " Individual characteristics      |" 
				+ " Units:  |" 
				+ " Taken accessories ||");
		System.out.println();
		for (Equipment c : equipments) {
			if (c != null) {
				System.out.println(c);
				System.out.print("________________________________________________________________________");
				System.out.println("_______________________________________________________________________");
			}
		}
	}
	
	public Equipment[] getEquipments() { 
		return equipments;
	}
	
	public Accessory[] getAccessories() {
		return accessories;
	}

	public Client[] getClients() {
		return clients;
	}
}
