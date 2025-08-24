# TreeSet in Java (Collections / Set)

A **TreeSet** is a `SortedSet` implementation backed by a **balanced Red–Black tree**. It stores **unique** elements in **sorted order** (natural order or by a provided `Comparator`). It offers **logarithmic-time** performance for add, remove, and search.

---

## Quick Facts

- **Package:** `java.util`
- **Implements:** `NavigableSet<E>`, `SortedSet<E>`, `Set<E>`, `Iterable<E>`, `Collection<E>`
- **Backed by:** Red–Black tree (self-balancing BST)
- **Ordering:** Natural (`Comparable`) or custom (`Comparator`)
- **Duplicates:** Not allowed
- **Nulls:** `null` not allowed for elements (throws `NullPointerException` on operations that need ordering)
- **Thread-safety:** Not synchronized; use `Collections.synchronizedSortedSet` or external locking
- **Performance:** `O(log n)` for `add`, `remove`, `contains`; `O(1)` for `first/last`; `O(log n)` for navigation ops

---

## When to Use `TreeSet`

Use `TreeSet` when you need:
- Elements kept **sorted** at all times
- **Range queries** and **navigation** (`floor`, `ceiling`, `lower`, `higher`, `subSet`, `headSet`, `tailSet`)
- **Consistent order** independent of insertion order

Prefer alternatives:
- `HashSet` for fastest membership checks without ordering
- `LinkedHashSet` for predictable **insertion-order iteration**
- `PriorityQueue` if you only need fast access to min/max, not full set operations
- `EnumSet` for sets of enum constants (very compact & fast)

---

## Constructors

```java
TreeSet<E> set1 = new TreeSet<>();                    // natural order
TreeSet<E> set2 = new TreeSet<>(Comparator.reverseOrder()); // custom order
TreeSet<E> set3 = new TreeSet<>(existingSortedSet);   // copy
TreeSet<E> set4 = new TreeSet<>(collection);          // from collection
```

> **Tip:** If elements don’t implement `Comparable`, you must supply a `Comparator`.

---

## Common Operations (with Examples)

```java
import java.util.*;

public class TreeSetBasics {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(1);
        ts.add(3);
        ts.add(3); // duplicate ignored

        System.out.println(ts);             // [1, 3, 5]
        System.out.println(ts.first());     // 1
        System.out.println(ts.last());      // 5

        // Navigation
        System.out.println(ts.lower(3));    // 1  (strictly less)
        System.out.println(ts.floor(3));    // 3  (<=)
        System.out.println(ts.higher(3));   // 5  (strictly greater)
        System.out.println(ts.ceiling(4));  // 5  (>=)

        // Range views (backed by the same tree)
        SortedSet<Integer> head = ts.headSet(3);     // < 3
        NavigableSet<Integer> tail = ts.tailSet(3, true); // >= 3
        NavigableSet<Integer> sub  = ts.subSet(2, true, 5, false); // [2,5)

        // Polling (destructive)
        System.out.println(ts.pollFirst()); // 1, removes 1
        System.out.println(ts.pollLast());  // 5, removes 5
    }
}
```

---

## Ordering & Comparators

### Natural Ordering
Elements must implement `Comparable<E>` consistently with `equals`. Inconsistent ordering may break set semantics.

```java
class User implements Comparable<User> {
    String name;
    int age;
    public User(String name, int age) { this.name = name; this.age = age; }
    @Override public int compareTo(User o) {
        return Integer.compare(this.age, o.age); // natural order by age
    }
    @Override public String toString() { return name + "(" + age + ")"; }
}
```

### Custom Comparator

```java
Comparator<User> byNameThenAge = Comparator
        .comparing((User u) -> u.name)
        .thenComparingInt(u -> u.age);

TreeSet<User> users = new TreeSet<>(byNameThenAge);
users.add(new User("Asha", 30));
users.add(new User("Asha", 30)); // duplicate by comparator => ignored
users.add(new User("Asha", 25)); // allowed (name same, age differs)
```

> **Important:** **Uniqueness** in `TreeSet` is determined by the **ordering**, not `equals/hashCode`. If `compare(a,b) == 0`, the set treats them as duplicates.

---

## Null Handling

- Unlike some legacy structures, `TreeSet` **does not permit `null`** if the ordering needs to compare it.
- Adding `null` typically throws `NullPointerException`.

```java
TreeSet<String> s = new TreeSet<>();
// s.add(null); // NPE
```

---

## NavigableSet Goodies

`TreeSet` implements `NavigableSet`, providing rich navigation methods:

- **Directional:** `lower(e)`, `floor(e)`, `ceiling(e)`, `higher(e)`
- **Views:** `headSet(toElement)`, `tailSet(fromElement)`, `subSet(from, to)` and their inclusive variants
- **Descending:** `descendingSet()`, `descendingIterator()`
- **Polling:** `pollFirst()`, `pollLast()`

```java
NavigableSet<Integer> ns = new TreeSet<>(List.of(10,20,30,40,50));
System.out.println(ns.descendingSet());     // [50, 40, 30, 20, 10]
System.out.println(ns.subSet(20, true, 40, false)); // [20, 30]
```

> Range views are **backed by the original set**: changes reflect both ways, and bounds are **checked**.

---

## Complexity

