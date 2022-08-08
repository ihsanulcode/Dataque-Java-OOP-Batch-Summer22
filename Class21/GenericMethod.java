
public class GenericMethod {

	public static <T> void printArray(T[] arr) {
		for (T element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		printArray(arr1);
		Double[] arr2 = { 1.2, 2.3, 3.4, 4.2, 5.5 };
		printArray(arr2);
		String[] arr3 = { "Java", "C++", "C", "Python", "JavaScript", "PHP" };
		printArray(arr3);

	}

}
