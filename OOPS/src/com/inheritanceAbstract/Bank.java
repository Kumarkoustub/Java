package com.inheritanceAbstract;

abstract public class Bank {

	protected String account_holderName;

	protected double balance;

public Bank(String account_holderName, double balance) {
	this.account_holderName = account_holderName;
	this.balance =balance;
		
	}

	// abstract method
	public abstract void deposite(double ammount);

	public abstract void withdrawal(double ammount);

//    non abstract method
	public void displayBalance() {
		System.out.println("Account Holder Name : " + account_holderName);
		System.out.println("Balance : " + balance);
	}

}
