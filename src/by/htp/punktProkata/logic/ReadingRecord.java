package by.htp.punktProkata.logic;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import by.htp.punktProkata.domen.*;
import by.htp.punktProkata.domen.equipment.*;

public class ReadingRecord {

	public static void writer(RentStation station) {

		if (station != null) {
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(station.getFile(), false))) {

				for (Equipment i : station.getListEquipment()) {
					if (i != null) {
						
						writer.write(i.toString() + '\n');

						//writer.flush();
					}
				}
			} catch (IOException ex) {

				System.out.println(ex.getMessage());
			}
		}
	}

}
