package com.example.clients;

import com.example.levels.ILevel;

public abstract class Client {
  protected ILevel level;

  protected float overdraftBase;

  public Client(float overdraftBase, ILevel level) {
    this.overdraftBase = overdraftBase;
    this.level = level;
  }

  public ILevel getLevel() {
    return level;
  }

  public float getOverdraftBase() {
    return overdraftBase;
  }

  public abstract float calculateOverdraftBase();

}
