
# Single-Level Inheritance in Java

## 📌 Introduction
**Single-level inheritance** is a type of inheritance where a child class inherits directly from a single parent class.  
It allows the child class to reuse the methods and variables of the parent class, while also adding its own specific features.

---

## 🔹 Need for Single-Level Inheritance
1. **Code Reusability** – Reuse fields and methods of the parent class.  
2. **Code Maintenance** – Update common logic in one place (parent class).  
3. **Improved Structure** – General behavior goes in the parent, specialized behavior in the child.  
4. **Supports Polymorphism** – Child can override parent methods.

---

## 📌 Example 1: Basic Single-Level Inheritance

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited from Animal
        d.bark();  // Defined in Dog
    }
}
```

### ✅ Output:
```
This animal eats food
Dog barks
```

---

## 📌 Example 2: Method Overriding (Polymorphism)

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

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Overridden method in Dog
    }
}
```

### ✅ Output:
```
Dog barks
```

---

## 📌 Conclusion
Single-level inheritance in Java helps in:  
- **Reusing code efficiently**  
- **Maintaining clarity in program structure**  
- **Reducing redundancy**  
- **Enabling polymorphism**  

It is the **simplest form of inheritance**, forming the foundation for more advanced types like **multilevel** and **hierarchical inheritance**.

---


