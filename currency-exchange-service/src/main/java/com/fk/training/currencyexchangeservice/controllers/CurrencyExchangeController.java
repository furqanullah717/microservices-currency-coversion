package com.fk.training.currencyexchangeservice.controllers;

import com.fk.training.currencyexchangeservice.models.ExchangeValue;
import com.fk.training.currencyexchangeservice.repository.ExchangeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CurrencyExchangeController
{
  @Autowired ExchangeRepository exchangeRepository;
  @Autowired Environment environment;
  Logger logger = LoggerFactory.getLogger(CurrencyExchangeController.class);

  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public ExchangeValue exchangeValue(@PathVariable String from, @PathVariable String to)
  {

    logger.info("Conversion from : "+from + "  to :" + to);
    Optional<ExchangeValue> optionalExchangeValue = exchangeRepository.findByFromAndTo(from, to);
    if (optionalExchangeValue.isPresent())
    {
      optionalExchangeValue.get().setPort(Integer.parseInt(environment.getProperty("local.server.port")));
    }
    logger.info(optionalExchangeValue.get().toString());
    return optionalExchangeValue.orElse(null);
  }
}
