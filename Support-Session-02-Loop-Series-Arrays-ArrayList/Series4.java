import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 1 + 1/(2^2) + 1/(3^3) +.....+1/(n^n).

		System.out.print("Enter N: ");
		int n = input.nextInt();
		input.close();

		double sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				System.out.print(i);
			} else {
				System.out.print("1/" + i + "^" + i);
			}
			if (i < n) {
				System.out.print("+");
			}
			sum += 1.0 / Math.pow(i, i);
		}

		System.out.println("\nSum: " + sum);
	}

}
