package com.banksystem;

public class AccountFunctionalities {

	public void deposit(Account account, double amount) {
		if (account.getBalance() < amount) {
			System.out.println("Insuiffient funds");
		} else {
			System.out.println("Available Balance:" + (account.getBalance() + amount));
		}
	}

	public void withdrwal(Account account, double amount) {
		if (account.getBalance() < amount) {
			System.out.println("Insuiffient funds");
		} else {
			System.out.println("Available Balance:" + (account.getBalance() - amount));
		}
	}

	public void transfer(Account account1, Account account2, double amount) {
		
		if (account1.getBalance() < amount) {
			System.out.println("Transaction Failed due to insufficient funds");

		} else {
			System.out.println("Transaction Done");
			System.out.println("Sender's Account balance: " + (account1.getBalance() - amount));
			System.out.println("Receiver's Account balance: " + (account1.getBalance() + amount));
		}
	}

}
