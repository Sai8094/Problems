package com.miniatm;

public class ATMFunctionalitiesImpl implements ATMFunctionalities {
	int failedAttempsCount = 0;
	
	@Override
	public void checkBalance(Account account, int pin) {
		if (account.isPinValide(pin)) {
			System.out.println("Available Balance is " + account.getBalance());
		} else {
			System.out.println("Invali Pin");
			failedAttempsCount++;
		}
	}

	@Override
	public void deposit(Account account, int pin, double amount) {
		if (account.isPinValide(pin)) {
			System.out.println("Available Balance is " + (account.getBalance() + amount));
		} else {
			System.out.println("Invali Pin");
			failedAttempsCount++;
		}
	}

	@Override
	public void withdrawl(Account account, int pin, double amount) {
		if (account.isPinValide(pin)) {
			if (account.getBalance() < amount) {
				System.out.println("Insufficient Funds");
			} else {
				System.out.println("Available Balance is " + (account.getBalance() - amount));
			}
		} else {
			System.out.println("Invali Pin");
			failedAttempsCount++;
		}
	}
	
	@Override
	public void numberOfFailedAttempt()
	{
		System.out.println("Number of Failed Attempts: "+ failedAttempsCount);
	}
}