| Operation                         | Time Complexity |
|----------------------------------|-----------------|
| `add`, `remove`, `contains`      | `O(log n)`      |
| `first`, `last`                  | `O(1)`          |
| `lower`, `floor`, `ceiling`, etc.| `O(log n)`      |
| Iteration                        | `O(n)`          |
| Memory                           | `O(n)`          |

---

## TreeSet vs. HashSet vs. LinkedHashSet

| Feature              | TreeSet                    | HashSet                      | LinkedHashSet                  |
|----------------------|----------------------------|------------------------------|--------------------------------|
| Order                | Sorted                     | Unordered                    | Insertion order                |
| Nulls                | Not allowed (in practice)  | One `null` allowed           | One `null` allowed             |
| Performance          | `O(log n)` ops             | Average `O(1)` ops           | `O(1)` + ordering overhead     |
| Range queries        | ✔                           | ✘                            | ✘                              |
| Comparator support   | ✔                           | ✘                            | ✘                              |

---

## Stream Interop

```java
TreeSet<String> ts = new TreeSet<>(Comparator.comparingInt(String::length)
                                             .thenComparing(Comparator.naturalOrder()));

ts.addAll(List.of("kiwi","banana","fig","apple"));

List<String> top2 = ts.stream().limit(2).toList(); // ["fig","kiwi"]

TreeSet<String> collected = new TreeSet<>(Comparator.reverseOrder());
collected.addAll(
    List.of("b","a","c").stream()
        .filter(s -> s.compareTo("b") >= 0)
        .toList()
);
```

---

## Conversions

```java
// To List (keeps order)
List<Integer> list = new ArrayList<>(ts);

// From array/collection
TreeSet<Integer> ts2 = new TreeSet<>(Arrays.asList(3,1,2,2));

// To HashSet (drops order)
Set<Integer> h = new HashSet<>(ts);

// Unmodifiable view (Java 10+)
NavigableSet<Integer> ro = Collections.unmodifiableNavigableSet(ts);
```

---

## Common Pitfalls

1. **Inconsistent Comparator:** If `compare(a,b) == 0` for distinct objects that you still want both kept, the second will be **dropped**.
2. **Mutable Keys:** Changing fields that affect ordering **after insertion** breaks the set’s invariants (element may “disappear”). Prefer immutables.
3. **`null` Elements:** Avoid; leads to `NullPointerException`.
4. **Performance Expectations:** `TreeSet` is slower than `HashSet` for plain membership tests; use it only when sorting/range queries matter.
5. **Equality vs Ordering:** `equals` is **not used** for set membership; ordering defines uniqueness.

---

## Real-World Patterns

- **De-duplicate + Sort**: ingest unsorted data, emit unique sorted stream.
- **Range Filtering**: quickly get all items within `[low, high]` via `subSet`.
- **Windowing**: maintain a sliding window (e.g., timestamps) and drop out-of-range via `headSet().clear()`.
- **Leaderboards**: track top-N with `descendingSet()` and `pollLast()`/`pollFirst()`.

```java
// Sliding 10-minute window of event timestamps (epoch millis)
class SlidingWindow {
    private final NavigableSet<Long> times = new TreeSet<>();
    private final long window = 10 * 60 * 1000L;
    public void add(long t) {
        times.add(t);
        long cutoff = t - window;
        times.headSet(cutoff, false).clear(); // remove older than cutoff
    }
    public int size() { return times.size(); }
}
```

---

## Thread Safety

- `TreeSet` is **not** thread-safe.
- Options:
  - Wrap: `SortedSet<E> sync = Collections.synchronizedSortedSet(new TreeSet<>());`
  - Use external locks or concurrent structures (no direct concurrent TreeSet, but `ConcurrentSkipListSet` is a scalable, sorted alternative).

```java
// Concurrent alternative
import java.util.concurrent.ConcurrentSkipListSet;
ConcurrentSkipListSet<Integer> css = new ConcurrentSkipListSet<>();
```

---

## API Reference: Key Methods

```text
// Query
boolean contains(Object o);
E first(); E last();
E lower(E e); E floor(E e); E ceiling(E e); E higher(E e);

// Update
boolean add(E e); boolean remove(Object o);
void clear();

// Views
SortedSet<E> headSet(E toElement);
SortedSet<E> tailSet(E fromElement);
SortedSet<E> subSet(E fromElement, E toElement);

// Inclusive variants (NavigableSet)
NavigableSet<E> headSet(E toElement, boolean inclusive);
NavigableSet<E> tailSet(E fromElement, boolean inclusive);
NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive);

// Iteration
Iterator<E> iterator();
Iterator<E> descendingIterator();

// Polling
E pollFirst(); E pollLast();
```

---

## FAQ

**Q: Why did my insert get ignored?**  
A: Your comparator deemed it equal to an existing element (`compare(a,b) == 0`).

**Q: Can I sort descending?**  
A: Yes—use `Comparator.reverseOrder()` or call `descendingSet()` view.

**Q: How do I allow duplicates?**  
A: Sets don’t allow duplicates by definition. Use a `List` or a `TreeMap<E,Integer>` to count occurrences.

**Q: Does `TreeSet` guarantee stable iteration order?**  
A: Yes, iteration follows the current sorted order (which can change if you mutate keys—don’t).

**Q: What if I need sorted + concurrent?**  
A: Consider `ConcurrentSkipListSet` from `java.util.concurrent`.
