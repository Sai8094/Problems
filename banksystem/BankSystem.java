package com.banksystem;

public class BankSystem {

	public static void main(String[] args) {
		Account account1 = new Account("Ramesh", "123456", 40000);
		Account account2 = new Account("Suresh", "234567", 10000);

		AccountFunctionalities accountFunctionalities = new AccountFunctionalities();
		accountFunctionalities.deposit(account1, 100);
		accountFunctionalities.transfer(account1, account2, 9000);

	}

}
