# LinkedHashMap in Java

## Introduction

`LinkedHashMap` is a part of the Java Collections Framework.\
It extends `HashMap` and maintains a **linked list** of the entries in
the map, in the order in which they were inserted.\
This makes it different from `HashMap`, which does not guarantee any
ordering of its elements.

------------------------------------------------------------------------

## Key Features of LinkedHashMap

-   Maintains insertion order of elements (or access order if
    specified).
-   Allows one `null` key and multiple `null` values.
-   Not synchronized (use `Collections.synchronizedMap()` for thread
    safety).
-   Provides predictable iteration order.
-   Time complexity for basic operations (`get()`, `put()`, `remove()`)
    is **O(1)**.

------------------------------------------------------------------------

## Class Declaration

``` java
public class LinkedHashMap<K, V>
    extends HashMap<K, V>
    implements Map<K, V>
```

-   **K**: Type of keys
-   **V**: Type of values

------------------------------------------------------------------------

## Constructors

1.  `LinkedHashMap()` -- Default constructor with initial capacity (16)
    and load factor (0.75).
2.  `LinkedHashMap(int initialCapacity)` -- Creates a LinkedHashMap with
    specified capacity.
3.  `LinkedHashMap(int initialCapacity, float loadFactor)` -- Creates
    with specified capacity and load factor.
4.  `LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)`
    -- Maintains insertion order (`false`) or access order (`true`).

------------------------------------------------------------------------

## Example 1: Basic Usage of LinkedHashMap

``` java
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

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

## Example 2: Maintaining Insertion Order

``` java
import java.util.*;

public class InsertionOrderExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        
        map.put("A", 10);
        map.put("C", 30);
        map.put("B", 20);
        map.put("D", 40);
        
        System.out.println("Insertion Order: " + map);
    }
}
```

**Output:**

    Insertion Order: {A=10, C=30, B=20, D=40}

------------------------------------------------------------------------

## Example 3: Access Order in LinkedHashMap

``` java
import java.util.*;

public class AccessOrderExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // Access elements
        map.get(1);
        map.get(3);

        System.out.println("Access Order: " + map);
    }
}
```

**Output:**

    Access Order: {2=Two, 1=One, 3=Three}

------------------------------------------------------------------------

## Example 4: Iterating through LinkedHashMap

``` java
import java.util.*;

public class IterationExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);

        // Using for-each loop
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
```

**Output:**

    Java -> 1
    Python -> 2
    C++ -> 3

------------------------------------------------------------------------

## Difference between HashMap and LinkedHashMap

  -----------------------------------------------------------------------
  Feature          HashMap                    LinkedHashMap
  ---------------- -------------------------- ---------------------------
  Order of         No order guaranteed        Maintains insertion/access
  Elements                                    order

  Performance      O(1) for basic operations  O(1), slightly slower than
                                              HashMap

  Iteration        Random order               Predictable order

  Use Case         When order doesn't matter  When order matters
  -----------------------------------------------------------------------

------------------------------------------------------------------------

## When to Use LinkedHashMap?

-   When you need **fast lookups** like HashMap but also want to
    maintain **insertion order**.
-   When implementing **LRU caches** (Least Recently Used).
-   When predictable iteration order is required.

------------------------------------------------------------------------

## Conclusion

-   `LinkedHashMap` is useful when order matters.
-   Provides performance close to `HashMap` with additional ordering
    feature.
-   Ideal for caching and ordered storage of key-value pairs.
