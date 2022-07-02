
public class BacchaCircle extends Circle {
	private double bacchaRadius;

	BacchaCircle() {

	}

	BacchaCircle(String name, String color, double radius, double bacchaRadius) {
		super(name, color, radius);
		this.bacchaRadius = bacchaRadius;
	}

	public double getBacchaRadius() {
		return bacchaRadius;
	}

	public void setBacchaRadius(double bacchaRadius) {
		this.bacchaRadius = bacchaRadius;
	}

	@Override
	public double getPeremeter() {
		return 2 * Math.PI * this.bacchaRadius;
	}

}
