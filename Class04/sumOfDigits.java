import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		int reminder = 0;
		int sum = 0;
		while(n>0) {
			reminder = n%10; //reminder
			sum += reminder; // sum = sum+reminder;
			n = n/10; //n /= 10;
		}
		System.out.println("Sum of digits: "+sum);

	}

}
