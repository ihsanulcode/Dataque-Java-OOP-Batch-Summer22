
public abstract class Circle extends GeoObjects {
	private double radius;

	public Circle() {

	}

	public Circle(String name, String color, double radius) {
		super(name, color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public abstract double getPeremeter();
//	public double getPeremeter() {
//		return 2 * Math.PI * this.radius;
//	}

}
