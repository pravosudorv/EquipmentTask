package by.htp.punktProkata.domen.equipment;

public class Konki extends SportObuv{
	public Konki( String title, int size) {
		super(Category.LetoSport,  title,  size);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + getSize();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Konki other = (Konki) obj;
		if (getSize() != other.getSize())
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return   super.toString() +"\n" +"[Konki " + getTitle() + ", Size = " + getSize() + ", category = " + getCategory() + "]" ;
	}
	
}
