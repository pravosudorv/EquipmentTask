package by.htp.punktProkata.domen;

import java.util.ArrayList;

public class RenStation {
	public ArrayList<Equipment> renStation = new ArrayList<Equipment>();

	public void print() {
		for(Equipment i : renStation) {
			i.print();
		}
	}

}
