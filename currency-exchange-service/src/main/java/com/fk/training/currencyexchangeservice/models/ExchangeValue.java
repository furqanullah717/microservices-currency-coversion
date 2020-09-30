package com.fk.training.currencyexchangeservice.models;

import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class ExchangeValue
{
  @Id
  @GeneratedValue
  private long id;

  @Column(name = "c_from")
  private String from;
  @Column(name = "c_to")
  private String to;
  private BigDecimal conversionMultiple;
  private int port;

  public ExchangeValue()
  {

  }

  public ExchangeValue(final long id, final String from, final String to, final BigDecimal conversionMultiple, int port)
  {
    this.id = id;
    this.from = from;
    this.to = to;
    this.conversionMultiple = conversionMultiple;
    this.port = port;
  }

  public int getPort()
  {
    return port;
  }

  public void setPort(final int port)
  {
    this.port = port;
  }

  public long getId()
  {
    return id;
  }

  public void setId(final long id)
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
}
