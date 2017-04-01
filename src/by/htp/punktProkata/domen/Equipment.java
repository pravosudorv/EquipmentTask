package by.htp.punktProkata.domen;

public abstract class Equipment {
	private Category category;
	private String title;

	enum Category {
		ZimaSport, LetoSport, Aksesuar, Transport
	}

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
	
	public abstract void print();

	@Override
	public String toString() {
		return "Equipment [category=" + category + ", title=" + title + " ";
	}

}
