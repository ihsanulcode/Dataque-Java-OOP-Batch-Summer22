
public class B extends A{
	int data;
	
	public B() {
		super();
		System.out.println("B");
	}
	
	public B(int dataA,int data) {
		super(dataA);
		this.data = data;
	}
}
