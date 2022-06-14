import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 1+11+111+1111+....nth

		System.out.print("Enter N: ");
		int n = input.nextInt();
		input.close();

		int sum = 0;
		int one = 1;
		for (int i = 1; i <= n; i++) {
			System.out.print(one);
			if(i<n) System.out.print(" + ");
			sum += one;
			one = (one*10)+1;
		}

		System.out.println("\nSum: " + sum);
	}

}
