package by.htp.punktProkata.domen;

import by.htp.punktProkata.domen.equipment.*;

public class RentStation {
	private Equipment[] listEquipment = new Equipment[10];
	private int sizeListEquipment = 0;
	
	private Client[] listClient = new Client[10];
	private int sizeListClient = 0;

	public Equipment[] getListEquipment() {
		return listEquipment;
	}

	public void addEquipment(Equipment equipment) {
		if (equipment != null) {
			if (sizeListEquipment == listEquipment.length) {
				Equipment[] newListEquipment = new Equipment[listEquipment.length * 3 / 2 + 1];
				cloned(newListEquipment);
			}
			listEquipment[sizeListEquipment] = equipment;
			sizeListEquipment++;
		}
	}
	
	public Client[] getListClient(Client client) {
		return listClient;
	}

	public void addClient(Client client) {
		if (client != null) {
			if (sizeListClient == listClient.length) {
				Client[] newListClient = new Client[listClient.length * 3 / 2 + 1];
				cloned(newListClient);
			}
			listClient[sizeListClient] = client;
			sizeListEquipment++;
		}
	}
	
	private void cloned(Equipment[] newListEquipment) {
		for (int i = 0; i < listEquipment.length; i++) {
			newListEquipment[i] = listEquipment[i];
		}
		listEquipment = newListEquipment;
	}
	
	private void cloned(Client[] newListClient) {
		for (int i = 0; i < listClient.length; i++) {
			newListClient[i] = listClient[i];
		}
		listClient = newListClient;
	}
}
