import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 1^2+2^2+3^2+4^2+....N

		System.out.print("Enter N: ");
		int n = input.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += Math.pow(i, 2);
		}

		System.out.println("Sum: " + sum);
	}

}
