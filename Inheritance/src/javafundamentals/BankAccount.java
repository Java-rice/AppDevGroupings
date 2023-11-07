package javafundamentals;

class BankAccount {
	int accountNumber;
	String accountName;
	String accountType;
	int initialBalance;
	String accountStatus;
	
	BankAccount(int accountNumber, String accountName, int initialBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.initialBalance = initialBalance;
	};
	
	int deposit(int cash) {
		return initialBalance += cash;
	};
	
	int withdraw(int cash) {
		return initialBalance -= cash;
	};
}
