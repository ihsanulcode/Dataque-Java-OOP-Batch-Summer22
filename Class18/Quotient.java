import java.util.Scanner;

public class Quotient {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		try {
			if (num2 == 0)
				throw new ArithmeticException("Divisor cannot be zero");
			System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
		} catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println("execute next...");

	}

}
