import java.util.Scanner;

public class passwordVarificationSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter facebook password: ");
		String password = input.nextLine();

		if (isValid(password))
			System.out.println(password + " Valid!");
		else
			System.out.println(password + " Invalid!");

	}

	public static boolean is_letter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');
	}

	public static boolean is_digit(char ch) {
		return (ch >= '0' && ch <= '9');
	}

	public static boolean isValid(String password) {
		if (password.length() < 8)
			return false;

		int charCount = 0;
		int digitCount = 0;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (is_digit(ch))
				digitCount++;
			else if (is_letter(ch))
				charCount++;
			else
				return false;
		}

		return (charCount >= 2 && digitCount >= 2);
	}

}
