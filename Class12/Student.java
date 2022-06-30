
public class Student extends Person {
	public double cgpa;
	public int id;
	public double creditPassed;

	public Student() {

	}

	public Student(String name, int age, int phone, long NID, double cgpa, int id, double creditPassed) {
		super(name, age, phone, NID);
		this.cgpa = cgpa;
		this.id = id;
		this.creditPassed = creditPassed;
	}

	@Override
	public String toString() {
		return "Student [name" + this.getName() + ", age=" + this.getAge() + ", phone=" + this.getPhone() + ", NID="
				+ this.getNID() + "cgpa=" + cgpa + ", id=" + id + ", creditPassed=" + creditPassed + "]";
	}

}
