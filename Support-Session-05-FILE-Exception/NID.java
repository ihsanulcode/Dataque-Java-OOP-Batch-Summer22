import java.util.InputMismatchException;
import java.util.Scanner;

public class NID {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean flag = true;
		do {
			try {
				System.out.println("Enter your age: ");
				int age = input.nextInt();
				checkAge(age);
				flag = false;
			} catch (InvalidAgeException ex) {
				System.out.println(ex.getMessage());
			} catch (InputMismatchException ex) {
				System.out.println(ex);
			}
		}while(flag);

		//System.out.println("Try again...");

	}

	public static void checkAge(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("Under 18 age!");
		else
			System.out.println("Valid age!");
	}

}
