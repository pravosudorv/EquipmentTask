package by.htp.punktProkata.domen;

public abstract class SportObuv extends Equipment{
private final int size; 
	
	public SportObuv(Category category, String title, int size) {
		super(category,  title);
		this.size = size;
	}

	public int getSize() {
		return size;
	}
	
	public void print() {
		System.out.println(getTitle()+ " " + getCategory() + " size:" + size);
	}

}
