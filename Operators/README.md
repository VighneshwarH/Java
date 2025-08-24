
# 🚀 Java Operators

Operators in **Java** are special symbols that perform specific operations on variables and values.  
They are divided into different categories:

- ➕ Arithmetic Operators  
- ⚖️ Relational Operators
- 🔑 Logical Operators  
- 🔢 Bitwise Operators  

---

## ➕ 1. Arithmetic Operators

Perform basic mathematical operations.

| Operator | Description           | Example (`a=10, b=5`) | Result |
|----------|----------------------|------------------------|--------|
| `+`      | Addition             | `a + b`                | `15`   |
| `-`      | Subtraction          | `a - b`                | `5`    |
| `*`      | Multiplication       | `a * b`                | `50`   |
| `/`      | Division             | `a / b`                | `2`    |
| `%`      | Modulus (remainder)  | `a % b`                | `0`    |

<details>
<summary>📌 Example Code</summary>

```java
public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
```
</details>

---

## ⚖️ 2. Relational Operators

Used for comparison, returning **true/false**.

| Operator | Description              | Example (`a=10, b=5`) | Result  |
|----------|--------------------------|------------------------|---------|
| `==`     | Equal to                | `a == b`               | `false` |
| `!=`     | Not equal to            | `a != b`               | `true`  |
| `>`      | Greater than            | `a > b`                | `true`  |
| `<`      | Less than               | `a < b`                | `false` |
| `>=`     | Greater than or equal   | `a >= b`               | `true`  |
| `<=`     | Less than or equal      | `a <= b`               | `false` |

<details>
<summary>📌 Example Code</summary>

```java
public class RelationalExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }
}
```
</details>

---

## 🔑 3. Logical Operators

Work on boolean values.

| Operator | Description              | Example (`x=true, y=false`) | Result |
|----------|--------------------------|-----------------------------|--------|
| `&&`     | Logical AND              | `x && y`                    | `false` |
| `||`     | Logical OR               | `x || y`                    | `true`  |
| `!`      | Logical NOT              | `!x`                        | `false` |

<details>
<summary>📌 Example Code</summary>

```java
public class LogicalExample {
    public static void main(String[] args) {
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}
```
</details>

---

## 🔢 4. Bitwise Operators

Operate on individual bits.

| Operator | Description          | Example (`a=5(0101), b=3(0011)`) | Result (Decimal) | Result (Binary) |
|----------|----------------------|----------------------------------|------------------|-----------------|
| `&`      | Bitwise AND          | `a & b`                          | `1`              | `0001`          |
| `|`      | Bitwise OR           | `a | b`                          | `7`              | `0111`          |
| `^`      | Bitwise XOR          | `a ^ b`                          | `6`              | `0110`          |
| `~`      | Bitwise Complement   | `~a`                             | `-6`             | `…1010`         |
| `<<`     | Left shift           | `a << 1`                         | `10`             | `1010`          |
| `>>`     | Right shift          | `a >> 1`                         | `2`              | `0010`          |

<details>
<summary>📌 Example Code</summary>

```java
public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));
    }
}
```
</details>

---

## 📝 Summary

- ➕ **Arithmetic Operators** → Perform math operations  
- ⚖️ **Relational Operators** → Compare values (`true/false`)  
- 🔑 **Logical Operators** → Combine/negate boolean expressions  
- 🔢 **Bitwise Operators** → Work on bits (0s & 1s)  

---

⭐ With this, you have a **stylish reference guide** for Java Operators!  

