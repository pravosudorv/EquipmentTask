package by.htp.punktProkata.domen;

import by.htp.punktProkata.domen.equipment.*;
import java.io.File;


public class RentStation {
	private Equipment[] listEquipment = new Equipment[10];
	private int sizeListEquipment = 0;
	
	private Client[] listClient = new Client[10];
	private int sizeListClient = 0;
	
	File file = new File("C:\\Users\\ÂÈÊÒÎÐ\\Google Äèñê\\workspace\\PynktProkata\\src\\by\\htp\\punktProkata\\domen\\ListEquipment.txt");
							
	public Equipment[] getListEquipment() {
		return listEquipment;
	}
	
	public File getFile() {
		return file;
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
	
	public void delEquipment(Equipment equipment) {
		if(equipment != null) {
			for(int i = 0; i < sizeListEquipment; i++) {
				if(equipment == listEquipment[i]) {
					listEquipment[i] = null;
					shifting(i);
				}
			}
		}
	}
	
	public int getSizeListEquipment() {
		return sizeListEquipment;
	}
	
	public Client[] getListClient() {
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
	
	private void shifting(int index) {
		for(int i = index; i < sizeListEquipment - 1; i++) {
			listEquipment[i] = listEquipment[i+1];
		}
		listEquipment[sizeListEquipment] = null;
		sizeListEquipment--;
	}

	
}
