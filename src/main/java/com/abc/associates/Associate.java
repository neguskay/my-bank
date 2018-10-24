package com.abc.associates;

import com.abc.associates.roles.AssociateRole;

public class Associate {

  private String associateName;
  private String dateOfBirth;

  private String[] address;

  private int associateID;

  private AssociateRole associateRole;

  public Associate(int associateID, String associateName, String dateOfBirth,
                   String[] address, AssociateRole associateRole ){

    this.associateID = associateID;
    this.associateName = associateName;
    this.dateOfBirth = dateOfBirth;
    this.address = address;
    this.associateRole = associateRole;

  }
}
