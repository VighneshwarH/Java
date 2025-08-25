# TreeMap in Java

## Introduction

`TreeMap` is a part of the Java Collections Framework.\
It implements the `NavigableMap` interface and is based on a **Red-Black
Tree** data structure.\
Unlike `HashMap` or `LinkedHashMap`, `TreeMap` **stores keys in a sorted
order** (natural ordering or by a custom comparator).

------------------------------------------------------------------------

## Key Features of TreeMap

-   Stores elements in **sorted order of keys**.
-   Does not allow `null` keys (throws `NullPointerException`).
-   Allows multiple `null` values.
-   Implements `NavigableMap` and `SortedMap` interfaces.
-   Time complexity for basic operations (`get()`, `put()`, `remove()`)
    is **O(log n)** due to tree structure.

------------------------------------------------------------------------

## Class Declaration

``` java
public class TreeMap<K, V>
    extends AbstractMap<K, V>
    implements NavigableMap<K, V>, Cloneable, Serializable
```

-   **K**: Type of keys (must be comparable or a comparator must be
    provided)
-   **V**: Type of values

------------------------------------------------------------------------

## Constructors

1.  `TreeMap()` -- Creates an empty TreeMap that sorts keys in natural
    order.
2.  `TreeMap(Comparator<? super K> comparator)` -- Creates a TreeMap
    using a custom comparator.
3.  `TreeMap(Map<? extends K, ? extends V> m)` -- Creates a TreeMap
    initialized with another map.
4.  `TreeMap(SortedMap<K, ? extends V> m)` -- Creates a TreeMap from an
    existing sorted map.

------------------------------------------------------------------------

## Example 1: Basic Usage of TreeMap

``` java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Banana");
        map.put(1, "Apple");
        map.put(2, "Cherry");

        System.out.println("TreeMap: " + map);
    }
}
```

**Output:**

    TreeMap: {1=Apple, 2=Cherry, 3=Banana}

------------------------------------------------------------------------

## Example 2: Custom Comparator in TreeMap

``` java
import java.util.*;

public class CustomComparatorExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());

        map.put("A", 10);
        map.put("C", 30);
        map.put("B", 20);

        System.out.println("Custom Order (Descending): " + map);
    }
}
```

**Output:**

    Custom Order (Descending): {C=30, B=20, A=10}

------------------------------------------------------------------------

## Example 3: Navigating TreeMap (firstKey, lastKey, etc.)

``` java
import java.util.*;

public class NavigationExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");

        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
        System.out.println("Higher Key (20): " + map.higherKey(20));
        System.out.println("Lower Key (20): " + map.lowerKey(20));
    }
}
```

**Output:**

    First Key: 10
    Last Key: 40
    Higher Key (20): 30
    Lower Key (20): 10

------------------------------------------------------------------------

## Example 4: Iterating through TreeMap

``` java
import java.util.*;

public class IterationExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
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

    C++ -> 3
    Java -> 1
    Python -> 2

------------------------------------------------------------------------

## Difference between HashMap, LinkedHashMap, and TreeMap

  -------------------------------------------------------------------------
  Feature       HashMap             LinkedHashMap        TreeMap
  ------------- ------------------- -------------------- ------------------
  Ordering      No order guaranteed Maintains            Sorted order
                                    insertion/access     (natural/custom)
                                    order                

  Null Keys     Allows one null key Allows one null key  Does not allow
                                                         null keys

  Null Values   Multiple allowed    Multiple allowed     Multiple allowed

  Performance   O(1) for basic      O(1), slightly       O(log n) for basic
                operations          slower than HashMap  operations

  Data          Hash Table          Hash Table + Linked  Red-Black Tree
  Structure                         List                 

  Use Case      When order doesn't  When insertion order When sorted order
                matter              matters              is required
  -------------------------------------------------------------------------

------------------------------------------------------------------------

## When to Use TreeMap?

-   When you need a **sorted map** by keys.
-   When you require **range queries** (e.g., subMap, headMap, tailMap).
-   When implementing **priority-based storage**.

------------------------------------------------------------------------

## Conclusion

-   `TreeMap` is best when you need key-based sorting.
-   Provides logarithmic time performance due to Red-Black Tree.
-   Useful for applications requiring **sorted order** and **range
    queries**.
