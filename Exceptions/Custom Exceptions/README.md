# Custom Exceptions in Java

## Introduction
Java allows developers to create their own **custom exceptions** to handle specific application requirements. 
These exceptions extend either the `Exception` class (for **checked exceptions**) or the `RuntimeException` class (for **unchecked exceptions**).

Custom exceptions make programs **more meaningful, readable, and domain-specific**.

---

## Key Points
- Custom exceptions can be created by **extending Exception** (Checked Exception) or **extending RuntimeException** (Unchecked Exception).
- They can include **custom messages**, fields, and methods.
- Improve error reporting by making exceptions **application-specific**.

---

## Example 1: AgeException (Checked Exception)

```java
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above to vote!");
        } else {
            System.out.println("Valid Age: Eligible to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15); // Invalid age
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
```

---

## Example 2: InvalidLoginException (Unchecked Exception)

```java
class InvalidLoginException extends RuntimeException {
    public InvalidLoginException(String message) {
        super(message);
    }
}

public class LoginSystem {
    static void login(String username, String password) {
        if (!"admin".equals(username) || !"1234".equals(password)) {
            throw new InvalidLoginException("Invalid username or password!");
        }
        System.out.println("Login Successful!");
    }

    public static void main(String[] args) {
        try {
            login("user", "wrongpass"); // Invalid credentials
        } catch (InvalidLoginException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
```

---

## Example 3: InsufficientFundsException (Checked Exception)

```java
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal denied! Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(6000); // Attempt to withdraw more than balance
        } catch (InsufficientFundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
```

---

## When to Use Checked vs Unchecked Custom Exceptions
| Criteria                 | Checked Exceptions                        | Unchecked Exceptions |
|---------------------------|-------------------------------------------|----------------------|
| **Inheritance**          | Extend `Exception`                        | Extend `RuntimeException` |
| **Handling Required**    | Must be handled with `try-catch/throws`   | Optional             |
| **Use Case**             | For recoverable conditions (e.g., banking errors, file errors) | For programming errors (e.g., invalid login, illegal arguments) |

---

## Advantages of Custom Exceptions
- Provide **clear and meaningful error messages**.
- Make debugging easier by being domain-specific.
- Encourage **modular and maintainable** code.
- Allow separation of **business logic** from **error handling**.

---

## Conclusion
Custom exceptions in Java enable developers to create application-specific error handling mechanisms. 
They enhance program readability, provide better debugging information, and ensure robust error management for both **checked** and **unchecked** scenarios.
