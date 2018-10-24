package com.abc.customers.generators;

import java.util.Random;

/**
 * Customer Generator Class.
 * Generates new random 9-digit customer ID number.
 * Check through the customer DB to ensure it doesn't already exist.
 */
public class CustomerGenerator {

  private int customerID;

  private Random random;

  public CustomerGenerator(){

    this.random = new Random();
    this.customerID = getNewCustomerID();

  }

  /**
   * @return new randomly generated customer ID number as a 9-digit integer
   */
  private int getNewCustomerID() {
    int custID = random.nextInt(999999999);

    //get a new 9-digit customer number
    //check in some customer DB and return if non-existent

    return custID;
  }

  public int getCustomerID() {
    return customerID;
  }

}
