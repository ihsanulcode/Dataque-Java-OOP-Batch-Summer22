import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FILEIO {

	public static void main(String[] args) {

		//write to file
		try {
			FileWriter file = new FileWriter("src/test.txt");
			file.write("Hello World!\n");
			file.write("Hello World!\n");
			file.write("Hello World!\n");
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Read from file
		File file = new File("src/test.txt");
		try {
			Scanner read = new Scanner(file);
			while(read.hasNext()) {
				String data = read.nextLine();
				System.out.println(data);
			}
			read.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
