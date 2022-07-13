import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestStudent {

	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<Student> student = new ArrayList<Student>();

		student.add(new Student(201, "Jon Snow", 3.88));
		student.add(new Student(203, "Jon Doe", 3.94));
		student.add(new Student(202, "Jon Kabir", 3.55));

		// Sort the ArrayList
		Collections.sort(student);

		for (int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i).toString());
		}

//		Student[] arr = new Student[3];
//		arr[0] = new Student(201, "Jon Snow", 3.88);
//		arr[1] = new Student(203, "Jon Doe", 3.94);
//		arr[2] = new Student(202, "Jon Kabir", 3.55);
//
//		// sort the Array
//		Arrays.sort(arr);
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i].toString());
//		}

		// Test Clone
		System.out.println("\nTest Clone:\n");
		Student s1 = new Student(111, "Ihsanul Haque", 3.50,new double[] {7.5,9.5,10.0});
		Student s2 = (Student) s1.clone();

		s2.scores[0] = 8.5;
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());

	}

}
