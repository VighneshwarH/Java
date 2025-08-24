# PriorityQueue in Java (Collection Framework)

## Introduction

-   A **PriorityQueue** in Java is a type of **Queue** that orders its
    elements based on their **priority**.
-   Unlike a normal queue (FIFO), elements are retrieved according to
    their **natural ordering** or by a **custom Comparator**.
-   It is part of the **java.util** package.

------------------------------------------------------------------------

## Key Points

-   Implements the **Queue interface**.
-   Orders elements by **natural ordering** or a **Comparator**.
-   **Null elements are not allowed**.
-   Not thread-safe (use `PriorityBlockingQueue` for thread safety).
-   The head of the queue is the **least element** according to
    ordering.

------------------------------------------------------------------------

## Class Declaration

``` java
public class PriorityQueue<E> extends AbstractQueue<E>
    implements java.io.Serializable
```

------------------------------------------------------------------------

## Constructors

-   `PriorityQueue()` → Creates an empty priority queue with natural
    ordering.
-   `PriorityQueue(int initialCapacity)` → Creates a queue with given
    capacity.
-   `PriorityQueue(int initialCapacity, Comparator<? super E> comparator)`
    → Creates a queue with custom ordering.

------------------------------------------------------------------------

## Common Methods

  ------------------------------------------------------------------------
  Method                       Description
  ---------------------------- -------------------------------------------
  `boolean add(E e)`           Inserts element into the queue.

  `boolean offer(E e)`         Inserts element without exception
                               (preferred).

  `E peek()`                   Retrieves but does not remove head.

  `E poll()`                   Retrieves and removes head, returns `null`
                               if empty.

  `boolean remove(Object o)`   Removes a specific element.

  `int size()`                 Returns number of elements.

  `Iterator<E> iterator()`     Returns an iterator over elements.
  ------------------------------------------------------------------------

------------------------------------------------------------------------

## Example 1: Natural Ordering

``` java
import java.util.PriorityQueue;

public class PQExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        pq.add(30);
        pq.add(10);
        pq.add(20);
        
        System.out.println("Priority Queue: " + pq);
        
        System.out.println("Head: " + pq.peek());
        
        System.out.println("Removed: " + pq.poll());
        
        System.out.println("After Removal: " + pq);
    }
}
```

**Output:**

    Priority Queue: [10, 30, 20]
    Head: 10
    Removed: 10
    After Removal: [20, 30]

------------------------------------------------------------------------

## Example 2: Custom Comparator (Max-Heap)

``` java
import java.util.PriorityQueue;
import java.util.Comparator;

public class PQCustom {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        pq.add(30);
        pq.add(10);
        pq.add(20);
        
        System.out.println("Priority Queue (Max-Heap): " + pq);
        
        while (!pq.isEmpty()) {
            System.out.println("Removed: " + pq.poll());
        }
    }
}
```

**Output:**

    Priority Queue (Max-Heap): [30, 10, 20]
    Removed: 30
    Removed: 20
    Removed: 10

------------------------------------------------------------------------

## Real-World Use Cases

-   **Task Scheduling** (CPU scheduling, printing tasks).
-   **Dijkstra's Algorithm** (shortest path in graphs).
-   **Event-driven Simulation** (processing events by time).
-   **Huffman Coding** (data compression).

------------------------------------------------------------------------

## Conclusion

-   **PriorityQueue** is a powerful data structure for **ordered
    retrieval** of elements.
-   Best for situations where **priority-based task execution** is
    required.
-   Supports both **natural ordering** and **custom comparators**.
