import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 1+2+3+4+....N

		System.out.print("Enter N: ");
		int n = input.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(i+"+");
			sum += i;
		}

		System.out.println("\nSum: " + sum);
	}

}
