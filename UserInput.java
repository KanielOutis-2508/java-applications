import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		Scanner Input = new Scanner(System.in);
		
		double bal = 100000;
		
		System.out.print("Enter your firstname: ");
		String firstName = Input.nextLine();
		
		System.out.print("Enter lastName: ");
		String lastName = Input.nextLine();
		
		
		System.out.print("Enter your age:" );
		short age = input .nextShort();
		
		System.out.printf("Welcome %s %s to FirstBank",firstName,lastName);
		System.out.printf("You are %d years old%n",age);
		System.out.printf("Your account balance is $%.2f%n",bal);
	}
}	