package by.htp.punktProkata.logica;

import by.htp.punktProkata.domen.*;

public class Manager {

	public static void printSpisokDostupnogo(RentStation rentStation) {
		for (Equipment i : rentStation.renStation){
			
			if(SdanoVProkat.No.equals(i.getSdano())) {
				System.out.print(i);
			}
		}
	}
}
