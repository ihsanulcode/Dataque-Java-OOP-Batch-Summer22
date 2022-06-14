import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> id = new ArrayList<Integer>();
		
		id.add(201); //0
		id.add(203); //1
		id.add(202); //2
		
		
		
		id.remove(2);
		for (int i = 0; i < id.size(); i++) {
			System.out.println(id.get(i));
		}

	}

}
