package com.abc.db;

import com.abc.associates.Associate;
import com.abc.associates.roles.AssociateRole;
import com.abc.associates.roles.BankManager;
import com.abc.associates.roles.TellerAssociate;

import java.util.ArrayList;
import java.util.List;

/**
 * Staff Data Class.
 * Set up as a mock to hold all Staff Data.
 * Would evolve into a Staff Database with appropriate schema based on the Customer Class.
 */
public class AssociatesData {

  private List<Associate> associates;

  private Associate abcStaffA;
  private Associate abcStaffB;

  public AssociatesData(){

    this.initAssociates();
    this.initAssociateData();

  }

  private void initAssociates() {

    this.abcStaffA = new Associate(2020, "AbcStaffA",
        "2/2/1966", new String[]{"Spring Fields", "California", " 90210"},
        new TellerAssociate());

    this.abcStaffB = new Associate(2030, "AbcStaffB",
        "2/2/1988",new String[]{"Barking Street", "London", "A12 3BC"},
        new BankManager());

  }

  private void initAssociateData() {

    this.associates = new ArrayList<Associate>();

    this.associates.add(this.abcStaffA);
    this.associates.add(this.abcStaffB);

  }
}
