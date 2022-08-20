
public class Test_2 {

	public static void main(String[] args) {
		// System.out.println();
		printAll(args);
	}

	public static void printAll(String[] lines) {
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
