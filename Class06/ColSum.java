import java.util.Scanner;

public class ColSum {

	public static void main(String[] args) {
		// Scanner class
		Scanner input = new Scanner(System.in);

		// getting size from user
		System.out.print("Enter row: ");
		int row = input.nextInt();
		System.out.print("Enter column: ");
		int col = input.nextInt();

		// declaring an array
		int arr[][] = new int[row][col];

		// getting array elements from user
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("[" + i + "][" + j + "]: ");
				arr[i][j] = input.nextInt();
			}
		}

		// display array
		System.out.println("\nArray:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		// col sum
		int colSum;
		for (int i = 0; i < arr.length; i++) {
			colSum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				colSum += arr[j][i];
			}
			System.out.println("Sum of column " + (i + 1) + ": " + colSum);
		}

	}

}
