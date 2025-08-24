# ArrayDeque in Java (Collections / Deque)

The **ArrayDeque** class in Java is a **resizable array-based implementation** of the **Deque interface**.  
It can function as both a **Queue (FIFO)** and a **Stack (LIFO)**.  
It is generally faster than `Stack` and `LinkedList` when used as a stack or queue.

---

## Quick Facts

- **Package:** `java.util`
- **Class:** `ArrayDeque<E>`
- **Implements:** `Deque<E>`, `Queue<E>`, `Iterable<E>`, `Collection<E>`
- **Ordering:** Maintains insertion order (no sorting)
- **Duplicates:** Allowed
- **Nulls:** Not allowed (throws `NullPointerException`)
- **Capacity:** Grows dynamically (initial capacity is 16 by default)
- **Thread-safety:** Not synchronized
- **Performance:**  
  - `O(1)` amortized for insertion and deletion at both ends  
  - Faster than `Stack` and `LinkedList`  

---

## When to Use `ArrayDeque`

Use `ArrayDeque` when you need:
- A stack replacement (`push`, `pop`, `peek`)
- A queue replacement (`offer`, `poll`, `peek`)
- High-performance double-ended queue operations

Do not use if:
- You need thread-safety (`ConcurrentLinkedDeque` is better)
- You need random access (use `ArrayList` instead)

---

## Constructors

```java
ArrayDeque<Integer> dq1 = new ArrayDeque<>();          // default capacity (16)
ArrayDeque<Integer> dq2 = new ArrayDeque<>(50);        // with initial capacity
ArrayDeque<Integer> dq3 = new ArrayDeque<>(dq1);       // copy another collection
```

---

## Common Methods

### Queue methods
| Method       | Description |
|--------------|-------------|
| `offer(e)`   | Inserts element at tail |
| `poll()`     | Removes and returns head |
| `peek()`     | Retrieves head without removing |

### Deque methods
| Method            | Description |
|-------------------|-------------|
| `offerFirst(e)`   | Adds element at front |
| `offerLast(e)`    | Adds element at rear |
| `pollFirst()`     | Removes first element |
| `pollLast()`      | Removes last element |
| `peekFirst()`     | Gets first element without removing |
| `peekLast()`      | Gets last element without removing |

### Stack methods (via Deque)
| Method       | Description |
|--------------|-------------|
| `push(e)`    | Push element onto stack (front) |
| `pop()`      | Pop element from stack (front) |
| `peek()`     | Look at top element |

---

## Example 1: Using as a Queue (FIFO)

```java
import java.util.*;

public class ArrayDequeQueueExample {
    public static void main(String[] args) {
        ArrayDeque<String> dq = new ArrayDeque<>();
        
        dq.offer("A");
        dq.offer("B");
        dq.offer("C");
        
        System.out.println("Queue: " + dq); // [A, B, C]
        
        System.out.println("Peek: " + dq.peek()); // A
        System.out.println("Poll: " + dq.poll()); // A
        System.out.println("After poll: " + dq); // [B, C]
    }
}
```

---

## Example 2: Using as a Stack (LIFO)

```java
import java.util.*;

public class ArrayDequeStackExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack: " + stack); // [30, 20, 10]
        
        System.out.println("Peek: " + stack.peek()); // 30
        System.out.println("Pop: " + stack.pop());   // 30
        System.out.println("After pop: " + stack);   // [20, 10]
    }
}
```

---

## Example 3: Double-Ended Operations

```java
import java.util.*;

public class ArrayDequeDoubleEndedExample {
    public static void main(String[] args) {
        ArrayDeque<String> dq = new ArrayDeque<>();
        
        dq.offerFirst("A");
        dq.offerLast("B");
        dq.offerFirst("C");
        
        System.out.println("Deque: " + dq); // [C, A, B]
        
        dq.pollLast();
        System.out.println("After pollLast: " + dq); // [C, A]
    }
}
```

---

## ArrayDeque vs. Other Collections

| Feature            | ArrayDeque        | LinkedList          | Stack             |
|--------------------|------------------|---------------------|-------------------|
| Null elements      | ❌ Not allowed   | ✔ Allowed          | ✔ Allowed         |
| Performance        | Fast, resizable  | Slower (node-based) | Legacy (slower)   |
| Thread safety      | ❌ No            | ❌ No              | ❌ No             |
| Use as Stack       | ✔ Yes           | ✔ Yes              | ✔ Yes (but legacy)|
| Random access      | ❌ No            | ❌ No              | ❌ No             |

---

## Common Pitfalls

1. **Null values not allowed** – inserting `null` throws `NullPointerException`.
2. **Not thread-safe** – use `ConcurrentLinkedDeque` if multiple threads access.
3. **No capacity bound** – unlike `ArrayBlockingQueue`, it grows dynamically.

---

## API Reference: Key Methods

```text
// Queue-like
boolean offer(E e);
E poll();
E peek();

// Deque-like
boolean offerFirst(E e);
boolean offerLast(E e);
E pollFirst();
E pollLast();
E peekFirst();
E peekLast();

// Stack-like
void push(E e);
E pop();
E peek();
```

---

## FAQ

**Q: Why use `ArrayDeque` instead of `Stack`?**  
A: `ArrayDeque` is faster and more modern; `Stack` is legacy.

**Q: Can `ArrayDeque` hold `null`?**  
A: No, it throws `NullPointerException`.

**Q: Is iteration order predictable?**  
A: Yes, elements are iterated from front to back.

**Q: Is `ArrayDeque` thread-safe?**  
A: No, use `ConcurrentLinkedDeque` for multithreading.
