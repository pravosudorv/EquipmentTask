package by.htp.punktProkata.logica;

import by.htp.punktProkata.domen.equipment.*;

public class Print {
	public static void maxSize() {
		System.out.println("bolshe brat nelzya");
	}
	
	public static void showEquipment(Equipment[] listEquipment) {
		for(Equipment i : listEquipment) {
			System.out.println(i);
		}
	}

}
