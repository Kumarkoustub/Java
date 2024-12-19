package com.inheritanceAbstract;

public class SavingAccount extends Bank {
	
	private double interestRate = 0.03;
	 public SavingAccount(String account_holderName, double balance ) {
		 super(account_holderName, balance);
	 }

	@Override
	public void deposite(double ammount) {
		balance = balance + ammount;
		System.out.println(ammount + "sucessfully deposited in your account");

	}

	@Override
	public void withdrawal(double ammount) {
		if (balance - ammount >= 0) {
			balance = balance - ammount;
			System.out.println(ammount +  " withdrawal from the saving account");
		} else {
			System.out.println("insufficient balance");
		}

	}
//	apply interest
	public void applyInterest() {
		balance =  balance*interestRate;
	}

}
