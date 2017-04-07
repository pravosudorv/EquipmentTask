package by.htp.punktProkata.domen.equipment;

public class Konki extends SportObuv{
	public Konki( String title, int size) {
		super(Category.LetoSport,  title,  size);
	}

	@Override
	public String toString() {
		return   super.toString() +"\n" +"[Konki " + getTitle() + ", Size = " + getSize() + ", category = " + getCategory() + "]" ;
	}
	
}
