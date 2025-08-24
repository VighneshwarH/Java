import java.util.Scanner;
public class ATM {
	private final String name;
	private final BankAccount bankAccount;
	private final Scanner sc;

	public ATM(String name, BankAccount bankAccount, Scanner sc) {
		this.name = name;
		this.bankAccount = bankAccount;
		this.sc = sc;
	}

	public void setPin() {
		System.out.print("Enter account number: ");
		long accNum = sc.nextLong();
		if (bankAccount.getAccountNumber() == accNum) {
			System.out.print("Enter your new 4-digit pin: ");
			int newPin = sc.nextInt();
			if (newPin < 1000 || newPin > 9999) {
				System.out.println("Enter only a 4-digit pin.");
			} else {
				bankAccount.setPin(newPin);
				System.out.println("Pin successfully changed.");
			}
		} else {
			System.out.println("Account not found.");
		}
	}

	public void checkBalance() {
		System.out.print("Enter pin: ");
		int pin = sc.nextInt();
		if (bankAccount.getPin() == pin) {
			System.out.println("Your balance: " + bankAccount.getBalance());
		} else {
			System.out.println("Invalid pin entered. Enter valid pin.");
		}
	}

	public void withdrawCash() {
		System.out.print("Enter pin: ");
		int pin = sc.nextInt();
		if (bankAccount.getPin() == pin) {
			System.out.print("Enter amount to withdraw: ");
			double amount = sc.nextDouble();
			if (amount <= 0) {
				System.out.println("Withdrawal amount must be greater than zero.");
				return;
			}
			if (amount > bankAccount.getBalance()) {
				System.out.println("Insufficient funds! Please check your balance.");
				return;
			}
			boolean success = bankAccount.withdraw(amount);
			if (success) {
				System.out.println("Withdrawal of " + amount + " successful.");
				System.out.println("Balance updated after withdrawal: " + bankAccount.getBalance());
			} else {
				System.out.println("Withdrawal failed. Please check your balance and amount.");
			}
		} else {
			System.out.println("Invalid pin entered. Enter valid pin.");
		}
	}

	public void depositCash() {
		System.out.print("Enter pin: ");
		int pin = sc.nextInt();
		if (bankAccount.getPin() == pin) {
			System.out.print("Enter amount to deposit: ");
			double amount = sc.nextDouble();
			if (amount <= 0) {
				System.out.println("Deposit amount must be greater than zero.");
				return;
			}
			bankAccount.deposit(amount);
			System.out.println("Deposit of " + amount + " successful.");
			System.out.println("Balance updated after deposit: " + bankAccount.getBalance());
		} else {
			System.out.println("Invalid pin entered. Enter valid pin.");
		}
	}
}