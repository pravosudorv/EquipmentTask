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
	
}
