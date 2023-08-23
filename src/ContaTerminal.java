import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Hello Welcome to The Bank.");
		
		System.out.println("\nPlease enter your first and last name:");
		String clientName = scanner.nextLine();
		
		System.out.println("Please enter your account number:");
		int accoutNumber = scanner.nextInt();
		
		System.out.println("Please enter your agency number:");
		String bankBranch = scanner.next();
		
		System.out.println("Please enter your new account balance(BRL):");
		double accountBalance = scanner.nextDouble();
		
		System.out.println("Hello Mr. " + clientName + ", thank you for creating an account with our bank.");
		System.out.println("Your bank branch is " + bankBranch + ", account number is " + accoutNumber + ", and your balance of R$" + accountBalance + " is now available for withdrawal.");
	}
	
}
