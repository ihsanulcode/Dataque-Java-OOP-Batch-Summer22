
public class B extends A {
	int b;

	public B() {

	}

	public B(int a, int b) {
		super(a);
		this.b = b;
	}

	@Override
	public void printDouble() {
		System.out.println("B "+ b * b);
	}

}
