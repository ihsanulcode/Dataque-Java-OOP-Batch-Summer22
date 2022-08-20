import java.util.InputMismatchException;
import java.util.Scanner;

public class TestPatient {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		String disease;
		boolean flag = true;
		Patient obj = new Patient();

		do {
			try {
				System.out.println("Enter patient name: ");
				name = input.nextLine();
				obj.setName(name);
				flag = false;
			} catch (InvalidNameException ex) {
				System.out.println(ex.getMessage());
			}
		} while (flag);

		flag = true;
		do {
			try {
				System.out.println("Enter patient age: ");
				age = input.nextInt();
				input.nextLine();
				obj.setAge(age);
				flag = false;
			} catch (InvalidAgeException ex) {
				System.out.println(ex.getMessage());
			} catch (InputMismatchException ex) {
				System.out.println(ex);
			}
		} while (flag);

		System.out.println("Enter Disease: ");
		disease = input.nextLine();
		obj.setDisease(disease);
		System.out.println(obj.toString());
		input.close();

	}

}
