package by.htp.punktProkata.domen.client;

import by.htp.punktProkata.domen.*;
import java.util.Date;

public  class RentEquipment {
	private Equipment equipment;
	private final Date date;
	
	public RentEquipment(Equipment equipment) {
		this.equipment = equipment;
		this.date = new Date();
		equipment.setSdano(SdanoVProkat.Yes);
	}
	
	public Date getDate() {
		return date;
	}
	
	public void delEquipment() {
		equipment.setSdano(SdanoVProkat.No);
		equipment = null;
	}
}
