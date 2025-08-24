import java.util.Scanner;
class XylemPhloem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int ld = 0;
		int sum1 = num%10;
		num = num/10;
		int sum2 = 0;
		while(num>9){
			ld = num%10;
			sum2+=ld;
			num/=10;
		}
		sum1+=num;
		System.out.println(sum1==sum2?"xylem number":"phloem number");
	}
}