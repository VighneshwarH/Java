import java.util.Scanner;
class ArmStrongNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int copy = num;
		int copy2 = num;
		int count = 0;
		int sum = 0;
		while(num>0){
			count++;
			num/=10;
		}
		while(copy>0){
			int ld = copy%10;
			int power = 1;
			for (int i = 1;i<=count ;i++ )
			{
				power = power*ld;
			}
			sum = sum + power;
			copy/=10;
		}
		System.out.println(copy2==sum?"ArmStrong number":"Not an Armstrong number");
	}
}

