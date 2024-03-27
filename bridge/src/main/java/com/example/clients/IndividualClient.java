package com.example.clients;

import com.example.levels.ILevel;

public class IndividualClient extends Client {

  public static float OVERDRAFT_FROM_INDIVIDUAL_CLIENT = 12500f;

  public IndividualClient(ILevel level) {
    super(OVERDRAFT_FROM_INDIVIDUAL_CLIENT, level);
  }

  @Override
  public float calculateOverdraftBase() {
    float overdraftBase = this.getOverdraftBase();
    float multiplier = this.level.multiplier();
    return overdraftBase * (1 + multiplier);
  }

}
