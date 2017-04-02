package by.htp.punktProkata.domen;

public abstract class Equipment {
	private Category category;
	private String title;
	private SdanoVProkat sdano;

	Equipment(Category category, String title) {
		this.category = category;
		this.title = title;
		this.sdano = SdanoVProkat.No;
	}

	public Category getCategory() {
		return category;
	}
	
	public SdanoVProkat getSdano() {
		return sdano;
	}

	public void setSdano(SdanoVProkat sdano) {
		this.sdano = sdano;
	}

	public String getTitle() {
		return title;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Equipment other = (Equipment) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	

}
