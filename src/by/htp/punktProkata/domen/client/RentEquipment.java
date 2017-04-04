package by.htp.punktProkata.domen.client;

import by.htp.punktProkata.domen.*;
import java.util.Date;

public  class RentEquipment {
	private Equipment equipment;
	private final Date date;
	private long rentTimeInMillis;
	
	
	public RentEquipment(Equipment equipment, int rentTime) {
		this.equipment = equipment;
		this.date = new Date();
		setRentTimeInMillis(rentTime);
		equipment.setSdano(SdanoVProkat.Yes);
	}
	
	public Date getDate() {
		return date;
	}
	
	/*public long getRentTimeInMillis() {
		return rentTimeInMillis;
	}*/

	public void setRentTimeInMillis(int rentTime) {
		int min = 60;
		int sec = 60;
		int milli = 1000;
		long rentTimeInMillis = rentTime * min * sec * milli;
		this.rentTimeInMillis = rentTimeInMillis;
	}

	public void delEquipment() {
		equipment.setSdano(SdanoVProkat.No);
		equipment = null;
	}
	
	private Date dateVozvrata() {
		Date dateVozvrata = this.date;
		dateVozvrata.setTime(date.getTime() + rentTimeInMillis);
		return dateVozvrata;
	}

	@Override
	public String toString() {
		return "dateSdachi  " + String.format("%tc", date) + "\n" + "dateVozrata " + 
				String.format("%tc", dateVozvrata()) +  equipment;
	}
	
	
}
