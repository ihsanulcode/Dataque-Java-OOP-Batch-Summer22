import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File file = new File("src/info.txt");
		int numOfPassport = 0;
		Scanner read = null;
		try {
			read = new Scanner(file);
			while (read.hasNext()) {
				read.nextLine();
				numOfPassport++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// array of objects
		Passport[] arr = new Passport[numOfPassport];

		// Array List of Passport
		ArrayList<Passport> list = new ArrayList<Passport>();

		// index tracking
		int index = 0;
		try {
			read = new Scanner(file);
			while (read.hasNext()) {
				String line = read.nextLine();
				String[] str = line.split(",");
				Passport obj = new Passport(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]));
				arr[index] = obj;
				list.add(obj);
				index++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// display passport data from array
		System.out.println("Array of Objects:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}

		// display passport data from array list
		System.out.println("Array List:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		//for-each loop
		System.out.println("Array List (Using For-each loop):");
		for(Passport i : list) {
			System.out.println(i.toString());
		}

	}

}
