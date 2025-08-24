import java.util.Scanner;
class TwistedPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(num +"is not a prime number");
                 return;
            }
         }
        System.out.println(num+" Prime number");
		
		
		int revNum = 0;
		while(num < 0 || num > 0){
			int ld = num%10;
			revNum = (revNum * 10) + ld;
			num = num/10;
		}
		
		for (int i = 2; i <= revNum / 2; i++) {
			if (revNum % i == 0) {
				System.out.println("Not a prime number");
                 return;
            }
         }
         System.out.println(revNum+" Prime number");
		 System.out.println("Given number is a twisted prime number");
	}
}
