package com.Bank;

public abstract class BankAccount {
	private int accNumber;
   private String accHolder;
   private double accBal;
   
  public BankAccount(int accNumber, String accHolder, int accBal) {
	
	this.accNumber = accNumber;
	this.accHolder = accHolder;
	this.accBal = accBal;
}

public double showBalance() {
	   return accBal;
   }
   
   public abstract double withdraw(double amount);
	public abstract double deposit(double amount);

@Override
public String toString() {
	return "BankAccount [accNumber=" + accNumber + ", accHolder=" + accHolder + ", accBal=" + getAccBal() + "]";
}

public double getAccBal() {
	return accBal;
}

public int getAccNumber() {
	return accNumber;
}

public String getAccHolder() {
	return accHolder;
}

public void setAccBal(double accBal) {
	this.accBal = accBal;
}
   
   
}
