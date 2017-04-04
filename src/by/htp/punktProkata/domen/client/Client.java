package by.htp.punktProkata.domen.client;

public class Client {
	private RentUnit rentUnit;
	private String fio;
	
	
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	
	public RentEquipment[] getRentUnit() {
		return rentUnit.getUnits();
	}
	
	public void setRentUnit(RentUnit rentUnit) {
		this.rentUnit = rentUnit;
	}
}
