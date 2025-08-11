package com.oop;

public class Bank {
	String bankname;
	String IFSC;
	String Location;
	UserAccount userAccount;

	public Bank() {
	}

	public Bank(String bankname, String iFSC, String location) {
		this.bankname = bankname;
		IFSC = iFSC;
		Location = location;
	}

	void createAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
		System.out.println("Account Created Successfully");
	}

	boolean isPinValid(int pin) {
		return this.userAccount.getPin() == pin;
	}

}
