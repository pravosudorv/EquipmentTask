package by.htp.punktProkata.domen.client;

import java.util.ArrayList;
import java.util.List;

public class ClientList {
	public List<Client> clientList = new ArrayList<Client>();
	
	public void addClient(Client client) {
		clientList.add(client);
	}

}
