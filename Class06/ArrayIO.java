import java.util.Scanner;

public class ArrayIO {

	public static void main(String[] args) {
		// Scanner class
		Scanner input = new Scanner(System.in);

		// getting size from user
		System.out.print("Enter array size: ");
		int size = input.nextInt();

		// declaring an array
		int arr[] = new int[size];

		// getting array elements from user
		System.out.println("\nEnter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		// print array elements
		System.out.println("\nArray:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}

	}

}
