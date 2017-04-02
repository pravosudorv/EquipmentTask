package by.htp.punktProkata.domen.client;

import by.htp.punktProkata.domen.*;

public class RentUnit {
	private RentEquipment[] units;
	private static final int MAX_SIZE = 3;

	public RentUnit(Equipment equipment) {
		units = new RentEquipment[] { new RentEquipment(equipment) };
	}

	public RentUnit(Equipment equipment1, Equipment equipment2) {
		units = new RentEquipment[] { new RentEquipment(equipment1), new RentEquipment(equipment2) };
	}

	public RentUnit(Equipment equipment1, Equipment equipment2, Equipment equipment3) {
		units = new RentEquipment[] { new RentEquipment(equipment1), new RentEquipment(equipment2),
				new RentEquipment(equipment3) };
	}

	public RentEquipment[] getUnits() {
		return units;
	}
	
	public void addRentEquipment(Equipment equipment) {
		int index = units.length;
		if (units.length <= MAX_SIZE) {
			cloned();
			units[index] = new RentEquipment(equipment);
		} else{ 
			System.out.println("blolshe brat nelzya");
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
		units[index - 1].delEquipment();
		units[index - 1] = null;
		sdvig(index);
		aCloned();
	}
	
	public void delRentEquipmentAll() {
		for(RentEquipment i : units) {
			i.delEquipment();
		}
		units = null;
	}

	private void sdvig(int index) {
			if(index != 0  && index != units.length) {
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
