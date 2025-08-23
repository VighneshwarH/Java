# Input/Output in Java

Java provides several ways to handle input and output (I/O) operations. The most common way for console input is using the `Scanner` class, while output is typically done with `System.out`.

## Console Input with Scanner

The `Scanner` class (in `java.util`) is used to read user input from the console.

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}
```

### Common Scanner Methods

- `nextLine()` – Reads a line of text.
- `nextInt()` – Reads an integer.
- `nextDouble()` – Reads a double.
- `next()` – Reads a single word.

## Output with System.out

Use `System.out.print()` and `System.out.println()` for output:

```java
System.out.print("Hello ");
System.out.println("World!");
```

## Other Input/Output Classes

- **BufferedReader**: For reading text from character input streams.
- **PrintWriter**: For writing formatted text output.
- **FileInputStream/FileOutputStream**: For reading/writing binary data from/to files.

### Example: Reading from a File

```java
import java.io.FileReader;
import java.io.BufferedReader;

public class FileReadExample {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
```

## Summary

- Use `Scanner` for simple console input.
- Use `System.out` for output.
- For file I/O, use classes from `java.io` package.

