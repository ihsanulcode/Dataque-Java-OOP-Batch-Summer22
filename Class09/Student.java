
public class Student {
	String name;
	double cgpa;
	int id;

	public Student() {
		this.name = null;
		this.cgpa = 0.0;
		this.id = 0;
	}

	public Student(String name, int id, double cgpa) {
		this.name = name;
		this.cgpa = cgpa;
		this.id = id;
	}

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		// this.cgpa = 0.0;
	}

	public String toString() {
		return "Name=" + name + ", Id=" + id + ", Cgpa=" + cgpa;
	}

}
