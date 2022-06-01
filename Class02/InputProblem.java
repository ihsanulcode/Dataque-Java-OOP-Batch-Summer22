import java.util.Scanner;

public class InputProblem {

	public static void main(String[] args) {
		// Scanner class
		Scanner input = new Scanner(System.in);

		System.out.println("ID: ");
		int id = input.nextInt();
		input.nextLine(); // solved the console buffer
		System.out.println("Name: ");
		String name = input.nextLine();
		System.out.println("Department: ");
		String dept = input.next();
		System.out.println("CGPA: ");
		double cgpa = input.nextDouble();

		System.out.println("\nINFO:");
		System.out.println(name);
		System.out.println(id);
		System.out.println(dept);
		System.out.println(cgpa);

	}

}
