package javafundamentals;

public class Transactions {
	static void BankTransactions(BankAccount account,String operation, int cash) {
		System.out.println("\nAccount Number = " + account.accountNumber);
		System.out.println("Account Name = " + account.accountName);
		System.out.println("Prev.Balance (Before Transaction) = " + account.initialBalance);
		System.out.println("-------------------------");
        System.out.println("Transaction:");
        
		if(operation == "deposit") {
	        account.deposit(cash); //access deposit method
	        System.out.println("\tDeposited: " + cash);
		}else if(operation == "withdraw") {
	        account.withdraw(cash); //access withdraw method
	        System.out.println("\tWithdrawn: " + cash);
		}
		
		System.out.println("-------------------------");
		System.out.println("Account Number = " + account.accountType);
		System.out.println("Latest Balance = " + account.initialBalance);
		
        // Checking the initial balance is less than 100 to determine  status
        if (account.initialBalance < 100) {
            account.accountStatus = "Closed \n";
        } else {
            account.accountStatus = "Active \n";
        }
        System.out.println("Account Status: " + account.accountStatus);
    }
}
