
public class Person {
	private String name;
	private int age;
	private int phone;
	private long NID;

	public Person() {

	}

	public Person(String name, int age, int phone, long NID) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.NID = NID;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPhone() {
		return phone;
	}

	public long getNID() {
		return NID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public void setNID(long nID) {
		NID = nID;
	}

	public String toString() {
		return "name=" + name + ", phone=" + phone + ", age=" + age + ", NID=" + NID;
	}

}
