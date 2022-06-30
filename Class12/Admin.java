
public class Admin {

	public static void main(String[] args) {

		Student s1 = new Student("Ihsanul Haque1", 21, 123, 111, 3.88, 201, 100);
		Student s2 = new Student("Ihsanul Haque2", 21, 123, 111, 3.88, 201, 100);
		Student s3 = new Student("Ihsanul Haque3", 21, 123, 111, 3.88, 201, 100);

		Faculty f1 = new Faculty("Monir Uddin1", 21, 123, 111, 211, 100000);
		Faculty f2 = new Faculty("Monir Uddin2", 21, 123, 111, 211, 100000);
		Faculty f3 = new Faculty("Monir Uddin3", 21, 123, 111, 211, 100000);

		// Array of Student
		Student[] s = new Student[3];
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;

		// Array of Faculty
		Faculty[] f = new Faculty[3];
		f[0] = f1;
		f[1] = f2;
		f[2] = f3;

		System.out.println(s[0].toString());
		System.out.println(s[1].toString());
		System.out.println(s[2].toString());
		
		System.out.println(f[0].toString());
		System.out.println(f[1].toString());
		System.out.println(f[2].toString());

	}

}
