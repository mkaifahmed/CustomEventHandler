package com.Bank;

import java.sql.Timestamp;

import org.springframework.context.ApplicationEvent;

public class WithdrawlEvent extends ApplicationEvent {
	double amount;
	BankAccount acc;
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		acc = bankAccount;
	}

	public WithdrawlEvent(Object source,double amount,BankAccount Acc) {
		super(source);
		setAmount(amount);
		setBankAccount(Acc);
		acc.withdraw(this.amount);
	}

	@Override
	public String toString() {
		return "money has been withdrawn from your account "+this.amount+ "\n" + "Remaining acc Balance =" + acc.showBalance()
				+ "\n"+"Timestamp: "+new Timestamp(System.currentTimeMillis());
	}

}
