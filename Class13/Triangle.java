
public class Triangle extends GeoObjects {
	private double base;
	private double height;

	public Triangle() {

	}

	public Triangle(String name, String color, double base, double height) {
		super(name, color);
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return 0.5 * this.base * this.height;
	}

	@Override
	public double getPeremeter() {
		return 0;
	}

}
