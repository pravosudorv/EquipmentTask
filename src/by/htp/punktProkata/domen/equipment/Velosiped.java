package by.htp.punktProkata.domen.equipment;

public class Velosiped extends Equipment{
private final int rost;
	
	public Velosiped(Category category, String title,int rost) {
		super(Category.Transport, title);
		this.rost = rost;
	}

}
