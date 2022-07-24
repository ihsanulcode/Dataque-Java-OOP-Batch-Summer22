
public class Test {

	public static void main(String[] args) {

		// declare type = A
		// actual type C
		A a = new C(1, 2, 3);
		//((B) a).printDouble();

		C c = (C) a;
		//c.printDouble();
		
		checkInstance(new A(5));

	}

	public static void checkInstance(Object o) {
		if (o instanceof A) {
			((A) o).printDouble();
		} else if (o instanceof B) {
			((B) o).printDouble();
		} else if (o instanceof C) {
			((C) o).printDouble();
		}
	}

}
