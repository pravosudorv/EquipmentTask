package by.htp.punktProkata.launcher;

import by.htp.punktProkata.domen.*;
import by.htp.punktProkata.domen.equipment.*;
import by.htp.punktProkata.logic.*;

public class Main {
	public static void main(String[] args) {
		RentStation station = new RentStation();
		
		station.addEquipment(new Konki("konki", 36));
		station.addEquipment(new Konki("konki", 35));
		station.addEquipment(new Konki("konki", 37));
		station.addEquipment(new Konki("konki", 35));
		station.addEquipment(new Konki("konki", 38));
		station.addEquipment(new Roliki("roliki", 35));
		station.addEquipment(new Roliki("roliki", 37));
		station.addEquipment(new Roliki("roliki", 38));
		
		station.addClient(new Client("Ivanov Ivan"));
		
		//Manager.showListAccessibility(station);
		
		
		
		//ReadingRecord.writer(station); 
		ReadingRecord.reader(station);
		
		/*Manager.rent(station, "konki", 35, 5, "Ivanov Ivan");
		
		Manager.showListAccessibility(station);
		
		Manager.recovery(station, "konki", 35, "Ivanov Ivan");
		
		Manager.showListAccessibility(station);*/
	}
}
