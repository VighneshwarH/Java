# Java Strings

## 🌟 Strings in Java

A **String** in Java is a sequence of characters. It is a **class** in `java.lang` package and is widely used to store and manipulate text.

---

## 🔹 Creating Strings

### Using String Literal:
```java
String str1 = "Hello";
```

### Using `new` Keyword:
```java
String str2 = new String("World");
```

---

## 🔹 String Methods

### 1. Length of String
```java
String text = "Java Programming";
System.out.println(text.length()); // Output: 16
```

### 2. Concatenation
```java
String first = "Hello";
String second = "World";
System.out.println(first + " " + second); // Output: Hello World
```

### 3. charAt()
```java
String word = "Java";
System.out.println(word.charAt(2)); // Output: v
```

### 4. substring()
```java
String text = "Programming";
System.out.println(text.substring(0, 6)); // Output: Progra
```

### 5. equals() & equalsIgnoreCase()
```java
String a = "Hello";
String b = "hello";
System.out.println(a.equals(b));          // false
System.out.println(a.equalsIgnoreCase(b)); // true
```

### 6. toUpperCase() & toLowerCase()
```java
String text = "Java";
System.out.println(text.toUpperCase()); // JAVA
System.out.println(text.toLowerCase()); // java
```

### 7. contains()
```java
String text = "Java Programming";
System.out.println(text.contains("Java")); // true
```

### 8. replace()
```java
String text = "I like Java";
System.out.println(text.replace("Java", "Python")); // I like Python
```

### 9. trim()
```java
String text = "   Hello World   ";
System.out.println(text.trim()); // Hello World
```

---

## 🔹 Example Program
```java
public class StringExample {
    public static void main(String[] args) {
        String name = "Vighneshwar";
        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Substring(0, 5): " + name.substring(0, 5));
    }
}
```

---

## 📌 Summary
- Strings are objects in Java, not primitive types.
- Created using **literals** or the **new keyword**.
- Common methods: `length()`, `charAt()`, `substring()`, `equals()`, `toUpperCase()`, `toLowerCase()`, `contains()`, `replace()`, `trim()`.
- Strings are **immutable** in Java.
