package by.htp.punktProkata.domen;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import by.htp.punktProkata.logica.*;
import by.htp.punktProkata.domen.client.*;

public class Main {
	public static void main(String[] args) {
		
		RentStation station = new RentStation();
		List<Equipment> ren =  station.listEquipment;
		RentUnit unit;
		Client client = new Client();
		client.setFio("adf af af");
		
		
		/*Date date = new Date();
		long c = date.getTime();
		System.out.println(c);
		Calendar data2 = Calendar.getInstance();
		System.out.println(data2.getTimeInMillis());
		System.out.println(String.format("%tc", date));
		date.setTime(date.getTime() + 60*60* 1000);//; += 60*60*1000;
		System.out.println(String.format("%tc", date));*/
		
		
		ren.add(new Konki("konki", 38));
		ren.add(new Konki("konki", 38));
		ren.add(new Konki("konki", 38));
		ren.add(new Konki("konki", 37));
		ren.add(new Konki("konki", 36));
		ren.add(new Konki("konki", 35));
		ren.add(new Roliki("roliki", 38));
		ren.add(new Roliki("roliki", 35));
		
		unit = new RentUnit(ren.get(0), 6);   //,ren.get(1),ren.get(3)
		unit.addRentEquipment(ren.get(3), 24);
		
		client.setRentUnit(unit);
		
		ClientList list = new ClientList();
		list.addClient(client);
		Manager.printRent(list, 1);
		//station.print();
		//System.out.println(ren);
		//Equipment r = unit.equipment;
		//unit.delRentEquipment(1);
		//System.out.println(ren);
		
		//unit.delRentEquipment(2);
		//System.out.println(ren);
		//System.out.println(unit.getUnits());
		Manager.printSpisokDostupnogo(station);
		//Manager.printClient(client);
		//unit.delRentEquipmentAll();
		
		//Manager.printSpisokDostupnogo(station, "roliki", 38 );
	}

}
