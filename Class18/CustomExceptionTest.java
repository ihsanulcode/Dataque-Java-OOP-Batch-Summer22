import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Enter age: ");
			int age = input.nextInt();
			checkAge(age);
		} catch (InvalidAgeException ex) {
			System.out.println(ex);
		} catch (InputMismatchException ex) {
			System.out.println(ex);
		}

	}

	public static void checkAge(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("You are not 18+");
		else
			System.out.println("Valid age!");
	}

}
