import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class studentRecord {

	public static void main(String[] args) {

		File file = new File("src/student.txt");
		try {
			Scanner reader = new Scanner(file);
			double sum = 0;
			int count = 0;
			while (reader.hasNext()) {
				String data = reader.nextLine();
				String[] str = data.split(" ");
				System.out.println(
						"FirstName=" + str[0] + ", LastName=" + str[1] + ", ID=" + str[2] + ", Cgpa=" + str[3]);
				sum += Double.parseDouble(str[3]);
				count++;
			}
			System.out.println("Sum=" + sum);
			System.out.println("AverageCgpa=" + (sum / count));
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
