import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		//getting number from user
		System.out.println("Enter a numbe: ");
		int n = input.nextInt();
		
		//checking
		if(n==0) {
			System.out.println("It's Zero");
		}else if(n%2==0) {
			System.out.println("Even number!");
		}
		else {
			System.out.println("Odd number!");
		}

		input.close();
	}

}
