
# 📘 Java Collection Framework – List Interface

## 1. 🌟 Introduction to List
- `List` is a **child interface** of `Collection` in Java.  
- It is an **ordered collection** (also known as a **sequence**) that allows:  
  - **Duplicate elements**  
  - **Null values**  
- Elements in a list can be **accessed by index** (just like arrays).  
- `List` is widely used when the order of insertion matters.  

---

## 2. 🌟 Features of List Interface
1. Maintains **insertion order**.  
2. Allows **duplicate elements**.  
3. Supports **positional access** (get, set, remove by index).  
4. Provides methods for **searching** elements.  
5. Supports **iteration** using `for-each`, `Iterator`, and `ListIterator`.  

---

## 3. 🌟 List Interface Hierarchy

```
                Collection (Interface)
                        |
                      List (Interface)
           /                |                 \
     ArrayList          LinkedList           Vector
                                             |
                                           Stack
```

---

## 4. 🌟 Commonly Used Classes of List

### 🔹 4.1 ArrayList
- Resizable/dynamic array implementation.  
- Provides **fast random access** (index-based).  
- Slower in insertion/deletion (compared to LinkedList).  
- Not synchronized.  

👉 Example: Storing student names in a dynamic list.

---

### 🔹 4.2 LinkedList
- Doubly linked list implementation.  
- Faster insertion/deletion (compared to ArrayList).  
- Can also act as a **Queue** and **Deque**.  

👉 Example: Task scheduling system.

---

### 🔹 4.3 Vector (Legacy)
- Dynamic array (similar to ArrayList).  
- **Thread-safe** (synchronized).  
- Slower than ArrayList due to synchronization overhead.  

👉 Example: Legacy projects requiring thread-safe collection.

---

### 🔹 4.4 Stack (Subclass of Vector)
- **LIFO (Last-In-First-Out)** data structure.  
- Methods:  
  - `push(E item)` → Add item  
  - `pop()` → Remove and return top element  
  - `peek()` → View top element without removal  

👉 Example: Undo/Redo operations in editors.

---

## 5. 🌟 Important Methods of List
- `add(E e)` → adds element  
- `add(int index, E e)` → adds element at specific index  
- `get(int index)` → returns element at given index  
- `set(int index, E e)` → updates element  
- `remove(int index)` → removes element at index  
- `indexOf(Object o)` → returns index of first occurrence  
- `lastIndexOf(Object o)` → returns last occurrence  
- `listIterator()` → returns ListIterator  

---

## 6. 🌟 Example Programs

### Example 1: ArrayList
```java
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicate allowed

        System.out.println("ArrayList Example:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

---

### Example 2: LinkedList
```java
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Wake up");
        tasks.add("Brush teeth");
        tasks.add("Go to college");

        System.out.println("LinkedList Example:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
```

---

### Example 3: Stack
```java
import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack Example:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
```

---

## 7. 🌟 When to Use Which List?
| List Type   | Best Use Case |
|-------------|---------------|
| **ArrayList** | Frequent access/read operations |
| **LinkedList** | Frequent insertion/deletion |
| **Vector** | Thread-safe list (legacy) |
| **Stack** | LIFO operations |

---

✅ The `List` interface is one of the most commonly used in Java, offering flexibility and multiple implementations for different needs.
