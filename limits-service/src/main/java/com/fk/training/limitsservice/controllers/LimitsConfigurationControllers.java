package com.fk.training.limitsservice.controllers;

import com.fk.training.limitsservice.config.ServiceConfig;
import com.fk.training.limitsservice.models.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationControllers
{
  @Autowired ServiceConfig serviceConfig;

  @GetMapping("/getLimits")
  public LimitConfiguration getLimits()
  {
    return new LimitConfiguration(serviceConfig.getMin(), serviceConfig.getMax());
  }
}
