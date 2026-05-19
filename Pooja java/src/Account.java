
public class Account {
//instance variables
	int accountNumber;
	String accountHolderName;
	double balance;
	double interestRate;
	
	
	//constructor
	public Account(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.interestRate = 0.05; // default interest rate
		
	}
	
	//method to display account details
	public void display() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Balance: $" + balance);	
		System.out.println("Interest Rate: " + (interestRate * 100) + "%");
		
	}
}
