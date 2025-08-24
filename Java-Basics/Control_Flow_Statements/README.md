# Java Control Flow & Loops

## 🌟 Control Flow

### 🔹 if-else Statement
The `if-else` statement allows conditional execution of code blocks.

**Syntax:**
```java
if (condition) {
    // code if condition is true
} else {
    // code if condition is false
}
```

**Example:**
```java
int number = 10;
if (number % 2 == 0) {
    System.out.println("Even Number");
} else {
    System.out.println("Odd Number");
}
```

---

### 🔹 switch Statement
The `switch` statement is used to execute one block of code among many options.

**Syntax:**
```java
switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    default:
        // default block
}
```

**Example:**
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Other day");
}
```

---

## 🔄 Loops

### 🔹 for Loop
The `for` loop is used when the number of iterations is known.

**Syntax:**
```java
for (initialization; condition; update) {
    // code to be executed
}
```

**Example:**
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}
```

---

### 🔹 while Loop
The `while` loop executes a block of code as long as the condition is true.

**Syntax:**
```java
while (condition) {
    // code to be executed
}
```

**Example:**
```java
int i = 1;
while (i <= 5) {
    System.out.println("Number: " + i);
    i++;
}
```

---

### 🔹 do-while Loop
The `do-while` loop executes the code block **at least once** before checking the condition.

**Syntax:**
```java
do {
    // code to be executed
} while (condition);
```

**Example:**
```java
int i = 1;
do {
    System.out.println("Value: " + i);
    i++;
} while (i <= 5);
```

---

## 📌 Summary
- **if-else**: Conditional execution
- **switch**: Multi-way branching
- **for loop**: Known number of iterations
- **while loop**: Repeats while condition is true
- **do-while loop**: Executes at least once before condition check
