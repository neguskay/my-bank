package com.abc.accounts;

import com.abc.customers.Customer;
import com.abc.interests.CheckingInterestScheme;
import com.abc.interests.InterestScheme;

public class Checking extends Account{

  /**
   * @param accountNumber Newly generated account number.
   * @param sortCode      Default Sort Code of the Bank Branch.
   * @param customer      Account's Customer object.
   * @param type          Either Checking, Savings or Maxi-Savings.
   */
  public Checking(int accountNumber, int sortCode, Customer customer, String type,
                  long balance, CheckingInterestScheme interestScheme) {

    super(accountNumber, sortCode, customer, type, balance, interestScheme);

  }

}
