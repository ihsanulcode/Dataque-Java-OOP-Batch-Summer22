
public class Point {
	double x;
	double y;

	Point() {
		x = 0.0;
		y = 0.0;
	}

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void coordinate() {
		System.out.println("(" + x + "," + y+")");
	}

}
