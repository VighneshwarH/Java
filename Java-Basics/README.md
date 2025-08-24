
# Java Basics

This document provides an overview of the fundamental concepts in Java including variables, data types, input/output, operators, control flow, loops, arrays, and strings.

---

## 📌 1. Variables & Data Types
- **Variable**: A container for storing data values.
- **Data Types**: Define the type of data a variable can hold.

### Example:
```java
public class Main {
    public static void main(String[] args) {
        int age = 20;            // integer
        double salary = 45000.5; // decimal number
        char grade = 'A';        // character
        boolean isJavaFun = true;// boolean
        String name = "John";    // string (non-primitive)

        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```

---

## 📌 2. Input & Output

- **Output**: `System.out.println()` is used to print output.
- **Input**: `Scanner` class is used to take user input.

### Example:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
```

---

## 📌 3. Operators
- **Arithmetic**: `+`, `-`, `*`, `/`, `%`
- **Relational**: `==`, `!=`, `<`, `>`, `<=`, `>=`
- **Logical**: `&&`, `||`, `!`
- **Assignment**: `=`, `+=`, `-=`, `*=`, `/=`

### Example:
```java
public class Main {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b)); // Arithmetic
        System.out.println("a > b: " + (a > b));  // Relational
        System.out.println("a > 0 && b > 0: " + (a > 0 && b > 0)); // Logical
    }
}
```

---

## 📌 4. Control Flow (if-else, switch)
### Example:
```java
public class Main {
    public static void main(String[] args) {
        int number = 10;

        // if-else
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // switch-case
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other day");
        }
    }
}
```

---

## 📌 5. Loops
- **for loop**
- **while loop**
- **do-while loop**

### Example:
```java
public class Main {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop: " + i);
        }

        // while loop
        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop: " + j);
            j++;
        }

        // do-while loop
        int k = 1;
        do {
            System.out.println("Do-While Loop: " + k);
            k++;
        } while (k <= 5);
    }
}
```

---

## 📌 6. Arrays
- Collection of elements of the same data type stored in a single variable.

### Example:
```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Access elements
        System.out.println("First Element: " + numbers[0]);

        // Loop through array
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
```

---

## 📌 7. Strings
- Strings are objects in Java that represent sequences of characters.

### Example:
```java
public class Main {
    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring: " + str.substring(0, 4));
    }
}
```

---

## ✅ Conclusion
These are the basic building blocks of Java.  
Mastering these fundamentals is essential before moving to **OOPS concepts** and advanced Java features.

---


