package exampleabstract;

public abstract class Account {
	public int account_number;
	public String account_holderName;
	public int account_holderAge;
	public String account_holderAddress;
	public double amount = 0;

	public abstract double sumAmount(int amount);

	public abstract double annualInterest(int amount);

}
