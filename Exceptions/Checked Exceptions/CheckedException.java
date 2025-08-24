import java.io.*;

// Demonstrating Checked Exceptions
public class CheckedException {
    public static void main(String[] args) {
        try {
            // Attempting to open a file that may not exist
            FileReader file = new FileReader("sample.txt");
            BufferedReader reader = new BufferedReader(file);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            // Specific handling for missing file
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // Handling for input/output errors
            System.out.println("I/O error occurred: " + e.getMessage());
        }
    }
}
