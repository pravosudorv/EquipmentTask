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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + rost;
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
		Luzhi other = (Luzhi) obj;
		if (rost != other.rost)
			return false;
		return true;
	}
	
	
}
