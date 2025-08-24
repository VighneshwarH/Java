# Vector in Java Collection Framework

## Introduction
In Java, **Vector** is a class in the `java.util` package that implements a **growable array of objects**.  
It is very similar to an `ArrayList`, but the main difference is that **Vector is synchronized**, making it thread-safe.

---

## Declaration

```java
Vector<Type> vector = new Vector<Type>();
```

Example:
```java
Vector<Integer> numbers = new Vector<Integer>();
```

---

## Features of Vector
- Implements `List`, `RandomAccess`, `Cloneable`, and `Serializable` interfaces.
- Maintains **insertion order**.
- Can contain **duplicate elements**.
- **Thread-safe** because all methods are synchronized.
- Allows `null` elements.

---

## Commonly Used Constructors
1. `Vector()` – Creates an empty vector with default capacity (10).
2. `Vector(int initialCapacity)` – Creates a vector with given initial capacity.
3. `Vector(int initialCapacity, int capacityIncrement)` – Creates a vector with capacity increment steps.
4. `Vector(Collection c)` – Creates a vector containing elements of the specified collection.

---

## Common Methods

| Method | Description |
|--------|-------------|
| `add(E e)` | Appends element at the end |
| `add(int index, E element)` | Inserts element at index |
| `addElement(E obj)` | Adds element at the end |
| `remove(int index)` | Removes element at index |
| `remove(Object o)` | Removes first occurrence of specified element |
| `removeAllElements()` | Removes all elements |
| `elementAt(int index)` | Returns element at index |
| `firstElement()` | Returns first element |
| `lastElement()` | Returns last element |
| `set(int index, E element)` | Replaces element at index |
| `size()` | Returns number of elements |
| `capacity()` | Returns current capacity |
| `contains(Object o)` | Checks if element exists |
| `isEmpty()` | Checks if vector is empty |

---

## Example: Basic Operations

```java
import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Mango");
        vector.addElement("Grapes");

        // Displaying vector
        System.out.println("Vector: " + vector);

        // Accessing elements
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());
        System.out.println("Element at index 2: " + vector.elementAt(2));

        // Removing elements
        vector.remove("Banana");
        vector.remove(0);

        System.out.println("After Removals: " + vector);

        // Iterating through Vector
        System.out.print("Iterating: ");
        for(String fruit : vector) {
            System.out.print(fruit + " ");
        }
    }
}
```

**Output:**
```
Vector: [Apple, Banana, Mango, Grapes]
First Element: Apple
Last Element: Grapes
Element at index 2: Mango
After Removals: [Mango, Grapes]
Iterating: Mango Grapes
```

---

## Differences Between ArrayList and Vector

| Feature | ArrayList | Vector |
|---------|-----------|--------|
| Synchronization | Not synchronized | Synchronized |
| Performance | Faster | Slower (due to synchronization) |
| Legacy | Modern (introduced in Java 1.2) | Legacy class (introduced in Java 1.0) |
| Usage | Preferred in single-threaded apps | Used in multi-threaded apps |

---

## When to Use Vector?
- When working in a **multi-threaded environment** where thread safety is required.
- When you need a **dynamic array** but also need **synchronized methods**.

---

## Conclusion
`Vector` is a legacy class in Java Collections Framework that provides a synchronized dynamic array.  
Although `ArrayList` is generally preferred, `Vector` is still useful in **multi-threaded applications** where thread safety is required.
