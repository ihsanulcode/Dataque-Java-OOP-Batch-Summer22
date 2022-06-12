import java.util.ArrayList;
import java.util.Scanner;

public class SearchStudentId {

	public static void main(String[] args) {
		// Scanner class
		Scanner input = new Scanner(System.in);

		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> id = new ArrayList<Integer>();
		ArrayList<Double> cgpa = new ArrayList<Double>();

		// get the number of students
		System.out.println("Enter the number of student: ");
		int n = input.nextInt();
		input.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("Student " + (i + 1) + ".");
			System.out.print("Name: ");
			name.add(input.nextLine());
			System.out.print("Id: ");
			id.add(input.nextInt());
			input.nextLine();
			System.out.print("Cgpa: ");
			cgpa.add(input.nextDouble());
			input.nextLine();
		}

		// display info
		System.out.println("\nStudent Info:");
		for (int i = 0; i < n; i++) {
			System.out.println("Student " + (i + 1) + ".");
			System.out.println(name.get(i));
			System.out.println(id.get(i));
			System.out.println(cgpa.get(i));
			System.out.println();
		}

		// get search key
		System.out.print("\nEnter the id to search: ");
		int key = input.nextInt();

		int index = -1;
		for (int i = 0; i < id.size(); i++) {
			if (id.get(i) == key) {
				index = i;
				break;
			}
		}

		// check and print
		if (index != -1) {
			System.out.println("\nStudent Found!");
			System.out.println(name.get(index));
			System.out.println(id.get(index));
			System.out.println(cgpa.get(index));
		} else {
			System.out.println("\nStudent not found!");
		}
	}

}
