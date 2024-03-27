package com.example.clients;

import com.example.levels.ILevel;

public class BusinessClient extends Client {
  public static float OVERDRAFT_FROM_BUSINESS_CLIENT = 125000f;

  public BusinessClient(ILevel level) {
    super(OVERDRAFT_FROM_BUSINESS_CLIENT, level);
  }

  @Override
  public float calculateOverdraftBase() {
    float overdraftBase = this.getOverdraftBase();
    float multiplier = this.level.multiplier();
    return overdraftBase * (1 + multiplier);
  }
}
