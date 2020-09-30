package com.fk.training.currencyconversionservice.model;

import java.math.BigDecimal;

public class CurrencyConversionBean
{
  private Long id;
  private String from;
  private String to;
  private BigDecimal conversionMultiple;
  private BigDecimal quantity;
  private BigDecimal totalAmount;
  private int port;

  public CurrencyConversionBean()
  {

  }

  public CurrencyConversionBean(final Long id, final String from, final String to, final BigDecimal conversionMultiple, final BigDecimal quantity, final BigDecimal totalAmount, final int port)
  {
    this.id = id;
    this.from = from;
    this.to = to;
    this.conversionMultiple = conversionMultiple;
    this.quantity = quantity;
    this.totalAmount = totalAmount;
    this.port = port;
  }

  public Long getId()
  {
    return id;
  }

  public void setId(final Long id)
  {
    this.id = id;
  }

  public String getFrom()
  {
    return from;
  }

  public void setFrom(final String from)
  {
    this.from = from;
  }

  public String getTo()
  {
    return to;
  }

  public void setTo(final String to)
  {
    this.to = to;
  }

  public BigDecimal getConversionMultiple()
  {
    return conversionMultiple;
  }

  public void setConversionMultiple(final BigDecimal conversionMultiple)
  {
    this.conversionMultiple = conversionMultiple;
  }

  public BigDecimal getQuantity()
  {
    return quantity;
  }

  public void setQuantity(final BigDecimal quantity)
  {
    this.quantity = quantity;
  }

  public BigDecimal getTotalAmount()
  {
    return totalAmount;
  }

  public void setTotalAmount(final BigDecimal totalAmount)
  {
    this.totalAmount = totalAmount;
  }

  public int getPort()
  {
    return port;
  }

  public void setPort(final int port)
  {
    this.port = port;
  }
}
