import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// getting array size from user
		System.out.print("Enter array size: ");
		int size = input.nextInt();

		// declaring array
		int arr[] = new int[size];

		// getting elements from user
		System.out.println("Enter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		System.out.println("Max Element: " + ArraySupport.arrayMax(arr));
		System.out.println("Min Element: " + ArraySupport.arrayMin(arr));

		System.out.println(Arrays.toString(arr));

	}

}
