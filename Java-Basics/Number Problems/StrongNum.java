import java.util.Scanner;
class StrongNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int ognum = num;
		int sum = 0;
		while(num>0){
			int ld = num%10;
			int fact = 1;
			for(int i =1;i<=ld;i++){
				fact = fact*i;
			}
			sum = sum + fact;
			num = num/10;
		}
		if(sum == ognum){
			System.out.println(ognum+" is a Strong number");
		}
		else{
			System.out.println(ognum+" is not a strong number");
		}
	}
}
