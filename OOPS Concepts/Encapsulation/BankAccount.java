public class BankAccount {
	private final long accountNumber;
	private double balance;
	private int pin;

	public BankAccount(long accountNumber, double balance, int pin) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.pin = pin;
	}

	public double getBalance() {
		return this.balance;
	}

	public int getPin() {
		return this.pin;
	}

	public void setPin(int newPin) {
		this.pin = newPin;
	}

	public long getAccountNumber() {
		return this.accountNumber;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		}
	}

	public boolean withdraw(double amount) {
		if (amount > balance) {
			return false;
		}
		if (amount <= 0) {
			return false;
		}
		this.balance -= amount;
		return true;
	}
}