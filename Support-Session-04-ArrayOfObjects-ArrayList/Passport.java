
public class Passport {
	private String name;
	private int age;
	private int NID;

	public Passport() {

	}

	public Passport(String name, int age, int nID) {
		super();
		this.name = name;
		this.age = age;
		NID = nID;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getNID() {
		return NID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setNID(int nID) {
		NID = nID;
	}

	@Override
	public String toString() {
		return "Passport [name=" + name + ", age=" + age + ", NID=" + NID + "]";
	}

}
