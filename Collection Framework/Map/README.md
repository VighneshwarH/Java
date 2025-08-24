# Map Hierarchy in Java (Collection Framework)

## Introduction

-   A **Map** in Java is an object that maps **keys to values**.
-   Keys are unique, but values can be duplicated.
-   Part of the **java.util** package, but it is **not a true
    Collection**.
-   Common implementations include **HashMap**, **LinkedHashMap**,
    **TreeMap**, and **Hashtable**.

------------------------------------------------------------------------

## Map Interface

-   **Map\<K,V\>**
    -   Key-Value pair mapping.
    -   No duplicate keys allowed.
    -   Can have one `null` key and multiple `null` values (except in
        `Hashtable` and `TreeMap`).

------------------------------------------------------------------------

## Map Hierarchy Diagram

                   Map (Interface)
                       |
        -------------------------------------
        |                 |                 |
     HashMap        SortedMap           Hashtable (Legacy)
        |                 |
     LinkedHashMap     TreeMap

------------------------------------------------------------------------

## Important Interfaces and Classes

### 1. **Map (Interface)**

-   Root interface for key-value pairs.
-   Methods:
    -   `put(K key, V value)`
    -   `get(Object key)`
    -   `remove(Object key)`
    -   `containsKey(Object key)`
    -   `containsValue(Object value)`

### 2. **HashMap**

-   Stores elements in **hash table**.
-   Allows **null key** and multiple **null values**.
-   **Unordered** and **unsynchronized**.

### 3. **LinkedHashMap**

-   Extends **HashMap**.
-   Maintains **insertion order**.
-   Allows **null key** and **null values**.

### 4. **SortedMap (Interface)**

-   Extends **Map**.
-   Maintains keys in **sorted order**.

### 5. **TreeMap**

-   Implements **SortedMap**.
-   Stores elements in **ascending order** of keys.
-   Does **not allow null key** (but allows multiple null values).
-   Based on **Red-Black Tree**.

### 6. **Hashtable (Legacy)**

-   Synchronized (Thread-safe).
-   Does **not allow null key or null value**.
-   Legacy class, replaced mostly by `HashMap`.

------------------------------------------------------------------------

## Comparison Table

  ---------------------------------------------------------------------------------
  Feature           HashMap      LinkedHashMap        TreeMap      Hashtable
  ----------------- ------------ -------------------- ------------ ----------------
  **Ordering**      No order     Insertion order      Sorted order No order
                                                      (keys)       

  **Null Key**      1 allowed    1 allowed            Not allowed  Not allowed

  **Null Values**   Multiple     Multiple allowed     Multiple     Not allowed
                    allowed                           allowed      

  **Thread Safe**   No           No                   No           Yes

  **Performance**   Fast         Slightly slower than Slower       Slower
                                 HashMap              (sorting     (synchronized)
                                                      overhead)    
  ---------------------------------------------------------------------------------

------------------------------------------------------------------------

## Example: HashMap

``` java
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        
        System.out.println("HashMap: " + map);
    }
}
```

**Output:**

    HashMap: {1=Apple, 2=Banana, 3=Cherry}

------------------------------------------------------------------------

## Example: TreeMap

``` java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "Cherry");
        map.put(1, "Apple");
        map.put(2, "Banana");
        
        System.out.println("TreeMap: " + map);
    }
}
```

**Output:**

    TreeMap: {1=Apple, 2=Banana, 3=Cherry}

------------------------------------------------------------------------

## Example: LinkedHashMap

``` java
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        
        System.out.println("LinkedHashMap: " + map);
    }
}
```

**Output:**

    LinkedHashMap: {1=Apple, 2=Banana, 3=Cherry}

------------------------------------------------------------------------

## Real-World Use Cases

-   **HashMap** → Caching, storing user data with unique IDs.
-   **LinkedHashMap** → Maintaining insertion order (e.g., LRU cache).
-   **TreeMap** → Navigable maps, dictionary implementations.
-   **Hashtable** → Legacy systems requiring thread-safe maps.

------------------------------------------------------------------------

## Conclusion

-   The **Map hierarchy** provides multiple choices depending on
    requirements:
    -   **HashMap**: Fast, general-purpose.
    -   **LinkedHashMap**: Ordered iteration.
    -   **TreeMap**: Sorted data.
    -   **Hashtable**: Legacy, synchronized.
