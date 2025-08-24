import java.util.Scanner;
public class  OnlineExamSystem
{
	String studID;
	private String password = "student@12345";
	
	OnlineExamSystem(String studID){
		this.studID = studID;
	}
	
	public void startExam(String password, int timeLeft) throws InvalidLoginException,TimeoverException {
		if(!(this.password.equals(password))){
			throw new InvalidLoginException("Login invalid..");
		}
		else 
		{
			if(timeLeft<=0){
				throw new TimeoverException("Time over. Exam already ended..");
			}
			else{
					System.out.println("You can write the exam");
			}
		}
	}
	
	public static void main(String[] args) throws InvalidLoginException,TimeoverException
	{
		Scanner sc = new Scanner(System.in);
		OnlineExamSystem stud1 = new OnlineExamSystem("stud1001");
		System.out.println("Enter your password");
		String password = sc.next();
		stud1.startExam(password,120);
		System.out.println("Exam session ended");
	}
}
