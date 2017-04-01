package by.htp.punktProkata.domen;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		RenStation station = new RenStation();
		ArrayList<Equipment> ren =  station.renStation;
		
		
		
		ren.add(new Konki("konki", 38));
		//konki.toString();
		//konki.print();
		//station.renStation.get(0).print();
		
		ren.add(new Konki("konki", 36));
		
		station.print();
	}

}
