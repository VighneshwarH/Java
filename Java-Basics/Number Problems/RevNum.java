class RevNum
{
	public static void main(String[] args) 
	{
		int num = 254;
		int reverse = 0;
		while(num > 0){
			int ld = num%10;
			reverse = (reverse * 10) + ld;
			num = num/10;
		}
		System.out.println(reverse);
	}
}


//import java.util.Scanner;
//class RevNumber
//{
	//public static void main(String[] args) 
	//{
		//Scanner sc = new Scanner(System.in);
		////int num = sc.nextInt();
		//int reverse = 0;
		//while(num > 0){
			//int ld = num%10;
			//reverse = reverse  + ld;
			//reverse = reverse *10;
			//num = num/10;
		//}
		//reverse = reverse / 10;
		//System.out.println(reverse);
	//}
//}

/*import java.util.Scanner;
class RevNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String reverse = "";
		while(num > 0){
			int ld = num%10;
			reverse +=ld;
			num = num/10;
		}
		num = Integer.parseInt(reverse);
		System.out.println(num);
	}
}*/