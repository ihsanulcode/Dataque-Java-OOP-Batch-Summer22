
public class Driver {

	public static void main(String[] args) {

		// Circle c1 = new Circle("Circle Object", "RED", 5.5);
		BacchaCircle c1 = new BacchaCircle("Circle Object", "RED", 3.0, 5.5);
		Triangle t1 = new Triangle("Triangle Object", "RED", 5.5, 4.5);

		System.out.printf("c1 Area: %.2f\n", c1.getArea());
		System.out.printf("c1 Peremeter: %.2f\n", c1.getPeremeter());

		System.out.printf("t1 Area: %.2f\n", t1.getArea());
		System.out.printf("t1 Peremeter: %.2f\n", t1.getPeremeter());

	}

}
