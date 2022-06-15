
public class Student {
	// data fields
	String name;
	int id;
	double cgpa;
	String password;

	// constructors
	Student() { // default constructor
		this.name = "N/A";
		this.id = 0;
		this.cgpa = 0.0;
		this.password = null;
	}

	Student(String name, int id, double cgpa) { // argument constructor
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
		this.password = null;
		// name = n;
		// id = i;
		// cgpa = c;
	}

	// methods
	public void Profile(String password) {
		if (this.password == null) {
			System.out.println("Please set a password!");

		} else if (this.password.equals(password)) {
			System.out.println("Name: " + name);
			System.out.println("ID: " + id);
			System.out.println("Cgpa: " + cgpa);
			System.out.println();
		} else {
			System.out.println("You are a hacker!");
		}
	}

	public void Profile() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Cgpa: " + cgpa);
		System.out.println();
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
