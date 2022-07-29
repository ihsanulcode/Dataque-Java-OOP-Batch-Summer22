
public class TestAccount {

	public static void main(String[] args) {
		Account ac = null;

		try {
			ac = new Account(1111, 5000, "abcd");
			ac.login(1111, "abcd");
			System.out.println(ac.toString());
			ac.credit(5000);
			System.out.println(ac.toString());
			ac.debit(2000);
			System.out.println(ac.toString());
			ac.debit(8000);
			System.out.println(ac.toString());
		} catch (InvalidAccountException | InvalidBalanceException | InvalidPasswordException ex) {
			System.out.println(ex);
		} catch (InvalidWithdrawAmountException ex) {
			System.out.println(ex);
		}

		System.out.println(ac.toString());
		ac.logout();

	}

}
