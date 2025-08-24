# Polymorphism in Java

Polymorphism is a fundamental concept in Object-Oriented Programming (OOP) that allows objects to be treated as instances of their parent class rather than their actual class. The word "polymorphism" means "many forms".

## Types of Polymorphism

### 1. Compile-time Polymorphism (Static Polymorphism)
- Achieved by method overloading and constructor overloading.
- The method or constructor to be executed is determined at compile time.

#### a. Method Overloading
Multiple methods with the same name but different parameter lists.

```java
class MathUtils {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

#### b. Constructor Overloading
Multiple constructors with different parameter lists.

```java
class Rectangle {
    int length, width;

    Rectangle() {
        length = width = 0;
    }

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }
}
```

### 2. Runtime Polymorphism (Dynamic Polymorphism)
- Achieved by method overriding.
- The method to be executed is determined at runtime.

#### a. Method Overriding
A subclass provides a specific implementation of a method already defined in its superclass.

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

#### b. Method Shadowing
Occurs when a subclass defines a static method with the same signature as a static method in the superclass.

```java
class Parent {
    static void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child display");
    }
}
```

## Example: Polymorphism in Action

```java
public class Main {
    public static void main(String[] args) {
        // Method Overloading
        MathUtils mu = new MathUtils();
        System.out.println(mu.add(2, 3));
        System.out.println(mu.add(2.5, 3.5));
        System.out.println(mu.add(1, 2, 3));

        // Constructor Overloading
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);

        // Method Overriding
        Animal a = new Animal();
        Animal d = new Dog();
        a.sound(); // Animal makes a sound
        d.sound(); // Dog barks

        // Method Shadowing
        Parent.display(); // Parent display
        Child.display();  // Child display
    }
}
```
