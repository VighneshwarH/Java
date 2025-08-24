// Step 1: Addition of the digits
import java.util.Scanner;
class SmithNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int copy=num;
		int sumOfPrimeFactors = 0;
		int sumOfDigits = 0;
		int i =2;
		while(copy > 0) {
			sumOfDigits += copy % 10; // Sum of digits
			copy /= 10;
		}
		while (num > 1) {
			boolean isPrime = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			while (isPrime && num % i == 0) {
				int temp = i;
				while(temp > 0) {
					int digit = temp % 10;
					sumOfPrimeFactors += digit;
					temp/=10;
				}
				num /= i;
			}
			i++;
		}
		if(sumOfDigits==sumOfPrimeFactors) {
			System.out.println("Smith Number");
		} else {
			System.out.println("Not a Smith Number");
		}
		sc.close();
	}
}
