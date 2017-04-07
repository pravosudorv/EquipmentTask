package by.htp.punktProkata.domen;

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
	
}
