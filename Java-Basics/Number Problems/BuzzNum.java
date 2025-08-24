import java.util.Scanner;
class BuzzNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println((num%10==7 || num%7==0)?"Buzz number":"Not a buzz number");
	}
}
