package com.abc.accounts;

import com.abc.interests.InterestScheme;
import com.abc.teller.Transaction;
import com.abc.customers.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Account Class
 *
 */
public class Account {

    public static final int CHECKING = 0;
    public static final int SAVINGS = 1;
    public static final int MAXI_SAVINGS = 2;

    private int accountType; //REMOVED "FINAL"
    public List<Transaction> transactions;

    //new code
    private int accountNumber;
    private int sortCode;

    private long balance;
    private String type;

    private Customer customer;

    private InterestScheme interestScheme;

    public Account(int accountType) {
        this.accountType = accountType;
        this.transactions = new ArrayList<Transaction>();
    }

    /**
     * @param accountNumber Newly generated account number.
     * @param sortCode Default Sort Code of the Bank Branch.
     * @param customer Account's Customer object.
     * @param type Either Checking, Savings or Maxi-Savings.
     */
    public Account(int accountNumber, int sortCode, Customer customer, String type,
                   long balance, InterestScheme interestScheme){

        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.type = type;
        this.customer = customer;
        this.interestScheme = interestScheme;
        this.balance = balance;

    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be greater than zero");
        } else {
            transactions.add(new Transaction(amount));
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be greater than zero");
        }  else {
            transactions.add(new Transaction(-amount));
        }
    }

    public double interestEarned() {
        double amount = sumTransactions();
        switch(accountType){
            case SAVINGS:
                if (amount <= 1000)
                    return amount * 0.001;
                else
                    return 1 + (amount-1000) * 0.002;
//            case SUPER_SAVINGS:
//                if (amount <= 4000)
//                    return 20;
            case MAXI_SAVINGS:
                if (amount <= 1000)
                    return amount * 0.02;
                if (amount <= 2000)
                    return 20 + (amount-1000) * 0.05;
                return 70 + (amount-2000) * 0.1;
            default:
                return amount * 0.001;
        }
    }

    public double sumTransactions() {
       return checkIfTransactionsExist(true);
    }

    private double checkIfTransactionsExist(boolean checkAll) {
        double amount = 0.0;
        for (Transaction t: transactions)
            amount += t.amount;
        return amount;
    }

    public int getAccountType() {
        return accountType;
    }

}
