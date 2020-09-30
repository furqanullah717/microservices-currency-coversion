package com.fk.training.limitsservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class ServiceConfig
{
  private int min;
  private int max;

  public int getMin()
  {
    return min;
  }

  public void setMin(final int min)
  {
    this.min = min;
  }

  public int getMax()
  {
    return max;
  }

  public void setMax(final int max)
  {
    this.max = max;
  }
}
