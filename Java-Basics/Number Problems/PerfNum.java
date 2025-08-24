import java.util.Scanner;
class PerfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = sc.nextInt();
		for(int i = 1; i<num/2;i++){
			if(num%i==0)
				sum = sum + i;
		}
		if(sum == num){
			System.out.println(num + " is a Perfect number");
		}
		else{
			System.out.println(num + " is not a Perfect Number");
		}
	}
}
