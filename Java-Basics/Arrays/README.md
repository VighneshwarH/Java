# Java Arrays (1D & 2D)

## 🌟 Arrays in Java

An **array** in Java is a collection of elements of the same data type stored in contiguous memory locations.

---

## 🔹 1D Array (Single Dimensional Array)

### Declaration:
```java
dataType[] arrayName;
```

### Initialization:
```java
int[] numbers = {10, 20, 30, 40, 50};
```

### Accessing Elements:
```java
System.out.println(numbers[0]); // Output: 10
```

### Example Program:
```java
public class OneDArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
```

---

## 🔹 2D Array (Two Dimensional Array)

### Declaration:
```java
dataType[][] arrayName;
```

### Initialization:
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### Accessing Elements:
```java
System.out.println(matrix[1][2]); // Output: 6
```

### Example Program:
```java
public class TwoDArrayExample {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## 📌 Summary
- **1D Array**: Stores elements in a single row (linear structure).
- **2D Array**: Stores elements in rows and columns (matrix structure).
- Arrays are indexed starting from **0**.
- Arrays provide fast access but have a fixed size.
