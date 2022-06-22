
public class ATMBooth {

	public static void main(String[] args) {

		Account ac = new Account(2013664, 5000.0, 9090);
		ac.LogIn(9090);
		System.out.println(ac.toString());
		ac.credit(10000);
		System.out.println(ac.toString());
		ac.debit(5000);
		System.out.println(ac.toString());
		ac.LogOut();
		// ac.credit(1000);

	}

}
