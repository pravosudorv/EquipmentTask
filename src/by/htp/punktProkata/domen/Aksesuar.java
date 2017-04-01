package by.htp.punktProkata.domen;

import by.htp.punktProkata.domen.*;
import by.htp.punktProkata.domen.Equipment.Category;

public abstract class Aksesuar extends Equipment {
	private final int size;
	
	public Aksesuar(String title, int size) {
		super(Category.Aksesuar, title);
		this.size = size;
	}

	@Override
	public String toString() {
		return "Aksesuar [size=" + size + "]";
	}
}
