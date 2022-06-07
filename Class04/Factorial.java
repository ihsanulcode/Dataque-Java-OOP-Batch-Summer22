import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// 5! = 1*2*3*4*5;

		// Scanner class
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		int fact = 1;
		for (int i = 1; i <=n ; i++) {
			fact *= i;
		}
		
		System.out.println("Factorial of "+n+"! is "+fact);

	}

}
