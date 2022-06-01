import java.util.Scanner; //import scanner class from java util package

public class UserInput {

	public static void main(String[] args) {
		//Scanner class
		Scanner input = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name = input.nextLine(); //sentence
		System.out.println("Enter ID: ");
		int ID = input.nextInt();
		System.out.println("Department: ");
		String dept = input.next(); //word
		System.out.println("CGPA: ");
		double cgpa = input.nextDouble();
		System.out.println("Are you graduate? ");
		boolean isGraduate = input.nextBoolean();
		
		System.out.println();
		System.out.println("Hi, "+name);
		System.out.println("Your ID: "+ID);
		System.out.println(dept);
		System.out.println(cgpa);
		System.out.println("Graduate: "+isGraduate);
	}

}
