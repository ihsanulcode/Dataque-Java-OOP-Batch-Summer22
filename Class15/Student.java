import java.util.Arrays;

public class Student implements Cloneable, Comparable<Student> {
	private int id;
	private String name;
	private double cgpa;
	double[] scores;

	public Student() {

	}

	public Student(int id, String name, double cgpa, double[] scores) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.scores = scores;
	}

	public Student(int id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public double[] getScores() {
		return scores;
	}

	public void setScores(double[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", scores=" + Arrays.toString(scores) + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.cgpa > o.getCgpa())
			return 1;
		else if (this.cgpa < o.getCgpa())
			return -1;
		else
			return 0;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// shallow copy
		// return (Student) super.clone();

		// Deep copy
		Student copy = (Student) super.clone();
		double[] arr = new double[this.scores.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = this.scores[i];
		}
		copy.scores = arr;
		return copy;
	}
}
