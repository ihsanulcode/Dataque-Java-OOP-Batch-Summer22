
public class Faculty extends Person {
	public int id;
	public double salary;

	public Faculty() {

	}

	public Faculty(String name, int age, int phone, long NID, int id, double salary) {
		super(name, age, phone, NID);
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty [name" + this.getName() + ", age=" + this.getAge() + ", phone=" + this.getPhone() + ", NID="
				+ this.getNID() + "id=" + id + ", id=" + id + ", salary=" + salary + "]";
	}

}
