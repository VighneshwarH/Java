import java.util.Scanner;
class HappyNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0){
			int d = num%10;
			sum = sum+d*d;
			num = num/10;
			if(num==0){
				if(sum>9){
					num = sum;
					sum=0;
				}
				else{
					if(sum==1){
						System.out.println("Happy Number");
						break;
					}
					else{
						System.out.println("Not a Happy Number");
						break;
					}
				}
			}
		}
	}
}