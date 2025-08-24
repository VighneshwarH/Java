
# 📘 Java Input/Output (I/O)

Java provides powerful ways to **read input** and **display output** through **console I/O** and **file I/O**.  
This guide covers the essentials:

- 🖥️ **Console Input (Scanner, BufferedReader, Command-line arguments)**  
- 🖨️ **Console Output (print, println, printf, format)**  
- 📂 **File Input/Output (FileReader, FileWriter, BufferedReader, BufferedWriter, FileInputStream, FileOutputStream)**  
- ⚡ **Advanced I/O (Serialization, NIO, Streams)**  

---

## 🖥️ 1. Console Input

Java provides multiple ways to take input from users.

| Method | Class | Example Usage |
|--------|-------|---------------|
| `Scanner` | `java.util.Scanner` | User-friendly, commonly used |
| `BufferedReader` | `java.io.BufferedReader` | Faster, used for large inputs |
| `Command-Line Args` | `String[] args` | Input passed when running the program |

<details>
<summary>📌 Example using Scanner</summary>

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        sc.close();
    }
}
```
</details>

<details>
<summary>📌 Example using BufferedReader</summary>

```java
import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine());
        System.out.println("You entered: " + num);
    }
}
```
</details>

---

## 🖨️ 2. Console Output

Java provides different methods for output.

| Method | Description | Example |
|--------|-------------|---------|
| `print()` | Prints text without newline | `System.out.print("Hello");` |
| `println()` | Prints text with newline | `System.out.println("Hello");` |
| `printf()` | Prints formatted output | `System.out.printf("Age: %d", 25);` |
| `format()` | Same as printf | `System.out.format("Pi: %.2f", 3.14159);` |

<details>
<summary>📌 Example Code</summary>

```java
public class OutputExample {
    public static void main(String[] args) {
        int age = 25;
        double pi = 3.14159;

        System.out.print("This is print.");
        System.out.println(" This is println.");
        System.out.printf("I am %d years old.\n", age);
        System.out.format("Value of pi: %.2f\n", pi);
    }
}
```
</details>

---

## 📂 3. File Input/Output

Java allows reading and writing files with multiple classes.

| Class | Type | Usage |
|-------|------|-------|
| `FileReader` | Character Stream | Reads characters from a file |
| `FileWriter` | Character Stream | Writes characters to a file |
| `BufferedReader` | Wrapper | Efficient reading |
| `BufferedWriter` | Wrapper | Efficient writing |
| `FileInputStream` | Byte Stream | Reads binary data |
| `FileOutputStream` | Byte Stream | Writes binary data |

<details>
<summary>📌 File Reading Example</summary>

```java
import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
</details>

<details>
<summary>📌 File Writing Example</summary>

```java
import java.io.*;

public class FileWriteExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello, this is a test file.");
            bw.newLine();
            bw.write("Java File I/O example.");
            bw.close();
            fw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
</details>

---

## ⚡ 4. Advanced I/O

- **Serialization** → Save and restore objects using `ObjectInputStream` and `ObjectOutputStream`.  
- **Java NIO (New I/O)** → Provides faster I/O with `Channels`, `Buffers`, and `Paths`.  
- **Streams API** → Used with collections for data manipulation and I/O.

<details>
<summary>📌 Serialization Example</summary>

```java
import java.io.*;

class Student implements Serializable {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
            oos.writeObject(new Student("Alice", 21));
            oos.close();
            System.out.println("Object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
</details>

---

## 📝 Summary

- 🖥️ **Console Input** → Scanner, BufferedReader, Command-line args  
- 🖨️ **Console Output** → print, println, printf, format  
- 📂 **File I/O** → FileReader, FileWriter, Streams, Buffers  
- ⚡ **Advanced I/O** → Serialization, NIO, Streams  

---

⭐ With this, you now have a **complete reference guide** for Java I/O 🚀
