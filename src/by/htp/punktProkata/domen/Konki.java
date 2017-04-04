package by.htp.punktProkata.domen;

public class Konki extends SportObuv{
	public Konki( String title, int size) {
		super(Category.LetoSport,  title,  size);
	}

	@Override
	public String toString() {
		return   "\n" +"[Konki " + getTitle() + ", Size = " + getSize() + ", category = " + getCategory() + ", sdano = " + getSdano()
				+  "]" ;
	}
	
}
