//Write a java program to find the sum of first 10 natural numbers.
public class sumOfNumbers {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <=10 ; i++) {
			sum += i;
		}
		System.out.println("Sum: "+sum);
		
		double avg = sum/10.0;
		System.out.println("Average: "+avg);

	}

}
