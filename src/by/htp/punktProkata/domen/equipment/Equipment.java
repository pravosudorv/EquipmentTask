package by.htp.punktProkata.domen.equipment;

public abstract class Equipment {
	private Category category;
	private String title;

	Equipment(Category category, String title) {
		this.category = category;
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public String getTitle() {
		return title;
	}
	
}
