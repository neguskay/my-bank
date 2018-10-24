package com.abc.associates.roles;

import com.abc.associates.defaults.RoleClearances;
import com.abc.associates.defaults.RoleNames;

public class BankManager extends AssociateRole{

  public BankManager(){

    super(RoleNames.DEFAULT_ROLE_NAME_MANAGER, RoleClearances.DEFAULT_CLEARANCE_LEVEL_MANAGER);

  }
}
