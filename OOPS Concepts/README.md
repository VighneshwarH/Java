
# OOPS in Java

This document provides a structured overview of the **Object-Oriented Programming System (OOPS)** concepts in Java, along with explanations and examples.

---

## 📌 1. Classes & Objects
- **Class**: A blueprint for creating objects (a template that defines fields and methods).
- **Object**: An instance of a class, representing a real-world entity.

```java
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Tesla";
        myCar.speed = 120;
        myCar.drive();
    }
}
```

---

## 📌 2. Global Variables
- Variables declared inside a class but outside methods, constructors, or blocks.
- Accessible by all methods in the class.

```java
class Student {
    String name; // global variable
    int age;     // global variable
}
```

---

## 📌 3. Static Keywords & Blocks
- **Static variables**: Shared among all objects of a class.
- **Static methods**: Can be called without creating an object.
- **Static block**: Executes once when the class is loaded.

```java
class Demo {
    static int count = 0;

    static {
        System.out.println("Static block executed.");
    }

    static void display() {
        System.out.println("Count: " + count);
    }
}
```

---

## 📌 4. Constructors and `this` Keyword
- **Constructor**: Special method used to initialize objects.
- **this**: Refers to the current object.

```java
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

## 📌 5. Inheritance
- Mechanism where one class acquires properties and behaviors of another class using `extends`.

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## 📌 6. Polymorphism
- **Compile-time (Method Overloading)** and **Runtime (Method Overriding)**.

```java
class MathUtils {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; } // Overloading
}

class Shape {
    void draw() { System.out.println("Drawing Shape"); }
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); } // Overriding
}
```

---

## 📌 7. Abstraction
- Hiding implementation details and showing only the functionality.
- Achieved using **abstract classes** and **interfaces**.

```java
abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a kick");
    }
}
```

---

## 📌 8. Encapsulation
- Wrapping variables and methods together in a class.
- Achieved using **private variables** with **getters and setters**.

```java
class BankAccount {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
```

---

## 📌 9. Final Keyword
- **final variable**: Cannot be changed once initialized.
- **final method**: Cannot be overridden.
- **final class**: Cannot be inherited.

```java
final class Constants {
    final double PI = 3.14159;
}
```

---

## ✅ Conclusion
Java’s **OOPS concepts** help in creating reusable, maintainable, and scalable software.  
Mastering these concepts is essential for strong Java programming skills.

---

