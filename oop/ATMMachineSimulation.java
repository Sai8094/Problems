package com.oop;

public class ATMMachineSimulation {
	public static void main(String[] args) {

		Bank bank = new Bank("SBI", "SBI123", "Bengaluru");
		UserAccount user = new UserAccount();
		user.setAccountholdername("Ramesh");
		user.setBalance(30000);
		user.setPin(2356);

		bank.createAccount(user);

		ATM atm = new ATM(bank, user);
		atm.checkBalance(2356);

	}

}
