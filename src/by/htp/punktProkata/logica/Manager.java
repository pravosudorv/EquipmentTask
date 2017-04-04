package by.htp.punktProkata.logica;

import by.htp.punktProkata.domen.*;
import by.htp.punktProkata.domen.client.*;
import java.util.Date;

public class Manager {

	public static void printSpisokDostupnogo(RentStation rentStation) {
		for (Equipment i : rentStation.listEquipment) {
			if (SdanoVProkat.No.equals(i.getSdano())) {
				System.out.print(i); // .getClass() + "\n"
			}
		}
	}

	public static void printSpisokDostupnogo(RentStation rentStation, String title) {
		for (Equipment i : rentStation.listEquipment) {
			if (title.equalsIgnoreCase(i.getTitle())) {
				print(i);
			}
		}
	}

	public static void printSpisokDostupnogo(RentStation rentStation, String title, int size) {
		for (Equipment i : rentStation.listEquipment) {

			if (title.equalsIgnoreCase(i.getTitle())) {
				if (i instanceof Konki) { // "class
											// by.htp.punktProkata.domen.Konki".equals(i.getClass())
					Konki equipment = (Konki) i;

					if (size == equipment.getSize()) {
						print(i);
					}
				}
				if (i instanceof Roliki) {
					Roliki equipment = (Roliki) i;

					if (size == equipment.getSize()) {
						print(i);
					}
				}
				if (i instanceof Luzhi) {
					Luzhi equipment = (Luzhi) i;

					if (size == equipment.getRost()) {
						print(i);
					}
				}
			}
		}
	}
	
	public static void printRent(ClientList client, int period) {
		Date periodDate = new Date();
		int min = 60;
		int sec = 60;
		int milli = 1000;
		long periodMillis = period * min * sec * milli;
		
		periodDate.setTime(periodDate.getTime() - periodMillis);
		for(Client i : client.clientList) {
			int nameClient = 0;
			for(RentEquipment j : i.getRentUnit()) {
				if(j.getDate().getTime() > periodDate.getTime()) {
					if(nameClient == 0) {
						System.out.println(i.getFio());
						nameClient = 1;
					}
					System.out.println(j);
				}
			}
		}
		
	}

	private static void print(Equipment equipment) {
		if (SdanoVProkat.No.equals(equipment.getSdano())) {
			System.out.print(equipment);
		}
	}
	
	public static void printClient(Client client) {
		RentEquipment[] rentUnits = client.getRentUnit();
		System.out.println("\n" + client.getFio());
		for (RentEquipment i : rentUnits) {
			System.out.println(i);
		}
	}

}
