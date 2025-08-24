import java.util.Scanner;
class SpyNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;
		while(num > 0){
			int ld = num%10;
			sum = sum + ld;
			product = product * ld;
			num = num/10;
		}
		if(sum == product){
			System.out.println("Number is a spy number");
		}
		else{
			System.out.println("Number is not spy number");
		}
	}
}
