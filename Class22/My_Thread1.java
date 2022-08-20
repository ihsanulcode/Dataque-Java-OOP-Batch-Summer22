
class My_Thread1 extends Thread {

	public static void main(String[] args) {
		My_Thread1 t = new My_Thread1();
		t.start();
		System.out.println("One. ");
		t.start();
		System.out.println("Two. ");
	}

	public void run() {
		System.out.println("thread ");
	}

}
