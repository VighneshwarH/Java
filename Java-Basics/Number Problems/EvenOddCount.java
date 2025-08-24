import java.util.Scanner;
class EvenOddCount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int evenCount = 0;
		int oddCount = 0;
		while(num>0){
			int ld = num%10;
			if(ld%2==0){
				evenCount++;
			}
			else{
				oddCount++;
			}
			num = num/10;
		}
		System.out.println("Even count is: " + evenCount);
		System.out.println("Odd count is: " + oddCount);
	}
}

