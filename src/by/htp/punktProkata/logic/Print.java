package by.htp.punktProkata.logic;

import by.htp.punktProkata.domen.equipment.*;

public class Print {
	public static void maxSize() {
		System.out.println("bolshe brat nelzya");
	}

	public static void printEquipment(Equipment[] listEquipment) {
		if (listEquipment != null) {
			for (Equipment i : listEquipment) {
				if (i != null) {
					System.out.println(i);
				} 
			}
		}
	}

	public static void print(Equipment equipment) {
		if (equipment != null) {
			System.out.print(equipment);
		}
	}

	public static void noClient() {
		System.out.println("clienta v baze net");
	}

	public static void noEquipment() {
		System.out.println("equipment v baze net");
	}

	public static void nix() {
		System.out.println("nelzya vzyat kak osnovnoe equipment");
	}
}
