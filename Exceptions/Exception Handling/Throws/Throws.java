import java.io.*;

public class Throws {
    // Method that declares exception using 'throws'
    static void readFile() throws IOException {
        // Trying to open a file that may not exist
        FileReader file = new FileReader("myfile.txt");
        BufferedReader br = new BufferedReader(file);

        // Printing first line from the file
        System.out.println("File Content: " + br.readLine());

        br.close();
    }

    public static void main(String[] args) {
        System.out.println("Trying to read file...");

        try {
            // Calling method that might throw IOException
            readFile();
        } catch (IOException e) {
            // Handling exception here
            System.out.println("Exception handled: " + e.getMessage());
        }

        System.out.println("Program continues after handling exception.");
    }
}
