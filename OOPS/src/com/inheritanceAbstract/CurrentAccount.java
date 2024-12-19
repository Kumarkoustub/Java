package com.inheritanceAbstract;

public class CurrentAccount extends Bank {
	public double overDraftLimit = 5000;
	public CurrentAccount(String account_holderName, double balance) {
		super(account_holderName, balance);
	}

//	@Override because of  abstract class
	public void deposite(double ammount) {
		balance = balance + ammount;
		System.out.println(ammount + "successfully deposited in your account");

	}

//	@Override because of abstract class
	public void withdrawal(double ammount) {
		if (balance - ammount >= -overDraftLimit) {
			balance = balance - ammount;
			System.out.println(ammount + " ammount is withdrawal from the account");

		}
		else {
			System.out.println("overdraft limit is  excceed or insufficient balance ");
		}

	}

}
