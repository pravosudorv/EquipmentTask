package by.htp.punktProkata.domen;

import by.htp.punktProkata.domen.equipment.Equipment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RentStation {
	private List<Equipment> listEquipment = new ArrayList<>();
	private List<Client> listClient = new ArrayList<>();
	private File file = new File("C:\\Users\\ÂÈÊÒÎĞ\\Google Äèñê\\workspace\\PynktProkata\\src\\by\\htp\\punktProkata\\domen\\ListEquipment.txt");
							
	public File getFile() {
		return file;
	}
	
	public List<Equipment> getListEquipment() {
		return listEquipment;
	}

	public void addEquipment(Equipment equipment) {
		listEquipment.add(equipment);
	}
	
	public void delEquipment(Equipment equipment) {
		listEquipment.remove(equipment);
	}
	
	public int getSizeListEquipment() {
		return listEquipment.size();
	}
	
	public List<Client> getListClient() {
		return listClient;
	}
	
	public void addClient(Client client) {
		listClient.add(client);
	}
	
	public void delClient(Client client) {
		listClient.remove(client);
	}
	
	public int getSizeListClient() {
		return listClient.size();
	}
	
}
