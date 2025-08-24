# Non-Primitive TypeCasting in Java (Upcasting and DownCasting)

In Java, **type casting** is the process of converting one type into another.  
For **non-primitive types (objects)**, typecasting is only possible between objects of parent and child classes.

---

## 1. Upcasting (Widening Reference Conversion)

- **Definition:** Converting a subclass reference into a superclass reference.  
- **Happens:** Implicitly or explicitly.  
- **Safe Casting:** Since every subclass is a type of its superclass, this is safe.

### Example:
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
    void run() {
        System.out.println("Dog runs fast");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();  // Upcasting
        a.sound();             // Calls Dog's overridden method
        // a.run();  // ❌ Not accessible because reference is of type Animal
    }
}
```
### Output:
```
Dog barks
```

---

## 2. Downcasting (Narrowing Reference Conversion)

- **Definition:** Converting a superclass reference back into a subclass reference.  
- **Happens:** Explicitly.  
- **Risky:** Can throw **ClassCastException** if the object is not actually of the subclass type.

### Example:
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
    void run() {
        System.out.println("Dog runs fast");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();   // Upcasting
        Dog d = (Dog) a;        // Downcasting
        d.sound();              // Calls Dog's method
        d.run();                // Now accessible
    }
}
```

### Output:
```
Dog barks
Dog runs fast
```

---

## 3. Invalid Downcasting Example
```java
Animal a = new Animal();
Dog d = (Dog) a;  // ❌ Runtime error (ClassCastException)
```

---

## Key Points:
- Upcasting: Safe, implicit or explicit, but limited to parent class methods.  
- Downcasting: Explicit, risky, requires actual object to be of subclass type.  
- **`instanceof` operator** can be used before downcasting to avoid `ClassCastException`.

### Example with `instanceof`:
```java
if (a instanceof Dog) {
    Dog d = (Dog) a;
    d.run();
}
```
