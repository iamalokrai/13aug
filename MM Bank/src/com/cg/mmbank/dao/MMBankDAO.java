package com.cg.mmbank.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.mmbank.pojo.BankAccount;
import com.cg.mmbank.pojo.CurrentAccount;
import com.cg.mmbank.pojo.Customer;
import com.cg.mmbank.pojo.SavingsAccount;

public class MMBankDAO {
	
	private Map<Integer, BankAccount> bankDB = new HashMap<>();
	//private Map<Integer, CurrentAccount> currentDB = new HashMap<>();
	
	/*public void addSavingsAccount(SavingsAccount sa) {
		savingsDB.put(sa.getAccountNo(), sa);
	}
	
	public void addCurrentAccount(CurrentAccount ca) {
		currentDB.put(ca.getAccountNo(), ca);
	}*/
	
	public void data() {
		bankDB.put(1001, new SavingsAccount(new Customer("Alok","7985254250","alok-ranjan.rai@capgemini.com","02/07/1997"), 50124,true ));
	}

}
