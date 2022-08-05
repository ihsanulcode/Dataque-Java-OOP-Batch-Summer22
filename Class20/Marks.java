import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {

		try {
			File file = new File("src/marks.txt");
			Scanner reader = new Scanner(file);

			double sum = 0;
			int count = 0;
			while (reader.hasNext()) {
				double mark = Double.parseDouble(reader.nextLine());
				sum += mark;
				count++;
			}
			double avg = sum/count;
			System.out.println("Sum: " + sum);
			System.out.println("Average marks: "+avg);
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
