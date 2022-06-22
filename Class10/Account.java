//Bank Account
public class Account {
	// data fields
	private int accountNumber;
	private double balance = 0.0;
	private int PIN;
	private boolean isLogIn = false;

	public Account(int accountNumber, double balance, int PIN) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.PIN = PIN;
	}

	public Account(int accountNumber, int PIN) {
		this.accountNumber = accountNumber;
		this.PIN = PIN;
	}

	// getters-setters methods
	// accesors-mutators
	public int getAccountNumber() {
		if (isLogIn)
			return this.accountNumber;
		else
			return -1;
	}

	public double getBalance() {
		if (isLogIn)
			return this.balance;
		else
			return -1;
	}

	public void setBalance(double balance) {
		if (isLogIn)
			this.balance = balance;
	}

	public void setPIN(int newPIN) {
		PIN = newPIN;
	}

	public void credit(double amount) {
		if (isLogIn) {
			if (amount > 0)
				this.balance += amount;
			else
				System.out.println("Invalid amount!");
		} else {
			System.out.println("Please enter secret number!");
		}
	}

	public void debit(double amount) {
		if (isLogIn) {
			if (this.balance >= amount)
				this.balance -= amount;
			else
				System.out.println("Amount exceeds the current balance!");
		} else {
			System.out.println("Please enter secret number!");
		}
	}

	public String toString() {
		if (isLogIn) {
			return "A/C no:" + this.accountNumber + ", Balance=$" + this.balance;
		}
		return "Please enter secret number!";

	}

	public void LogIn(int PIN) {
		if (this.PIN == PIN)
			this.isLogIn = true;
	}

	public void LogOut() {
		this.isLogIn = false;
	}
}
