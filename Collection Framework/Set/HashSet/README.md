# HashSet in Java (Collection / Set)

In Java, **HashSet** is a part of the **Java Collections Framework** and is implemented in the **`java.util`** package.  
It is used to create a collection that **uses a hash table for storage**. It implements the **Set interface**, which means it does not allow duplicate elements.

---

## Features of HashSet:
1. **Unique elements only** – duplicates are not allowed.  
2. **Order is not guaranteed** – HashSet does not maintain insertion order.  
3. **Allows null** – at most one `null` element can be stored.  
4. **Backed by HashMap** internally.  
5. **Unsynchronized** – not thread-safe by default.  

---

## Syntax:
```java
HashSet<Type> set = new HashSet<>();
```

---

## Example 1: Basic Operations with HashSet
```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Banana");  // Duplicate (ignored)

        // Displaying HashSet
        System.out.println("HashSet: " + set);

        // Checking for an element
        System.out.println("Contains Apple? " + set.contains("Apple"));

        // Removing element
        set.remove("Mango");
        System.out.println("After removing Mango: " + set);

        // Size of HashSet
        System.out.println("Size: " + set.size());
    }
}
```
### Possible Output:
```
HashSet: [Banana, Apple, Mango]
Contains Apple? true
After removing Mango: [Banana, Apple]
Size: 2
```

---

## Example 2: Iterating through HashSet
```java
import java.util.HashSet;

public class IterateExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Iterating using for-each loop
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
```
### Output (order not guaranteed):
```
40
20
10
30
```

---

## Example 3: Using Iterator
```java
import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
```

---

## Key Points to Remember:
- **Duplicates are not allowed**.  
- **Insertion order is not maintained**.  
- **At most one null is allowed**.  
- HashSet is **faster than List** for search, insert, and delete (O(1) average time complexity).  
- Can be converted to other collections like `ArrayList` if ordering is required.

---
