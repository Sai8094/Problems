package com.oop;

public class ATM {
	Bank bank;
	UserAccount userAccount;
	
	ATM(Bank bank,UserAccount userAccount){
		this.bank = bank;
		this.userAccount = userAccount;
	}
	
	double withdrawl(int pin,double amt)
	{
		
		if(bank.isPinValid(pin))
		{
			if(amt > userAccount.getBalance())
			{
				System.out.println("Insuifficient Funds");
			}else {
				double setBalance= userAccount.getBalance() - amt;
				userAccount.setBalance(setBalance);
			}
		}
		return userAccount.getBalance();
	}
	
	void checkBalance(int pin)
	{
		
		if(bank.isPinValid(pin))
		{
			System.out.println("Available Balance is: "+ this.userAccount.getBalance());
		}else {
			System.out.println("Invalid Pin");
		}
	}
}
