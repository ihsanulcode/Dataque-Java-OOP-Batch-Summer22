import java.util.Scanner;

public class Series3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 1 + 1/2 + 1/3 + 1/4 + ..... + 1/n.

		System.out.print("Enter N: ");
		int n = input.nextInt();

		double sum = 0;
//		for (int i = 1; i <= n; i++) {
//			sum += 1.0/(double)i;
//		}
		int i = 1;
		while (i <= n) {
			if(i==1) System.out.print(i);
			else System.out.print("1/"+i);
			if(i<n) System.out.print(" + ");
			
			sum += 1.0 / (double) i;
			i++;
		}

		System.out.println("\nSum: " + sum);
	}

}
