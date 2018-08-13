package com.cg.mmbank.services;

import com.cg.mmbank.dao.MMBankDAO;
import com.cg.mmbank.pojo.CurrentAccount;
import com.cg.mmbank.pojo.SavingsAccount;

public class MMBankServices {
	
	private MMBankDAO dao = new MMBankDAO();
	
	public void addSavingsAccount(SavingsAccount sa) {
		dao.addSavingsAccount(sa);
	}
	
	public void addCurrentAccount(CurrentAccount ca) {
		dao.addCurrentAccount(ca);
	}

}
