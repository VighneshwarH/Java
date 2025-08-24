# Primitive Typecasting in Java (Narrowing & Widening)

In Java, **typecasting** is the process of converting one primitive data
type into another.\
There are two types of casting in Java:

------------------------------------------------------------------------

## 1. Widening (Implicit Casting)

-   Also called **type promotion**.
-   Happens automatically when converting a **smaller type to a larger
    type**.
-   No data loss, safe conversion.

### Order of Conversion (by size)

    byte → short → int → long → float → double

### Example

``` java
public class WideningExample {
    public static void main(String[] args) {
        int num = 10;
        double d = num; // int to double (automatic)

        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + d);
    }
}
```

**Output:**

    Integer value: 10
    Double value: 10.0

------------------------------------------------------------------------

## 2. Narrowing (Explicit Casting)

-   Also called **explicit casting**.
-   Happens when converting a **larger type to a smaller type**.
-   Data loss may occur.
-   Must be done manually using **(type)**.

### Example

``` java
public class NarrowingExample {
    public static void main(String[] args) {
        double d = 9.78;
        int num = (int) d; // double to int (explicit)

        System.out.println("Double value: " + d);
        System.out.println("Integer value (after narrowing): " + num);
    }
}
```

**Output:**

    Double value: 9.78
    Integer value (after narrowing): 9

------------------------------------------------------------------------

## Key Points

-   **Widening** is safe (no data loss).
-   **Narrowing** may cause **data loss** or **precision loss**.
-   Casting is only possible between **compatible types**.

------------------------------------------------------------------------

## When to Use

-   **Widening:** When precision is not an issue and automatic
    conversion is sufficient.
-   **Narrowing:** When performance or memory optimization is required,
    but careful handling of data loss is needed.

------------------------------------------------------------------------
