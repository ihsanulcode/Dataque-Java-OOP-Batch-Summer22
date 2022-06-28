
public class Faculty extends Person{
	public int id;
	public double salary;

	public Faculty() {

	}

	public Faculty(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}

	public String toString() {
		return "Faculty [id=" + id + ", salary=" + salary + "]";
	}

}
