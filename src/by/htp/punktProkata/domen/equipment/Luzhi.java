package by.htp.punktProkata.domen.equipment;

public class Luzhi extends Equipment{
	private final int rost;
	
	public Luzhi(Category category, String title,int rost) {
		super(Category.ZimaSport, title);
		this.rost = rost;
	}

	public int getRost() {
		return rost;
	}
	
	
}
