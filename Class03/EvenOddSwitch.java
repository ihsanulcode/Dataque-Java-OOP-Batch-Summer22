import java.util.Scanner;

public class EvenOddSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter n: ");
		int n = input.nextInt();

		switch (n % 2) {
		case 0:
			System.out.println((n == 0) ? "Zero" : "Even");
			break;
		case 1:
			System.out.println("Odd");
			break;

		}

	}

}
