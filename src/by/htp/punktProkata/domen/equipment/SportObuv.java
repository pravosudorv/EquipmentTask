package by.htp.punktProkata.domen.equipment;

public abstract class SportObuv extends Equipment{
private final int size; 
	
	public SportObuv(Category category, String title, int size) {
		super(category,  title);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SportObuv other = (SportObuv) obj;
		if (size != other.size)
			return false;
		return true;
	}
	
	
}
