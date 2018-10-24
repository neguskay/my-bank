package com.abc.accounts;

import com.abc.customers.Customer;
import com.abc.interests.MaxiSavingsInterestScheme;
import com.abc.interests.SavingsInterestScheme;

public class Savings extends Account{

  /**
   * @param accountNumber Newly generated account number.
   * @param sortCode      Default Sort Code of the Bank Branch.
   * @param customer      Account's Customer object.
   * @param type          Either Checking, Savings or Maxi-Savings.
   */
  public Savings(int accountNumber, int sortCode, Customer customer, String type,
                 long balance, MaxiSavingsInterestScheme interestScheme) {
    super(accountNumber, sortCode, customer, type, balance, interestScheme);
  }

}
