package by.htp.punktProkata.domen;

public abstract class Aksesuar extends Equipment {
	private final int size;
	
	public Aksesuar(String title, int size) {
		super(Category.Aksesuar, title);
		this.size = size;
	}

}
