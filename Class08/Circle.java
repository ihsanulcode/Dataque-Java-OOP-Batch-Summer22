
public class Circle {
	double radius;
	static int countCircle;

	Circle() {
		this.radius = 1;
		this.countCircle++;
	}

	Circle(double radius) {
		this.radius = radius;
		this.countCircle++;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

}
