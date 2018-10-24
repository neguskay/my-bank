package com.abc.db;

import com.abc.customers.Customer;
import com.abc.customers.generators.CustomerGenerator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Customer Data Class.
 * Set up as a mock to hold all Customer Data.
 * Would evolve into a Customer Database with appropriate schema based on the Customer Class.
 */
public class CustomersData {

  private List<Customer> customers;

  public CustomersData(){
    this.initCustomersData();
  }

  private void initCustomersData(){

    this.customers = new ArrayList<Customer>();

    this.customers.add(new Customer(new CustomerGenerator().getCustomerID(),"First", null,
        "5/5/1995",null));
  }
}
