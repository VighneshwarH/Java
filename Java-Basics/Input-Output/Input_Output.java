import java.util.Scanner;

public class Input_Output{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner class object creation

    // Input for integer
    System.out.print("Enter an integer: ");
    int intValue = sc.nextInt();
    System.out.println("You entered: " + intValue);

    // Input for double
    System.out.print("Enter a double: ");
    double doubleValue = sc.nextDouble();
    System.out.println("You entered: " + doubleValue);

    // Input for float
    System.out.print("Enter a float: ");
    float floatValue = sc.nextFloat();
    System.out.println("You entered: " + floatValue);

    // Input for long
    System.out.print("Enter a long: ");
    long longValue = sc.nextLong();
    System.out.println("You entered: " + longValue);

    // Input for short
    System.out.print("Enter a short: ");
    short shortValue = sc.nextShort();
    System.out.println("You entered: " + shortValue);

    // Input for byte
    System.out.print("Enter a byte: ");
    byte byteValue = sc.nextByte();
    System.out.println("You entered: " + byteValue);

    // Input for boolean
    System.out.print("Enter a boolean (true/false): ");
    boolean boolValue = sc.nextBoolean();
    System.out.println("You entered: " + boolValue);

    // Input for single word (String)
    System.out.print("Enter a single word: ");
    String word = sc.next();
    System.out.println("You entered: " + word);

    // Input for full line (String)
    sc.nextLine(); // Consume leftover newline
    System.out.print("Enter a full line: ");
    String line = sc.nextLine();
    System.out.println("You entered: " + line);


    sc.close();

    }
}