package com.miniatm;

public class Account {
	private String name;
	private double balance=50000;
	private int pin=1234;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	public boolean isPinValide(int pin)
	{
		return this.pin==pin;
	}
}
