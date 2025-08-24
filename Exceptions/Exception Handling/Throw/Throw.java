public class Throw {
    // Method to check if a person is eligible to vote
    static void divide(double num1, double num2) {
        if (num2 == 0) {
            // Throwing exception explicitly
            throw new ArithmeticException("Division by zero error.");
        } else {
            double result = num1 / num2;
            System.out.println("Result: " + result);
        }
    }

    public static void main(String[] args) {
        System.out.println("Dividing numbers");

        // Passing numbers to divide
        divide(15, 0);

        System.out.println("This line will not run if exception is thrown.");
    }
}
