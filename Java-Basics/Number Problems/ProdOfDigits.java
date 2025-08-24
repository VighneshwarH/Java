import java.util.*;
class ProdOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int product = 1;
		while(num > 0){
			int ld = num%10;
			product = product * ld;
			num = num/10;
		}
		System.out.println(product);
		sc.close();
	}
}
