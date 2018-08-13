package com.cg.bank.pojo;

public class SavingsAccount extends BankAccount {
	private boolean salary;

	public SavingsAccount(int accountNo, Customer accountHolder, double accountBalance, boolean salary) {
		super(accountNo, accountHolder, accountBalance);
		this.salary = salary;
	}

}
