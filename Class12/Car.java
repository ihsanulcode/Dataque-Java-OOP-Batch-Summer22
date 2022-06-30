
public class Car {
	String name;
	int id;

	Car() {

	}

	Car(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", id=" + id;
	}

}
