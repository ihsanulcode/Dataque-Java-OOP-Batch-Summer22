import java.util.Scanner;

//Array Of Objects
public class StudentDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// getting the number of students
		System.out.print("Enter the number the students: ");
		int n = input.nextInt();
		input.nextLine();

		// Array of Student
		Student[] arr = new Student[n];

		// getting students informations
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Student " + (i + 1) + ".");
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Id: ");
			int id = input.nextInt();
			input.nextLine();
			System.out.print("Cgpa: ");
			double cgpa = input.nextDouble();
			input.nextLine();

			// assigning student object to the array
			arr[i] = new Student(name, id, cgpa);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}

}
