package com.Bank;

public class SavingsAccount extends BankAccount {
	double withdrawLimit = 300000;
	double depositLimit = 1000000;

	

	public SavingsAccount(int accNumber, String accHolder, int accBal) {
		super(accNumber, accHolder, accBal);
		
	}

	@Override
	public double withdraw(double amount) {
		if(amount<=withdrawLimit && amount<=getAccBal()) {
			setAccBal(getAccBal()-amount);
			
		}
		return amount;
	}

	@Override
	public double deposit(double amount) {
		
		if(amount<=withdrawLimit ) {
			setAccBal(getAccBal()+amount);
			
		}
		return amount;
	}
	
	
}
