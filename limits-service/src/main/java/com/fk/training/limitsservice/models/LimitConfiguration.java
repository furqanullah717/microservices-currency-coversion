package com.fk.training.limitsservice.models;

public class LimitConfiguration
{
  private  int miniumum;
  private  int maximum;

  public LimitConfiguration(final int miniumum, final int maximum)
  {
    this.miniumum = miniumum;
    this.maximum = maximum;
  }

  public int getMiniumum()
  {
    return miniumum;
  }

  public void setMiniumum(final int miniumum)
  {
    this.miniumum = miniumum;
  }

  public int getMaximum()
  {
    return maximum;
  }

  public void setMaximum(final int maximum)
  {
    this.maximum = maximum;
  }
}
