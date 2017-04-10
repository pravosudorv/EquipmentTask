package by.htp.punktProkata.domen;

import by.htp.punktProkata.domen.equipment.*;
import java.util.Date;

public  class RentEquipment {
	private Equipment equipment;
	private final Date date;
	private Aksesuar[] aksesuar;
	private long rentTimeInMillis;
	
	public RentEquipment(Equipment equipment, int rentTime) {
		this.equipment = equipment;
		this.date = new Date();
		setRentTimeInMillis(rentTime);
	}
	
	public RentEquipment(Equipment equipment, Aksesuar[] aksesuar, int rentTime) {
		this.equipment = equipment;
		this.date = new Date();
		this.aksesuar = aksesuar;
		setRentTimeInMillis(rentTime);
	}
	
	public Equipment getEquipment() {
		return equipment;
	}

	public Date getDate() {
		return date;
	}
	
	public void setRentTimeInMillis(int rentTime) {
		int min = 60;
		int sec = 60;
		int milli = 1000;
		long rentTimeInMillis = rentTime * min * sec * milli;
		this.rentTimeInMillis = rentTimeInMillis;
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
