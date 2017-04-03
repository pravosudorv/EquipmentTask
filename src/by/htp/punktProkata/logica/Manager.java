package by.htp.punktProkata.logica;

import by.htp.punktProkata.domen.*;

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
				if (i instanceof Konki) { // "class by.htp.punktProkata.domen.Konki".equals(i.getClass())
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

	private static void print(Equipment equipment) {
		if (SdanoVProkat.No.equals(equipment.getSdano())) {
			System.out.print(equipment);
		}
	}

}
