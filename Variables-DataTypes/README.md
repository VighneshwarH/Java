# Variables and Data Types in Java

## Variables

Variables are containers for storing data values. In Java, each variable must be declared with a data type.

**Syntax:**
```java
dataType variableName = value;
```

**Example:**
```java
int age = 25;
double salary = 50000.50;
```

### Types of Variables

- **Local Variables:** Declared inside methods.
- **Instance Variables:** Declared inside a class but outside any method.
- **Static Variables:** Declared with the `static` keyword inside a class.

## Data Types

Java is a strongly typed language. Every variable must have a data type.

### Primitive Data Types

| Data Type | Size    | Example      | Description                |
|-----------|---------|--------------|----------------------------|
| byte      | 1 byte  | `byte b = 10;`      | Stores whole numbers from -128 to 127 |
| short     | 2 bytes | `short s = 1000;`   | Stores whole numbers from -32,768 to 32,767 |
| int       | 4 bytes | `int i = 100000;`   | Stores whole numbers from -2,147,483,648 to 2,147,483,647 |
| long      | 8 bytes | `long l = 100000L;` | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float     | 4 bytes | `float f = 5.75f;`  | Stores fractional numbers, up to 6-7 decimal digits |
| double    | 8 bytes | `double d = 19.99;` | Stores fractional numbers, up to 15 decimal digits |
| char      | 2 bytes | `char c = 'A';`     | Stores a single character/letter or ASCII values |
| boolean   | 1 bit   | `boolean flag = true;` | Stores true or false values |

### Non-Primitive Data Types

- **String:** Sequence of characters. Example: `String name = "Java";`
- **Arrays:** Collection of similar data types.
- **Classes, Interfaces, Objects:** User-defined types.

## Example

```java
public class Main {
    public static void main(String[] args) {
        int number = 10;
        double price = 99.99;
        char grade = 'A';
        boolean isJavaFun = true;
        String message = "Hello, Java!";
        
        System.out.println(number);
        System.out.println(price);
        System.out.println(grade);
        System.out.println(isJavaFun);
        System.out.println(message);
    }
}
```

## Summary

- Variables store data values.
- Data types define the type and size of data.
- Java has 8 primitive data types and several non-primitive types.
