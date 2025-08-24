import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms: ");
        int num = sc.nextInt();

        int a = 0, b = 1, sum;

        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}
