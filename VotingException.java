import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
}
}

public class Voting {

	static void validate(int age) throws InvalidAgeException{
		if(age<18) 
			throw new InvalidAgeException("\nAge is less than 18");
		else
			System.out.println("Welcome !!! You are eligible to vote");
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Age:");
		int Uage = s.nextInt();
		try {
			validate(Uage);
		}
		catch(InvalidAgeException ia) {
			System.out.println("Exception occured: " + ia);
		}
		
	}

}
