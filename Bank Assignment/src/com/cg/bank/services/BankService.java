package com.cg.bank.services;

import java.util.Collection;

import com.cg.bank.dao.BankDAO;
import com.cg.bank.pojo.BankAccount;
import com.cg.bank.pojo.CurrentAccount;
import com.cg.bank.pojo.SavingsAccount;

public class BankService {
	private BankDAO bankdao = new BankDAO();

	public Collection<SavingsAccount> savAll() {
		return bankdao.allSav();
	}

	public Collection<CurrentAccount> curAll() {
		return bankdao.allCur();
	}
	public BankAccount withdraw(int accno,int amount) {
		return bankdao.withdraw(accno, amount);
	}

}
