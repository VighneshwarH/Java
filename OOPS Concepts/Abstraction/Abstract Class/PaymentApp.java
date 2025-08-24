// Abstract class
abstract class Payment {
    abstract void pay(double amount);  // Abstract method

    // Concrete method (common for all payment methods)
    void paymentDetails(double amount) {
        System.out.println("Payment of ₹" + amount + " initiated.");
    }
}

// CreditCard payment
class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

// UPI payment
class UpiPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.paymentDetails(1500);
        p1.pay(1500);

        System.out.println();

        Payment p2 = new UpiPayment();
        p2.paymentDetails(500);
        p2.pay(500);
    }
}
