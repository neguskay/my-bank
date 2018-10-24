package com.abc.db;

import com.abc.accounts.Account;
import com.abc.accounts.Checking;
import com.abc.accounts.MaxiSavings;
import com.abc.accounts.Savings;
import com.abc.accounts.defaults.BranchDefaults;
import com.abc.accounts.generators.AccountGenerator;

import java.util.ArrayList;
import java.util.List;

public class AccountsData{

  private List<Account> accounts;

  private Savings savingsAcc;
  private Checking checkingAcc;
  private MaxiSavings maxiSavingsAcc;

  public AccountsData(){

    this.initAccounts();
    this.initAccountsData();

  }

  private void initAccountsData() {
    this.accounts = new ArrayList<Account>();
  }

  private void initAccounts() {
    this.savingsAcc = new Savings(12, 276767, null, null, 775,
        null);
    //this.checkingAcc = new Checking();
    //this.maxiSavingsAcc = new MaxiSavings();
  }
}
