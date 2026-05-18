import java.util.Scanner;

public class AccountMain {
//scanner class to take input from user
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		sc.nextLine(); // consume the newline character
		
		System.out.print("Enter account holder name: ");
		String accountHolderName = sc.nextLine();
		
		System.out.print("Enter balance: ");
		double balance = sc.nextDouble();
		
		Account account = new Account(accountNumber, accountHolderName, balance);
		account.display();
		
		sc.close();
	}
}
