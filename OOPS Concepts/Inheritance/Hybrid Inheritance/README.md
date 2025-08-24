# Hybrid Inheritance in Java

Hybrid inheritance is a combination of two or more types of inheritance (single, multiple, multilevel, hierarchical) in a single program. In Java, hybrid inheritance is achieved using interfaces because Java does not support multiple inheritance with classes.

## Example: OnlineStore Payment System

Below is an example demonstrating hybrid inheritance in Java. The `OnlineStore` class implements two interfaces: `CreditCardPayment` and `PayPalPayment`, allowing it to process payments via both methods.

```java
// Interface for credit card payments
interface CreditCardPayment {
    void payByCreditCard(double amount);
}

// Interface for PayPal payments
interface PayPalPayment {
    void payByPayPal(double amount);
}

// OnlineStore implements both payment interfaces
class OnlineStore implements CreditCardPayment, PayPalPayment {
    @Override
    public void payByCreditCard(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }

    @Override
    public void payByPayPal(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

public class Main {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();
        store.payByCreditCard(100.0);
        store.payByPayPal(50.0);
    }
}
```

## Explanation

- **Interfaces**: `CreditCardPayment` and `PayPalPayment` define payment methods.
- **OnlineStore Class**: Implements both interfaces, inheriting their abstract methods.
- **Hybrid Inheritance**: Achieved by combining multiple interfaces in a single class.

## Key Points

- Java uses interfaces to support hybrid inheritance.
- Hybrid inheritance helps in designing flexible and modular systems.
- Avoids ambiguity and diamond problem present in multiple inheritance with classes.

