package by.htp.punktProkata.domen;

import by.htp.punktProkata.domen.equipment.*;
import by.htp.punktProkata.logic.Print;

public class RentUnit {
	private RentEquipment[] units;
	private static final int MAX_SIZE = 3;

	public RentUnit() {
		units = new RentEquipment[0];
	}

	/*
	 * public RentUnit(Equipment equipment, int rentTime) { units = new
	 * RentEquipment[] { new RentEquipment(equipment, rentTime) }; }
	 * 
	 * public RentUnit(Equipment equipment1, Equipment equipment2, int rentTime)
	 * { units = new RentEquipment[] { new RentEquipment(equipment1, rentTime),
	 * new RentEquipment(equipment2, rentTime) }; }
	 * 
	 * public RentUnit(Equipment equipment1, Equipment equipment2, Equipment
	 * equipment3, int rentTime) { units = new RentEquipment[] { new
	 * RentEquipment(equipment1, rentTime), new RentEquipment(equipment2,
	 * rentTime), new RentEquipment(equipment3, rentTime) }; }
	 */
	public RentEquipment[] getUnits() {
		return units;
	}

	public void addRentEquipment(Equipment equipment, int rentTime) {
		if (equipment != null) {
			if (!Category.Aksesuar.equals(equipment.getCategory())) {
				int index = units.length;
				if (units.length <= MAX_SIZE) {
					cloned();
					units[index] = new RentEquipment(equipment, rentTime);
				} else {
					Print.maxSize();
				}
			} else {
				Print.nix();
			}
		}
	}

	private void cloned() {
		RentEquipment[] newUnits = new RentEquipment[units.length + 1];
		for (int i = 0; i < units.length; i++) {
			newUnits[i] = units[i];
		}
		units = newUnits;
	}

	public void delRentEquipment(int index) {

		units[index] = null;
		sdvig(index);
		aCloned();
	}

	private void sdvig(int index) {
		if (index != 0 && index != units.length) {
			units[index] = units[units.length - 1];
			units[units.length - 1] = null;
		}
	}

	private void aCloned() {
		RentEquipment[] newUnits = new RentEquipment[units.length - 1];
		for (int i = 0; i < newUnits.length; i++) {
			newUnits[i] = units[i];
		}
		units = newUnits;
	}

}
