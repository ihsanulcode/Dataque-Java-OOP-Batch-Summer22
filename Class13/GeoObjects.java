
public abstract class GeoObjects {
	private String name;
	private String color;

	public GeoObjects() {
	}

	public GeoObjects(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// abstract methods
	public abstract double getArea();

	public abstract double getPeremeter();

}
