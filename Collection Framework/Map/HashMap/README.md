# HashMap in Java (Collection Framework)

## Introduction

-   A **HashMap** is part of the **java.util** package and implements
    the **Map interface**.
-   It stores elements as **key-value pairs**.
-   Uses **hashing** to store and retrieve elements efficiently.
-   Allows **one null key** and multiple **null values**.
-   Provides **constant time performance (O(1))** for basic operations
    like insertion and lookup (on average).

------------------------------------------------------------------------

## Key Features

-   **Non-synchronized** (not thread-safe).
-   **No ordering** of keys or values is maintained.
-   Allows **duplicate values** but **not duplicate keys**.
-   Uses a **hash table** (array + linked list + tree structure after
    Java 8).
-   Introduced in **Java 1.2**.

------------------------------------------------------------------------

## Class Declaration

``` java
public class HashMap<K,V>
    extends AbstractMap<K,V>
    implements Map<K,V>, Cloneable, Serializable
```

------------------------------------------------------------------------

## Constructors

-   `HashMap()` → Creates an empty HashMap.
-   `HashMap(int initialCapacity)` → Creates a HashMap with a specified
    capacity.
-   `HashMap(int initialCapacity, float loadFactor)` → Creates a HashMap
    with specified capacity and load factor.
-   `HashMap(Map<? extends K,? extends V> m)` → Creates a HashMap with
    mappings from another map.

------------------------------------------------------------------------

## Common Methods

  Method                          Description
  ------------------------------- ---------------------------------------
  `put(K key, V value)`           Inserts a key-value pair.
  `get(Object key)`               Retrieves value for a given key.
  `remove(Object key)`            Removes mapping for a given key.
  `containsKey(Object key)`       Checks if the key exists.
  `containsValue(Object value)`   Checks if the value exists.
  `isEmpty()`                     Checks if map is empty.
  `size()`                        Returns number of key-value pairs.
  `clear()`                       Removes all mappings.
  `keySet()`                      Returns a set of all keys.
  `values()`                      Returns a collection of all values.
  `entrySet()`                    Returns a set of all key-value pairs.

------------------------------------------------------------------------

## Internal Working of HashMap

1.  HashMap uses a **hashing technique**.
2.  Hash function calculates **hash code** for a key → index in bucket
    array.
3.  Collisions are handled using **Linked List** (before Java 8) or
    **Balanced Tree (Red-Black Tree)** (Java 8+).
4.  Ensures average O(1) performance for insertion and lookup.

------------------------------------------------------------------------

## Example 1: Basic Usage

``` java
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        
        // Accessing values
        System.out.println("Map: " + map);
        System.out.println("Value for key 2: " + map.get(2));
        
        // Removing a key
        map.remove(3);
        System.out.println("After removal: " + map);
    }
}
```

**Output:**

    Map: {1=Apple, 2=Banana, 3=Cherry}
    Value for key 2: Banana
    After removal: {1=Apple, 2=Banana}

------------------------------------------------------------------------

## Example 2: Iterating through HashMap

``` java
import java.util.*;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        
        // Iterating using entrySet
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
```

**Output:**

    A -> 10
    B -> 20
    C -> 30

------------------------------------------------------------------------

## Example 3: Handling Null Keys and Values

``` java
import java.util.*;

public class HashMapNullExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(null, "First"); // Null key
        map.put(1, null);       // Null value
        map.put(2, null);       // Another null value
        
        System.out.println("HashMap with nulls: " + map);
    }
}
```

**Output:**

    HashMap with nulls: {null=First, 1=null, 2=null}

------------------------------------------------------------------------

## Real-World Use Cases

-   **Database Caching** (store query results).
-   **Dictionaries** (word-definition mapping).
-   **Configuration Storage** (settings with unique keys).
-   **Counting Frequency** of words/objects.

------------------------------------------------------------------------

## Comparison: HashMap vs Hashtable vs LinkedHashMap vs TreeMap

  ## 📊 Comparison of Java Map Implementations

| **Feature**       | **HashMap**        | **LinkedHashMap**       | **TreeMap**            | **Hashtable**         |
|-------------------|--------------------|--------------------------|------------------------|------------------------|
| **Ordering**      | ❌ No ordering     | ✅ Insertion order       | ✅ Sorted by keys      | ❌ No ordering         |
| **Null Keys**     | ✅ One allowed     | ✅ One allowed           | ❌ Not allowed         | ❌ Not allowed         |
| **Null Values**   | ✅ Multiple allowed| ✅ Multiple allowed      | ✅ Multiple allowed    | ❌ Not allowed         |
| **Thread Safety** | ❌ Not thread-safe | ❌ Not thread-safe       | ❌ Not thread-safe     | ✅ Thread-safe         |

---

### 🧠 Notes

- **TreeMap** uses natural ordering or a custom comparator for sorting keys.
- **Hashtable** is synchronized but considered legacy; prefer `ConcurrentHashMap` for modern thread-safe usage.
- **HashMap** and **LinkedHashMap** are ideal for non-threaded environments with flexible null handling.
- **LinkedHashMap** is great when predictable iteration order is needed.

---

### ✅ Summary

- Use **HashMap** for fast, unordered access.
- Use **LinkedHashMap** when insertion order matters.
- Use **TreeMap** when sorted key access is required.
- Use **Hashtable** only if legacy thread safety is essential.



## Conclusion

-   **HashMap** is one of the most used collections in Java for fast
    **key-value pair storage and retrieval**.
-   Best choice when:
    -   **Fast lookup** is needed.
    -   **No ordering requirement**.
    -   **Thread-safety not required**.
