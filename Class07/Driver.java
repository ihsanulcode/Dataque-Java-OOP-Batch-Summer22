import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Creating an object of Student class
		Student s1 = new Student();
		// dot call
		// data initialization
		s1.name = "Ihsanul Haque Asif";
		s1.id = 201;
		s1.cgpa = 3.80;
		s1.setPassword("ilovejava");

		System.out.print("Enter password: ");
		String password = input.nextLine();
		s1.Profile(password);

		Student s2 = new Student();
		s2.Profile();

	}

}

/*
 * Question: Create a class Student that has data fields name,id and cgpa. Add a
 * method named profile() that prints the students informations. Now create a
 * Driver class and create 3 student object and invoke their Profile method.
 */
