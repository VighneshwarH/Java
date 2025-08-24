# LinkedList in Java Collection Framework

## Introduction
In Java, **LinkedList** is a part of the **Java Collections Framework** and is found in the `java.util` package.  
It is a **doubly linked list implementation** of the **List** and **Deque** interfaces.

Unlike arrays, the size of a `LinkedList` is **dynamic**, and unlike `ArrayList`, it allows for efficient insertion and deletion operations.

---

## Declaration

```java
LinkedList<Type> list = new LinkedList<Type>();
```

Example:
```java
LinkedList<String> names = new LinkedList<String>();
```

---

## Features of LinkedList
- Implements `List`, `Deque`, `Cloneable`, and `Serializable` interfaces.
- Can contain **duplicate elements**.
- Maintains **insertion order**.
- **Not synchronized** (can be synchronized using `Collections.synchronizedList()`).
- Allows `null` elements.

---

## Commonly Used Constructors
1. `LinkedList()` – Creates an empty LinkedList.
2. `LinkedList(Collection c)` – Creates a list containing elements of the specified collection.

---

## Common Methods

| Method | Description |
|--------|-------------|
| `add(E e)` | Appends the specified element to the end |
| `add(int index, E element)` | Inserts element at the given position |
| `addFirst(E e)` | Inserts element at the beginning |
| `addLast(E e)` | Appends element at the end |
| `remove()` | Removes first element |
| `remove(int index)` | Removes element at specified position |
| `removeFirst()` | Removes first element |
| `removeLast()` | Removes last element |
| `get(int index)` | Returns element at index |
| `getFirst()` | Returns first element |
| `getLast()` | Returns last element |
| `set(int index, E element)` | Replaces element at index |
| `size()` | Returns number of elements |
| `clear()` | Removes all elements |
| `contains(Object o)` | Checks if list contains specified element |

---

## Example: Basic Operations

```java
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.addFirst("Orange");
        list.addLast("Grapes");

        // Displaying list
        System.out.println("LinkedList: " + list);

        // Accessing elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Removing elements
        list.remove("Banana");
        list.removeFirst();
        list.removeLast();

        System.out.println("After Removals: " + list);

        // Iterating through LinkedList
        System.out.print("Iterating: ");
        for(String fruit : list) {
            System.out.print(fruit + " ");
        }
    }
}
```

**Output:**
```
LinkedList: [Orange, Apple, Banana, Mango, Grapes]
First Element: Orange
Last Element: Grapes
Element at index 2: Banana
After Removals: [Apple, Mango]
Iterating: Apple Mango
```

---

## Differences Between ArrayList and LinkedList

| Feature | ArrayList | LinkedList |
|---------|-----------|------------|
| Data Structure | Dynamic Array | Doubly Linked List |
| Access Time | Fast (O(1)) | Slow (O(n)) |
| Insertion/Deletion | Slow (shifting needed) | Fast (no shifting needed) |
| Memory Usage | Less (no pointers) | More (stores pointers) |

---

## When to Use LinkedList?
- When frequent **insertions and deletions** are required.
- When memory usage is **not a major concern**.
- When you need a **Deque** (double-ended queue).

---

## Conclusion
`LinkedList` in Java is a powerful data structure when insertions and deletions are frequent.  
However, if fast random access is required, **ArrayList** is a better choice.
