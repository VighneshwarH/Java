interface CreditCardPayment {
    void payWithCreditCard(double amount);
}

interface PayPalPayment {
    void payWithPayPal(double amount);
}

public class OnlineStore implements CreditCardPayment, PayPalPayment {
    public void payWithCreditCard(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }

    public void payWithPayPal(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        store.payWithCreditCard(100.0);
        store.payWithPayPal(50.0);
    }
}