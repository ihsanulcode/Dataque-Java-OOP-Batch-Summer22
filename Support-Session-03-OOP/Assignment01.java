
public class Assignment01 {
	public static void main(String[] args) {
		// Creating a point and use setters to assign values
		Point p1 = new Point();
		p1.setX(1);
		p1.setY(2);
		// printing value using getters
		System.out.println("Point p1: x=" + p1.getX() + ", y=" + p1.getY());

		// creating another point and use overloaded constructor
		Point p2 = new Point(p1);
		// printing point coordinate using toString method
		System.out.println("Point p2: " + p2.toString());

		// creating another Point and use argument constructor
		Point p3 = new Point(3, 4);
		System.out.println("Point p3: " + p3.toString());

		// creating another Point and use argument constructor
		Point p4 = new Point(5.5);
		System.out.println("Point p4: " + p4.toString());

		// mid point p1 and p3
		Point midPoint = p1.calculateMidPoint(p3);
		System.out.println("\nP1 and P3 MidPoint: " + midPoint.toString());

		// length p2 and p4
		double length = p2.calculateLength(p4);
		System.out.printf("P2 and P4 length: %.2f\n",length);

		// Gradient p3 and p4
		double slope = p3.calculateGradient(p4);
		System.out.println("P3 and P4 Gradient: " + slope);

	}

}

class Point {
	private double x;
	private double y;

	public Point() {

	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point(double n) {
		this.x = n;
		this.y = n;
	}

	public Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Point calculateMidPoint(Point p) {
		double midX = (this.x + p.x) / 2;
		double midY = (this.y + p.y) / 2;

		return new Point(midX, midY);
	}

	public double calculateLength(Point p) {
		double length = Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.y), 2));
		return length;
	}

	public double calculateGradient(Point p) {
		double slope = (p.y - this.y) / (p.x - this.x);
		return slope;
	}

	public String toString() {
		return "x=" + x + ", y=" + y;
	}

}
