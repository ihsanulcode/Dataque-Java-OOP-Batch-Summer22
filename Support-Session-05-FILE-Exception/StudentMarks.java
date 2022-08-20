import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student {
	private String name;
	private int id;
	private double marks;

	public Student() {

	}

	public Student(String name, int id, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getMarks() {
		return marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}

}

public class StudentMarks {

	public static void main(String[] args) {
		Scanner input = null;
		File file = new File("src/StudentData.txt");

		// find the number of student from file records
		int numOfStudent = 0;
		try {
			input = new Scanner(file);
			while (input.hasNext()) {
				input.nextLine();
				numOfStudent++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// declaring Student array
		Student[] arr = new Student[numOfStudent];

		// read data from file
		int index = 0;
		try {
			input = new Scanner(file);
			while (input.hasNext()) {
				String line = input.nextLine();
				String[] str = line.split(" ");
				arr[index] = new Student(str[0], Integer.parseInt(str[1]), Double.parseDouble(str[2]));
				index++;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// call toString method for every student objects
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i].toString());
//		}

		// find maximum marks index
		int MAXIndex = 0;
		double max = arr[0].getMarks();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getMarks() > max) {
				max = arr[i].getMarks();
				MAXIndex = i;
			}
		}

		// find minimum marks index
		int MINIndex = 0;
		double min = arr[0].getMarks();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getMarks() < min) {
				min = arr[i].getMarks();
				MINIndex = i;
			}
		}

		// display max and min marks holders toString()
		// System.out.println("Topper: " + arr[MAXIndex].toString());
		// System.out.println("Average: " + arr[MINIndex].toString());

		// write informations to result.txt file
		try {
			FileWriter newFile = new FileWriter("src/result.txt");
			newFile.write("Topper: " + arr[MAXIndex].toString());
			newFile.write("\n");
			newFile.write("Average: " + arr[MINIndex].toString());
			newFile.close();
			System.out.println("Successfully write into result.txt file.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
