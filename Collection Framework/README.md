
# 📘 Java Collection Framework – Detailed Introduction

## 1. 🌟 What is a Collection Framework?
- A **Collection Framework** in Java is a **unified architecture** that provides a set of **classes and interfaces** to store and manipulate groups of objects.  
- Before Java 2 (JDK 1.2), developers had to use **arrays**, **Vectors**, or **Hashtables**, which were not flexible enough.  
- The Collection Framework was introduced in **Java 2** to solve these limitations.

---

## 2. 🌟 Features of Collection Framework
1. **Unified architecture** → same interfaces for different data structures.  
2. **Dynamic** → collections can grow/shrink in size at runtime (unlike arrays).  
3. **Predefined data structures** → List, Set, Queue, Map, etc.  
4. **Ready-made algorithms** → searching, sorting, shuffling (`Collections` class).  
5. **High performance** → optimized implementations.  
6. **Reduces programming effort** → reusable classes and interfaces.  

---

## 3. 🌟 The Collection Framework Hierarchy

Here’s the simplified diagram of the **Collection Framework**:

```
                Iterable (Interface)
                       |
                 Collection (Interface)
             /           |             \
          List          Set           Queue
      (ArrayList,   (HashSet,       (LinkedList,
       LinkedList,   TreeSet)        PriorityQueue)
       Vector)

                Map (Interface)
            (HashMap, TreeMap, Hashtable, LinkedHashMap)
```

---

## 4. 🌟 Key Interfaces of Collection Framework

### 🔹 4.1 Iterable (Root Interface)
- Root interface of the collection hierarchy.
- Provides the method:
  - `Iterator<T> iterator()` → used to traverse elements one by one.
- Extended by `Collection` interface.

---

### 🔹 4.2 Collection Interface
- The **base interface** for all collections (except Map).  
- Defines **basic operations**:
  - `add(E e)` → add element  
  - `remove(Object o)` → remove element  
  - `size()` → number of elements  
  - `isEmpty()` → check if empty  
  - `iterator()` → get iterator  

👉 All other interfaces like **List, Set, and Queue** extend `Collection`.

---

### 🔹 4.3 List Interface
- Ordered collection (sequence).  
- Allows **duplicate elements**.  
- Access via **index**.  

**Implementations:**
- `ArrayList` → dynamic array  
- `LinkedList` → doubly linked list  
- `Vector` → legacy class (synchronized)  
- `Stack` → subclass of Vector  

---

### 🔹 4.4 Set Interface
- Unordered collection of **unique elements** (no duplicates).  

**Implementations:**
- `HashSet` → stores unique elements, no order guaranteed  
- `LinkedHashSet` → maintains insertion order  
- `TreeSet` → stores elements in **sorted order**  

---

### 🔹 4.5 Queue Interface
- Used to hold elements in a **FIFO (First-In-First-Out)** manner.  

**Implementations:**
- `PriorityQueue` → elements ordered by priority  
- `LinkedList` → can be used as a queue  

---

### 🔹 4.6 Map Interface (NOT part of Collection)
- A `Map` represents a collection of **key-value pairs**.  
- Keys are unique; values can be duplicated.  
- Not a child of `Collection` but part of Collection Framework.  

**Implementations:**
- `HashMap` → stores key-value pairs, no order guaranteed  
- `LinkedHashMap` → maintains insertion order  
- `TreeMap` → stores key-value pairs in sorted order  
- `Hashtable` → legacy synchronized class  

---

## 5. 🌟 Advantages of Using Collection Framework
- Increases **code reusability**.  
- Provides **ready-made data structures**.  
- Offers **built-in algorithms** (sorting, searching, etc.).  
- Reduces **development time**.  
- Ensures **type safety** using Generics.  

---

## 6. 🌟 Example Program

```java
import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // Example with List (ArrayList)
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("List Example:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Example with Set (HashSet)
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20); // duplicate, won't be added

        System.out.println("\nSet Example:");
        for (int num : set) {
            System.out.println(num);
        }

        // Example with Map (HashMap)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("\nMap Example:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
```

---

✅ This gives a **clear and detailed introduction** to Java Collection Framework and the **Collection interface**, with diagrams and examples.
