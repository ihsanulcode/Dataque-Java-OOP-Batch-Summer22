import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// Scanner class
		Scanner input = new Scanner(System.in);

		// getting size from user
		System.out.print("Enter array size: ");
		int size = input.nextInt();

		// declaring an array
		int arr[] = new int[size];

		// getting array elements from user
		int sum = 0;
		System.out.println("\nEnter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
			sum += arr[i];
		}

		// print array elements
		System.out.println("\nArray:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}
		
		//print summation
		System.out.println("\nSum of Array Elements: "+sum);

	}

}
