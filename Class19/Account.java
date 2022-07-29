
public class Account {
	private int accountNumber;
	private double balance = 0.0;
	private String password;
	private boolean isLogin = false;

	public Account() {
	}

	public Account(int accountNumber, double balance, String password)
			throws InvalidAccountException, InvalidBalanceException, InvalidPasswordException {
		this.setAccountNumber(accountNumber);
		this.setBalance(balance);
		this.setPassword(password);
		System.out.println("Account created!");
	}

	public void login(int accountNumber, String password) throws InvalidAccountException, InvalidPasswordException {
		if (this.accountNumber == accountNumber && this.password.equals(password)) {
			this.isLogin = true;
			System.out.println("Welcome Back!, @" + this.accountNumber);
		} else if (!(this.accountNumber == accountNumber)) {
			throw new InvalidAccountException("Invalid A/C number!");
		} else if (!(this.password.equals(password))) {
			throw new InvalidPasswordException("Incorrect password!");
		}
	}

	public void logout() {
		if (isLogin) {
			this.isLogin = false;
			System.out.println("Thank you for banking with us!");
		}

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public String getPassword() {
		return password;
	}

	public void setAccountNumber(int accountNumber) throws InvalidAccountException {
		if (Integer.toString(accountNumber).length() == 4) {
			this.accountNumber = accountNumber;
		} else {
			throw new InvalidAccountException("A/C numbers should be 4 digit!");
		}
	}

	public void setBalance(double balance) throws InvalidBalanceException {
		if (balance >= 5000.0) {
			this.balance = balance;
		} else {
			throw new InvalidBalanceException("Account opening balance min 5,000 BDT");
		}
	}

	public void setPassword(String password) throws InvalidPasswordException {
		if (password.length() >= 4) {
			this.password = password;
		} else {
			throw new InvalidPasswordException("Password can't be less then 4 characters!");
		}
	}

	public void credit(double amount) {
		if (isLogin)
			this.balance += amount;
	}

	public void debit(double amount) throws InvalidWithdrawAmountException {
		if (isLogin) {
			if (amount >= this.balance) {
				throw new InvalidWithdrawAmountException("Amount withdrawn exceeds the current balance!");
			} else {
				this.balance -= amount;
			}
		}
	}

	@Override
	public String toString() {
		if (isLogin)
			return "A/C no: " + this.accountNumber + ", Balance: " + this.balance;
		else
			return null;
	}
}
