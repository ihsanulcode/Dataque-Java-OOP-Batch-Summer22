import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
//		switch(expression) {
//			case x:
//				//code block
//				break;
//			case y:
//				//code block
//				break;
//			default:
//				//code block
//		}
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter day number: ");
		int day = input.nextInt();
		switch(day) {
			case 1:
			System.out.println("Monday");
			break;
			case 2:
				System.out.println("Tue");
				break;
			case 3:
				System.out.println("Wed");
				break;
			case 4:
				System.out.println("Thur");
				break;
			case 5:
				System.out.println("Fri");
				break;
			case 6:
				System.out.println("Sat");
				break;
			case 7:
				System.out.println("Sun");
				break;
			default:
				System.out.println("Invalid day!");
		}
		
		input.close();

	}

}
