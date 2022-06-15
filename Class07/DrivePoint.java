
public class DrivePoint {

	public static void main(String[] args) {

		Point a = new Point(1, 2);
		Point b = new Point(3, 4);
		
		a.coordinate();
		b.coordinate();
		
		Point midPoint = new Point(((a.x+b.x)/2.0), ((a.y+b.y)/2.0));
		midPoint.coordinate();
		

	}

}
