
public class MultipleDataTypes<I, S> {
	private S x;
	private I y;

	public MultipleDataTypes(S x, I y) {
		this.x = x;
		this.y = y;
	}

	public S getX() {
		return x;
	}

	public I getY() {
		return y;
	}

	public void setX(S x) {
		this.x = x;
	}

	public void setY(I y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "MultipleDataTypes [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) {
		MultipleDataTypes<Integer, String> obj = new MultipleDataTypes<Integer, String>("Ihsanul Haque Asif", 201);
		System.out.println(obj.toString());

	}

}
