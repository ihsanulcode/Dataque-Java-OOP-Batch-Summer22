
public class ConditionalStatements {

	public static void main(String[] args) {
		
		double marks = 87.124;
		
		if(marks > 82) {
			//block of code to be executed if the condition is true
			System.out.println("B+");
		}else if(marks > 72) {
			System.out.println("B-");
		}else if(marks > 62) {
			System.out.println("B");
		}else {
			//block of code to be executed if the condition is false
			System.out.println("C");
		}
		
		//Short Hand if-else
		//Ternary operator
		int time = 20;
		if(time < 28) {
			System.out.println("Good day");
		}else {
			System.out.println("Good noon");
		}
		
		//variable = (condition) ? True : False
		String msg = (time < 18)? "Good Day" : "Good noon";
		System.out.println(msg);

	}

}
