
public class Patient {
	private String name;
	private int age;
	private String disease;

	public Patient() {

	}

	public Patient(String name, int age, String disease) throws InvalidAgeException, InvalidNameException {
		super();
		this.setAge(age);
		this.setName(name);
		this.disease = disease;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDisease() {
		return disease;
	}

	public void setName(String name) throws InvalidNameException {
		if (name.length() < 3)
			throw new InvalidNameException("Name can not be less than 3 character!");
		else
			this.name = name;
	}

	public void setAge(int age) throws InvalidAgeException {
		if (age < 0)
			throw new InvalidAgeException("Age can not be negative!");
		else
			this.age = age;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", disease=" + disease + "]";
	}

}
