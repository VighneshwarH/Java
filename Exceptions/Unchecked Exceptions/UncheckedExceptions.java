public class UncheckedExceptions {
    public static void main(String[] args) {
        try {
            // 1. ArithmeticException (Division by zero)
            int a = 10;
            int b = 0;
            int result = a / b;  // This will throw ArithmeticException
            System.out.println("Result: " + result);

            // 2. NullPointerException (Accessing null reference)
            String name = null;
            System.out.println("Length: " + name.length());

            // 3. ArrayIndexOutOfBoundsException (Invalid index)
            int arr[] = {1, 2, 3};
            System.out.println("Element: " + arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed - cleanup done.");
        }
    }
}
