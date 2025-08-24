
# 📘 Java Variables & Data Types

In Java, **variables** are containers that hold data values, and **data types** specify the type of data a variable can store.  

---

## 📝 1. Variables in Java

### 🔹 Declaration and Initialization
```java
int age = 25;        // Declaration + Initialization
String name = "John"; // String variable
double pi = 3.14159; // Decimal variable
```

### 🔹 Rules for Naming Variables
- Must start with a letter, `$`, or `_`
- Cannot start with a digit
- Case-sensitive (`age` and `Age` are different)
- Should not use Java keywords (`int`, `class`, etc.)

---

## 🏷️ 2. Types of Variables

| Type | Description | Example |
|------|-------------|---------|
| **Local** | Declared inside methods, accessible only within them | `int x = 10;` |
| **Instance** | Declared inside a class but outside methods, unique for each object | `String name;` |
| **Static** | Declared with `static`, shared among all objects of a class | `static int count;` |

<details>
<summary>📌 Example Code</summary>

```java
public class VariableExample {
    int instanceVar = 20;           // Instance variable
    static int staticVar = 100;     // Static variable

    public void display() {
        int localVar = 10;          // Local variable
        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
    }

    public static void main(String[] args) {
        VariableExample obj = new VariableExample();
        obj.display();
    }
}
```
</details>

---

## 📊 3. Data Types in Java

Java is a **strongly typed language** – every variable must have a data type.

### 🔹 Primitive Data Types
| Data Type | Size | Default Value | Example |
|-----------|------|---------------|---------|
| `byte`    | 8-bit | 0 | `byte b = 100;` |
| `short`   | 16-bit | 0 | `short s = 1000;` |
| `int`     | 32-bit | 0 | `int a = 10;` |
| `long`    | 64-bit | 0L | `long l = 100000L;` |
| `float`   | 32-bit | 0.0f | `float f = 10.5f;` |
| `double`  | 64-bit | 0.0d | `double d = 20.99;` |
| `char`    | 16-bit | '