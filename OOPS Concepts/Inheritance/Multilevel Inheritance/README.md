# 🐾 Java OOPs: Multilevel Inheritance Example

## 📌 What is Multilevel Inheritance?
- **Multilevel Inheritance** is a type of inheritance where a class is derived from another derived class.  
- It forms a **chain of inheritance**.  
- Example: `Animal → Mammal → Domestic_Animal → Dog`

---

## 🏗️ Class Hierarchy
```
Animal
   │
   └── Mammal
          │
          └── Domestic_Animal
                    │
                    └── Dog
```

---

## 📂 Files in this Project
1. **Animal.java** – Base class with general properties.  
2. **Mammal.java** – Inherits from `Animal`.  
3. **Domestic_Animal.java** – Inherits from `Mammal`.  
4. **Dog.java** – Inherits from `Domestic_Animal`.  
5. **Main.java** – Runs the program and demonstrates inheritance.  

---

## 📜 Code Walkthrough with Explanations

### 🔹 Animal.java
```java
class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}
```
- **Class `Animal`** → Base class (superclass).  
- **Method `eat()`** → Prints a general statement about animals eating.  
  - No variables are declared here.  
  - Every class that extends `Animal` will automatically **inherit** this method.

---

### 🔹 Mammal.java
```java
class Mammal extends Animal {
    void breathe() {
        System.out.println("Mammals breathe air.");
    }
}
```
- **Class `Mammal`** → Extends `Animal`, hence inherits the `eat()` method.  
- **Method `breathe()`** → Prints a statement about mammals breathing air.  

---

### 🔹 Domestic_Animal.java
```java
class Domestic_Animal extends Mammal {
    void liveWithHumans() {
        System.out.println("Domestic animals live with humans.");
    }
}
```
- **Class `Domestic_Animal`** → Extends `Mammal`, so it inherits both `eat()` (from `Animal`) and `breathe()` (from `Mammal`).  
- **Method `liveWithHumans()`** → Defines the behavior of domestic animals living with humans.  

---

### 🔹 Dog.java
```java
class Dog extends Domestic_Animal {
    void bark() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}
```
- **Class `Dog`** → Extends `Domestic_Animal`.  
- Inherits:  
  - `eat()` from **Animal**  
  - `breathe()` from **Mammal**  
  - `liveWithHumans()` from **Domestic_Animal**  
- **Method `bark()`** → Defines a dog’s specific behavior (barking).  

---

### 🔹 Main.java
```java
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();            // from Animal
        d.breathe();        // from Mammal
        d.liveWithHumans(); // from Domestic_Animal
        d.bark();           // from Dog
    }
}
```
- **Class `Main`** → Contains the entry point of the program (`main` method).  
- **Object `Dog d = new Dog();`** → Creates an instance of `Dog`.  
- Method calls:  
  - `d.eat();` → Calls the `eat()` method inherited from `Animal`.  
  - `d.breathe();` → Calls the `breathe()` method from `Mammal`.  
  - `d.liveWithHumans();` → Calls the method from `Domestic_Animal`.  
  - `d.bark();` → Calls the method defined in `Dog`.  

---

## 🖥️ Sample Output
```
Animals eat food.
Mammals breathe air.
Domestic animals live with humans.
Dog barks: Woof! Woof!
```

---

## 🎯 Key Points
- `Dog` inherits all methods from **Domestic_Animal, Mammal, and Animal**.  
- This shows how features **accumulate** through the inheritance chain.  
- Multilevel inheritance helps in **reusability** and **hierarchical classification**.  

---

## 📚 Learn More
- [Java Inheritance - Official Oracle Docs](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)  
- [GeeksforGeeks: Inheritance in Java](https://www.geeksforgeeks.org/inheritance-in-java/)  
- [W3Schools: Java Inheritance](https://www.w3schools.com/java/java_inheritance.asp)  

---

✨ This project demonstrates **Java Multilevel Inheritance** clearly with real-world analogy of **Animals → Mammals → Domestic Animals → Dog**.
