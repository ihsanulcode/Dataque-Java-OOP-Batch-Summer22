import java.util.ArrayList;

public class ArrayListBasic {

	public static void main(String[] args) {
		// declaring an ArrayList
		ArrayList<Double> cgpa = new ArrayList<Double>();

		cgpa.add(3.88); // 0
		cgpa.add(3.68); // 1
		cgpa.add(3.58); // 2
		cgpa.add(3.48); // 3
		cgpa.add(3.08); // 4
		
		for (int i = 0; i < cgpa.size(); i++) {
			System.out.println(cgpa.get(i));
		}
		
		System.out.println(cgpa.indexOf(4.00));
	}

}
