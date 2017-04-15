package by.htp.punktProkata.logic;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import by.htp.punktProkata.domen.*;
import by.htp.punktProkata.domen.equipment.*;

public class ReadingRecord {

	public static void writer(RentStation station) {

		if (station != null) {
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(station.getFile(), false))) {

				for (Equipment i : station.getListEquipment()) {
					if (i != null) {

						writer.write(i.toString() + '\n');

						// writer.flush();
					}
				}
			} catch (IOException ex) {

				System.out.println(ex.getMessage());
			}
		}
	}

	public static void reader(RentStation station) {
		
		if(station != null) {
			try(BufferedReader reader = new BufferedReader(new FileReader(station.getFile()))) {
				String line = null;
				while((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				
			} catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
	
	

}
