package by.htp.punktProkata.logic;

import by.htp.punktProkata.domen.equipment.*;
import by.htp.punktProkata.domen.*;
import java.util.Date;

public class Manager {

	public static void showSpisokDostupnogo(RentStation rentStation) {
		if (rentStation != null) {
			Print.printEquipment(rentStation.getListEquipment());
		}
	}

	public static void rent(RentStation rentStation, String title, int size, int rentTime, String fio) {
		if (rentStation != null) {

			Client client = searchClient(rentStation, fio);
			if (client == null) {
				Print.noClient();
				return;
			}

			Equipment equipment = showEquipment(rentStation, title, size);
			if (equipment == null) {
				Print.noEquipment();
				return;
			}

			client.addEquipment(equipment, rentTime);
			rentStation.delEquipment(equipment);
		}
	}

	public static void recovery(RentStation rentStation, String title, int size, String fio) {
		if (rentStation != null) {

			Client client = searchClient(rentStation, fio);
			if (client == null) {
				Print.noClient();
				return;
			}

			Equipment equipment = showEquipmentClient(client, title, size);
			if (equipment == null) {
				Print.noEquipment();
				return;
			}
			rentStation.addEquipment(equipment);
			client.delEquipment(equipment);
		}
	}

	public static void showEquipment(RentStation rentStation, String title) {
		if (rentStation != null) {
			for (Equipment i : rentStation.getListEquipment()) {
				if (title.equalsIgnoreCase(i.getTitle())) {
					Print.print(i);
				}
			}
		}
	}

	private static Equipment showEquipmentClient(Client client, String title, int size) {
		if (client != null) {
			for (RentEquipment j : client.getRentUnit()) {
				Equipment i = j.getEquipment();
				if (title.equalsIgnoreCase(i.getTitle())) {

					if (i instanceof Konki) {
						Konki equipment = (Konki) i; // == Roliki.class

						if (size == equipment.getSize()) {
							return i;
						}
					}
					if (i instanceof Roliki) {
						Roliki equipment = (Roliki) i;

						if (size == equipment.getSize()) {
							return i;
						}
					}
					if (i instanceof Luzhi) {
						Luzhi equipment = (Luzhi) i;

						if (size == equipment.getRost()) {
							return i;
						}
					}
				}
			}
		}
		return null;
	}
	
	public static Equipment showEquipment(RentStation rentStation, String title, int size) {
		if (rentStation != null) {
			for (Equipment i : rentStation.getListEquipment()) {
				if (title.equalsIgnoreCase(i.getTitle())) {

					if (i instanceof Konki) {
						Konki equipment = (Konki) i; // == Roliki.class

						if (size == equipment.getSize()) {
							return i;
						}
					}
					if (i instanceof Roliki) {
						Roliki equipment = (Roliki) i;

						if (size == equipment.getSize()) {
							return i;
						}
					}
					if (i instanceof Luzhi) {
						Luzhi equipment = (Luzhi) i;

						if (size == equipment.getRost()) {
							return i;
						}
					}
				}
			}
		}
		return null;
	}

	/*
	 * public static void showRent(RentStation rentStation, int period) { Date
	 * periodDate = new Date(); int min = 60; int sec = 60; int milli = 1000;
	 * long periodMillis = period * min * sec * milli;
	 * 
	 * periodDate.setTime(periodDate.getTime() - periodMillis); for (Client i :
	 * client.clientList) { int nameClient = 0; for (RentEquipment j :
	 * i.getRentUnit()) { if (j.getDate().getTime() > periodDate.getTime()) { if
	 * (nameClient == 0) { System.out.println(i.getFio()); nameClient = 1; }
	 * System.out.println(j); } } }
	 * 
	 * }
	 */

	public static Client searchClient(RentStation rentStation, String fio) {
		for (Client i : rentStation.getListClient()) {
			if (fio.equals(i.getFio())) {
				return i;
			}
		}
		return null;
	}

	public static void printClient(Client client) {
		RentEquipment[] rentUnits = client.getRentUnit();
		System.out.println("\n" + client.getFio());
		for (RentEquipment i : rentUnits) {
			System.out.println(i);
		}
	}

}
