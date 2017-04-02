package by.htp.punktProkata.domen;

public class Sanki extends Equipment{
	private final int rost;
	private final int maxMass;
	
	public Sanki(String title,int rost, int maxMAss) {
		super(Category.ZimaSport, title);
		this.rost = rost;
		this.maxMass = maxMAss;
	}


}
