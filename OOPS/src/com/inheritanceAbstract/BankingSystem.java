package com.inheritanceAbstract;

public class BankingSystem {

	public static void main(String[] args) {
		Bank saving = new SavingAccount("koustub",5000);
		Bank current = new CurrentAccount("pachi",5000);
//		saving.account_holderName = "koustub";
//		saving.balance = 5000;
		
		// for saving account
		saving.displayBalance();
		saving.withdrawal(1500);
		saving.displayBalance();
		
//		for current account
		current.displayBalance();
		current.withdrawal(4000);
		current.displayBalance();
		}

}
