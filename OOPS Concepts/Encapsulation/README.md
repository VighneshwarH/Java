
# Encapsulation in Java

## 📌 Introduction
**Encapsulation** is one of the four fundamental OOP concepts in Java.  
It refers to the **wrapping of data (variables) and methods (functions) into a single unit** (class).  
It helps protect the data from outside interference and misuse.

In Java, encapsulation is typically achieved by:  
1. Declaring variables as **private**.  
2. Providing **public getter and setter methods** to access and update the values.

---

## 🔹 Need for Encapsulation
1. **Data Hiding** – Sensitive data is hidden from direct access.  
2. **Controlled Access** – Provides controlled access to variables using getters and setters.  
3. **Improved Security** – Prevents unauthorized access to critical data.  
4. **Code Flexibility & Maintainability** – Internal implementation can be changed without affecting external code.  
5. **Better Modularity** – Combines variables and methods in a single class.

---

## 📌 Example 1: Basic Encapsulation

```java
class BankAccount {
    private double balance; // private variable

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(5000); // setting balance
        System.out.println("Account Balance: " + account.getBalance());
    }
}
```

### ✅ Output:
```
Account Balance: 5000.0
```

---

## 📌 Example 2: Security with Encapsulation

```java
class Student {
    private String name;
    private int age;

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John");
        s.setAge(21);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
```

### ✅ Output:
```
Name: John
Age: 21
```

---

## 📌 Conclusion
Encapsulation in Java ensures:  
- **Data hiding and security**  
- **Controlled access through getters and setters**  
- **Improved flexibility and maintainability**  
- **Better modular and clean code**  

It is a fundamental concept that makes programs **more secure, modular, and easier to manage**.

---

