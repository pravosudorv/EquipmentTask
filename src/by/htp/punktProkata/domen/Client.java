package by.htp.punktProkata.domen;

public class Client {
	private RentUnit rentUnit;
	private final String fio;
	
	public Client(String fio) {
		this.fio = fio;
		rentUnit = new RentUnit();
	}
	
	public String getFio() {
		return fio;
	}
	
	public RentEquipment[] getRentUnit() {
		return rentUnit.getUnits();
	}
	
}
