import java.util.Scanner;

public class Series6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 1 + 1/2! + 1/3! + ..... + 1/n!.

		System.out.print("Enter N: ");
		int n = input.nextInt();
		input.close();

		double sum = 0;
		for (int i = 1; i <= n; i++) {
			if(i==1) System.out.print(i);
			else System.out.print("1/"+i+"!");
			if(i<n) System.out.print(" + ");
			sum += 1.0 / (double) factorial(i);
		}

		System.out.println("\nSum: " + sum);
	}

	public static int factorial(int f) {
		int fact = 1;
		for (int i = 1; i <= f; i++) {
			fact *= i;
		}
		return fact;
	}

}
