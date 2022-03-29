package com.Bank;

public class SalaryAccount extends BankAccount {
	double withdrawLimit = 300000;
	
	
	public SalaryAccount(int accNumber, String accHolder, int accBal) {
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
		setAccBal(getAccBal()+amount);
		
		return amount;
	}
	
}
