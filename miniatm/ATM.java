package com.miniatm;

public class ATM {

	public static void main(String[] args) {
		
		ATMFunctionalities atmFunctionalities = new ATMFunctionalities();
		
		Account account = new Account();
		account.setName("Ramesh");
		account.setBalance(60000);
		account.setPin(1234);
		
		atmFunctionalities.checkBalance(account, account.getPin());
		atmFunctionalities.deposit(account, 1234, 2000);
		atmFunctionalities.withdrawl(account, 1234, 7000);
		atmFunctionalities.numberOfFailedAttempt();
	}

}
