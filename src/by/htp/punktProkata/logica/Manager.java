package by.htp.punktProkata.logica;

import by.htp.punktProkata.domen.*;

public class Manager {

	public static void printSpisokDostupnogo(RentStation rentStation) {
		for (Equipment i : rentStation.listEquipment){	
			if(SdanoVProkat.No.equals(i.getSdano())) {
				System.out.print(i);
			}
		}
	}

	public static void printSpisokDostupnogo(RentStation rentStation, String title) {
		for (Equipment i : rentStation.listEquipment){
			if(title.equals(i.getTitle())) {
				System.out.print(i);	
			}
		}
	}
	
	public static void printSpisokDostupnogo(RentStation rentStation, String title, int size) {
		String nameClass;
		
		for (Equipment i : rentStation.listEquipment){
			if(title.equalsIgnoreCase(i.getTitle())) {
				if("by.htp.punktProkata.domen.Konki".equals(i.getClass())
				System.out.print(i.getClass());	
			}
		}
	}
	
}
