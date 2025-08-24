# Abstraction in Java

## Introduction
Abstraction in Java is one of the core concepts of Object-Oriented Programming (OOP). 
It is the process of hiding implementation details and showing only the essential features of an object. 
This allows developers to focus on *what an object does* rather than *how it does it*.

---

## Key Points
- Abstraction is achieved in Java using **Abstract Classes** and **Interfaces**.
- It helps reduce complexity by hiding unnecessary details.
- Provides a clear separation between *implementation* and *behavior*.
- Encourages **loose coupling** in code design.

---

## Abstract Classes
- Declared using the `abstract` keyword.
- Cannot be instantiated directly.
- Can have both **abstract methods** (without implementation) and **concrete methods** (with implementation).
- Used when you want to share code among several related classes but also want to enforce implementation of specific methods.

### Example:
```java
abstract class Animal {
    abstract void sound();

    void breathe() {
        System.out.println("Breathing...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Barks");
    }
}

class Main {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
        obj.breathe();
    }
}
```

---

## Interfaces
- Declared using the `interface` keyword.
- Defines a contract of methods that implementing classes must follow.
- All methods in interfaces are **implicitly abstract and public** (before Java 8).
- From Java 8 onwards, interfaces can have **default** and **static methods**.
- A class can implement multiple interfaces, supporting **multiple inheritance**.

### Example:
```java
interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}
```

---

## Difference between Abstract Class and Interface

| Feature                | Abstract Class                              | Interface                                      |
|-------------------------|---------------------------------------------|-----------------------------------------------|
| **Methods**             | Can have abstract and concrete methods      | Only abstract methods (Java 7); default, static methods (Java 8+) |
| **Multiple Inheritance**| Not supported                               | Supported                                     |
| **Access Modifiers**    | Can have any access modifier                | Methods are `public` by default               |
| **Variables**           | Can have instance and static variables      | Only `public static final` constants          |
| **Constructor**         | Can have constructors                       | Cannot have constructors                      |

---

## Real-life Example of Abstraction
Think of a **car**:
- You know how to start, stop, and drive the car (interface/abstract methods).
- You don’t need to know the exact internal combustion process, fuel injection, or engine design (hidden implementation).

This is **abstraction** — showing only what is necessary and hiding the details.

---

## Advantages of Abstraction
- Reduces code complexity.
- Increases reusability of code.
- Provides a clear separation between interface and implementation.
- Enhances maintainability of applications.

---

## Conclusion
Abstraction in Java is a powerful OOP concept that helps in designing flexible and maintainable applications. 
By using **abstract classes** and **interfaces**, developers can define a blueprint for other classes, ensuring consistency while hiding unnecessary implementation details.
