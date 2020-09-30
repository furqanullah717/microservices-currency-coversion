package com.fk.training.currencyexchangeservice.repository;

import com.fk.training.currencyexchangeservice.models.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ExchangeRepository extends JpaRepository<ExchangeValue, Long>
{
  Optional<ExchangeValue> findByFromAndTo(String from, String to);
}
