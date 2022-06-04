import java.util.Scanner;

public class GAME101 {

	public static void main(String[] args) {
		// Scanner class
		Scanner input = new Scanner(System.in);

		int player;
		do {
			System.out.print("\t\tscissor(0), Rock(1), Paper(2): ");
			player = input.nextInt(); // player input

			// computer input
			int computer = (int) (Math.random() * (2 - 0 + 1) + 0);

			// logic
			if (computer == 0) {
				switch (player) {
				case 0:
					System.out.println("\t\t~~ Computer is Scissor. You are scissor too. Draw!");
					break;
				case 1:
					System.out.println("\t\t~~ Computer is Scissor. You are Rock too. You win!");
					break;
				case 2:
					System.out.println("\t\t~~ Computer is Scissor. You are Paper too. Computer win!");
					break;
				default:
					System.out.println("\t\t~~ You are cheating!");
				}
			} else if (computer == 1) {
				switch (player) {
				case 0:
					System.out.println("\t\t~~ Computer is Rock. You are scissor too. Computer win!");
					break;
				case 1:
					System.out.println("\t\t~~ Computer is Rock. You are Rock too. Draw!");
					break;
				case 2:
					System.out.println("\t\t~~ Computer is Rock. You are Paper too. You win!");
					break;
				default:
					System.out.println("\t\t~~ You are cheating!");
				}
			} else if (computer == 2) {
				switch (player) {
				case 0:
					System.out.println("\t\t~~ Computer is Paper. You are scissor too. You win!");
					break;
				case 1:
					System.out.println("\t\t~~ Computer is Paper. You are Rock too. Computer win!");
					break;
				case 2:
					System.out.println("\t\t~~ Computer is Paper. You are Paper too. Draw!");
					break;
				default:
					System.out.println("\t\t~~ You are cheating!");
				}
			}

		} while (player == 0 || player == 1 || player == 2);

	}

}
