## Abstract Classes
- Declared using the `abstract` keyword.
- Cannot be instantiated directly.
- Can have both **abstract methods** (without implementation) and **concrete methods** (with implementation).
- Used when you want to share code among several related classes but also want to enforce implementation of specific methods.

### Example:
```java
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

```

- Payment is an abstract class.
- Concrete methods (paymentDetails) are common for all payments.
- Abstract method (pay) forces each payment type to provide its own implementation.