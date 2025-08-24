# LinkedHashSet in Java (Collection / Set)

In Java, **LinkedHashSet** is a part of the **Java Collections Framework** and is implemented in the **`java.util`** package.  
It is a subclass of **HashSet** that maintains a **linked list** of the entries in the set, in the order in which they were inserted.

---

## Features of LinkedHashSet:
1. **Unique elements only** – duplicates are not allowed.  
2. **Maintains insertion order** – unlike HashSet.  
3. **Allows null** – at most one `null` element can be stored.  
4. **Combination of HashTable + LinkedList**.  
5. **Unsynchronized** – not thread-safe by default.  

---

## Syntax:
```java
LinkedHashSet<Type> set = new LinkedHashSet<>();
```

---

## Example 1: Basic Operations with LinkedHashSet
```java
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Banana");  // Duplicate (ignored)

        // Displaying LinkedHashSet
        System.out.println("LinkedHashSet: " + set);

        // Checking for an element
        System.out.println("Contains Apple? " + set.contains("Apple"));

        // Removing element
        set.remove("Mango");
        System.out.println("After removing Mango: " + set);

        // Size of LinkedHashSet
        System.out.println("Size: " + set.size());
    }
}
```
### Output:
```
LinkedHashSet: [Apple, Banana, Mango]
Contains Apple? true
After removing Mango: [Apple, Banana]
Size: 2
```

---

## Example 2: Iterating through LinkedHashSet
```java
import java.util.LinkedHashSet;

public class IterateExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

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
### Output (insertion order preserved):
```
10
20
30
40
```

---

## Example 3: Using Iterator
```java
import java.util.LinkedHashSet;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
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
- **Maintains insertion order** (unlike HashSet).  
- **At most one null is allowed**.  
- Slightly **slower than HashSet** due to order maintenance.  
- Useful when a **Set with predictable iteration order** is required.

---
