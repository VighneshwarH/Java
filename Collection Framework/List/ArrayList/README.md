
# 📘 Java Collection Framework – ArrayList

## 1. 🌟 Introduction to ArrayList
- `ArrayList` is a **resizable (dynamic) array implementation** of the `List` interface.  
- Unlike arrays in Java, the size of an `ArrayList` can **grow or shrink dynamically**.  
- Allows **duplicate elements** and **null values**.  
- Maintains the **insertion order**.  
- Provides **random access** using indexes (just like arrays).

---

## 2. 🌟 Features of ArrayList
1. **Dynamic resizing** – Unlike arrays, size is not fixed.  
2. **Ordered collection** – Maintains insertion order.  
3. **Allows duplicates** – Multiple occurrences of the same element.  
4. **Index-based access** – Fast retrieval of elements.  
5. **Not synchronized** – Faster than `Vector`, but not thread-safe.  
6. **Implements**: `List`, `RandomAccess`, `Cloneable`, `Serializable`.

---

## 3. 🌟 ArrayList Hierarchy

```
                Collection (Interface)
                        |
                      List (Interface)
                        |
                    ArrayList (Class)
```

---

## 4. 🌟 Constructors of ArrayList
- `ArrayList()` → creates an empty list with default capacity (10).  
- `ArrayList(int capacity)` → creates list with specified initial capacity.  
- `ArrayList(Collection c)` → creates list containing elements of another collection.  

---

## 5. 🌟 Important Methods of ArrayList
- `add(E e)` → Add element at end.  
- `add(int index, E e)` → Insert element at specific index.  
- `get(int index)` → Retrieve element at index.  
- `set(int index, E e)` → Replace element.  
- `remove(int index)` → Remove element at index.  
- `remove(Object o)` → Remove first occurrence of element.  
- `size()` → Get number of elements.  
- `isEmpty()` → Check if list is empty.  
- `contains(Object o)` → Check if element exists.  
- `clear()` → Remove all elements.  

---

## 6. 🌟 Example Programs

### Example 1: Basic ArrayList Operations
```java
import java.util.*;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // duplicate allowed

        System.out.println("Fruits List: " + fruits);
        
        // Accessing element
        System.out.println("First fruit: " + fruits.get(0));

        // Modifying element
        fruits.set(1, "Orange");
        System.out.println("Modified List: " + fruits);

        // Removing element
        fruits.remove("Mango");
        System.out.println("After Removal: " + fruits);
    }
}
```

---

### Example 2: Iterating ArrayList
```java
import java.util.*;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        // Using for-each loop
        System.out.println("Using for-each:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
```

---

### Example 3: ArrayList with User-defined Objects
```java
import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class ArrayListExample3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Charlie"));

        System.out.println("Students List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
```

---

## 7. 🌟 Internal Working of ArrayList
- Internally uses a **dynamic array**.  
- Default capacity = **10**.  
- When exceeded:  
  - A **new array** is created with capacity = `old capacity * 1.5`.  
  - Old elements are copied to new array.  

---

## 8. 🌟 Performance Analysis
| Operation       | Time Complexity | Notes |
|-----------------|-----------------|-------|
| **Access (get, set)** | O(1) | Direct index access |
| **Insertion at end** | O(1) (amortized) | Resizing may occur |
| **Insertion at index** | O(n) | Shifts elements |
| **Deletion** | O(n) | Requires shifting |
| **Search (contains)** | O(n) | Linear search |

---

## 9. 🌟 When to Use ArrayList?
- When frequent **read/access** operations are required.  
- When list size is **unknown** in advance.  
- When duplicates are allowed.  
- Not suitable for frequent insertion/deletion in middle (use `LinkedList` instead).  

---

✅ `ArrayList` is the most widely used collection in Java due to its dynamic resizing and fast access performance.
