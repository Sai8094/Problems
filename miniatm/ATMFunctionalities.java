package com.miniatm;

public interface ATMFunctionalities {
	public void checkBalance(Account account, int pin);
	public void deposit(Account account, int pin, double amount);
	public void withdrawl(Account account, int pin, double amount);
	public void numberOfFailedAttempt();

}
