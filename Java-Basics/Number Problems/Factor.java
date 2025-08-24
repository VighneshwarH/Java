/*import java.util.Scanner;
class Factor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Factors of "+num);
		for(int i = 1; i<=num;i++){
			if(num%i==0){
				System.out.print(i+" ");
			}
		}
	}
}*/

//Oprimized way
import java.util.Scanner;
class Factor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Factors of "+num);
		System.out.print(1+" ");
		for(int i = 2; i<=num/2;i++){
			if(num%i==0){
				System.out.print(i+" ");
			}
		}
		System.out.print(""+num);
	}
}