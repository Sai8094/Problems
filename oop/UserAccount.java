package com.oop;

public class UserAccount {
	private String accountholdername;
	private int pin;
	private double balance;

	public UserAccount() {
	}

	public String getAccountholdername() {
		return accountholdername;
	}

	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	};

}
