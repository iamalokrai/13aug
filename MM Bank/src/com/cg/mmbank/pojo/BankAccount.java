package com.cg.mmbank.pojo;

public abstract class BankAccount {
	private final int accountNo;
	private Customer accountHolder;
	private double accountBalance;

	private static int accountId;
	static {
		accountId = 500;
	}

	{
		this.accountNo = ++accountId;
	}

	public BankAccount(Customer accountHolder, double accountBalance) {
		super();
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	public BankAccount(Customer accountHolder) {
		super();
		this.accountHolder = accountHolder;
	}

	public Customer getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public static int getAccountId() {
		return accountId;
	}

	public static void setAccountId(int accountId) {
		BankAccount.accountId = accountId;
	}

	public int getAccountNo() {
		return accountNo;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + "]";
	}

}
