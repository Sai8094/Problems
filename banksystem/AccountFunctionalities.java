package com.banksystem;

public interface AccountFunctionalities {
	void deposit(Account account, double amount);
	void withdrwal(Account account, double amount);
	void transfer(Account account1, Account account2, double amount);

}
