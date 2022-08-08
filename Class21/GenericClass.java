
public class GenericClass<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public static void main(String[] args) {
		GenericClass<Integer> obj1 = new GenericClass<Integer>();
		obj1.setData(10);
		System.out.println(obj1.getData());
		
		GenericClass<String> obj2 = new GenericClass<String>();
		obj2.setData("Java");
		System.out.println(obj2.getData());
	}

}
