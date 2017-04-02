package by.htp.punktProkata.domen.client;

import by.htp.punktProkata.domen.*;

public  class RentEquipment {
	private Equipment equipment;	
	
	
	public RentEquipment(Equipment equipment) {
		this.equipment = equipment;
		equipment.setSdano(SdanoVProkat.Yes);
	}
	
	public void delEquipment() {
		equipment.setSdano(SdanoVProkat.No);
		equipment = null;
	}
}
