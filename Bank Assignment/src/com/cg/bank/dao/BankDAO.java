package com.cg.bank.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.bank.pojo.BankAccount;
import com.cg.bank.pojo.CurrentAccount;
import com.cg.bank.pojo.Customer;
import com.cg.bank.pojo.SavingsAccount;

public class BankDAO {
	
	Map<Integer, SavingsAccount> savDB = new HashMap<>();
	Map<Integer, CurrentAccount> curDB = new HashMap<>();
	
	public Collection<SavingsAccount> allSav() {
		savDB.put(1, new SavingsAccount(1001, new Customer("Alok", "7985254250", "alokrai697@gmail.com", "02/07/1997"), 50124, true));
		savDB.put(2, new SavingsAccount(1002, new Customer("Udit", "8525425022", "uditk18@gmail.com", "09/07/1996"), 20152, true));
		savDB.put(3, new SavingsAccount(1003, new Customer("Mayur", "8545201232", "mayurkiyaan8@gmail.com", "15/07/1995"), 20152, false));
		savDB.put(4, new SavingsAccount(1004, new Customer("Rahul", "9023123252", "rockingrahul123@gmail.com", "09/01/1996"), 20152, true));
		savDB.put(5, new SavingsAccount(1005, new Customer("Gaurav", "7985454574", "gj@gmail.com", "25/07/1996"), 20152, true));
		savDB.put(6, new SavingsAccount(1002, new Customer("Ripu", "8989564525", "maihudhawan@gmail.com", "01/09/1997"), 20152, false));
		return savDB.values();

	}
	
	public Collection<CurrentAccount> allCur() {
		curDB.put(101, new CurrentAccount(5001, new Customer("Alok", "7985254250", "alokrai697@gmail.com", "02/07/1997"), 45565, 10000));
		curDB.put(101, new CurrentAccount(5001, new Customer("Shivam", "8457568585", "shivam007@gmail.com", "11/08/1996"), 12344, 10000));
		curDB.put(101, new CurrentAccount(5001, new Customer("Prashant", "8176955501", "pojha@gmail.com", "09/02/1996"), 24115, 10000));
		curDB.put(101, new CurrentAccount(5001, new Customer("Roshan", "8845482322", "roshant@gmail.com", "27/01/1997"), 22325, 10000));
		curDB.put(101, new CurrentAccount(5001, new Customer("Aditya", "8318408970", "aditya02@gmail.com", "25/11/1996"), 11452, 10000));
		
		return curDB.values();

	}
	public BankAccount withdraw(int accno,int amount) {
		Integer i=accno;
		if(savDB.get(i).getAccountBalance()>amount) {
			savDB.get(i).setAccountBalance(savDB.get(i).getAccountBalance()-amount);
			return savDB.get(i);
		}
		else {
			return null;
		}
		
	}

}
