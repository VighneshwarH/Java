# Queue in Java (Collections / Framework)

A **Queue** in Java is a **collection** used to hold elements **before processing** in a **FIFO (First-In-First-Out)** manner. It is part of the `java.util` package and extends the **Collection** interface.

---

## Quick Facts

- **Package:** `java.util`
- **Interface:** `Queue<E>`
- **Extends:** `Collection<E>`
- **Default behavior:** FIFO (First-In-First-Out)
- **Implementations:** `LinkedList`, `PriorityQueue`, `ArrayDeque`, `ConcurrentLinkedQueue`, etc.
- **Nulls:** Most implementations **disallow null** (use `null` carefully).
- **Thread-safety:** Some queues are thread-safe (`ConcurrentLinkedQueue`, `BlockingQueue`), while others are not (`LinkedList`, `ArrayDeque`).
- **Performance:** O(1) amortized for enqueue/dequeue in linked/array-based queues; `PriorityQueue` operations cost O(log n).

---

## When to Use `Queue`

Use `Queue` when you need:
- FIFO processing (tasks, messages, buffers)
- Ordered processing (priority, fair scheduling)
- Thread-safe producer-consumer models (with `BlockingQueue`)

---

## Types of Queues in Java

1. **`LinkedList` (Queue implementation)**  
   - Can act as `List`, `Deque`, or `Queue`.  
   - Allows duplicates and `null`.  

2. **`PriorityQueue`**  
   - Orders elements according to natural ordering or a `Comparator`.  
   - Not strictly FIFO — based on priority.  
   - Does not allow `null`.  

3. **`ArrayDeque`**  
   - A resizable array-based double-ended queue.  
   - Faster than `LinkedList`.  
   - Does not allow `null`.  

4. **`ConcurrentLinkedQueue`**  
   - Thread-safe non-blocking queue (lock-free).  
   - Suitable for concurrent applications.  

5. **`BlockingQueue` (interface)**  
   - Used in multithreading for producer-consumer.  
   - Implementations: `ArrayBlockingQueue`, `LinkedBlockingQueue`, `PriorityBlockingQueue`, `DelayQueue`.  

---

## Queue Methods

| Method            | Description |
|-------------------|-------------|
| `add(e)`          | Inserts element; throws exception if capacity full |
| `offer(e)`        | Inserts element; returns `false` if capacity full |
| `remove()`        | Removes and returns head; throws exception if empty |
| `poll()`          | Removes and returns head; returns `null` if empty |
| `element()`       | Retrieves head without removing; throws exception if empty |
| `peek()`          | Retrieves head without removing; returns `null` if empty |

---

## Example 1: Basic Queue (LinkedList)

```java
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        // Adding elements
        q.add(10);
        q.add(20);
        q.add(30);
        
        System.out.println("Queue: " + q); // [10, 20, 30]
        
        // Access head
        System.out.println("Head: " + q.peek()); // 10
        
        // Remove elements
        System.out.println("Removed: " + q.poll()); // 10
        System.out.println("Queue after poll: " + q); // [20, 30]
    }
}
```

---

## Example 2: PriorityQueue

```java
import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        
        pq.add(30);
        pq.add(10);
        pq.add(20);
        
        System.out.println("PriorityQueue: " + pq);
        
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // 10, 20, 30 (natural order)
        }
    }
}
```

---

## Example 3: ArrayDeque

```java
import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> dq = new ArrayDeque<>();
        
        dq.offer("A");
        dq.offer("B");
        dq.offer("C");
        
        System.out.println("Deque: " + dq); // [A, B, C]
        
        dq.poll();
        System.out.println("After poll: " + dq); // [B, C]
        
        dq.offerFirst("X");
        dq.offerLast("Y");
        System.out.println("Deque after additions: " + dq); // [X, B, C, Y]
    }
}
```

---

## Example 4: BlockingQueue (Producer-Consumer)

```java
import java.util.concurrent.*;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    public Producer(BlockingQueue<Integer> q) { this.queue = q; }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Produced: " + i);
                queue.put(i); // blocks if full
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> q) { this.queue = q; }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Consumed: " + queue.take()); // blocks if empty
            }
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

public class BlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(5);
        new Thread(new Producer(bq)).start();
        new Thread(new Consumer(bq)).start();
    }
}
```

---

## Queue vs. Deque

| Feature     | Queue                  | Deque (Double-Ended Queue) |
|-------------|------------------------|-----------------------------|
| Access      | FIFO (head-tail)       | Both ends (head and tail)  |
| Examples    | LinkedList, PriorityQueue | ArrayDeque, LinkedList |
| Methods     | `offer`, `poll`, `peek` | `offerFirst`, `offerLast`, `pollFirst`, `pollLast` |

---

## Queue vs. Stack

| Feature     | Queue (FIFO)           | Stack (LIFO)              |
|-------------|------------------------|----------------------------|
| Order       | First In, First Out    | Last In, First Out        |
| Java class  | `Queue` (interface)    | `Stack` (class) / `Deque` |
| Use case    | Scheduling, messaging  | Undo operations, parsing  |

---

## Thread Safety

- **Not thread-safe:** `LinkedList`, `ArrayDeque`, `PriorityQueue`
- **Thread-safe alternatives:**  
  - `ConcurrentLinkedQueue` (non-blocking)  
  - `BlockingQueue` (`ArrayBlockingQueue`, `LinkedBlockingQueue`, etc.)  

---

## Common Pitfalls

1. **Null elements:** Most queues disallow `null`. Use sentinel values instead.
2. **PriorityQueue order:** Not guaranteed to iterate in sorted order, only removal order is guaranteed.
3. **BlockingQueue:** Methods like `put()` and `take()` may block indefinitely.
4. **Concurrent access:** Use thread-safe queues in multithreaded environments.

---

## API Reference: Key Methods

```text
boolean add(E e);
boolean offer(E e);
E remove();
E poll();
E element();
E peek();
```

---

## FAQ

**Q: Does `PriorityQueue` maintain full sorted order?**  
A: No, only the head element is guaranteed to be the smallest (or highest priority).

**Q: How do I make a queue thread-safe?**  
A: Use `ConcurrentLinkedQueue` or a `BlockingQueue`.

**Q: Can I add `null` to a queue?**  
A: Most implementations do not allow `null` (throws `NullPointerException`).

**Q: Which is faster: `ArrayDeque` or `LinkedList` for queues?**  
A: `ArrayDeque` is generally faster due to better memory locality.
