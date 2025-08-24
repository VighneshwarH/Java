## 🔹 try-catch-finally

### ✅ Syntax
```java
try {
    // code that may throw exception
} catch(ExceptionType e) {
    // code to handle exception
} finally {
    // block of code that always executes
}
```

- **try** → contains risky code that may cause exception.  
- **catch** → handles the exception.  
- **finally** → always executes (used for closing resources, cleanup).  

### ✅ Example
```java
public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Program starts...");

        try {
            // Risky code: dividing by zero
            int number = 10;
            int result = number / 0; 
            System.out.println("Result: " + result); 
        } 
        catch (ArithmeticException e) {
            // If division by zero occurs, this block will handle it
            System.out.println("Exception caught: " + e.getMessage());
        } 
        finally {
            // This block ALWAYS executes (used for cleanup tasks like closing files)
            System.out.println("Finally block always executes!");
        }

        System.out.println("Program ends normally.");
    }
}
```

**Output:**
```
Program starts...
Exception caught: / by zero
Finally block always executes!
Program ends normally.

```