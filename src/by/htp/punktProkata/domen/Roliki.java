package by.htp.punktProkata.domen;

public class Roliki extends SportObuv{
	 
	public Roliki(String title, int size) {
		super(Category.LetoSport,  title,  size);
	}
	
	@Override
	public String toString() {
		return   "\n" +"[Roliki " + getTitle() + ", Size = " + getSize() + ", category = " + getCategory() + ", sdano = " + getSdano()
				+  "]" ;
	}
}
