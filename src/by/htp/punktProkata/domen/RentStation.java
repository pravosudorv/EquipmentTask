package by.htp.punktProkata.domen;

import java.util.ArrayList;
import java.util.List;

public class RentStation {
	public List<Equipment> listEquipment = new ArrayList<Equipment>();

	public List<Equipment> getListEquipment() {
		return listEquipment;
	}

	public void addEquipment(Equipment equipment) {
		listEquipment.add(equipment) ;
	}

	

}
