package by.htp.punktProkata.domen;

import java.util.ArrayList;
import by.htp.punktProkata.logica.*;
import by.htp.punktProkata.domen.client.*;

public class Main {
	public static void main(String[] args) {
		
		RentStation station = new RentStation();
		ArrayList<Equipment> ren =  station.listEquipment;
		RentUnit unit;
		
		
		ren.add(new Konki("konki", 38));
		ren.add(new Konki("konki", 38));
		ren.add(new Konki("konki", 38));
		ren.add(new Konki("konki", 37));
		ren.add(new Konki("konki", 36));
		ren.add(new Konki("konki", 35));
		
		unit = new RentUnit(ren.get(2),ren.get(1),ren.get(4) );
		//station.print();
		//System.out.println(ren);
		//Equipment r = unit.equipment;
		//unit.delRentEquipment(1);
		//System.out.println(ren);
		
		//unit.delRentEquipment(2);
		//System.out.println(ren);
		//System.out.println(unit.getUnits());
		Manager.printSpisokDostupnogo(station);
		
		unit.delRentEquipmentAll();
		System.out.println();
		Manager.printSpisokDostupnogo(station);
	}

}
