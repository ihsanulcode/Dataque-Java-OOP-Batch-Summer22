import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		//Random class
		Random random = new Random();
		
		int number = random.nextInt(10-1+1)+1; //(upper-lower+1)+lower
		System.out.println(number);

	}

}
