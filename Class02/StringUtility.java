
public class StringUtility {

	public static void main(String[] args) {
		//String methods
		String name = "1234";
		String course1 = "CSE115";
		String course2 = "CSE215";
		//System.out.println(name.length());
		System.out.println(course1.equals(course2));
		
		//Math class
		int n = 25;
		System.out.println(Math.sqrt(n));
		
		int base = 2;
		int power = 3;
		System.out.println(base+"^"+power+" is "+(int)Math.pow(base, power));
		
		//type casting
		int p = 5;
		double c = 5.5;
		System.out.println((int)c);
		System.out.println((double)p);
		

	}

}
