package Capsule;

public class BankAccount {
	
	private String accountName;
	private int accountNumber;
	private int BalanceTotal;
	
	BankAccount (int balance)
	{
		this.BalanceTotal = balance;
	}
	
	public void setAccountName(String name) {
		this.accountName = name;
	}
	
	public void setAccountNumber(int num) {
		if (num < 0) {
			this.accountNumber = 0;
		} else {
			this.accountNumber = num;
		}
	}
	public void DepositAmount(int amount)
	{
		this.BalanceTotal += amount;
	}
	public void WithdrawAmount(int amount)
	{
		this.BalanceTotal -= amount;
	}
	
	void DisplayDetails() {
		System.out.println("\nBankAccountName="+accountName+"\nBankAccountNumber="+accountNumber+"\nBalanceTotal="+BalanceTotal);
		System.out.println(" ");
	}
	

}
