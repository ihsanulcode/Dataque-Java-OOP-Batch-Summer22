
public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 10;
		System.out.println("C1 area: " + c1.getArea());
		
		Circle c2 = new Circle();
		c2.radius = 20;
		System.out.println("C2 area: " + c2.getArea());
		
		Circle c3 = new Circle();
		c3.radius = 30;
		System.out.println("C3 area: " + c3.getArea());
		
		System.out.println("Total Circle Created: "+Circle.countCircle);
	}

}
