package com.fk.training.currencyconversionservice.controller;

import com.fk.training.currencyconversionservice.model.CurrencyConversionBean;
import com.fk.training.currencyconversionservice.services.CurrencyExchangeServiceProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyConversionController
{
  @Autowired CurrencyExchangeServiceProxy exchangeServiceProxy;
  Logger logger = LoggerFactory.getLogger(CurrencyConversionController.class);
  @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
  public CurrencyConversionBean getCurrency(@PathVariable final String from, @PathVariable final String to, @PathVariable final BigDecimal quantity)
  {
    Map<String, String> uriVaribales = new HashMap<>();
    uriVaribales.put("from", from);
    uriVaribales.put("to", to);
    logger.info("Conversion from : "+from + "  to :" + to);
    ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate()
            .getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",
                    CurrencyConversionBean.class, uriVaribales);
    CurrencyConversionBean response = responseEntity.getBody();
    logger.info(response.toString());
    return new CurrencyConversionBean(response.getId(), response.getFrom(), response.getTo(), response.getConversionMultiple(), quantity, quantity.multiply(response.getConversionMultiple()), response.getPort());
  }

  @GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
  public CurrencyConversionBean getCurrencyFeign(@PathVariable final String from, @PathVariable final String to, @PathVariable final BigDecimal quantity)
  {
    logger.info("Conversion from : "+from + "  to :" + to);
    CurrencyConversionBean response = exchangeServiceProxy.exchangeValue(from, to);
    logger.info(response.toString());
    return new CurrencyConversionBean(response.getId(), response.getFrom(), response.getTo(), response.getConversionMultiple(), quantity, quantity.multiply(response.getConversionMultiple()), response.getPort());
  }
}
