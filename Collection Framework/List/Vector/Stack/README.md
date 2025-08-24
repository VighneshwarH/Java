# Stack in Java (Under Collection → List → Vector)

In Java, **Stack** is a subclass of **Vector** that implements a
**Last-In, First-Out (LIFO)** data structure.\
It represents a stack of objects, where the last element pushed is the
first one to be popped.

------------------------------------------------------------------------

## Hierarchy

    Collection → List → Vector → Stack

------------------------------------------------------------------------

## Key Points

-   Stack extends Vector and provides methods for stack operations.
-   It follows **LIFO (Last In First Out)** principle.
-   Introduced in **Java 1.0**.

------------------------------------------------------------------------

## Stack Class Declaration

``` java
public class Stack<E> extends Vector<E>
```

------------------------------------------------------------------------

## Commonly Used Methods

  -----------------------------------------------------------------------
  Method                      Description
  --------------------------- -------------------------------------------
  `push(E item)`              Pushes an item onto the top of the stack.

  `pop()`                     Removes and returns the top element of the
                              stack.

  `peek()`                    Returns the top element without removing
                              it.

  `empty()`                   Checks if the stack is empty.

  `search(Object o)`          Returns the position of the element from
                              the top (1-based).
  -----------------------------------------------------------------------

------------------------------------------------------------------------

## Example Program

``` java
import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("Stack: " + stack);

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop element
        System.out.println("Popped element: " + stack.pop());

        // Stack after pop
        System.out.println("Stack after pop: " + stack);

        // Search element
        int pos = stack.search(10);
        System.out.println("Position of 10: " + pos);

        // Check empty
        System.out.println("Is stack empty? " + stack.empty());
    }
}
```

------------------------------------------------------------------------

## Output

    Stack: [10, 20, 30]
    Top element: 30
    Popped element: 30
    Stack after pop: [10, 20]
    Position of 10: 2
    Is stack empty? false

------------------------------------------------------------------------

## When to Use Stack?

-   Undo/Redo operations
-   Expression evaluation (Postfix/Prefix)
-   Backtracking algorithms
-   Browser history navigation

------------------------------------------------------------------------
