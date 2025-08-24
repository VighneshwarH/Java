# Set in Java (Under Collection)

In Java, **Set** is an interface that extends the **Collection**
interface.\
It represents a collection of unique elements, meaning **duplicates are
not allowed**.

------------------------------------------------------------------------

## Hierarchy

    Collection → Set

------------------------------------------------------------------------

## Key Points

-   A **Set** cannot contain duplicate elements.
-   It models the mathematical set abstraction.
-   Common implementations include **HashSet**, **LinkedHashSet**, and
    **TreeSet**.
-   Introduced in **Java 1.2** (as part of Java Collections Framework).

------------------------------------------------------------------------

## Set Interface Declaration

``` java
public interface Set<E> extends Collection<E>
```

------------------------------------------------------------------------

## Commonly Used Implementations

  -----------------------------------------------------------------------
  Implementation                          Description
  --------------------------------------- -------------------------------
  `HashSet`                               Stores elements using hashing.
                                          Does not maintain insertion
                                          order.

  `LinkedHashSet`                         Maintains insertion order.

  `TreeSet`                               Stores elements in sorted
                                          (ascending) order.
  -----------------------------------------------------------------------

------------------------------------------------------------------------

## Commonly Used Methods

Since Set extends Collection, it inherits all Collection methods such
as:

  Method                 Description
  ---------------------- ------------------------------------------------------
  `add(E e)`             Adds an element to the set (if not already present).
  `remove(Object o)`     Removes an element from the set.
  `contains(Object o)`   Checks if the set contains a given element.
  `size()`               Returns the number of elements in the set.
  `clear()`              Removes all elements from the set.
  `isEmpty()`            Checks if the set is empty.

------------------------------------------------------------------------

## Example Program

``` java
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // Using HashSet
        Set<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate, will not be added

        System.out.println("HashSet: " + set);

        // Checking for element
        System.out.println("Contains Banana? " + set.contains("Banana"));

        // Removing element
        set.remove("Cherry");
        System.out.println("After removing Cherry: " + set);

        // Iterating through elements
        System.out.println("Iterating through set:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
```

------------------------------------------------------------------------

## Possible Output

    HashSet: [Banana, Apple, Cherry]
    Contains Banana? true
    After removing Cherry: [Banana, Apple]
    Iterating through set:
    Banana
    Apple

(Note: The order of elements may vary because **HashSet does not
maintain order**.)

------------------------------------------------------------------------

## When to Use Set?

-   To avoid duplicate entries.
-   For fast lookups using **HashSet**.
-   To maintain insertion order using **LinkedHashSet**.
-   To store elements in sorted order using **TreeSet**.

------------------------------------------------------------------------
