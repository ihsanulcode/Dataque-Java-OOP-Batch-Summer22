import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		
		do {
			try {
				System.out.println("Enter Name: ");
				String name = input.nextLine();
				System.out.println("Enter ID: ");
				int id = input.nextInt();
				input.nextLine();
				System.out.println("Enter Cgpa: ");
				double cgpa = input.nextDouble();
				input.nextLine();
				
				//display
				System.out.println("Hi, "+name+"!");
				System.out.println("ID "+id);
				System.out.println("CGPA "+cgpa);
				flag = false;
				
			}catch(InputMismatchException ex) {
				System.out.println("Enter again");
				input.nextLine();
			}
		}while(flag);

	}

}
