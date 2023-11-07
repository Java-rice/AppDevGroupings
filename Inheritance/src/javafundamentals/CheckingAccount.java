package javafundamentals;

class CheckingAccount extends BankAccount{
	CheckingAccount(int accountNumber, String accountName, int initialBalance){
		super(accountNumber, accountName,initialBalance);
		this.accountType = "Checking Account"; 
	};
	
	void display() {
		System.out.println("Account Number = " + accountNumber);
		System.out.println("Account Name = " + accountName);
		System.out.println("Account Type = " + accountType);
		System.out.println("Initial Balance = " + initialBalance + "\n");
	};
}
