class PrimeFactor 
{
	public static void main(String[] args) 
	{
		int n = 56; // Example number
		int i = 2;


		while (n > 1) {
			boolean isPrime = true;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			boolean isPrimeFactor = false; // Flag to check if the i is prime
			while (isPrime && n % i == 0) {
				n /= i;
				isPrimeFactor = true; // Reset for next i check
			}
			if(isPrimeFactor){
				System.out.print(i + " ");
			}
			i++;
		}
		
	}
}
