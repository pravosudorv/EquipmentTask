package by.htp.punktProkata.domen;

import by.htp.punktProkata.domen.equipment.*;
import by.htp.punktProkata.logic.Print;

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

	public void addEquipment(Equipment equipment, int rentTime) {
		rentUnit.addRentEquipment(equipment, rentTime);
	}

	public void delEquipment(Equipment equipment) {
		int index = audit(equipment);
		if (index >= 0) {
			rentUnit.delRentEquipment(index);
		} else {
			Print.nix();
		}
	}

	private int audit(Equipment equipment) {
		if (equipment != null) {
			for (int i = 0; i < getRentUnit().length; i++) {
				if (equipment.equals(getRentUnit()[i].getEquipment())) {
					return i;
				}
			}
		}
		return -1;
	}

}
