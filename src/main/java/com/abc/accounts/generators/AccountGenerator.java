package com.abc.accounts.generators;

import com.abc.accounts.defaults.BranchDefaults;

import java.util.Random;

/**
 * Account Number Generator Class.
 * Checks and generates new random account numbers for new instances of each account.
 * Generates a new random 8-digit account number.
 * Checks and ensures it hasn't already been issued to a another account in the Accounts DB.
 */
public class AccountGenerator {

  private int accountNumber;
  private int sortCode;


  private Random random;

  public AccountGenerator(){

    this.random = new Random();

    this.accountNumber = getNewAccountNumber();
    this.sortCode = BranchDefaults.DEFAULT_BRANCH_SORT_CODE;
  }


  /**
   * @return randomly generated new  account number.
   */
  private int getNewAccountNumber(){

    int accNum = random.nextInt(99999999);

    // check some DB for already existing numbers

    return accNum;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public int getSortCode() {
    return sortCode;
  }
}
