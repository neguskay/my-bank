package com.abc.associates.roles;

import com.abc.associates.defaults.RoleClearances;
import com.abc.associates.defaults.RoleNames;

public class TellerAssociate extends AssociateRole{

  public TellerAssociate(){

    super(RoleNames.DEFAULT_ROLE_NAME_TELLER_ASSISTANT,
        RoleClearances.DEFAULT_CLEARANCE_LEVEL_TELLER_ASSISTANT);

  }
}
