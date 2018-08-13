package com.cg.bank.pojo;

public class CurrentAccount extends BankAccount {
	private int odLimit;

	public CurrentAccount(int accountNo, Customer accountHolder, double accountBalance, int odLimit) {
		super(accountNo, accountHolder, accountBalance);
		this.odLimit = odLimit;
	}

}
