import java.util.Scanner;
public class ATMDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your account number: ");
		long accountNum = sc.nextLong();
		// Initial balance and pin can be customized
		BankAccount bankAccount = new BankAccount(accountNum, 5000.0, 1234);
		ATM atm = new ATM(name, bankAccount, sc);

		while (true) {
			System.out.println("\n1. Set Pin");
			System.out.println("2. Check Balance");
			System.out.println("3. Withdraw Cash");
			System.out.println("4. Deposit Cash");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					atm.setPin();
					break;
				case 2:
					atm.checkBalance();
					break;
				case 3:
					atm.withdrawCash();
					break;
				case 4:
					atm.depositCash();
					break;
				case 5:
					System.out.println("Thank you for using the ATM. Goodbye!");
					sc.close();
					return;
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}