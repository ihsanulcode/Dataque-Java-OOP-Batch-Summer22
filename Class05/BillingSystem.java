import java.util.Scanner;

public class BillingSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Menu();

		int choice;
		int bCount = 0;
		int pCount = 0;
		int cCount = 0;

		do {
			System.out.print("> ");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				bCount++;
				break;
			case 2:
				pCount++;
				break;
			case 3:
				cCount++;
				break;
			case 0:
				checkOut(bill(bCount,pCount,cCount));
				break;
			default:
				System.out.println("Invalid choice!");
			}
		} while (choice != 0);
	}

	public static void Menu() {
		System.out.println("1. Burger - 10 BDT");
		System.out.println("2. Pizza - 20 BDT");
		System.out.println("3. Coffee - 10 BDT");
		System.out.println("0. Check out");
	}

	public static int bill(int bCount, int pCount, int cCount) {
		if (bCount != 0)
			System.out.println("Burger\t-\t" + (bCount * 10));
		if (pCount != 0)
			System.out.println("Pizza\t-\t" + (pCount * 20));
		if (cCount != 0)
			System.out.println("Coffe\t-\t" + (cCount * 10));

		return (bCount * 10) + (pCount * 20) + (cCount * 10);
	}
	
	public static void checkOut(int total) {
		System.out.println("\nTotal\t-\t"+total);
	}

}
