import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int row = input.nextInt();
		
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
